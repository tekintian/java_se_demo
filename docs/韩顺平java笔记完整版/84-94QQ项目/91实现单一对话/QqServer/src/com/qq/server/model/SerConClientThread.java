/**
 * ���ܣ���������ĳ���ͻ��˵�ͨѶ�߳�
 * 
 */
package com.qq.server.model;
import java.net.*;
import java.io.*;
import com.qq.common.*;
public class SerConClientThread extends Thread{

	Socket s;
	public SerConClientThread(Socket s)
	{
		//�ѷ������͸ÿͻ��˵����Ӹ���s
		this.s=s;
	}
	public void run()
	{
		while(true)
		{
			//������Խ��տͻ��˵���Ϣ
			try {
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
				Message m=(Message)ois.readObject();
				
				System.out.println(m.getSender()+"��"+m.getGetter()+"˵"+m.getCon());
				
				//һ�����ת������
				//ȡ�ý����˵�ͨѶ�߳�
				SerConClientThread sc=ManagerClientThread.getClientThread(m.getGetter());
				ObjectOutputStream oos=new ObjectOutputStream(sc.s.getOutputStream());
				oos.writeObject(m);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
