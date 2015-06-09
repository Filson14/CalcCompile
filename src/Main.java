import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JFileChooser;

import java_cup.runtime.*;

public class Main {

	static boolean do_debug_parse = false;

	public static void main(String[] args) {

		try {

			// Writer writer = new Writer(new FileOutputStream(new
			// File("test/wynik.txt")));
			Writer writer = new Writer(System.out);
			Parser p = new Parser(new Scanner(System.in), writer);
			// Parser p = new Parser(new Scanner(new FileInputStream(new
			// File("test/test.txt"))), writer );
			// MainWindow w = new MainWindow();
			Controller controller = new Controller();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}

class Controller {
	MainWindow mainWindow;
	Writer writer;
	Parser parser;

	public Controller() {
		parser = new Parser();
		mainWindow = new MainWindow();
		mainWindow.setVisible(true);
		mainWindow.getCompile().addActionListener(new CompileListener());
	}

	public class CompileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (writer != null)
				writer = null;
			mainWindow.getOutputArea().setText("");
			Scanner scanner;
			String outputName = "";
			try {
				if (mainWindow.getInputConsole().isSelected()) {
					System.out.println(mainWindow.getConsoleText());
					String text = mainWindow.getConsoleText()+ "\n";
					scanner = new Scanner( new ByteArrayInputStream(text.getBytes("UTF-8")));
					// outputName = "consoleOutput" + Math.random() * 1000 +
					// ".txt";
				} else {
					String filename = mainWindow.getInputFile().getText();

					// outputName = filename.substring(0, filename.length()-4)+
					// "_result.txt";
					System.out.println(mainWindow.getInputFileName().getText());
					scanner = new Scanner(new FileInputStream(new File(
							mainWindow.getInputFileName().getText())));
				}
				if (mainWindow.getOutputConsole().isSelected()) {
					writer = new Writer(System.out);
					mainWindow.write(writer.getBuffor());
				} else {
					JFileChooser chooser = new JFileChooser();
					// FileNameExtensionFilter filter = new
					// FileNameExtensionFilter("txt");
					// chooser.setFileFilter(filter);

					chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
					int returnVal = chooser.showSaveDialog(null);
					if (returnVal == JFileChooser.APPROVE_OPTION) {

						mainWindow.write("Chosen folder : \n"
								+ chooser.getCurrentDirectory().getName());

						writer = new Writer(new FileOutputStream(new File(
								chooser.getCurrentDirectory().getAbsolutePath()
										+ File.separatorChar
										+ chooser.getSelectedFile().getName())));

					} else {
						mainWindow.write("Cancelled\n");
					}
				}
//				parser.setScanner(scanner);
//				parser.setWriter(writer); 
				parser = new Parser(scanner, writer);
				parser.parse();
				if(mainWindow.getOutputConsole().isSelected())mainWindow.getOutputArea().append(writer.getBuffor());
					writer.writeBuffor();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {

			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}

	public class FileListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

		}

	}

}
