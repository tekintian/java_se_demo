/**
 * final ������ʹ��
 * 1: ���final �ڱ���ǰ������������븳��ֵ���̳���������Ļ����������ֵ���ܱ䣬���ǿ������¶���һ��ͬ���ı��������������
 *    ���Բ���final���ͣ���ϸ�� Aaa���е� rate ������ Bbb�̳�֮��rate�����ı仯
 * 2�����final ���෽���б�ʾ����������̳�֮���ܱ���д�� �������¶����������
 * 3�����ඨ���final ��ʾ����಻�ܱ��̳У����Ӿ����ˣ����Ǻ� 
 */

package com.test4;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bbb  bb=new Bbb();
		bb.show();	
	}

}
class Aaa  // ������ʱ���һ��final ��ʾ�����Ͳ��ܱ��̳���
{
	int a;   // ���ʱ�� a��Ĭ������� 0
	final float rate=3.1415f;  // �̳������໹�������¶��� rate ���ҿ��Բ���final ������������¶���rate��rate��ֵ���ܱ�
     public void sendMes()   // �����final��ʾ�������˵�����ܱ���������̳�
	{
		System.out.println("������Ϣ");
	}
    public void show()
    {
    	System.out.println("a");
    }
}
class Bbb extends Aaa
{
	//int rate=3;   �������µ�һһ��rate
	public Bbb()
	{
		a++;
	//	rate=rate+2;
	}
  	public void sendMes()
	{
		System.out.println();
	}  // ������Ϊ�����Ѿ��������������Ϊfinal ����
  	public void show()
  	{
  		System.out.println(rate);
  	}
}
interface Fish
{
	//�÷���ʵ��.....
	public void swimming();
}
interface Bird
{
	public void fly();
}
class Monkey
{
	int name;
	public void jump()
	{
		System.out.println("���ӻ���");
	}
}
class LittleMokey  extends Monkey implements Fish, Bird
{

	public void swimming() {
		// TODO Auto-generated method stub
		
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
}
