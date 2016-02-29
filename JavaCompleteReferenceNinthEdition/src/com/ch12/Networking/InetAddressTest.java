package com.ch12.Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress encapsulate ip and domain name.
 * 
 * @author rsanchez
 *
 */
public class InetAddressTest {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			printData(inetAddress);
			
			inetAddress = InetAddress.getByName("www.herbschildt.com");
			printData(inetAddress);
			
			InetAddress listInetAddress[] = InetAddress.getAllByName("www.nba.com");
			for (int i = 0; i < listInetAddress.length; i++) {
				printData(listInetAddress[i]);
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void printData(InetAddress inetAddress) {
		System.out.println(inetAddress);
		System.out.println(inetAddress.isMulticastAddress());
		System.out.println();
	}
}
