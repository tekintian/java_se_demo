/**
 * ���񲼾���ʾ
 * 
 */
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo8_4 extends JFrame{

	//�������
	int size=9;
	JButton jbs[]=new JButton[size];
	public static void main(String[] args) {
		Demo8_4 abc=new Demo8_4();

	}
	//���캯��
	public Demo8_4()
	{
		for(int i=0; i<9; i++)
		{
			jbs[i]=new JButton(String.valueOf(i));
		}
		//���ò��ֹ���
		this.setLayout(new GridLayout(3,3)); //��������
		
		//������
		for(int i=0; i<size; i++)
		{
			this.add(jbs[i]);
		}
		//���ô�������
		this.setSize(300,200);
		this.setLocation(200,200);
		//��ֹ�û��ı䴰���С
		this.setResizable(false);
		//�˳������˳�jvm
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//��ʾ
		this.setVisible(true);
	}
}
