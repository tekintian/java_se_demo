/**
 * QQ�������
 * 
 */
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo8_10 extends JFrame{
  
	JTextArea jta=null;    //�����ı�
	JScrollPane jsp=null;    // ������
	JPanel jpl=null;
	JComboBox jcb=null;    // ��ѡ��
	JTextField jtf=null;    // �����ı�
	JButton jb=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Demo8_10 abc=new  Demo8_10();
	}
	public Demo8_10()
	{
		jta=new JTextArea();
		jsp=new JScrollPane(jta);   //�����ı��м��������
		jpl=new JPanel();  // Ĭ������ʽ����
		String []chartter={"��ɭ","����"};
		jcb=new JComboBox(chartter);
		jtf=new JTextField(10);
		jb=new JButton("����");
		
		
		//���ò���
		jpl.add(jcb);
		jpl.add(jtf);
		jpl.add(jb);
		
		//����JFrame
		this.add(jsp);
		this.add(jpl, BorderLayout.SOUTH);
		this.setSize(300,200);
		this.setIconImage(new ImageIcon("images/qq.jpg").getImage());    //����ͼ��
		this.setLocation(200, 200);
		
		this.setTitle("��ѶQQ");
		this.setResizable(false);    // ��֧�����
		//�˳������˳�jvm
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // �˳�ʱ��ر�JVM
		
		//��ʾ
		this.setVisible(true);
		
	}

}
