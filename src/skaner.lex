	import java.util.*;
	import java_cup.runtime.*;

%%
%class Scanner
%line
%column
%cup

%{
/*
	Ten kod zostanie wstawiony do wygenerowanej klasy skanera.
*/
	/**
	*	Metoda tworzy nowy Symbol (token) wraz z okreœleniem jego pozycji, bez wartoœci.
	**/
	private Symbol symbol(int type){
		return new Symbol(type, yyline, yycolumn);
	}

	/**
	*	Metoda tworzy nowy Symbol (token) wraz z okreœleniem jego pozycji i wartoœci.
	**/
	private Symbol symbol(int type, Object value){
		return new Symbol(type, yyline, yycolumn, value);
	}
%}


	INTEGER = 0|[1-9]*[0-9]
	REAL = {INTEGER}[.][0-9]+
	NUMBER = {INTEGER}|{REAL}
	
	WHITESPACE = [ \t\f]
	LINE_SEPARATOR = \r|\n|\n\r|\r\n
	
 	/* Wyra¿enia wy³apuj¹ce komentarze */
    COMMENT = {BLOCK_COMMENT} | {LINE_COMMENT} | {JAVADOC_COMMENT}

    BLOCK_COMMENT   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    LINE_COMMENT     = "//" [^\r\n]* {LINE_SEPARATOR}?
    JAVADOC_COMMENT = "/**" {INSIDE_COMMENT} "*"+ "/"
    INSIDE_COMMENT       = ( [^*] | \*+ [^/*] )*
	
%%
	<YYINITIAL>{
		{NUMBER}			{ return symbol(sym.NUMBER, new Double(yytext())); }
		
		{LINE_SEPARATOR}	{ return symbol(sym.NEW_LINE); }
		
		"("					{ return symbol(sym.LPARENT); }
		")"					{ return symbol(sym.RPARENT); }
		
		"+"					{ return symbol(sym.PLUS); }
		"-"					{ return symbol(sym.MINUS); }
		"*"					{ return symbol(sym.TIMES); }
		"/"					{ return symbol(sym.DIVIDE); }
		"^"					{ return symbol(sym.POW); }
		
		"sin"				{ return symbol(sym.SIN); }
		"cos"				{ return symbol(sym.COS); }
		"tan"				{ return symbol(sym.TAN); }
		"ctg"				{ return symbol(sym.CTG); }
		
		
		
		{COMMENT}			{ /* Ignorujemy komentarze */ }
		{WHITESPACE}		{ /* Ignorujemy bia³e znaki */ }
		
		[^] { throw new Error("Nieznany symbol: <" + yytext() + "> on " + yyline + ":" + yycolumn); }
	}
	
	
	
	
