/**
 * JComboBox/Jlist/JScorllPane
 * ���������/�б�����/���������
 */
package com.test;
import java.awt.*;
import javax.swing.*;

public class Demo8_8 extends JFrame {

	//����
	JPanel jp1, jp2;
	JLabel jl1, jl2;
	JComboBox jcb1;
	JList jlist;
	JScrollPane jsp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_8 demo=new Demo8_8();
	}
	//���캯��
	public Demo8_8()
	{
		jp1=new JPanel();
		jp2=new JPanel();
		
		jl1=new JLabel("��ļ���");
		jl2=new JLabel("���εص�");
		
		String []jp={"����","�Ϻ�","���","����"};
		
		jcb1=new JComboBox(jp);
		
		String []dd={"��կ��","�ʹ�","�찲��","����","����","����"};
		
		jlist=new JList(dd);
		jlist.setVisibleRowCount(2);   // ���ù�������ʾ������Ϣ
		jsp=new JScrollPane(jlist);   //  ���б���뵽����������
		//���ò���
		 this.setLayout(new GridLayout(3,1));   // �������Ĳ����������񲼾�
		 
		 jp1.add(jl1);
		 jp1.add(jcb1);
		 
		 
		 jp2.add(jl2);   //�ɱ�ǩ���뵽 ���2��
		 jp2.add(jsp);   // �ѹ��������뵽 ���2��
		 
		 this.add(jp1);
		 this.add(jp2);   // �����2 ���뵽  JFrame�����
		 this.setSize(500,500);
			this.setLocation(200, 200);
			
			this.setTitle("ע�����û�");
			this.setResizable(false);    // ��֧�����
			//�˳������˳�jvm
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // �˳�ʱ��ر�JVM
			
			//��ʾ
			this.setVisible(true);
	}
}
