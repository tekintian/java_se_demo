/**
 * ���ܣ�̹����Ϸ��1.0�汾
 * 1������̹��
 * 
 */
package com.test1;
import javax.swing.*;
import java.awt.*;
public class MyTankGame1 extends JFrame{

	MyPanel mp=null;
	public static void main(String[] args) {
		
		MyTankGame1 mtg=new MyTankGame1();
	}
	//���캯��
	public MyTankGame1()
	{
		mp=new MyPanel();
		this.add(mp);
		this.setSize(400,300);
		this.setVisible(true);
	}
}
//�ҵ����
class MyPanel extends JPanel
{
	//����һ���ҵ�̹��
	Hero hero=null;
	
	//���캯��
	public MyPanel()
	{
		hero=new Hero(100,100);
	}
	
	//��дpaint
	public void paint(Graphics g)
	{
		super.paint(g);
		//����ͼ��ı���ɫ
		g.fillRect(0, 0, 400, 300);
		this.drawTank(hero.getX(), hero.getX(), g, 0, 1);
	}
	//����̹�˵ĺ���
	public void drawTank(int x, int y, Graphics g, int direct, int type)
	{
		switch(type)
		{
		case 0:
			g.setColor(Color.cyan);
			break;
		case 1:
			g.setColor(Color.yellow);
			break;
		}
		// �жϷ���
		switch(direct)
		{
		case 0:   // ����
			
			//�����ҵ�̹�ˣ���ʱ����װ��һ��������
			//1����������ľ���
			//���û��ʵ���ɫ�����ƾ���
			//1��������ߵľ���
			g.fill3DRect(x, y, 5, 30,false);
			//2�������ұߵľ���
			g.fill3DRect(y+15,y, 5, 30,false);
			//3:�����м����
			g.fill3DRect(x+5, y+5,10, 20,false);
			//4:����Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//5:������Ͳ
			g.drawLine(x+10, x+15, y+10, y);	
			break;
		}
		
		
	}
	
}
	

//����һ��̹����
class Tank
{
	//b��ʾ̹�˵ĺ�����x ��������y
	int x=0;
	int y=0;
	public Tank(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
//�ҵ�̹��
class Hero extends Tank
{
	public Hero(int x, int y)
	{
		super(x,y);
	}
}

