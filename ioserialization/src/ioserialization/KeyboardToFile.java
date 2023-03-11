package ioserialization;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class KeyboardToFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("entered main");
		
		String data=null;
		/*
		 * Object fr = null; BufferedReader reader = new BufferedReader((Reader) fr);
		 */
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader reader =new BufferedReader(isr);// reading strings from keyboard
		
		FileWriter writer=new FileWriter("Myfile.txt");
		System.out.println("enter some text");
		data = reader.readLine();
	
		while(! data.equals("quit")) {
		//System.out.println("you have entered data...."+data);
		writer.write(data);
		data = reader.readLine(); 
		}
		writer.flush();
		writer.close();
		reader.close();
		System.out.println("main exited...");
		

	}

}
