/**
 * ���ǵ�һ���������˳�������9999�˿ڼ���
 * ���Խ��մӿͻ��˷�������Ϣ
 */
package com.test1;
import java.net.*;
import java.io.*;
public class MyServer1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer1 msl=new MyServer1();
	}
	public MyServer1()
	{
		try {
			//��9999�Ŷ˿ڼ���
			ServerSocket ss=new ServerSocket(9999);
			System.out.println("���Ƿ������������ڼ���");
			//�ȴ������ͻ������ӣ��ú����᷵��һ��Scokey����
			Socket s=ss.accept();
			
			//Ҫ��ȡs�д��ݵ�����
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader (isr);
			//�ж�ȡ
			String info=br.readLine();
			
			System.out.println("�������Ѿ��յ���"+info);
			
			PrintWriter pw=new PrintWriter(s.getOutputStream(), true);
			
			pw.println("��������Ƿ�����");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
