/**
 * ������ı�Ҫ��
 * 1�����������û�г��󷽷������󷽷������з�����
 *:2�����󷽷�����ʵ��������
 */
package com.test2;

public class Text {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//�����һ��������
abstract class Animal   // ����Ҫ�� abstract �ؼ��� ����û�� abstract
{
	String name;
	int age;
	//������
	abstract public void cry();  //������������з�����
}
class Cat extends Animal
{
	//ʵ�ָ����cry()
	public void cry()
	{
		// do nothing..... Ҳ����
		System.out.println("èè��");
	}
}