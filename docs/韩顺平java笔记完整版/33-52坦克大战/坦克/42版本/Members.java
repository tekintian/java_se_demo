package com.test3;

import java.util.Vector;

//ը����
class Bomb
{
	//�����ҵ�������
	int x, y;
	//ը��������
	int life=9;
	boolean isLive=true;
	
	public Bomb(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	//��������ֵ
	public void lifeDown()
	{
		if(life>0)
		{
			life--;
		}
		else
		{
			this.isLive=false;
		}
	}
	
}

//�ӵ���
class Shot implements Runnable
{
	int x;
	int y;
	int direct;
	int speed=1;
	//�Ƿ񻹻���
	boolean isLive=true;
	public Shot(int x, int y, int direct)
	{
		this.x=x;
		this.y=y;
		this.direct=direct;
	}
	public void run() {
		while(true)
		{
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			switch(direct)
			{
			case 0:
				//�ӵ�����
				y-=speed;
				break;
			case 1:
				x+=speed;
				break;
			case 2:
				y+=speed;
				break;
			case 3:
				x-=speed;
				break;
			}
		//	System.out.println("�ӵ�������x="+x+"�ӵ���y����y="+y);
			//�ӵ���ʱ����
			
			//�жϸ��ӵ��Ƿ�������Ե
			if(x<0||x>400||y<0||y>300)
			{
				this.isLive=false;
				break;
			}
			
		}
		
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
	//̹����ɫ
	int color=0;
	//̹���ٶ�
	int speed=5;
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
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
}
//���˵�̹��,�����߳���
class EnemyTank extends Tank implements Runnable
{
	boolean isLive=true;
	int times=0;
	//����һ�����������Դ�ŵ��˵��ӵ�
	Vector<Shot> ss=new Vector<Shot>();
	//��������ӵ���Ӧ���ڸոմ���̹�˺͵��˵��ӵ������Ժ�ȥ���ӵ�
	public EnemyTank(int x, int y)
	{
		super(x, y);
	}
	public void run() {
		// TODO Auto-generated method stub
		while (true)
		{
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				// TODO: handle exception
			}
			switch(this.direct)
			{
			case 0:
				//˵��̹�����������ƶ�
				for(int i=0; i<30; i++)
				{
					if(y>0)
					{
						y-=speed;
						try {
							Thread.sleep(50);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 1:
				for(int i=0; i<30; i++)
				{
					if(x<400)
					{
						x+=speed;
						try {
							Thread.sleep(50);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 2:
				for(int i=0; i<30; i++)
				{
					if(y<300)
					{
						y+=speed;
						try {
							Thread.sleep(50);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				break;
			case 3:
				for(int i=0; i<30; i++)
				{
					if(x>0)
					{
						x-=speed;
						try {
							Thread.sleep(50);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
				break;
			}
			this.times++;
			//�ж��Ƿ���Ҫ��̹�˼����µ��ӵ�
			if(times%2==0)
			{
					if(isLive)
					{
						if(ss.size()<5)
						{
					//		System.out.println("et.ss.size()"+et.ss.size());
							//û���ӵ�
							 Shot s=null;
							 //����ӵ�
							switch(direct)
							{
								case 0:
									s=new Shot(x+10,y ,0);
									ss.add(s);
									break;
								case 1:
									s=new Shot(x+30,y+10, 1);
									ss.add(s);
									break;
								case 2:
									s=new Shot(x+10,y+30, 2);
									ss.add(s);
									break;
								case 3:
									s=new Shot(x, y+10, 3);
									ss.add(s);
									break;
							}
							// �����ӵ�
							Thread t=new Thread(s);
							t.start();
						}	
						
					}
			}	
			
			
			//��̹���������һ���µķ���
			this.direct=(int)(Math.random()*4);
			
			//�жϵ��˵�̹���Ƿ�����
			
			if(this.isLive==false)
			{
				//��̹���������Ƴ��߳�
				break;
			}
			
		}
	}
	
}
//�ҵ�̹��
class Hero extends Tank
{
	 Shot s=null;
	//�����ӵ�����
	 Vector<Shot> ss=new Vector<Shot>();
	public Hero(int x, int y)
	{
		super(x,y);
	}
	public void shotEnemy()
	{
		
		switch(this.direct)
		{
		case 0:
			s=new Shot(x+10,y ,0);
			ss.add(s);
			break;
		case 1:
			s=new Shot(x+30,y+10, 1);
			ss.add(s);
			break;
		case 2:
			s=new Shot(x+10,y+30, 2);
			ss.add(s);
			break;
		case 3:
			s=new Shot(x,y+10, 3);
			ss.add(s);
			break;
		}
		//�����̲߳�����
		Thread t=new Thread(s);
		t.start();
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
