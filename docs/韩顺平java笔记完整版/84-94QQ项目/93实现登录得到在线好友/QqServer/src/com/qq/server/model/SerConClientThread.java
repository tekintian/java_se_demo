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
				
			//	System.out.println(m.getSender()+"��"+m.getGetter()+"˵"+m.getCon());
				//�Դӿͻ���ȡ�õ���Ϣ���������жϣ�Ȼ������Ӧ�Ĵ���
				if(m.getMesType().equals(MessageType.message_comm_mes))
				{
					//һ�����ת������
					//ȡ�ý����˵�ͨѶ�߳�
					SerConClientThread sc=ManagerClientThread.getClientThread(m.getGetter());
					ObjectOutputStream oos=new ObjectOutputStream(sc.s.getOutputStream());
					oos.writeObject(m);
				}else if(m.getMesType().equals(MessageType.message_get_onLineFriend))
				{
					System.out.println(m.getSender()+"Ҫ���ĺ�����Ϣ");
					//�Ѹ÷������ĺ��ѷ��ظ��ͻ���
					String  res=ManagerClientThread.getAllOnLineUserid();
					Message m2=new Message();
					m2.setMesType(MessageType.message_ret_onLineFriend);
					m2.setCon(res);
					m2.setGetter(m.getSender());
					ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
					oos.writeObject(m2);
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
	}
}
