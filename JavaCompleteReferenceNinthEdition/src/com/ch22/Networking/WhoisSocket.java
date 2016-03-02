package com.ch22.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class WhoisSocket {

	public static void main(String[] args) {

		try {
			//Create a socket connected to internic.net on port 43
			Socket s = new Socket("whois.internic.net", 43);
			
			//Obtain I/O strems
			InputStream in = s.getInputStream();
			OutputStream out = s.getOutputStream();
			
			//Construct a request string
			String str = "MHProfessional.com";
			
			//Convert to bytes
			byte[] buffer = str.getBytes();
			
			//Send request
			out.write(buffer);
			
			//Read and display the result
			int c;
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			s.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
