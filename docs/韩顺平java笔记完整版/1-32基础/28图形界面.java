/**
 * ���ܣ� ���濪��
 * 
 */
package com.test;
import java.awt.*;
import javax.swing.*;
public class Demo8_1 extends JFrame{
	  // ����Ҫ��������嵽����
		JButton jb1=null;
	public static void main(String[] args) {
		
		   Demo8_1 demp8_1=new  Demo8_1();
		
		
	}
		//���캯��
		public Demo8_1()
		{
			//����һ��button��ť
			jb1=new JButton("���ǰ�ť");
			
			//���������ñ���
			 this.setTitle("hello");
			//���ô�С���������ؼ���ģ����������ܶȵ�λ���ͳ��Ȳ�һ��
			this.setSize(200, 200);
			//���Jbutton���
			this.add(jb1);
			//���ó�ʼ����
			this.setLocation(100,200);
			
			// ��ʾ
			this.setVisible(true);
			//���õ��رմ���ʱ���˳�JVM 
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}
		
	}

