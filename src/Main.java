
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JFileChooser;

import java_cup.runtime.*;

public class Main {

	static boolean do_debug_parse = false;
	private MainWindow mainWindow;
	public static void main(String[] args) {
		
		try{
			
			Writer writer = new Writer(new FileOutputStream(new File("test/wynik.txt")));
			//Writer writer = new Writer(System.out);
			//Parser p = new Parser(new Scanner(System.in),writer);
			Parser p = new Parser(new Scanner(new FileInputStream(new File("test/test.txt"))), writer );
			Object result = p.parse();
			p.getWriter().writeBuffor();
			MainWindow w = new MainWindow();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
		
		
		public class Controller
		{
			MainWindow mainWindow;
			Writer writer;
			Parser Parser;
			public Controller()
			{
				mainWindow= new MainWindow();
				
			}
			
			public class CompileListener implements ActionListener
			{

				@Override
				public void actionPerformed(ActionEvent e) {
					if(mainWindow.getInputConsole().isSelected())
					{
						// stream za stringa
					}
					else
					{
						
					}
					if(mainWindow.getOutputConsole().isSelected())
					{
//						mainWindow.write(); writer.writeBuffor();
					}
					else
					{
						
					}
					
				}
				
			}
			public class FileListener implements ActionListener
			{

				@Override
				public void actionPerformed(ActionEvent e) {
				
				}
				
			}

			
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