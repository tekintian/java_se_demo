/**
 * ���ǿͻ��˺ͷ������˱���ͨѶ���߳�
 */
package com.qq.client.tools;
import java.io.*;
import java.net.*;
import com.qq.common.*;
import com.qq.client.tools.*;
public class ClientConServerThread extends Thread{

	private Socket s;
	
	public ClientConServerThread(Socket s)
	{
		this.s=s;
		
	}
	public void run()
	{
		while(true)
		{
			//��ͣ�Ķ�ȡ�ӷ������˷�������Ϣ
			try {
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
				Message m=(Message)ois.readObject();
				System.out.println("��ȡ���ӷ�������������Ϣ"+m.getSender()+"��"+m.getGetter()+"����"+m.getCon());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public Socket getS() {
		return s;
	}
	public void setS(Socket s) {
		this.s = s;
	}
}
