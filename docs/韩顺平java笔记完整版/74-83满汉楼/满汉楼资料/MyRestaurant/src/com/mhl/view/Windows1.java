/*
 * �ý���ֻ�о������ܣ�ϵͳ����Ա���Խ���Ĳ�������
 * ��ɽ����˳���Ǵ����ң����ϵ���
 * */
package com.mhl.view;
//���������
import com.mhl.mytools.*;

import java.awt.*;

import javax.swing.*;
import javax.swing.Timer;

import java.util.*;
import java.awt.event.*;

import javax.imageio.*;
import java.io.*;

import com.sun.java.swing.plaf.windows.resources.windows;
public class Windows1 extends JFrame implements ActionListener,MouseListener{
	
	//�����������Ҫ�����
	//����ͼ��
	Image titleIcon,timebg;
	//�˵���
	JMenuBar jmb;
	//һ���˵�
	JMenu jm1,jm2,jm3,jm4,jm5,jm6;
	//�����˵�
	
	//��һ���˵��Ķ����˵�
	JMenuItem jmm1,jmm2,jmm3,jmm4,jmm5;
	
	//�����˵���ͼ��
	
	//��һ���˵��Ķ����˵�ͼ��
	ImageIcon jm1_icon1,jm1_icon2,jm1_icon3,jm1_icon4,jm1_icon5;
	
	//����������
	JToolBar jtb;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10;
	
	//������Ҫ�������壨JPanel����JLabel
	JPanel jp1,jp2,jp3,jp4,jp5;
	//�ٶ���7����壬���ڴ������jp1����ϵı�ǩʱ��Ӧ����jp3��Ƭ����ʾ�Ŀ�Ƭ��ÿһ�ſ�Ƭ��һ����壬��������ʾ��ͬ�Ĺ���ģ�飬�����¹�����½����Ľ��棩
	JPanel jp3_1,jp3_2,jp3_3,jp3_4,jp3_5,jp3_6,jp3_7;
	
	//����jp1�������Ҫ�����
	//����ImagePanel�࣬���ڻ�jp1����ͼƬ
	ImagePanel jp1_imgPanel;
	//����jp1�������ı���ͼƬ
	Image jp1_bg;
	//jp1����ϵ�����Сͼ�꣨��ǩ��
	JLabel jp1_lab1,jp1_lab2,jp1_lab3,jp1_lab4,jp1_lab5,jp1_lab6,jp1_lab7,jp1_lab8;
	//��jp2������Ҫ��JLabel������������ͼ�꣬���ڿ��ƿ�Ƭ�������ʾ
	JLabel jp2_lab1,jp2_lab2;
	//����jp3��Ҫ�����
	Image jp3_bg;
	//����jp3��Ƭ������Ҫ��ͼƬ��ǩ
	JLabel jp3_l1,jp3_l2,jp3_l3,jp3_l4,jp3_l5,jp3_l6,jp3_l7;
	//����jp2,jp3Ϊ��Ƭ���֣����������ﶨ�壬��ĵļ��������л���Ƭ
	CardLayout cardjp2,cardjp3;
	//����һ����ִ��ڵ���������ڷֱ���jp1,jp4
	JSplitPane jsp1;
	
	//��״̬������ʾ��ǰʱ��
	JLabel timeNow;
	//javax.swing���е�Timer���Զ�ʱ�Ĵ���Action�¼�����˿������������һЩ����
	//������JAVA�У�Timer�����ڶ�����У��书��Ҳ��һ�������ʹ��ʱ����ָ����
	//ͬʱ����ʵ�ֽӿڼ���,implements ActionListener
	javax.swing.Timer t;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windows1 w1=new Windows1();
	}
	//��ʼ���˵����ĺ���
	public void initMenu()
	{
		//������һ���˵��Ķ����˵�ͼ��
		jm1_icon1=new ImageIcon("image/jm1_icon1.jpg");
		jm1_icon2=new ImageIcon("image/jm1_icon2.jpg");
		jm1_icon3=new ImageIcon("image/jm1_icon3.jpg");
		jm1_icon4=new ImageIcon("image/jm1_icon4.jpg");
		jm1_icon5=new ImageIcon("image/jm1_icon5.jpg");
		
		//����һ���˵�
		jm1=new JMenu("ϵͳ����");
		jm1.setFont(MyFont.f1);
		//�����Ӳ˵���ȡ�ͽ�ԭ�򣬿ɶ��Ըߣ�ͬʱ���ڲ鿴����
		//���������˵�
		jmm1=new JMenuItem("�л��û�",jm1_icon1);
		jmm1.setFont(MyFont.f2);
		
		jmm2=new JMenuItem("�л����տ����",jm1_icon2);
		jmm2.setFont(MyFont.f2);
		
		jmm3=new JMenuItem("��½����",jm1_icon3);
		jmm3.setFont(MyFont.f2);
		
		jmm4=new JMenuItem("������",jm1_icon4);
		jmm4.setFont(MyFont.f2);
		
		jmm5=new JMenuItem("�˳�",jm1_icon5);
		jmm5.setFont(MyFont.f2);
		//��ӵ�һ���˵�
		jm1.add(jmm1);
		jm1.add(jmm2);
		jm1.add(jmm3);
		jm1.add(jmm4);
		jm1.add(jmm5);
		
		
		jm2=new JMenu("���¹���");
		jm2.setFont(MyFont.f1);
		
		jm3=new JMenu("�˵�����");
		jm3.setFont(MyFont.f1);
		
		jm4=new JMenu("����ͳ��");
		jm4.setFont(MyFont.f1);
		
		jm5=new JMenu("�ɱ����ⷿ");
		jm5.setFont(MyFont.f1);
		
		jm6=new JMenu("����");
		jm6.setFont(MyFont.f1);
		
		//��һ���˵���Ӳ˵���
		jmb=new JMenuBar();
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		jmb.add(jm6);
		
		//�Ѳ˵���JMenuBar��ӵ�JFrame����ȥ
		this.setJMenuBar(jmb);
	}
	//��ʼ���������ĺ���
	public void initToolBar()
	{
		//�������������
		//����������
		jtb=new JToolBar();
		//���ù����������Ը��������̶�����
		jtb.setFloatable(false);
		//��������������İ�ť
		jb1=new JButton(new ImageIcon("image/toolBar_image/jb1.jpg"));
		jb2=new JButton(new ImageIcon("image/toolBar_image/jb2.jpg"));
		jb3=new JButton(new ImageIcon("image/toolBar_image/jb3.jpg"));
		jb4=new JButton(new ImageIcon("image/toolBar_image/jb4.jpg"));
		jb5=new JButton(new ImageIcon("image/toolBar_image/jb5.jpg"));
		jb6=new JButton(new ImageIcon("image/toolBar_image/jb6.jpg"));
		jb7=new JButton(new ImageIcon("image/toolBar_image/jb7.jpg"));
		jb8=new JButton(new ImageIcon("image/toolBar_image/jb8.jpg"));
		jb9=new JButton(new ImageIcon("image/toolBar_image/jb9.jpg"));
		jb10=new JButton(new ImageIcon("image/toolBar_image/jb10.jpg"));
		
		//�Ѱ�ť��ӵ�������
		jtb.add(jb1);
		jtb.add(jb2);
		jtb.add(jb3);
		jtb.add(jb4);
		jtb.add(jb5);
		jtb.add(jb6);
		jtb.add(jb7);
		jtb.add(jb8);
		jtb.add(jb9);
		jtb.add(jb10);
		
		//�ѹ�������ӵ����ڵı���
		this.add(jtb,BorderLayout.NORTH);
	}
	//��ʼ���������岿�֣��м䲿�֣��ĸ���壩�ĺ���
	public void initAllPanel()
	{
		//���������壨���м䲿�֣�
		//����jp1���
		jp1=new JPanel(new BorderLayout());//����������Ϊ�߽粼��
		try {
			jp1_bg=ImageIO.read(new File("image/center_image/jp1_bg.jpg"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����һ�����ָ�������
		Cursor myCursor=new Cursor(Cursor.HAND_CURSOR);//�������
		jp1_imgPanel=new ImagePanel(jp1_bg);
		//��ͼƬ�������Ϊ���񲼾�
		this.jp1_imgPanel.setLayout(new GridLayout(8,1));
		//��ͼƬ��������Сͼ�꣬Ҳ����Label
		//new JLabel()���캯���еĲ���˳���ǣ�����˵����ͼ�꣬���
		jp1_lab1=new JLabel(new ImageIcon("image/center_image/label_1.gif"));
		jp1_imgPanel.add(jp1_lab1);
		jp1_lab2=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_2.jpg"),0);
		jp1_lab2.setFont(MyFont.f4);
		//������Ƶ�JLabel����ʱ���һֻС��
		jp1_lab2.setCursor(myCursor);
		//Ĭ����JLabel������
		jp1_lab2.setEnabled(false);
		//��jp1_lab2���������
		jp1_lab2.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab2);
		jp1_lab3=new JLabel("�� ½ �� ��",new ImageIcon("image/center_image/label_3.jpg"),0);
		jp1_lab3.setFont(MyFont.f4);
		jp1_lab3.setCursor(myCursor);
		jp1_lab3.setEnabled(false);
		jp1_lab3.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab3);
		jp1_lab4=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_4.jpg"),0);
		jp1_lab4.setFont(MyFont.f4);
		jp1_lab4.setCursor(myCursor);
		jp1_lab4.setEnabled(false);
		jp1_lab4.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab4);
		jp1_lab5=new JLabel("�� �� ͳ ��",new ImageIcon("image/center_image/label_5.jpg"),0);
		jp1_lab5.setFont(MyFont.f4);
		jp1_lab5.setCursor(myCursor);
		jp1_lab5.setEnabled(false);
		jp1_lab5.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab5);
		jp1_lab6=new JLabel("�ɱ����ⷿ",new ImageIcon("image/center_image/label_6.jpg"),0);
		jp1_lab6.setFont(MyFont.f4);
		jp1_lab6.setCursor(myCursor);
		jp1_lab6.setEnabled(false);
		jp1_lab6.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab6);
		jp1_lab7=new JLabel("ϵ ͳ �� ��",new ImageIcon("image/center_image/label_7.jpg"),0);
		jp1_lab7.setFont(MyFont.f4);
		jp1_lab7.setCursor(myCursor);
		jp1_lab7.setEnabled(false);
		jp1_lab7.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab7);
		jp1_lab8=new JLabel("�� �� �� ��",new ImageIcon("image/center_image/label_8.jpg"),0);
		jp1_lab8.setFont(MyFont.f4);
		jp1_lab2.setCursor(myCursor);
		jp1_lab8.setEnabled(false);
		jp1_lab8.addMouseListener(this);
		jp1_imgPanel.add(jp1_lab8);
		//��ͼƬ�����뵽jp1���
		jp1.add(jp1_imgPanel);
		
		//����jp2��jp3,jp4��壬����jp2,jp3�Ǳ�jp4��������
		//����jp4�Ǳ߽粼��,jp2λ��jp4�����ߣ�jp3λ���м䣨ռ�ݴ󲿷�λ�ã���jp2��jp3�ǿ�Ƭ����
		//�ֱ������������Ĳ���ģʽ
		jp4=new JPanel(new BorderLayout());
		
		this.cardjp2=new CardLayout();
		//����jp2Ϊ��Ƭ����
		jp2=new JPanel(cardjp2);
		//����������ǩ�����ң����ڵ����ʱ����ִ��ڵ���ʾ����
		jp2_lab1=new JLabel(new ImageIcon("image/center_image/jp2_left.jpg"));
		jp2_lab1.addMouseListener(this);
		jp2_lab2=new JLabel(new ImageIcon("image/center_image/jp2_right.jpg"));
		jp2_lab2.addMouseListener(this);
		//��jp2_lab1,jp2_lab2���뵽jp2��,jp2�ǿ�Ƭ����
		jp2.add(jp2_lab1,"0");
		jp2.add(jp2_lab2,"1");
		
		this.cardjp3=new CardLayout();
		jp3=new JPanel(cardjp3);
		//�ȸ�jp3����һ��������Ŀ�Ƭ��ͼƬ��壩
		try {
			jp3_bg=ImageIO.read(new File("image/center_image/jp3_bg.jpg"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ImagePanel ip_jp3=new ImagePanel(jp3_bg);
		//��������ͼƬ��ǩ���ڲ��Կ�Ƭ����
		jp3_l1=new JLabel(new ImageIcon("image/jp3_test/jp3_1.jpg"));
		jp3_l2=new JLabel(new ImageIcon("image/jp3_test/jp3_2.jpg"));
		jp3_l3=new JLabel(new ImageIcon("image/jp3_test/jp3_3.jpg"));
		jp3_l4=new JLabel(new ImageIcon("image/jp3_test/jp3_4.jpg"));
		jp3_l5=new JLabel(new ImageIcon("image/jp3_test/jp3_5.jpg"));
		jp3_l6=new JLabel(new ImageIcon("image/jp3_test/jp3_6.jpg"));
		jp3_l7=new JLabel(new ImageIcon("image/jp3_test/jp3_7.jpg"));
		
		
		//���������ܿ��Ӧ�Ŀ�Ƭ���
		
		jp3_1=new JPanel();
		jp3_1.add(jp3_l1);
		
		jp3_2=new JPanel();
		jp3_2.add(jp3_l2);
		
		jp3_3=new JPanel();
		jp3_3.add(jp3_l3);
		
		jp3_4=new JPanel();
		jp3_4.add(jp3_l4);
		
		jp3_5=new JPanel();
		jp3_5.add(jp3_l5);
		
		jp3_6=new JPanel();
		jp3_6.add(jp3_l6);
		
		jp3_7=new JPanel();
		jp3_7.add(jp3_l7);
		
		//��ӿ�Ƭ
		jp3.add(ip_jp3,"0");
		jp3.add(jp3_1,"1");
		jp3.add(jp3_2,"2");
		jp3.add(jp3_3,"3");
		jp3.add(jp3_4,"4");
		jp3.add(jp3_5,"5");
		jp3.add(jp3_6,"6");
		jp3.add(jp3_7,"7");
		
		//��jp2,jp3����jp4
		jp4.add(jp2,BorderLayout.WEST);
		jp4.add(jp3,BorderLayout.CENTER);
		
		//��һ����ִ��ڣ��ֱ���jp1,jp4
		jsp1=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,jp1,jp4);
		//ָ����ߵ����ռ��������
		jsp1.setDividerLocation(150);
		//�Ѳ�ֱ߽�����Ϊ0��������ʾ
		jsp1.setDividerSize(0);
		
		//��jsp1�����뵽����
		this.add(jsp1,BorderLayout.CENTER);
	}
	//��ʼ��״̬����jp5��壩�ĺ���
	public void initJp5()
	{
		//����jp5��壬��״̬���Ĵ���
		jp5=new JPanel();
		//����jp5���Ĳ��ַ�ʽ�������ڸ�����Ϸ��������������
		jp5.setLayout(new BorderLayout());
		//����Timer
		t=new Timer(1000,this);//ÿ��һ�룬ȥ�ڷ�һ��ActionEvent�¼�
		//������ʱ��
		t.start();
		//������ʾʱ���ǩ
		//Calendar.getInstance().getTime().toLocaleString()��ָ�õ���ǰ��ϵͳʱ��
		timeNow=new JLabel(Calendar.getInstance().getTime().toLocaleString());
		timeNow.setFont(MyFont.f3);
		try {
			timebg=ImageIO.read(new File("image/time_bg.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����һ��ͼƬ��壬���ڻ�״̬���ı���ͼ
		ImagePanel ip1=new ImagePanel(timebg);
		//����ͼƬ���Ĳ��ַ�ʽ
		ip1.setLayout(new BorderLayout());
		ip1.add(timeNow,BorderLayout.EAST);
		jp5.add(ip1);
		this.add(jp5,BorderLayout.SOUTH);
		
	}
	public Windows1()
	{
		//���ô��ڱ���ͼ��
		try {
			//��PS������͸��������ͼ��ʱ�����뱣��ΪGIF��ʽ��ͼƬ��������ʾ͸������
			titleIcon=ImageIO.read(new File("image/title.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.setIconImage(titleIcon);
		this.setTitle("����¥��������ϵͳ");
		this.setFont(MyFont.f0);
		
		//��ÿһ�����ܿ�Ĵ�������һ�������������ɶ��Ըߣ�ͬʱ���ڲ��Ժͷ���
		
		//���ó�ʼ���˵����ĺ���
		this.initMenu();
		//���ó�ʼ���������ĺ���
		this.initToolBar();
		//���ó�ʼ���������壨�м䲿��,jp1,jp2,jp3,jp4���ĺ���
		this.initAllPanel();
		//���ó�ʼ��״̬��(jp5)�ĺ���
		this.initJp5();
		
		//���ô�С
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		
		//���ô���
		this.setSize(width,height-32);
		this.setVisible(true);
		//�رմ���ʱ�˳�ϵͳ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.timeNow.setText("��ǰϵͳʱ�䣺"+Calendar.getInstance().getTime().toLocaleString()+" ");
	}

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.jp1_lab2)//���¹���
		{
			this.cardjp3.show(jp3, "1");
		}
		else if(e.getSource()==this.jp1_lab3)//��½����
		{
			this.cardjp3.show(jp3, "2");
		}
		else if(e.getSource()==this.jp1_lab4)//���׼۸�
		{
			this.cardjp3.show(jp3, "3");
		}
		else if(e.getSource()==this.jp1_lab5)//����ͳ��
		{
			this.cardjp3.show(jp3, "4");
		}
		else if(e.getSource()==this.jp1_lab6)//�ɱ����ⷿ
		{
			this.cardjp3.show(jp3, "5");
		}
		else if(e.getSource()==this.jp1_lab7)//ϵͳ����
		{
			this.cardjp3.show(jp3, "6");
		}
		else if(e.getSource()==this.jp1_lab8)//��������
		{
			this.cardjp3.show(jp3, "7");
		}
		else if(e.getSource()==jp2_lab1)
		{
			//����ʾ���ֲ����Ľ�������������jp1)��ͬʱ��ʾjp2��Ƭ�����е�jp2_lab2(���ҵļ�ͷ)
			//�Ѳ�������������������������jp1
			this.jsp1.setDividerLocation(0);//���ò������������Ĵ�СΪ0���أ������ɼ�
			//ͬʱ��ʾ���ҵļ�ͷ
			this.cardjp2.show(jp2,"1");
		}
		else if(e.getSource()==jp2_lab2)
		{
			//�����ص�jp1���չ�����������������ִ�С
			this.jsp1.setDividerLocation(150);//����ǰ�涨�������ʱ�����ռ150���أ���ʱӦ��ʾ150����
			//ͬʱ��ʾ����ļ�ͷ
			this.cardjp2.show(jp2,"0");
		}
	
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		//����û�ѡ����ĳ������JLabel�������
		if(e.getSource()==this.jp1_lab2)
		{
			this.jp1_lab2.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab3)
		{
			this.jp1_lab3.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab4)
		{
			this.jp1_lab4.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab5)
		{
			this.jp1_lab5.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab6)
		{
			this.jp1_lab6.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab7)
		{
			this.jp1_lab7.setEnabled(true);
		}
		else if(e.getSource()==this.jp1_lab8)
		{
			this.jp1_lab8.setEnabled(true);
		}
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//����û��뿪��JLabel�������
		if(e.getSource()==this.jp1_lab2)
		{
			this.jp1_lab2.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab3)
		{
			this.jp1_lab3.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab4)
		{
			this.jp1_lab4.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab5)
		{
			this.jp1_lab5.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab6)
		{
			this.jp1_lab6.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab7)
		{
			this.jp1_lab7.setEnabled(false);
		}
		else if(e.getSource()==this.jp1_lab8)
		{
			this.jp1_lab8.setEnabled(false);
		}
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}

