package _7.exception.handling;

import java.io.*;

public class MultipleExceptions {
	public static void main(String args[]) {
		FileInputStream fis = null;
		FileInputStream fis2 = null;
		try {
			fis = new FileInputStream("file.txt");
			System.out.println("File Opened");
			fis.read();
			System.out.println("Read File");
		}

		catch (FileNotFoundException fnfe) {
			System.out.println("File not found");
		}

		catch (IOException ioe) {
			System.out.println("File Closing Exception");
		}

		finally {
			try {
				fis = new FileInputStream("file.txt");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("finally");
		}
		System.out.println("Next task..");
	}
}
