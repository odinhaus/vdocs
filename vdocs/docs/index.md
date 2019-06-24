# Introduction to @@prod



## What is @@prod?

- @@prod stands for graph data manipulation language

- @@prod lets you access graph data repositories to manipulate and visualize the data retrieved

  

## What can gD@@prodML do?

- @@prod can execute BQL queries against Starling data repositories

- @@prod can execute web service calls against Starling Data Ports

- @@prod can execute web service calls against third party graph data repositories

- @@prod can define data graphs from scripted data

- @@prod can filter, combine and transform data graphs to create nd visualize new graphs

  

## What can @@prod NOT do?

- @@prod does **NOT** update source data repositories



## Simple @@prod Examples

*Create and display a simple graph consisting of two nodes linked by an edge*:

```sql
FROM [Foo{Id: 'foo'}->a{}->Fee{Id:'fee'}];
DISPLAY $result;
```

*Execute a BQL query and display only those Persons that have at least two friends*:

```sql
FROM QUERY 'Person<-isFriendOf<-Person'
ASSIGN $friends;

FROM Person{as $p}<-isFriendOf{as $ifo}<-Person{as $f} IN $friends
GROUP $p AS Person{as $G}
ON { Id: $f.Id }
WHERE $G[$ifo].Count() >= 2
MAP Person{
	Id: $G.Id,
	Name: $G[$f.Name].First()
};

DISPLAY $result;
```



## Resources

- [@@prod Complete Syntax ](gDML_Syntax.md) - a complete reference to the @@prod langauge
- [@@prod Recipes and Examples](gDML_Recipes.md) - a series of example problems and @@prod scripts



## Documentation Conventions

### Interpreting grammar rules:

Grammar rules are described throughout the documentation to describe the @@prod language rules in an abstract form.  The language is described as a set of named rules and pattern matching expressions that comprise the rule, whereby the pattern matching rules may also reference other named rules.

The rule definitions follow the form:

```
<RULE NAME> ::= PATTERN
```

where `RULE NAME` is the name of the rule being defined, the `::=` operator symbolize rule assignment and `PATTERN` is a series of statements and operators that define the matching conditions for the rule.

The `PATTERN` expression can consist of named elements, literal values, and various symbols to define logical groupings and cardinalities of expressions as summarized below:

| Symbol         | Meaning                                                      |
| -------------- | ------------------------------------------------------------ |
| [ ... \| ... ] | A group of related optional expressions whereby one of the expressions MAY match |
| ( ... \| ... ) | A group of required expressions whereby one of the expressions MUST match |
| *              | A cardinality specifier indicating zero or more matches      |
| ?              | A cardinality specifier indicating zero or one matches       |
| +              | A cardinality specifier indicating one or more matches       |
| ' ... '        | A literal text value                                         |
| ...            | Indicates that further details are required but have been omitted for the sake of brevity |

**NOTE**: Throughout the document, all @@prod rule names will always be referenced with uppercase letters, but in the interpretation of the rules in script, the naming is always case-insensitive. Likewise, any literal string matches defined by a rule are also matched in a case-insensitive manner.

**Examples**:

- The `SCRIPT` rule is defined as one or more `STATEMENT` rules

```
<SCRIPT> := STATEMENT+
```



- The `LIMIT` rule is defined as having one `PATH_SELECTOR` rule, followed by a literal `'TO'` followed by either a `COUNT` expression or an `OFFSET, COUNT` expression

```
<LIMIT> := PATH_SELECT 'TO' ( COUNT | (OFFSET ',' COUNT) )
```

