
%%

%standalone
%class Calc

nl		=  \n|\r|\r\n
intNumber	=  [1-9][0-9]*

%%

{intNumber}	{System.out.println("NUMBER: " +yytext());}


"+"		{System.out.println("PLUS");}
"-"		{System.out.println("MINUS");}
"*"		{System.out.println("STAR");}
"/"		{System.out.println("DIV");}


"("		{System.out.println("OPEN_BRACKET");}
")"		{System.out.println("CLOSE_BRACKET");}

"="		{System.out.println("EQUAL\n");}

{nl}|" "|\t 	{;}

.		{System.out.println("Error: " + yytext());}

