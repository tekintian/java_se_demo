/**
 * ���ܣ��������ݵ�ʹ��
 * ����һ���������飬���ڴ�Ź������ֺ�����
 */
package com.test1;
import java.io.*;
public class Demo5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//����һ�����Դ����ֻ���Ķ�������
		Dog dogs[]=new Dog[3];
		//������������ֵ
	/*	dogs[0]=new Dog();   ����� new ��һ������ ʹ dog[0]ָ���
		dogs[0].setName("����");
		dogs[0].setWeight(4.5f);   */
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		for(int i=0; i<3; i++)
		{
			dogs[i]=new Dog();
			System.out.println("�����"+(i+1)+"������");
			String name=br.readLine();
			//�����ָ�������
			dogs[i].setName(name);
			System.out.println("�������"+(i+1)+"����");
			String s_weight=br.readLine();
			float weight=Float.parseFloat(s_weight);
			dogs[i].setWeight(weight);
			
		}
			// ����ƽ������
			float allWeight=0;
			for(int j=0; j<3; j++)
			{
				allWeight+=dogs[j].getWeight();
			}
			for(int j=0; j<3; j++)
			{
				System.out.printf("��������"+dogs[j].name+"��������"+dogs[j].weight);
			}
			//float avgWeight=1f;    //  ����ط����ܸ���ֵ
			float avgWeight=allWeight/dogs.length;
			System.out.println();
			System.out.println("��������="+allWeight+"ƽ������"+avgWeight);
		}
	}

// ����һ������
class Dog
{
	public String name;
	public float weight;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}