/**
 * �����Ǽ�����¼�������Ƶ����
 * 1��ͨ���������Ҽ�������С��Ϊλ�õ��ƶ�
 */
package com.test4;
import java.awt.*;
import javax.swing.*;

import java.awt.event.*;
public class Demo9_4 extends JFrame {

	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_4 demo=new Demo9_4();

	}
	//���캯��
	public Demo9_4()
	{
		mp=new MyPanel();
	  	//mp���뵽JFrame
		this.add(mp);   // ÿ����һ�� Demo9_4 �������һ����Ӧ��this
		
		//��Ӽ���
		this.addKeyListener(mp);     // ���̼��������������Ķ���  ��mp������м���
		this.setSize(400,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
}
//�����Լ������

class MyPanel extends JPanel implements KeyListener
{
	int x=10;
	int y=10;
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.BLUE);
		g.fillOval(x, y, 20, 20);
	}
    //��������
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
	//	 System.out.println("��������"+(char)arg0.getKeyCode() );
		if(arg0.getKeyCode()==KeyEvent.VK_UP)
		{
			//System.out.println("��������");
			y-=10;	
		}
		if(arg0.getKeyCode()==KeyEvent.VK_DOWN)
		{
			//System.out.println("��������");
			y+=10;
					
		}
		if(arg0.getKeyCode()==KeyEvent.VK_LEFT)
		{
			//System.out.println("��������");
			x-=10;
		}
		if(arg0.getKeyCode()==KeyEvent.VK_RIGHT)
		{
			//System.out.println("��������");
			x+=10;
		}
		//���� repaint() ���������ػ��ƽ���
		this.repaint();
	}
	//�����ͷ�
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	//����һ��ֵ����ӡ���
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}