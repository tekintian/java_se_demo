/**
 * �����ϵͳ����Ա���������ܿ��Խ���Ĳ�������
 * ��ɽ����˳�򣬴��ϵ��£������ң�
 */
package com.myl.view;
import com.mhl.tools.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;
public class Windows1 extends JFrame{

	//������Ҫ�����
	Image titleIcon;    //����Сͼ��  ��������ϵ�Сͼ��
	JMenuBar jmb;     //����˵���
	//����һ���˵�
	JMenu jm1, jm2, jm3, jm4, jm5, jm6;   //����˵�ѡ��
	//��������˵�
	JMenuItem jmm1, jmm2, jmm3, jmm4, jmm5;   
	
	//ͼ��
	ImageIcon jmm1_icon1, jmm1_icon2, jmm1_icon3, jmm1_icon4, jmm1_icon5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Windows1 w1=new Windows1();
	}
	public Windows1()
	{
		//�������
		try {
			titleIcon=ImageIO.read(new File("image\\jiubei.gif"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//����ͼ��
		jmm1_icon1=new ImageIcon("image\\jm1_icon1.jpg");
		jmm1_icon2=new ImageIcon("image\\jm1_icon2.jpg");
		jmm1_icon3=new ImageIcon("image\\jm1_icon3.jpg");
		jmm1_icon4=new ImageIcon("image\\jm1_icon4.jpg");
		jmm1_icon5=new ImageIcon("image\\jm1_icon5.jpg");
		
		//����һ���˵�
		jm1=new JMenu("ϵͳ����");
		jm1.setFont(MyTools.f1);
		//���������˵�
		jmm1=new JMenuItem("�л����û�����", jmm1_icon1);
		jmm1.setFont(MyTools.f2);
		jmm2=new JMenuItem("�л����տ����", jmm1_icon2);
		jmm2.setFont(MyTools.f2);
		jmm3=new JMenuItem("��¼����", jmm1_icon3);
		jmm3.setFont(MyTools.f2);
		jmm4=new JMenuItem("������", jmm1_icon4);
		jmm4.setFont(MyTools.f2);
		jmm5=new JMenuItem("�˳�", jmm1_icon5);
		jmm5.setFont(MyTools.f2);
		//����
		jm1.add(jmm1);
		jm1.add(jmm2);
		jm1.add(jmm3);
		jm1.add(jmm4);
		jm1.add(jmm5);
		jm2=new JMenu("���¹���");
		jm2.setFont(MyTools.f1);
		jm3=new JMenu("�˵�����");
		jm3.setFont(MyTools.f1);
		jm4=new JMenu("����ͳ��");
		jm4.setFont(MyTools.f1);
		jm5=new JMenu("�ɱ����ⷿ");
		jm5.setFont(MyTools.f1);
		jm6=new JMenu("����");
		jm6.setFont(MyTools.f1);
		
		//��һ���˵����뵽JMenuBar
		jmb=new JMenuBar();
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		jmb.add(jm4);
		jmb.add(jm5);
		jmb.add(jm6);
		
		//��JMenuBar��ӵ�JFrame��
		this.setJMenuBar(jmb);
		
		
		//���ô�С
		int w=Toolkit.getDefaultToolkit().getScreenSize().width;
		int h=Toolkit.getDefaultToolkit().getScreenSize().height;
		//�رմ����Ǻ��˳�ϵͳ
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//���ô��ڵ�ͼƬ
		this.setIconImage(titleIcon);
		this.setTitle("����¥����ϵͳ");
		this.setSize(w, h-25);
		this.setVisible(true);
	}

}