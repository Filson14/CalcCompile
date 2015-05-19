import java.io.*;

public class Main {

	static boolean do_debug_parse = false;
	public static void main(String[] args) {
		try{
			Parser p = new Parser(new Scanner(System.in));
			Object result = p.parse().value;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}

	}

}
