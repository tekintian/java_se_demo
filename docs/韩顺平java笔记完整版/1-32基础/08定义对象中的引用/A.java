/*
		�ඨ���е����ö��� �������ʱ����Զ�������������������ͬһ�����ö��󣬸ı�һ����������ñ����еı�������Ҳ�͸ı�������һ��
		���������õı�����10��16�д���
*/
import java.io.*;
public class A
{
	public static void main (String [] args)
	{
		Dog dog1= new Dog(2, "���");
		Person p1=new Person(dog1,23, "ɣ����");
		Person p2=new Person(dog1, 25,"������");
		p1.showInfo();
		p1.dog.showInfo();
		p1.dog.changeName("����");  // ��ɣ�����Ĺ������ָ�Ϊ����
	    p1.dog.showInfo();
	}
}
class Person 
{
	int age;
	String name;
	Dog dog;
	public Person (Dog dog, int age, String name)
	{
		this.age=age;
		this.name=name;
		this.dog=dog;
	}
	public void showInfo()
	{
		System.out.println("�����ǣ�"+this.name);
	}
}
class Dog
{
	private int age;
	public String name;
	public Dog(int age, String name)
	{
		this.age=age;
		this.name=name;
	}
	public void changeName(String name)
	{
		this.name=name;
	}
	public void showInfo()
	{
		 System.out.println("������"+this.name);
	}

}