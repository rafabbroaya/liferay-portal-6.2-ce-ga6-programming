package com.ch22.Networking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpURLDemo {

	public static void main(String[] args) {
		try {
			URL hp = new URL("http://www.google.com");
			HttpURLConnection hpCon = (HttpURLConnection)hp.openConnection();
			
			System.out.println("Request Method: " + hpCon.getRequestMethod());
			System.out.println("Response Code: " + hpCon.getResponseCode());
			System.out.println("Response Message: " + hpCon.getResponseMessage());
			
			Map<String, List<String>> map = hpCon.getHeaderFields();
			Set<String> set = map.keySet();
			
			for (String string : set) {
				System.out.println("Key: " + string + " Value: "+ map.get(string));
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
