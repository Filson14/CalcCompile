import java.io.*;

import java_cup.runtime.*;

public class Main {

	static boolean do_debug_parse = false;
	public static void main(String[] args) {
		try{
			Parser p = new Parser(new Scanner(System.in));
			Object result = p.parse();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
//		Scanner scaner = new Scanner(System.in);
//		Symbol s;
//		try {
//			while((s = scaner.next_token()) != null){
//				System.out.println(s.sym);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

	}

}