%%

// Write a scanner for the C programming language. 
// The scanner must: 
// Recognize the C language comments ( /* and */ ) 
// Recognize the symbols: “{“, “}”, “(“, “)”, “[“, “]”, “+”, “-”, “*”, “/”, “=”, “;”, “.”, “,”, “<”, “>”, “&”, “|”, “!”. 
// Recognize some C keywords: int, double, if, else, while, print 
// Recognize integer and double numbers 
// Any #include, space, tab and newline must be discarded 


// The scanner must provide as output the recognized units (the TOKENS) printing them separated by a space. 
// Regarding the integers, the double numbers and the identifiers, it must also print, in addition to the recognized token, the token value (e.g. INT:30) 
// The recognized C language is a simplified version where functions do not exist and the variables can be declared only at the beginning of the file. 

// NB: The scanner written for this laboratory will be used in the next laboratories for building a complete compiler. 
// This compiler will be able to compile programs similar to the one shown in the following example.

%standalone
%class Lab2

nl          = \n|\r|\r\n

// Code        = ({Directive}|{Keyword}|{Identifier}|{Double}|{Integer}|{Symbols}|{Comment})*
Directive   = "#include"" "?"<"{Alpha}+".h>"
Alpha       = [a-zA-Z]
AlphaDigit  = [a-zA-Z0-9]
Comment     = "/*"{AlphaDigit}*" "*{AlphaDigit}*"/"
Keyword     = ("int"|"double"|"if"|"else"|"while"|"print")
Integer     = 
Double      =

Identifier  = {Alpha}({AlphaDigit})*
IntNumb     = ("+"|"-")?[0-9]+
DoubleNumb  = ("+"|"-")?([1-9][0-9]*"."[0-9]*)|( "." [0-9]+ )|( 0 "." [0-9]*)
Symbols     = ("{"|"}"|"("|")"|"["|"]"|"+"|"-"|"*"|"/"|"="|";"|"."|","|"<"|">"|"&"|"|"|"!")

%%

{Directive}     {;}
{Comment}       {;}
{Symbols}       {}
{Keyword}       {System.out.println(yytext() + "");}
{Identifier}    {System.out.println("<FONT COLOR=\"#008000\">" + yytext() + "</FONT>");}
{Number}        {System.out.println("<FONT COLOR=\"#FFA500\">" + yytext() + "</FONT>");}
{StringLiteral} {System.out.println("<FONT COLOR=\"#800080\">" + yytext() + "</FONT>");}
{nl}|" "|\t      {System.out.println(yytext());}
.               {System.out.print(yytext());}
