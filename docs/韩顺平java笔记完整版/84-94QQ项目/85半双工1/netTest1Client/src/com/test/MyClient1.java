/**
 * ����һ���ͻ��˳��򣬿������ӷ�������
 */
package com.test;
import java.net.*;
import java.io.*;
public class MyClient1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClient1 mcl=new MyClient1();
	}
	public MyClient1()
	{
		try {
			//Socket,��������ĳ���������ˣ�127.0.0.1��ʾ��������Ip  9999��ʾ�˿ں�
			Socket s=new Socket("127.0.0.1", 9999);
			
			//���s���ӳɹ��� �Ϳ��Է����ݸ�������
			//����ͨ��pw ��sд����  true��ʾˢ����
			PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
			
			pw.println("��������ǿͻ���");
			
			
			
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader (isr);
			//�ж�ȡ
			String response=br.readLine();
			
			System.out.println("�ͻ����Ѿ��յ���"+response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
