%%

//Write a lexical analyzer by means of a JFLEX program which, given one or more C sources as input, recognizes
//all the language elements (numerical constants, strings, preprocessor directives, keywords and comments) and
//produces as output an HTML file where each element results highlighted with a different color. All the input files
//must appear in a unique HTML file preceded by the name of the original source file. Note that in HTML colors
//are expressed with a “#” followed by three pairs of exadecimal digits, each one represented by a fundamental
//component of the RGB tern (e.g. “#FF0000” is a bright red, “#0000FF” is blue and so on)

%standalone
%class Lab1

nl          = \n|\r|\r\n

Code        = ({Directive}|{Keyword}|{Identifier}|{Number}|{StringLiteral}|{Comment})*
Library     = {Alpha}+".h"
Directive   = "#include"" "?"<"{Library}">"
Digit       = [0-9]
Alpha       = [a-zA-Z]
AlphaDigit  = [a-zA-Z0-9]
HexaDec     = [0-9a-fA-F]
Comment     = "/*"{AlphaDigit}*" "*{AlphaDigit}*"/"
Keyword     = ("auto"|"break"|"case"|"char"|"const"|"continue"|"default"|"do"|"double"|"else"|"enum"|"extern"|"float"|"for"|"goto"|"if"|"int"|"long"|"register"|"return"|"short"|"signed"|"sizeof"|"static"|"struct"|"switch"|"typedef"|"union"|"unsigned"|"void"|"volatile"|"while")
Identifier  = {Alpha}({AlphaDigit})*
Number      = {Digit}+
StringLiteral = "\"([^\"\n\r]|\\.)*\""

%%

{Library}       {System.out.println("<FONT COLOR=\"#FF0000\">" + yytext() + "</FONT>");}
{Directive}     {String s = yytext(); s = s.split(" ")[1]; System.out.println("<FONT COLOR=\"#00FF00\">#include &lt;" + s + ".h&gt;</FONT>");}
{Comment}       {System.out.println("<FONT COLOR=\"#FF00FF\">" + yytext() + "</FONT>");}
{Keyword}       {System.out.println("<FONT COLOR=\"#0000FF\">" + yytext() + "</FONT>");}
{Identifier}    {System.out.println("<FONT COLOR=\"#008000\">" + yytext() + "</FONT>");}
{Number}        {System.out.println("<FONT COLOR=\"#FFA500\">" + yytext() + "</FONT>");}
{StringLiteral} {System.out.println("<FONT COLOR=\"#800080\">" + yytext() + "</FONT>");}
{nl}|" "|\t      {System.out.println(yytext());}
.               {System.out.print(yytext());}

// nl 			    = \n|\r|\r\n

// Code            = ({Directive}*)? 
// Library         = {Alpha}+".h"
// Directive       = "#include"" "?"<"{Library}">"
// Digit           = [0-9]
// Alpha           = [a-zA-Z]
// AlphaDigit      = [a-zA-Z0-9]
// HexaDec         = [0-9a-fA-F]
// Comment         = "/*"{AlphaDigit}*" "*{AlphaDigit}*"/"\*
// // add others...

// %%
// {Library}        {System.out.println("Library :"+yytext());}
// {Directive}      {String s = yytext(); s = s.split(" ")[1]; System.out.println("<FONT COLOR=#00FF00>#include &lt;"+ s +".h&gt;</FONT>");}
// {Comment}		 {System.out.println("Comment :"+yytext());}

// {Code}		     {System.out.println("Include :"+yytext());}
// {nl}|" "|\t   {;}
// .		{System.out.print(yytext() + " ");}
