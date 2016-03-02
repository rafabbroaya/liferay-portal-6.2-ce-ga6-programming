package com.ch22.Networking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLConnectionDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.internic.net/index.html");
			
			System.out.println("Protocol: " + url.getProtocol());
			System.out.println("Port: " + url.getPort());
			System.out.println("Host: " + url.getHost());
			System.out.println("File: " + url.getFile());
			System.out.println("Ext: " + url.toExternalForm());
			
			URLConnection hpCon = url.openConnection();
			
			long date = hpCon.getDate();
			if (date == 0) {
				System.out.println("No date info");
			} else {
				System.out.println("Date: " + new Date(date));
			}
			
			System.out.println("Content-type: " + hpCon.getContentType());
			
			date = hpCon.getExpiration();
			if (date == 0) {
				System.out.println("No date expiration info");
			} else {
				System.out.println("Date Expiration: " + new Date(date));
			}
			
			date = hpCon.getLastModified();
			if (date == 0) {
				System.out.println("No date last modified info");
			} else {
				System.out.println("Date last modified: " + new Date(date));
			}
			
			long len = hpCon.getContentLengthLong();
			
			if (len == -1) {
				System.out.println("Content lenght unavailable");
			} else {
				System.out.println("Content-Length: " + len);
			}
			
			if (len > 0) {
				System.out.println("======Content======");
				InputStream in = hpCon.getInputStream();
				int c;
				while((c=in.read())!=-1) {
					System.out.print((char)c);
				}
				in.close();
			} else {
				System.out.println("No content avalilable");
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
