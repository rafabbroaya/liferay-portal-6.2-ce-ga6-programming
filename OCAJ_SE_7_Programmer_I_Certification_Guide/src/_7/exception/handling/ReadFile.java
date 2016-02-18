package _7.exception.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	static public void main(String... args) {
		FileInputStream file = null, file2 = null;
		try {
			file = new FileInputStream(
					"D:\\DESARROLLO\\WorkSpaceEclipseLuna32bits\\OracleJavaCertificationProgramming\\src\\com\\properties\\Test.properties");
			try {
				file2 = new FileInputStream("");
				file.read();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println("File Open");
			file.read();
			System.out.println("ReadFile");
		} catch (FileNotFoundException e) {
			System.out.println("File Not found");
		} catch (IOException e) {
			System.out.println("File closing exception");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Next Task");
		
	}

}
