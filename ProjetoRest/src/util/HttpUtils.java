package util;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import android.util.Log;

public class HttpUtils {
	public static String doGet(String endereco){
		try {
			URL url = new URL(endereco);
			URLConnection conn = url.openConnection();
			InputStream is = conn.getInputStream();
			Scanner scanner = new Scanner(is);
			String conteudo = scanner.useDelimiter("\\A").next();
			scanner.close();
			return conteudo;
		} catch (Exception e) {
			Log.e("Error",e.getMessage());
			return null;
		}
	}
	public static String doPost(String endereco, String cont){
		try {
			URL url = new URL(endereco);
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Content-Type", "application/xml");
			
			OutputStream os = conn.getOutputStream();
			PrintWriter out = new PrintWriter(os);
			out.print(cont);
			out.close();
			
	        InputStream stream = conn.getInputStream();
	        conn.disconnect();

	        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
	        String result = "";
	        String line;
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        	result+= line;
	        }

	        br.close();
	        return result;
        } catch (Exception e) {
			Log.e("Error",e.getMessage());
			return null;
		}
	}
	public static String doDelete(String endereco){
		try {
			URL url = new URL(endereco);
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("DELETE");
			
		
	        InputStream stream = conn.getInputStream();
	        conn.disconnect();

	        //put output stream into a string
	        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
	        String result = "";
	        String line;
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        	result+= line;
	        }

	        br.close();
	        return result;
        } catch (Exception e) {
			Log.e("Error",e.getMessage());
			return null;
		}
	}
	public static String doPut(String endereco, String cont){
		try {
			URL url = new URL(endereco);
			
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.setDoOutput(true);
			conn.setRequestMethod("PUT");
			conn.setRequestProperty("Content-Type", "application/xml");
			
			OutputStream os = conn.getOutputStream();
			PrintWriter out = new PrintWriter(os);
			out.print(cont);
			out.close();
			
	        InputStream stream = conn.getInputStream();
	        conn.disconnect();

	        BufferedReader br = new BufferedReader(new InputStreamReader(stream));
	        String result = "";
	        String line;
	        while ((line = br.readLine()) != null) {
	        	System.out.println(line);
	        	result+= line;
	        }

	        br.close();
	        return result;
        } catch (Exception e) {
			Log.e("Error",e.getMessage());
			return null;
		}
	}
}