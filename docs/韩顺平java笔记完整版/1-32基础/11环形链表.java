/**
 * ����:ɣ��
 * ���ܣ�����������
 */
package com.sangyang;

public class Demo4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CyclLink cyclink=new CyclLink();
		cyclink.setLen(15);
		cyclink.createLink();
		cyclink.setK(2);
		cyclink.setM(2);
		cyclink.show();
		cyclink.play();
	}
}
class Child
{
	int no;
	Child nextChild;   // ָ����һ��Child��ָ��
	public Child(int no)
	{
		//��һ�����
		this.no=no;
	}
	
}
// ��������
class CyclLink
{
	//�ȶ���һ��ָ�������һ��С��������
	//ָ���һ��С�������ã����ܶ�
	Child firstChild=null;
	Child temp=null;
	int len=0;//��ʾ���м���С��
	int k=0;
	int m=0;
	//����m
	public void setM(int m)
	{
		this.m=m;
	}
	//��������Ĵ�С
	public void setLen(int len)
	
	{
		this.len=len;
	}
	//���ôӵڼ����˿�ʼ����
	public void setK(int k)
	{
		this.k=k;
	}
	//��ʼplay
	public void play()
	{
		Child temp=this.firstChild;
		//1.���ҵ���ʼ��������
		for(int i=1; i<k; i++)
		{
			temp=temp.nextChild;
		}
		while(this.len!=1)
		{
		//2.��m��
		for(int j=1; j<m; j++)
		{
			temp=temp.nextChild;
		}
		//�ҵ�Ҫ��Ȧ��ǰһ��С��
		Child temp2=temp;
		while (temp2.nextChild!=temp)
		{
			temp2=temp2.nextChild;
		}
		//3.������m��С�����˳�
		temp2.nextChild=temp.nextChild;
		//��tempָ����һ��������С��
		temp=temp.nextChild;
	//	this.show();
		this.len--;
		}
		
		//���һ��С��
		System.out.println("����Ȧ"+temp.no);
	}

	//��ʼ����������
	public void createLink()
	{
		for(int i=1; i<=len; i++)
		{
			if(i==1)
			{
				//������һ��С��
				Child ch=new Child(i);
				this.firstChild=ch;
				this.temp=ch;
			}
			else
			{
				if(i==len)
				{
					//������һ��С��
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;
					temp.nextChild=this.firstChild;
				}
				else
				{
					//��������С��
					Child ch=new Child(i);
					temp.nextChild=ch;
					temp=ch;				
				}		
		    }
	    }
}
	
//��ӡ�û�������
	public void show()
	{
		Child temp=this.firstChild;
		do
		{
			System.out.print(temp.no+" ");
			temp=temp.nextChild;
		}while(temp!=this.firstChild);
	}
}
