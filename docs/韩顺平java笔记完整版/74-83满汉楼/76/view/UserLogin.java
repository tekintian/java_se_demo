package com.myl.view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class UserLogin extends 	JDialog{
	
	//������Ҫ�����
	JLabel jl1, jl2, jl3;
	JTextField jName;
	JPasswordField jPasswd;
	JButton jCon, jCancel;
	Font f1=new Font("����",Font.PLAIN, 16);
	//�ڴ���һ������
	Font f2=new Font("����",Font.PLAIN, 14);
	public static void main(String [] args)
	{
		UserLogin ul=new UserLogin();
	}
	
	public UserLogin()
	{
		Container ct=this.getContentPane();
		//���óɿղ���
		this.setLayout(null);
		//�����������
		jl1=new JLabel("�������û���");
		jl1.setBounds(60, 190, 150, 15);
		jl1.setFont(f1);
		//����
		ct.add(jl1);
		
		jName=new JTextField(20);
		jName.setFont(f1);
		jName.setBounds(180, 190,120 , 30);
		//�����°��ĸо�
		jName.setBorder(BorderFactory.createLoweredBevelBorder());
		ct.add(jName);
		
		jl2=new JLabel ("(Ա����)");
		jl2.setFont(f2);
		//����ǰ��ɫ
		jl2.setForeground(Color.red);
		jl2.setBounds(100, 210, 100, 30);
		ct.add(jl2);
		
		//��ʾ��������
		jl3=new JLabel ("����������");
		jl3.setFont(f1);
		jl3.setBounds(60,240,150,30);
		ct.add(jl3);
		
		//�����
		jPasswd=new JPasswordField(20);
		jPasswd.setFont(f1);
		jPasswd.setBounds(180, 240,120 , 30);
		//�����°��ĸо�
		jPasswd.setBorder(BorderFactory.createLoweredBevelBorder());
		ct.add(jPasswd);
		
		
		jCon=new JButton("ȷ��");
		jCon.setFont(f1);
		jCon.setBounds(110, 300, 70, 30);
		//���뵽����
		ct.add(jCon);
		
		//����ȡ����ť
		jCancel=new JButton("ȡ��");
		jCancel.setFont(f1);
		jCancel.setBounds(220, 300, 70, 30);
		ct.add(jCancel);
		
		
		jl2=new JLabel("�������û���");
		jl3=new JLabel("�������û���");
		
		
		
		//����һ��BackImage����
		BackImage bi=new BackImage();
		//����ͼƬ��λ��
		bi.setBounds(0, 0, 360, 360);
		//���������¿�
		//��һ��������뵽JFrame,����JDialog�п���ֱ�ӷ���
	//	this.add(bi);
		//Ҳ����������
		
		ct.add(bi);
		this.setUndecorated(true);
		this.setSize(360,360);
		//ȷ��JWindow�ĳ�ʼλ��
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200, height/2-150);
		this.setVisible(true);
	}
	//�ڲ���
	class BackImage extends JPanel
	{
		Image im;
		public BackImage()
		{
			try {
				im=ImageIO.read(new File("image\\login.gif"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		public void paintComponent(Graphics g)
		{
			g.drawImage(im, 0,0, 360, 360, this);
		}
	}
}
