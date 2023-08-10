package java.byteapp;
import java.io.*;


public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileOutputStream fstream= new FileOutputStream("bufferdata");
			BufferedOutputStream bufferedout=new BufferedOutputStream(fstream);
			
			bufferedout.write("Developer name: Janhavi,Bug no.: 1,Bug Description: Ioexception".getBytes());
		
			bufferedout.flush();
			bufferedout.close();
			
			
			
			
			
			
		}
		
		
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
