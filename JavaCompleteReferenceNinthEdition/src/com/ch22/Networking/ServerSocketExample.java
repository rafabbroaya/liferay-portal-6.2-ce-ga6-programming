package com.ch22.Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExample {
	
	private ServerSocket server;
	private int port = 7777;

	public ServerSocketExample() {
		super();
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ServerSocketExample server = new ServerSocketExample();
		server.handleConnection();
	}
	
	public void handleConnection() {
		System.out.println("Server waiting for client connections in port: " + server.getLocalPort());
		while (true) {
			try {
				Socket socket = server.accept();
				new ConnectionHandle(socket);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
	
	class ConnectionHandle implements Runnable {

		Thread t;
		Socket socket;
		
		public ConnectionHandle(Socket socket) {
			super();
			this.socket = socket;
			t = new Thread(this);
			t.start();
		}

		@Override
		public void run() {
			try {
				DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
				System.out.println(dataInputStream.readUTF());
				DataOutputStream out = new DataOutputStream(socket.getOutputStream());
				out.writeUTF("Bye");
				socket.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
