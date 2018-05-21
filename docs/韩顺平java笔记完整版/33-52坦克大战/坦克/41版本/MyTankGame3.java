/**
 * ���ܣ�̹����Ϸ��3.0�汾
 * 1������̹��
 * 2:ʵ��̹�����������ƶ�
 * 3:ʵ��̹�˷���һ���ӵ�.
 * 4������������ӵ�ʵ���������䣬��ֻ��� ����J ����ʱ��ȥ��һ�������Ϳ�����
 * 5:ʵ���ӵ��򵽵���̹��̹�˻���ʧ
 */
package com.test3;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class MyTankGame3 extends JFrame{

	MyPanel mp=null;
	public static void main(String[] args) {
		
		MyTankGame3 mtg=new MyTankGame3();
	}
	//���캯��
	public MyTankGame3()
	{
		mp=new MyPanel();
		//����mp�߳�
		Thread t=new Thread(mp);
		t.start();
		this.add(mp);
		//ע�����
		this.addKeyListener(mp);
		this.setSize(400,300);
		this.setVisible(true);
	}
}
//�ҵ����
class MyPanel extends JPanel implements KeyListener,Runnable
{
	//����һ���ҵ�̹��
	Hero hero=null;
	//������˵�̹��
	Vector<EnemyTank> ets=new Vector<EnemyTank>();
	int enSize=3;
	//���캯��
	public MyPanel()
	{	//�ҵ�̹��
		hero=new Hero(150,150);
		//��ʼ�����˵�̹��
		for(int i=0; i<enSize; i++)
		{	// ����һ������̹��
			EnemyTank  et=new EnemyTank((i+1)*50,0);
			et.setColor(0);
			et.setDirect(2);
			//���뵽�����
			ets.add(et);
		}
	}
	
	//��дpaint
	public void paint(Graphics g)
	{
		super.paint(g);
		//����ͼ��ı���ɫ
		g.fillRect(0, 0, 600, 400);
		//�����Լ���̹��
		this.drawTank(hero.getX(),hero.getY(), g, hero.direct, 1);
	
		//ss��ȡ��ÿһ���ӵ�������
		for(int i=0; i<hero.ss.size(); i++)
		{
			Shot myShot=hero.ss.get(i);
			//���ӵ�
			if(myShot!=null&&myShot.isLive==true)
			{
				g.draw3DRect(myShot.x, myShot.y, 1, 1, false);
			}
			//ɾ�������������ӵ�
			if(myShot.isLive==false)
			{
				//��ss��ɾ�����ӵ�
				hero.ss.remove(myShot);
			}
		}
		//�������˵�̹��
		for(int i=0; i<ets.size(); i++)
		{
			EnemyTank et=ets.get(i);
			if(et.isLive)
			{
				this.drawTank(et.getX(), et.getY(), g, et.getDirect(), 0);
			}
		}
		
	}
	//дһ������ר���ж��ӵ��Է���е��˵�̹��
	public void hitTank(Shot s, EnemyTank et)
	{
		//�жϸ�̹�˵ķ���
		switch(et.direct)
		{
		//������˵�̹�˵ķ��������ϻ�������
		case 0:
		case 2:
			if(s.x>et.x&&s.x<et.x+20&&s.y>et.y&&s.y<et.y+30)
			{
				//����
				//�ӵ�����
				s.isLive=false;
				//����̹������
				et.isLive=false;
				
			}
		case 1:
		case 3:
			if(s.x>et.x&&s.x<et.x+30&&s.y>et.y&&s.y<et.y+20)
			{
				//����
				//�ӵ�����
				s.isLive=false;
				//����̹������
				et.isLive=false;
				
			}
		}
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
			g.fill3DRect(x+5, y+5,10, 20,false);
			//4:����Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//5:������Ͳ
			g.drawLine(x+10, y+15, x+10, y);	
			break;
		case 1:    //  ����
			g.fill3DRect(x, y, 30, 5, false);
			//
			g.fill3DRect(x, y+15, 30, 5, false);
			//
			g.fill3DRect(x+5, y+5, 20, 10, false);
			//
			g.fillOval(x+10, y+5, 10, 10);
			//
			g.drawLine(x+15, y+10, x+30, y+10);
			break;
		case 2: // ����
			//�����ҵ�̹�ˣ���ʱ����װ��һ��������
			//1����������ľ���
			//���û��ʵ���ɫ�����ƾ���
			//1��������ߵľ���
			g.fill3DRect(x, y, 5, 30,false);
			//2�������ұߵľ���
			g.fill3DRect(x+15,y, 5, 30,false);
			//3:�����м����
			g.fill3DRect(x+5, y+5,10, 20,false);
			//4:����Բ��
			g.fillOval(x+5, y+10, 10, 10);
			//5:������Ͳ
			g.drawLine(x+10, y+15, x+10, y+30);	
			break;
		case 3:  //����
			g.fill3DRect(x, y, 30, 5, false);
			//
			g.fill3DRect(x, y+15, 30, 5, false);
			//
			g.fill3DRect(x+5, y+5, 20, 10, false);
			//
			g.fillOval(x+10, y+5, 10, 10);
			//
			g.drawLine(x+15, y+10, x-3, y+10);
			break;
			
		}
		
		
	}
	//�����´��� a s w d
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode()==KeyEvent.VK_W)
		{
			//���� ǰ��
			this.hero.setDirect(0);
			this.hero.moveUp();
		}
		else if(e.getKeyCode()==KeyEvent.VK_D)
		{
			//����ǰ��
			this.hero.setDirect(1);
			this.hero.moveRight();
		}
		else if(e.getKeyCode()==KeyEvent.VK_S)
		{
			//����ǰ��
			this.hero.setDirect(2);
			this.hero.moveDown();
		}
		else if(e.getKeyCode()==KeyEvent.VK_A)
		{
			//����ǰ��
			this.hero.setDirect(3);
			this.hero.moveLeft();
		}
		//�ж�����Ƿ���J��
		if(e.getKeyCode()==KeyEvent.VK_J)
		{
			if(this.hero.ss.size()<=5)
			{
				this.hero.shotEnemy();
			}
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

	public void run() {
		// TODO Auto-generated method stub
		//ÿ��100�������»����ӵ�
		while(true)
		{
			try {
				Thread.sleep(100);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			//�ж��Ƿ����
			for(int i=0; i<hero.ss.size(); i++)
			{
				//ȡ���ӵ�
				Shot myShot=hero.ss.get(i);
				//�ж��ӵ��Ƿ���Ч
				if(myShot.isLive)
				{
					//ȡ��ÿһ�����˵�̹����֮ƥ�䣬
					for(int j=0; j<ets.size(); j++)
					{
						//ȡ��̹��
						EnemyTank et=ets.get(j);
						
						if(et.isLive)
						{
							this.hitTank(myShot,et);
						}
					}
				}
			}
			//���»���panel
			this.repaint();
		}
		
	}
	
}
	

