	import java.util.*;

	class MyScanner {
		public static void main(String argv[]) throws java.io.IOException{
			Yylex yy = new Yylex(System.in);
			Yytoken t;
			
			System.out.println("Podaj wyrażenie:");
			
			while ((t = yy.yylex()) != null)
				System.out.println(t);
		}
	}

	class Yytoken {
		public String type;
		public String attribute;
	
		Yytoken (String type){
			this.type = new String(type);
		}
		
		Yytoken (String type, String attribute){
			this.type = new String(type);
			this.attribute = new String(attribute);
		}
	
		public String toString(){
			return type + ": " + attribute;
		}
	}

%%
	INTEGER = [1-9]*[0-9]
	REAL = {INTEGER}[.][0-9]*
	NUMBER = {INTEGER}|{REAL}
	SCIENTIFIC = {NUMBER}[E|e]{INTEGER}
	
	TRYGO = (sin|cos|tg|ctg)[(]

	O_PARENTHESIS = [(\[{]
	C_PARENTHESIS = [)\]}]
	
	
	WHITESPACE = [ \t\f]
	LINE_SEPARATOR = \r|\n|\n\r|\r\n
	
	PLUS = "+"
	MINUS = -
	DZIEL = \
	MNOZ = "*"
	OPERATOR = {PLUS}|{MINUS}|{DZIEL}|{MNOZ}

	
 	/* comments */
    COMMENT = {BLOCK_COMMENT} | {LINE_COMMENT} | {JAVADOC_COMMENT}

    BLOCK_COMMENT   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    LINE_COMMENT     = "//" [^\r\n]* {LINE_SEPARATOR}?
    JAVADOC_COMMENT = "/**" {INSIDE_COMMENT} "*"+ "/"
    INSIDE_COMMENT       = ( [^*] | \*+ [^/*] )*
	
%%
	<YYINITIAL>{
		{INTEGER} { return new Yytoken("Liczba calkowita", yytext()); }
		{REAL}	{ return new Yytoken("Liczba rzeczywista", yytext()); }
	
		{SCIENTIFIC}	{ return new Yytoken("Notacja wykladnicza", yytext()); }
	
		{TRYGO}	{ return new Yytoken("F. trygonometryczna", yytext()); }
		
		"("	{ return new Yytoken("Otwarcie nawiasu", yytext()); }
		
		")"	{ return new Yytoken("Zamkniecie nawiasu", yytext()); }
			
		"["	{ return new Yytoken("Otwarcie nawiasu", yytext()); }
		
		"]"	{ return new Yytoken("Zamkniecie nawiasu", yytext()); }
		
		"{"	{ return new Yytoken("Otwarcie nawiasu", yytext()); }
		
		"}"	{ return new Yytoken("Zamkniecie nawiasu", yytext()); }
		
		{COMMENT}	{ System.out.println("Komentarz"); }
			
		{OPERATOR} { return new Yytoken("Dzialanie", yytext()); }
	}

	
	{LINE_SEPARATOR} {return new Yytoken("Koniec wyrazenia");}
	
	{WHITESPACE}	{ /* Nothning */ }
	
	[^] { throw new Error("Nieznany symbol: " + yytext()); }
