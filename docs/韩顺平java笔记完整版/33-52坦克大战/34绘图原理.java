/**
 * java ��ͼԭ��
 */
package com.test1;
import javax.swing.*;
import java.awt.*;
public class Demo9_1 extends JFrame {

	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_1 demo=new Demo9_1();
	}
	public Demo9_1()
	{
		mp=new MyPanel();
		this.add(mp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//����һ��MyPanel  ���ڻ�ͼ��ʵ�ֻ�ͼ������
class MyPanel extends JPanel
{
	//���� JPanel��paint ����  
	//Graphics ��ͼ����Ҫ��
	public void paint(Graphics g)  //��������ᱻϵͳ�Զ�����, ������ⴰ�ڵĴ�С�����±����ã�
	{
		//1:���ø��ຯ����ɳ�ʼ������
		super.paint(g);      //���д��벻���٣����˾Ͳ��ܻ�ͼ��  
		//��һ��Բ
//		System.out.println("paint������");
//		g.drawOval(10, 10, 30, 30);   // ��Բ
//		
//		g.drawLine(10, 10, 50, 50);   // ��ֱ��
//		
//		g.drawRect(10,10, 50, 50);

		
		
		
//		//��һ������ɫ�ľ���
//		g.setColor(Color.blue);
//		g.fillRect(50,50, 60, 80);
//		
//		//��һ������ɫ�ľ���
//		g.setColor(Color.red);
//		g.fillRect(150,150, 60, 80);
	
		
		
//		
//		//������ϻ���ͼƬ
//		Image im=Toolkit.getDefaultToolkit().getImage
//		(Panel.class.getResource("/mengmeng.jpg"));
//		//ʵ��ͼƬ
//		 g.drawImage(im, 10, 10, 100 , 150, this);
		
		
		 
		
		//������
		g.setColor(Color.red);    //����������ɫ
		g.setFont(new Font("���Ĳ���",Font.BOLD, 30));  //���������ʽ
		g.drawString("��ɣ����", 100,100);  //��������
		 
		 
	}
}
