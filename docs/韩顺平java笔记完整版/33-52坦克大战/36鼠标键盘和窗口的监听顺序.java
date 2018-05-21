/**
 * ʱ���������˳��
 * 1�����ʱ�䴦��˳��    //�ӿ�����MouseListener
 * ��	��갴���� mousePressed
		����ɿ��� mouseReleased
		������� mouseClicked x=193y=154
:  2�������¼�����˳��       //�ӿ�����KeyListener
		���̰����˼�keyPressed
		����������ֵkeyTyped
		���̰��µļ��Ѿ��ɿ�keyReleased
	3�������ƶ�����ק   //�ӿ�����MouseMotionListener	
	4�����ڵ������С���͹ر�	  //�ӿ�����WindowListener
	
		
 */
package com.test5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Demo9_5 extends JFrame{

	MyPanel mp=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo9_5 demo=new Demo9_5();
	}
    //���캯��
	public Demo9_5()
	{
		mp=new MyPanel();
		this.add(mp);
		//ע�����
//		this.addMouseListener(mp);
//		this.addKeyListener(mp);
//		this.addMouseMotionListener(mp);
		this.addWindowListener(mp);
		
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
//1���������֪����갴�µ���Ϣ������ֻ�µ����λ��
//2�������֪���Ǹ���������
//3�������֪����ק
class MyPanel extends JPanel implements WindowListener   //, MouseListener, KeyListener, MouseMotionListener
{
	public void paint(Graphics g)
	{
		super.paint(g);
	}
	
//	 //���
//     //��걻���
//	public void mouseClicked(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("������� x="+e.getX()+"y="+e.getY());
//	}
//	//����ƶ���MyPanel
//	public void mouseEntered(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("�������");
//	} 
//	//����뿪MyPanel
//	public void mouseExited(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("�������");
//	}
//	//��갴��
//	public void mousePressed(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("��갴����");
//	}
//	//����ɿ�
//	public void mouseReleased(MouseEvent e) {
//		// TODO Auto-generated method stub
//		System.out.println("����ɿ���");
//	}
//	
//	
//	//����
//	//������
//	public void keyPressed(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("���̰����˼�");
//	}
//	//���ɿ�
//	public void keyReleased(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("���̰��µļ��Ѿ��ɿ�");
//	}
//	//������������  ���ֵ�����ǿɼ��ķ����޷�����
//	public void keyTyped(KeyEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("����������ֵ");
//	}
//	
//	
//	
//	
//	//����϶�
//	public void mouseDragged(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("�����ק�ĵ�ǰ����"+arg0.getX());
//	}
//	//����ƶ�
//	public void mouseMoved(MouseEvent arg0) {
//		// TODO Auto-generated method stub
//		System.out.println("��굱ǰ����"+arg0.getX());
//	}

	
	
	
	
	
	
	//���ڼ�����
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowActivated");  // ���ڱ�����
	}
   //���ڹر�
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowClosed");
	}
   //�������ڹر�
	public void windowClosing(WindowEvent e) {   
		// TODO Auto-generated method stub
		System.out.println("windowClosing");
	}
	//����ʧȥ����
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeactivated");
	}
	//���ڻ�ԭ
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowDeiconified");
	}
	//������С��
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowIconified");
	}
   //���ڴ�
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("windowOpened");
	}
}