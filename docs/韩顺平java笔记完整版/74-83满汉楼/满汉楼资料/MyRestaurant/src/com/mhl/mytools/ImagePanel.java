/*
 * ����һ�����Զ�̬����һ��ͼƬ��������JPanel
 * 
 * */
package com.mhl.mytools;
import java.awt.*;
import javax.swing.*;
import javax.imageio.*;
public class ImagePanel extends JPanel{
	//�������
	Image im;
	//���캯��ȥָ����JPanel�Ĵ�С
	public ImagePanel(Image im)
	{
		this.im=im;//�˴���this�����٣������ܻ���ͼƬ
		//ϣ������С�����ҵ�����
		int width=Toolkit.getDefaultToolkit().getScreenSize().width;
		int height=Toolkit.getDefaultToolkit().getScreenSize().height;
		this.setSize(width,height);
	}
	//��������
	public void paintComponent(Graphics g)
	{
		//����
		super.paintComponent(g);
		g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);
	}
}
