/**
 * ���ܣ��ӿڵĽ���
 * ע�� Computer ��
 * 1���ӿڲ�����ʵ��������
 * 2���ӿ��еķ��������з�����
 * 3: �����ʵ���˽ӿڣ������ѽӿ��еķ���ȫ��ʵ��
 * 4���ӿ��еı���������Public private �����Σ����������϶��Ǿ�̬��
 *    ���ܼӲ���staitc �ؼ��� ������ fanl ���� �����ã�
 *                      �ӿ���.������
 *    �ķ�ʽ���ʽӿ��еı���
 * 5: �ӿڲ��ܼ̳���ͨ�࣬ �����Լ̳нӿڣ����������ʵ��
 *    ����ӿڱ���ʵ�ֽӿڼ̳����ĸ���ķ���
 */
package com.test3;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Computer();
		Camera camera1=new Camera();
		Phone phone1=new Phone();
		computer.useUsb(camera1);  // useUsb�����еĲ��������Ƕ�̬
		computer.useUsb(phone1);
	}

}
// ����һ���ӿ�
interface Usb{
	int a=1;
	public void start();
	public void stop();
}
//��д��������࣬����ʵ����usb�ӿ�һ��
//ʵ�ָ���Ļ�Ӧ�ð�����ӿ�ȫ��ʵ�ֲ�Ȼ�ͻᱨ��
class Camera implements Usb
{
	public void start()
	{
		System.out.println("�����������ʼ��������");
	}
	public void stop()
	{
		System.out.println("���������ֹͣ��������");
	}
	
}
//��д�ֻ���
class Phone implements Usb
{
	public void start()
	{
		System.out.println("�����ֻ�����ʼ��������");
	}
	public void stop()
	{
		System.out.println("�����ֻ���ֹͣ��������");
	}
	
}
class Computer
{
	public void useUsb(Usb usb)  // ��̬������
	{
		usb.start();
		usb.stop();
	}
}
