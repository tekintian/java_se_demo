package com.test2;
import java.net.*;
import java.io.*;
import com.common.*;
public class MyClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient mc=new MyClient();
	}
	
	public MyClient()
	{
		try {
			Socket s=new Socket("127.0.0.1",3456);
			//ͨ��ObjectOutputStream�����������Ͷ���
			ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
			User u=new User();
			u.setName("ɣ��");
			u.setPass("123");
			oos.writeObject(u);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}
}
