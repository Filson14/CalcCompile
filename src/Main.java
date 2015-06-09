import java.io.*;

import java_cup.runtime.*;

public class Main {

	static boolean do_debug_parse = false;
	public static void main(String[] args) {
		
		
		try{
			
			Writer writer = new Writer(new FileOutputStream(new File("test/wynik.txt")));
			//Writer writer = new Writer(System.out);
			//Parser p = new Parser(new Scanner(System.in),writer);
			Parser p = new Parser(new Scanner(new FileInputStream(new File("test/test.txt"))), writer );
			Object result = p.parse();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
		
		
		/*
		Scanner scaner;
		try {
			//scaner = new Scanner(new FileInputStream(new File("test/test.txt")));
			scaner = new Scanner(System.in);
			Symbol s;
			while((s = scaner.next_token()).sym != 0){
			}
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
		*/
	}

}