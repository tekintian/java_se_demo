/**
 * 
 */
package com.test1;
import java.net.*;
import java.io.*;
import com.common.*;
public class MyServer  {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer ms=new MyServer();
	}
	
	public MyServer()
	{
		try {
			System.out.println("��3456�˿ڼ�������");
			ServerSocket ss=new ServerSocket(3456);
			Socket s=ss.accept();
			//�Զ���������ʽ��ȡ
			ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
			User u=(User)ois.readObject();
			
			//���
			System.out.println(u.getName()+u.getPass());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
