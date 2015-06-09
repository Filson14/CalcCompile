import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
	private FileDialog fileDialog;
	private JRadioButton inputConsole;
	private JRadioButton inputFile;
	
	public FileDialog getFileDialog()
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
		return inputFileName.getText();
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
		compile = new JButton("Compile");
		leftPanel  = new JPanel();
		rightPanel = new JPanel();
		inputBrowse = new JButton("Browse");
		splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		JPanel temp1 = new JPanel();
		inputFileName = new JTextField();
		outputFile = new  JRadioButton("Output to file");
		outputConsole = new JRadioButton("Output to console");
		
		fileDialog = new FileDialog(this);
		fileDialog.setVisible(false);
		
		fileDialog.setFilenameFilter(new FilenameFilter() {
		    @Override
		    public boolean accept(File dir, String name) {
		        return name.endsWith(".txt");
		    }
		});
		
        GridBagConstraints gbc = new GridBagConstraints();
		
		splitPane.setResizeWeight(1);

		mainPanel.add(splitPane);
		rightPanel.setLayout(new GridBagLayout());
		
		inputFileName.setText("...");
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
		temp1.add(inputFileName);
		temp1.add(inputBrowse);
		ButtonGroup btnGroup = new ButtonGroup();
		btnGroup.add(outputConsole);
		btnGroup.add(outputFile);
		temp1.add(outputConsole);
		temp1.add(outputFile);
		temp1.add(compile);
		outputConsole.setSelected(true);
		
		
		inputBrowse.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fileDialog.setVisible(true);
				String fn = fileDialog.getFile();
				if(fn == null)
				{
					outputArea.append("Cancelled");
					
				}
				else
				{
					outputArea.append("Chosen file : " + fn);
					inputFileName.setText(fn);
				}
				
				
				
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
}
