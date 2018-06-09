package com.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server03 {
	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(8888);
			System.out.println("服务器已启动");
			Socket s = ss.accept();
			// 构建IO流
			while (true) {
				BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				String mess = br.readLine();
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				// 为了证明是服务器返回的数据，我对mess修改在发送到客户端
				String str = "服务器>>" + mess + "\n";
				bw.write(str);
				bw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
