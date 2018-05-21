/**
 * ���ǿͻ��˺ͷ������˱���ͨѶ���߳�
 */
package com.qq.client.tools;
import java.io.*;
import java.net.*;
import com.qq.common.*;
import com.qq.client.tools.*;
import com.qq.client.view.*;
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
			//	System.out.println("��ȡ���ӷ�������������Ϣ"+m.getSender()+"��"+m.getGetter()+"����"+m.getCon());  
				
				if(m.getMesType().equals(MessageType.message_comm_mes))   
				{
					//�Ѵӷ������õ�����Ϣ��ʾ������ʾ�Ľ���
					QqChat qqChat=ManageQqChat.getQqChat(m.getGetter()+""+m.getSender());
					//��ʾ
					qqChat.showMessage(m);
				}else if(m.getMesType().equals(MessageType.message_ret_onLineFriend))
				{
					System.out.println("�ͻ��˽��ܵ�"+m.getCon());
					String con=m.getCon();
					String friends[]=con.split(" ");
					String getter=m.getGetter();
					//�޸���Ӧ�ĺ����б�
					QqFriendList qqFriendList=ManageQqFriendList.getQqFriend(getter);
					
					//���º����б�
					if(qqFriendList!=null)
					{
						qqFriendList.updateFriend(m);
					}
				}
				
				
				
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
