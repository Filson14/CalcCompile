import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.stream.Stream;


public class Writer {

	private StringBuilder sb;
	
	private PrintStream output;
	
	public Writer(OutputStream stream)
	{
		sb = new StringBuilder("");
		setStream(stream);
	}
	
	public void write(String msg)
	{
		sb.append(msg);
//		output.print(msg);
	}
	
	public void writeBuffor(){
		output.print(sb.toString());
		output.close();
	}
	
	public String getBuffor(){
		
		return sb.toString();
	}
	
	public void setStream(OutputStream stream)
	{
		output = new PrintStream(stream);
	}
}
