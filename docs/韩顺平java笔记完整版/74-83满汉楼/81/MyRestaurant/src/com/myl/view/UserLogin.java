package com.myl.view;
import com.mhl.tools.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.imageio.*;
import java.io.*;
import com.mhl.model.*;
public class UserLogin extends 	JDialog implements ActionListener{
	
	//定义需要的组件
	JLabel jl1, jl2, jl3;
	JTextField jName;
	JPasswordField jPasswd;
	JButton jCon, jCancel;
	
	public static void main(String [] args)
	{
		UserLogin ul=new UserLogin();
	}
	
	public UserLogin()
	{
		Container ct=this.getContentPane();
		//设置成空布局
		this.setLayout(null);
		//创建各个组件
		jl1=new JLabel("请输入用户名");
		jl1.setBounds(60, 190, 150, 15);
		jl1.setFont(MyTools.f1);
		//放入
		ct.add(jl1);
		
		jName=new JTextField(20);
		jName.setFont(MyTools.f1);
		jName.setBounds(180, 190,120 , 30);
		//设置下凹的感觉
		jName.setBorder(BorderFactory.createLoweredBevelBorder());
		ct.add(jName);
		
		jl2=new JLabel ("(员工号)");
		jl2.setFont(MyTools.f2);
		//设置前景色
		jl2.setForeground(Color.red);
		jl2.setBounds(100, 210, 100, 30);
		ct.add(jl2);
		
		//提示输入密码
		jl3=new JLabel ("请输入密码");
		jl3.setFont(MyTools.f1);
		jl3.setBounds(60,240,150,30);
		ct.add(jl3);
		
		//密码框
		jPasswd=new JPasswordField(20);
		jPasswd.setFont(MyTools.f1);
		jPasswd.setBounds(180, 240,120 , 30);
		//设置下凹的感觉
		jPasswd.setBorder(BorderFactory.createLoweredBevelBorder());
		ct.add(jPasswd);
		
		
		jCon=new JButton("确定");
		jCon.addActionListener(this);
		jCon.setFont(MyTools.f1);
		jCon.setBounds(110, 300, 70, 30);
		//放入到容器
		ct.add(jCon);
		
		//加入取消按钮
		jCancel=new JButton("取消");
		jCancel.addActionListener(this);
		jCancel.setFont(MyTools.f1);
		jCancel.setBounds(220, 300, 70, 30);
		ct.add(jCancel);
		
		
		jl2=new JLabel("请输入用户名");
		jl3=new JLabel("请输入用户名");
		
		
		
		//创建一个BackImage对象
		BackImage bi=new BackImage();
		//定义图片的位置
		bi.setBounds(0, 0, 360, 360);
		//不是用上下框
		//把一个组件放入到JFrame,或者JDialog中可以直接放入
	//	this.add(bi);
		//也可以这样做
		
		ct.add(bi);
		this.setUndecorated(true);
		this.setSize(360,360);
		//确定JWindow的初始位置
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setLocation(width/2-200, height/2-150);
		this.setVisible(true);
	}
	//内部类
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
	//响应用户登录的请求
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		//判断是否点击确定按钮
		if(arg0.getSource()==jCon)
		{
			//取出员工号和密码
			String u=this.jName.getText().trim();
			String p=new String (this.jPasswd.getPassword());
			UserModel um=new UserModel();
			String res=um.checkUser(u, p);
			if(res.equals("主管")||res.equals("经理")||res.equals("管理员"))
			{
				new Windows1();
				//关闭登录界面
				this.dispose();
			}
		}else if(arg0.getSource()==this.jCancel)
		{
			this.dispose();
		}
		
	}
}
