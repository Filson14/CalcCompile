import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;

import javax.swing.BoxLayout;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.sun.org.apache.bcel.internal.generic.FMUL;


public class MainWindow extends JFrame{


	private JSplitPane splitPane;
	private JPanel leftPanel;
	private JPanel rightPanel;
	private JButton compile;
	private JButton inputBrowse;
	private JTextArea outputArea;
	private JTextArea inputArea;
	private JTextField inputFileName;
	private JRadioButton outputFile;
	private JRadioButton outputConsole;
	private JFileChooser fileDialog;
	private JRadioButton inputConsole;
	private JRadioButton inputFile;
	
	public JFileChooser getFileDialog()
	{
		return fileDialog;
	}
	
	public JRadioButton getOutputConsole()
	{
		return outputConsole;
	}
	public JRadioButton getOutputFile()
	{
		return outputFile;
	}
	public void write(String line)
	{
		outputArea.append(line);
	}
	public String getConsoleText()
	{
		return inputArea.getText();
	}
	public String getFileName()
	{
		return getInputFileName().getText();
	}
	
	
		public MainWindow() 
		{
			super();
			initialize();
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		new JFrame();
		setBounds(100, 100, 450, 360);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultLookAndFeelDecorated(true);
		setVisible(true);
		getContentPane().setLayout(new BorderLayout());
		JPanel mainPanel = new JPanel();
		getContentPane().add(mainPanel, BorderLayout.CENTER);
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		inputArea = new JTextArea();
		outputArea = new JTextArea();
		setCompile(new JButton("Compile"));
		leftPanel  = new JPanel();
		rightPanel = new JPanel();
		inputBrowse = new JButton("Browse");
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JPanel temp1 = new JPanel();
		setInputFileName(new JTextField());
		outputFile = new  JRadioButton("Output to file");
		outputConsole = new JRadioButton("Output to console");
		
		inputConsole = new JRadioButton("Input from console");
		inputFile = new JRadioButton("Input from file");
		inputConsole.setSelected(true);
		ButtonGroup btnGroup2 = new ButtonGroup();
		btnGroup2.add(inputConsole);
		btnGroup2.add(inputFile);
		
		
		
        GridBagConstraints gbc = new GridBagConstraints();
		
		splitPane.setResizeWeight(1);

		mainPanel.add(splitPane);
		rightPanel.setLayout(new GridBagLayout());
		
		getInputFileName().setText("...");
		temp1.setLayout(new BoxLayout(temp1, BoxLayout.Y_AXIS));
		leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
		leftPanel.add(inputArea);
		leftPanel.add(new JSeparator(SwingConstants.HORIZONTAL));
		leftPanel.add(outputArea);
		outputArea.setEditable(false);
		inputArea.setSize((int) (this.WIDTH/(2.2)), (int) (this.HEIGHT/(2.2)));
		
		splitPane.setRightComponent(rightPanel);
		splitPane.setLeftComponent(leftPanel);
		splitPane.setEnabled(false);
		
		rightPanel.add(temp1);
		temp1.add(inputConsole);
		temp1.add(inputFile);
		temp1.add(getInputFileName());
		temp1.add(inputBrowse);
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(outputConsole);
		btnGroup.add(outputFile);
		temp1.add(outputConsole);
		temp1.add(outputFile);
		temp1.add(getCompile());
		outputConsole.setSelected(true);
		
		
		inputBrowse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				
				 JFileChooser chooser = new JFileChooser();
//				    FileNameExtensionFilter filter = new FileNameExtensionFilter("txt");
//				    chooser.setFileFilter(filter);
				    int returnVal = chooser.showOpenDialog(null);
				    if(returnVal == JFileChooser.APPROVE_OPTION) {
				    	

						outputArea.append("Chosen file : " + chooser.getSelectedFile().getAbsolutePath()+ "\n");
						getInputFileName().setText(chooser.getSelectedFile().getAbsolutePath());
				    }
				    else
				    {
				    	outputArea.append("Cancelled\n");
				    }
//				String fn = fileDialog.getFile();
//				if(fn == null)
//				{
//					outputArea.append("Cancelled");
//					
//				}
//				else
//				{
//					outputArea.append("Chosen file : " + fn);
//					inputFileName.setText(fn);
//				}
				
				
				
			}
		});
		
		
		
	}

	public JRadioButton getInputConsole() {
		return inputConsole;
	}

	public void setInputConsole(JRadioButton inputConsole) {
		this.inputConsole = inputConsole;
	}

	public JRadioButton getInputFile() {
		return inputFile;
	}

	public void setInputFile(JRadioButton inputFile) {
		this.inputFile = inputFile;
	}

	public JButton getCompile() {
		return compile;
	}

	public void setCompile(JButton compile) {
		this.compile = compile;
	}

	public JTextField getInputFileName() {
		return inputFileName;
	}

	public void setInputFileName(JTextField inputFileName) {
		this.inputFileName = inputFileName;
	}
}
