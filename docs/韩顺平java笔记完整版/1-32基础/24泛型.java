/**
 * ���͵ı�Ҫ��
 * ����ǿ������ת����ߴ���İ�ȫ��
 * �ᵽ�����������
 */
package com.test3;
import java.lang.reflect.Method;
import java.util.*;
public class Demo25 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Dog>  al=new ArrayList<Dog>();   // al �����;��� Dog����
		//����һֻ��
		Dog dog1=new Dog();
		//���뵽������
		al.add(dog1);
	//	Dog temp=(Dog)al.get(0);
	//	Cat temp=(Cat)al.get(0);
		
	//	Dog temp=al.get(0);   //ȡal���еĵ�һ��Ԫ�� ����ǿ������ת��
		Gen<Bird> gen1=new Gen<Bird>(new Bird());
		gen1.showTypeName();
	}

}
//����һ����Bird
class Bird
{
	public void test1()
	{
		System.out.println("aa");
	}
	public void count(int a, int b)
	{
		System.out.println(a+b);
	}
}
//����һ����
class Gen<T>
{
	private T o;
	// �õ�T�����ͺ�����
	public Gen(T a)
	{
		o=a;
	}
	public void showTypeName()
	{
		System.out.println("�����ǣ�"+o.getClass().getName());
		//ͨ��������ƿ��Եõ�T���͵ĺܶ���Ϣ������˵�õ���Ա��������
		Method []m=o.getClass().getDeclaredMethods();
		//  ��ӡ
		for(int i=0; i<m.length; i++)
		{
			System.out.println(m[i].getName());
		}
	}
	
}
class Cat
{
	private String color;
	private int age;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
class Dog
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}