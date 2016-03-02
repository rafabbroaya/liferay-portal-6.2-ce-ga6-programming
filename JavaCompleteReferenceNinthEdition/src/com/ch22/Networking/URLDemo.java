package com.ch22.Networking;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo {

	public static void main(String[] args) {
		try {
			URL hp = new URL("http://www.herbschildt.com/WhatsNew");
			
			System.out.println("Protocol: " + hp.getProtocol());
			System.out.println("Port: " + hp.getPort());
			System.out.println("Host: " + hp.getHost());
			System.out.println("File: " + hp.getFile());
			System.out.println("Ext: " + hp.toExternalForm());
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
