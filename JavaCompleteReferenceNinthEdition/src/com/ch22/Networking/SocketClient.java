package com.ch22.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {

	public static void main(String[] args) {
		try {
			InetAddress inetAddress = InetAddress.getLocalHost();
			Socket socketClient = new Socket(inetAddress.getHostName(), 7777);
			OutputStream out = socketClient.getOutputStream();
			DataOutputStream dataOut = new DataOutputStream(out);
			dataOut.writeUTF("Hello");
			DataInputStream in = new DataInputStream(socketClient.getInputStream());
			System.out.println(in.readUTF());
			socketClient.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
