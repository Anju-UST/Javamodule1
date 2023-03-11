package ioserialization;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadingFromFileWriteToFile {

	public static void main(String[] args) throws Exception {

	FileReader reader = new FileReader("D:\\USTCORE\\ioserialization\\src\\ioserialization\\KeyboardToFile.java");
	BufferedReader buffer = new BufferedReader(reader);
			FileWriter writer = new FileWriter("copy.txt");
	String data=null;
	while((data= buffer.readLine()) !=null) {
		writer.write(data);
		System.out.println("");
	}
	writer.flush();
	writer.close();
	reader.close();
	}

}
