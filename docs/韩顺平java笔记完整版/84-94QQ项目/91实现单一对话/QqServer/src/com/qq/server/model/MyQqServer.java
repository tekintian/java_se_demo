/**
 * ����qq�����������ڼ����ȴ�ĳ��qq�ͻ���������
 */
package com.qq.server.model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import com.qq.common.*;
public class MyQqServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public MyQqServer()
	{
		try {
			//��999�Ŷ˿ڼ���
			System.out.println("���Ƿ�������999��������");
			ServerSocket ss=new ServerSocket (9999);
			//����,�ȴ��ͻ��˵�����
			while(true)
			{
				Socket s=ss.accept();
				
				//���տͻ��˷�������Ϣ
				ObjectInputStream ois=new ObjectInputStream(s.getInputStream());
				User u=(User)ois.readObject();
				System.out.println("���������յ�id: "+u.getUserId()+"�����룺"+u.getPasswd());
				Message m=new Message();
				ObjectOutputStream oos=new ObjectOutputStream(s.getOutputStream());
				if(u.getPasswd().equals("123"))
				{
					//����һ���ɹ��ĵ�¼��Ϣ	
					m.setMesType("1");
					oos.writeObject(m);
				
					//���ﵥ��һ���߳��ø��̣߳���ͻ��˱���ͨѶ
					SerConClientThread scct=new SerConClientThread(s);
					ManagerClientThread.addClientThread(u.getUserId(), scct);
					//������ÿͻ���ͨѶ���߳�
					scct.start();
				}else{
					m.setMesType("2");
					oos.writeObject(m);
					//�ر�����
					s.close();
				}
			
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{		
			
		}
	}
}
