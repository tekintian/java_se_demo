/**
 * �ʰ�
 * �б� JList
   ��ǩ���� ��ͼ��
 */
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo8_9 extends JFrame {
	 //�������
	JSplitPane jsp;
	JList jlist;
	JLabel jl1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo8_9 abc=new Demo8_9();
	}
	public Demo8_9()
	{
		//�������
		String []words={"boy","girl","bird"};
		jlist=new JList(words);
		jl1=new JLabel(new ImageIcon("images/ciba.jpg"));
		
		// ��ִ���
		jsp=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, jlist, jl1);
		// ���Ա仯 ����һ�¾Ϳ��԰Ѵ��ڲ��
		jsp.setOneTouchExpandable(true);
		//���ò��ֹ�����
		
		//������
		this.add(jsp);
		
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
