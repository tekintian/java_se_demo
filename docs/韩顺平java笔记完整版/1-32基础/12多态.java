/**
 * ������ʾ����̬����ʾ
 * ���������д�˸���ķ����� 
 * ���   ����  ����=new ���� 
 *     ����.����    // ����������������д�����������ķ�����
 *     ���û����д����ø���ķ���
 */

package com.sangliyang;

public class Demo5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Cat cat=new Cat();
		cat.cry();
		Dog dog=new Dog();
		dog.cry();   
		Animal an=new Cat();   //��̬������һ������ı���ָ������
		an.cry();
		an.eat();
		an=new Dog();
		an.cry();
		an.eat(); */
		Master master=new Master();
		master.feed(new Dog(), new Bone());  //��̬
		master.feed(new Cat(), new Fish());
		
	}

}
class Food
{
	String name;
	public void showName()
	{
		
	}
}
class Fish extends Food
{
	public void showName()
	{
		System.out.println("��");
	}
}
class Bone extends Food
{
	public void showName()
	{
		System.out.println("��ͷ");
	}
}
//������
class Master
{
	//������ιʳ��
	public void feed(Animal an, Food f)
	{
		an.eat();
		f.showName();
	}
}
//������Animal
class Animal
{
	String name;
	int age;
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
	//������
	public void cry()
	{
		System.out.println("��֪����ô��");
	}
	public void eat()
	{
		System.out.println("�Ҳ�����ʲô");
	}

}
class Dog extends Animal
{
	public void cry()
	{
		System.out.println("������");
	}
	public void eat()
	{
		System.out.println("��ϲ���Թ�ͷ");
	}
	
}
class Cat extends Animal
{
	public void cry()
	{
		System.out.println("������");
	}
	public void eat()
	{
		System.out.println("èϲ������");
	}
}
