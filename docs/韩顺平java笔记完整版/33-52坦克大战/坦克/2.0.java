/**
 * ���ܣ�̹����Ϸ��2.0�汾
 * 1������̹��
 * 2:ʵ��̹�����������ƶ�
 */
package com.test6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyTankGame2 extends JFrame{

	MyPanel mp=null;
	public static void main(String[] args) {
		
		MyTankGame2 mtg=new MyTankGame2();
	}
	//���캯��
	public MyTankGame2()
	{
		mp=new MyPanel();
		this.add(mp);
		//ע�����
		this.addKeyListener(mp);
		this.setSize(400,300);
		this.setVisible(true);
	}
}
//�ҵ����
class MyPanel extends JPanel implements KeyListener
{
	//����һ���ҵ�̹��
	Hero hero=null;
	
	//���캯��
	public MyPanel()
	{
		hero=new Hero(150,150);
	}
	
	//��дpaint
	public void paint(Graphics g)
	{
		super.paint(g);
		//����ͼ��ı���ɫ
		g.fillRect(0, 0, 600, 400);
		this.drawTank(hero.getX(),hero.getY(), g,hero.direct,1);
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
			g.fill3DRect(x+15,y, 5, 30,false);
			//3:�����м����
			g.fill3DRect(x+5, y+5,10, 20,true);
			//4:����Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//5:������Ͳ
			g.drawLine(x+10, y+15, x+10, y);	
			break;
		}
		
		
	}
	//�����´��� a s w d
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W)
		{
			//����
		//	this.hero.setDirect(0);
			this.hero.moveUp();
		}
		else if(e.getKeyCode()==KeyEvent.VK_D)
		{
			//����
		//	this.hero.setDirect(1);
			this.hero.moveRight();
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		{
			//����
		//	this.hero.setDirect(2);
			this.hero.moveDown();
		}
		else if(e.getKeyCode()==KeyEvent.VK_A)
		{
			//����
		//	this.hero.setDirect(3);
			this.hero.moveLeft();
		}
		//���»��ƴ���
		this.repaint();
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
	

//����һ��̹����
class Tank
{
	//b��ʾ̹�˵ĺ�����x ��������y
	int x=0;
	int y=0;
	// ���巽��  0��ʾ���� 1��ʾ�ң� 2��ʾ�� 3��ʾ��
	int direct=0;
	//̹���ٶ�
	int speed=20;
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
	public int getDirect() {
		return direct;
	}
	public void setDirect(int direct) {
		this.direct = direct;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
//�ҵ�̹��
class Hero extends Tank
{
	public Hero(int x, int y)
	{
		super(x,y);
	}
	//̹�������ƶ�
	public void moveUp()
	{
		y-=speed;
	}
	//̹�������ƶ�
	public void moveRight()
	{
		x+=speed;
	}
	//�����ƶ�
	public void moveDown()
	{
		y+=speed;
	}
	//������ƶ�
	public void moveLeft()
	{
		x-=speed;
	}
}

