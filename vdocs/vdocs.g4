grammar vdocs;

/*
 * Parser Rules
 */

variables
	:	(variable SEMICOLON)*
	;

variable
	:	namedElement COLON stringValue
	;

stringValue
	:	STRING
	;

namedElement
	:	NAMEDELEMENT
	;

compileUnit
	:	EOF
	;

/*
 * Lexer Rules
 */



NAMEDELEMENT  
	:	[a-zA-Z_@] [a-zA-Z0-9@_-]*
    ;

COLON
    :   ':'
    ;

SEMICOLON
    :   ';'
    ;

STRING
    :	'"' ( ESC_SEQ | ~('\\'|'"') )* '"'
	|	'\'' ( ESC_SEQ | ~('\\'|'\'') )* '\''
    ;

WS  :   [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/'    -> channel(HIDDEN) // match anything between /* and */
    ;

LINE_COMMENT
    :   '//' ~[\r\n]* '\r'? '\n' -> channel(HIDDEN)
    ;

fragment
ESC_SEQ
    :   '\\' [btnfr"'\\]
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment
OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment
HEX_DIGIT 
    :   ('0'..'9'|'a'..'f'|'A'..'F') 
    ;

fragment
UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
