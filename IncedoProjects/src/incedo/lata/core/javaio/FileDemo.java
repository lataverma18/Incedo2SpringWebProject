package incedo.lata.core.javaio;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f=new File("myDocs");
		File[] file=f.listFiles();
		
		for(File temp:file)
		{
			if(temp.isDirectory())
				temp.delete();
		}
	}
}
