/**
 * ��������
 * 
 */
package com.test1;
import javax.swing.*;

import java.io.*;
import java.net.*;
import java.awt.event.*;
public class MyServer3 extends JFrame implements ActionListener{

	JTextArea jta=null;
	JTextField jtf=null;
	JButton jb=null;
	JScrollPane jsp=null;
	JPanel jp1=null;
	//����Ϣ�����ͻ��˵Ķ���
	PrintWriter pw=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyServer3 ms=new MyServer3();
	}
	
	public MyServer3()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);
		jtf=new JTextField(10);
		jb=new JButton("����");
		jb.addActionListener(this);
		
		jp1=new JPanel();
		jp1.add(jtf);
		jp1.add(jb);
		this.add(jsp,"Center");
		this.add(jp1, "South");
		this.setTitle("qq��������,��������");
		this.setSize(300,200);
		this.setVisible(true);
		
		//����������
		try {
			ServerSocket ss=new ServerSocket(9999);
			//�ȴ��ͻ�������
			Socket s=ss.accept();
			
			
			InputStreamReader isr=new InputStreamReader(s.getInputStream());
			BufferedReader br=new BufferedReader(isr);
			
			pw=new PrintWriter(s.getOutputStream(), true);
			//�ӿͻ�������ȡ��Ϣ
			while(true)
			{
				//��ȡ�ӿͻ��˷�������Ϣ
				String info=br.readLine();
				jta.append("�ͻ��Է�����˵   "+info+"\r\n");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	;
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//��������˷��Ͱ�ť
		if(arg0.getSource()==jb)
			
		{
			//�ѷ�����jtfд�����ݷ��͸��ͻ���
			String info=jtf.getText();
			
			jta.append("�������Կͻ���˵�� "+info+"\r\n");
			pw.println(info);
			
			//��շ��Ϳ������
			jtf.setText("");
		}
	}

}
