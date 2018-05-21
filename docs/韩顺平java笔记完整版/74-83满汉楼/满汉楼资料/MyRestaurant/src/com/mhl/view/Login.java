package com.mhl.view;
//���������
import com.mhl.model.*;
import com.mhl.mytools.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
public class Login extends JDialog implements ActionListener {
	
	//������½���
	JLabel jl1,jl2,jl3;
	JTextField jname;
	JPasswordField jpasswd;
	JButton jlog,jcancle;
	//����һ������
	Font f1;
	
	public static void main(String []args)
	{
		Login login=new Login();
	}
	public Login()
	{	
//		this.add(jl1)�ȼ���������䣬��������д��������һ�����ϳ���Ա�϶�
//		Container ct=new Container();//����һ������
//		ct.add(jl1);//�������ӵ�������
		
		//����һ������
		//f1=new Font("����",Font.PLAIN,16);
		
		//������
		//��ʾ�����û���
		jl1=new JLabel("�������û�����");
		jl1.setBounds(60, 190, 150, 30);
		jl1.setFont(MyFont.f1);
		this.add(jl1);
		
		//����ʾ����Ա����
		jl2=new JLabel("(��Ա����)");
		jl2.setForeground(Color.red);
		jl2.setFont(MyFont.f2);
		jl2.setBounds(100,210,100,30);
		this.add(jl2);
		
		//��ʾ��������
		jl3=new JLabel ("���������룺");
		jl3.setBounds(60,240,150,30);
		jl3.setFont(MyFont.f2);
		this.add(jl3);
		
		//�û����������ı���
		jname=new JTextField(20);
		jname.setFocusable(true);
		jname.setBounds(180,190,120,30);
		jname.setFont(f1);
		this.add(jname);
		//���ñ߽��°�
		jname.setBorder(BorderFactory.createLoweredBevelBorder());
		
		//�������������
		jpasswd=new JPasswordField();
		jpasswd.setFocusable(true);
		jpasswd.setBounds(180,240,120,30);
		this.add(jpasswd);
		jpasswd.setBorder(BorderFactory.createLoweredBevelBorder());
		
		//���õ�½��ť
		jlog=new JButton("ȷ ��");
		//��Ӽ���
		jlog.addActionListener(this);
		jlog.setBounds(105,300,75,30);
		jlog.setFont(f1);
		//����ǰ��ɫ
		jlog.setForeground(Color.blue);
		this.add(jlog);
		
		//����ȡ����ť
		jcancle=new JButton("ȡ ��");
		jcancle.addActionListener(this);
		jcancle.setBounds(215,300,75,30);
		jcancle.setFont(f1);
		//����ǰ��ɫΪ��ɫ
		jcancle.setForeground(Color.blue);
		this.add(jcancle);
		
		//���ÿղ���
		this.setLayout(null);
		//����һ��BackImage����
		BackImage bi=new BackImage();
		//�趨ͼƬ��λ��
		bi.setBounds(0,0,360,360);
		//��ͼƬ��ӵ�JDialog
		this.add(bi);
		//����ʾ���ڵ����±߿�
		this.setUndecorated(true);
		//���ô��ھ���
		this.setSize(360, 360);
		int width=getToolkit().getDefaultToolkit().getScreenSize().width;
		int height=getToolkit().getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200,height/2-200);
		this.setVisible(true);
	}
	
	//����һ���ڲ��࣬���̳�JPanle�����ڻ�����ͼƬ
	class BackImage extends JPanel
	{
		Image im;
		public BackImage(){
			try
			{
				im=ImageIO.read(new File("Image/login.gif"));
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		//Ҫ��ͼƬ����JPanle����Ҫ��дһ��Paint����
		public void paint(Graphics g) //�˴���paint�е�p��Сд��
		//����Ǵ�д���������дpaint�����ˣ�����һ���µķ����ˣ���ô�����ͼƬ�ǲ��������
		{
			g.drawImage(im,0,0,360,360,this);
		}
//		public void Paint(Graphics g)
//		{
//			g.drawImage(im,0,0,348,330,this);
//		}
		
	}
//��Ӧ�û���½������
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//�ж��Ƿ���ȷ����ť
		if(arg0.getSource()==jlog)
		{
			//ȡ��Ա���ż�������
			String userName=this.jname.getText().trim();//trim()���ڷ�ֹ�û������пո�
			//�˴�����Ļ�ȡ����ͨ��getText()������Ϊ�˰�ȫһ����getPassword()���飬
			//������һ���ַ��������ո�����
			String passwd=new String(this.jpasswd.getPassword());
			//ȡ���û���������󣬵���ģʽ����
			UserModel um=new UserModel();
			String zhiwei=um.checkUser(userName, passwd);//����Ա����ְλ
			if(zhiwei.equals("����")||zhiwei.equals("����Ա")||zhiwei.equals("����"))
			{
				//ͨ��new Windows1()�л�����Ӧ��ҳ��(����)
				new Windows1();
				//�л���Windows1ҳ��󣬹رյ�½����
				this.dispose();
			}
		}
		else if(arg0.getSource()==jcancle)
		{
			//�����ȡ����ťʱ���رյ�½���˳�ϵͳ
			this.dispose();
		}
	}
	
}
 