/**
 * ���ܣ������������
 * 1��ע�����  ������Ҫ����������ָ��һ�������� ���磺jb1.addActionListener(myCat1);  //  myCat1���� jb1
 * 2:�������߷��ض����ַ���Ϣ   jb1.setActionCommand("aa"); 
 * 3���������� ���� �������Ķ�����������Ϣ   
 * 4�������߿��Լ����Ը����󣬣�����������Ҳ���Ա�����������
 * 
 * ע�⣺���������ڵ������ʵ�� ActionListener ��  ����ʵ�� actionPerformed ������ actionPerformed ��������if else�������������󷢳��Ĳ�ͬ��Ϣ����ͬ�Ĵ���
 */
package com.test3;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo9_3 extends JFrame implements ActionListener{

	//����һ��panel
	JPanel mp=null;
	JButton jb1=null;
	JButton jb2=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_3 demo=new Demo9_3();
		Demo9_3 demo1=new Demo9_3();
		Demo9_3 demo3=new Demo9_3();
	}
	public Demo9_3()
	{
		mp=new JPanel();
		jb1=new JButton("��ɫ");
		jb2=new JButton("��ɫ");
		
		
		this.add(jb1, BorderLayout.NORTH);
		mp.setBackground(Color.black);
		this.add(mp);
		this.add(jb2, BorderLayout.SOUTH);
		
		Cat myCat1=new Cat();
		
		jb1.addActionListener(myCat1);
		jb2.addActionListener(myCat1);
		
		//ע�����
		jb1.addActionListener(this);
		//ָ��action����
		jb1.setActionCommand("aa");   // �������߷������ַ���Ϣ
		
		jb2.addActionListener(this);   //  ��ʾDemo9_3  �����������ж��󶼼����˶���
		jb2.setActionCommand("bb");
		
		this.setSize(200, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	//���¼�����ķ���
	public void actionPerformed(ActionEvent e) {
		
		//�ж����Ǹ���ť�����
		if(e.getActionCommand().equals("aa"))  // ����������Ķ��󷢳����ַ���Ϣ�� aa
		{
			System.out.println("����º�ɫ��ť��");
			mp.setBackground(Color.black);
		}
		else if(e.getActionCommand().equals("bb"))
		{
			System.out.println("������ɫ��");
			mp.setBackground(Color.red);
		}
	}

}
class Cat implements ActionListener
{
	public void actionPerformed(ActionEvent arg0)   //�����������ʵ��  ActionEvent �Ǽ�����굥���¼�
	{
		if(arg0.getActionCommand().equals("aa"))
		{
			System.out.println("èҲ֪���㰴�º�ɫ��ť��");
		}
		   else
			if(arg0.getActionCommand().equals("bb"))
		{
			System.out.println("èҲ֪���㰴�º�ɫ��ť��");
		}
	}
}
/*class MyPanel extends JPanel
{
	public void paint(Graphics g)
	{
		super.print(g);
		g.fillRect(0, 0, 200, arg3)
	}
} */
