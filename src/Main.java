
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JFileChooser;

import java_cup.runtime.*;

public class Main {

	static boolean do_debug_parse = false;
	public static void main(String[] args) {
		
		try{
			
			//Writer writer = new Writer(new FileOutputStream(new File("test/wynik.txt")));
			Writer writer = new Writer(System.out);
			Parser p = new Parser(new Scanner(System.in),writer);
			//Parser p = new Parser(new Scanner(new FileInputStream(new File("test/test.txt"))), writer );
			Object result = p.parse();
			p.getWriter().writeBuffor();
//			MainWindow w = new MainWindow();
			Controller controller = new Controller();
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
}
		
		
		class Controller
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
	