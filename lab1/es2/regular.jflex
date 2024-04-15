%%

// Write the regular definitions and the correspondent JFLEX program for recognizing a subset of the URL defined by HTTP. 
// This subset must include: 
// • The recognition of more than one scheme (like http:, ftp:, gopher: and similar ones). 
// • The domains expressed as names (e.g. www.polito.it) or as IP addresses (e.g. 130.192.4.4) 
// • The use of ports different from the default one for the current scheme (domain followed by “:” and by the number of the alternative port). 
// • The use of anchors in the HTML file (file name followed by a “#” and by the anchor name). 
// • Sequences of escape (i.e. the character “%” followed by a pair of exadecimal digits) in any position.

%standalone
%class Lab1

nl 			= \n|\r|\r\n
URL             = {Scheme}":" "//" ({DomainName} | {DomainIP} | "localhost" ) (":"{Port})? ({Path}+)? {FileType}? "/"?
Digit           = [0-9]
Alpha           = [a-zA-Z]
AlphaDigit      = [a-zA-Z0-9]
HexaDec         = [0-9a-fA-F]
Scheme          = ( "http" | "https" | "ftp" | "nntp" | "gopher" )
DomainName      = (({AlphaDigit}+)? \. {AlphaDigit}+ \. {AlphaDigit}+) 
DomainIP        = ((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)
Port            = [1-9]([0-9]{3})?
Path            = "/"("%"{HexaDec}+)?{AlphaDigit}+
FileType		= \.({AlphaDigit}+"/"? | "html"{Anchor}?)
Anchor          = "#"{AlphaDigit}+

%%
{URL}		{System.out.println("URL [Ok] :"+yytext());}
			
{nl}|" "|\t   {;}

.		{System.out.println("Error: " + yytext());}
