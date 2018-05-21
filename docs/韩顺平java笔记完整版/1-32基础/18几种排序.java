/**
 * ������ʾ��������
 * 1��ð������ Bubble
 * 2:�������� Select
 * 3:�������� InsertSort
 * 4:�������� QuickSotrt
 * ����: �����βα�������Ӧ�õ�ʱ���ββ�������ͨ���ͣ��βα����Ǹ������ͣ�����˵����Ϳ���
 */
package com.test1;
import java.util.*;
public class Demo5_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len=10000000;
		int []arr=new int[len];
		for (int i=0; i<len; i++)
		{
			//�ó����������1��10000������
			//Math.random()���������һ�� 0��1�����ֲ������0 Ҳ�������1
			int t=(int)(Math.random()*10000);
			arr[i]=t;
		}
	//	int arr1[]={1,6,0,-1,9,3,2,44,33,77};
	/*	int a=12;
		int arr[]={1,6,0,-1,9};
		Bubble bubble=new Bubble();
		bubble.test(a);
		System.out.println("a="+a);     //���ʱ��a��ֵ��12 ӦΪ�������Ͳ�����ƽ�������ͣ���������Ϳ���
		bubble.sort(arr);  */
		
		//��ѡ�����򷨶���һ������
	//	Select select=new Select();
		//�ò��뷨����һ������
	//	InsertSort is=new InsertSort();
		//������ǰ��ӡһ��ʱ��
		QuickSort qs=new QuickSort();
		Calendar cal1=Calendar.getInstance();  //����һ��ʱ����  ����ģʽ
		System.out.println("����ǰ"+cal1.getTime());
	//	select.sort(arr);
	//	is.sort(arr1);
		//������ӡһ��ʱ�䣬�������ֶ���һ������
		qs.sort(arr,0 ,arr.length-1);
		Calendar cal2=Calendar.getInstance();  // �������¶��壬
		System.out.println("�����"+cal2.getTime());
	/*	for(int i=0; i<arr1.length; i++)
		{
			System.out.printf("%d ",arr1[i]);
		} */
    }
}


//1:��������
class InsertSort
{
	//��������
	public void sort(int arr[])
	{
		for(int i=1; i<arr.length; i++)
		{
			int insertVal=arr[i];
			//insertVal׼����ǰһ�����Ƚ�
			int index=i-1;
			while(index>=0&&insertVal<arr[index])
			{
				//����arr[index]����ƶ�
				arr[index+1]=arr[index];
				//��index ��ǰ�ƶ�
				index--;
			}
			//��insertVal ���뵽�ʵ���λ��
			arr[index+1]=insertVal;
		}
	}
}


//2:ѡ������
class Select
{
	//ѡ�������
	int temp=0;
	public void sort(int arr[])
	{
		//��Ϊ��һ����������С��
		int temp=0;
		for(int j=0; j<arr.length-1; j++)
		{
			int min=arr[j];
			//��¼��С�����±�
			int minIndex=j;
			for(int k=j+1; k<arr.length; k++)
				if(min>arr[k])
				{
					min=arr[k];
					minIndex=k;
				}
			temp=arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
		}
	}
}



//3:ð������
class Bubble
{
	public void test(int a)
	{
		a++;
	}
	public void sort(int arr[])
	{
		int temp=0;
		//i�Ǿ����߼���, ð������
		for(int i=0; i<arr.length-1; i++)
		{
			//�ڲ�ѭ������ʼ����Ƚϣ��������ǰһ�����Ⱥ�һ������ͽ���
			for(int j=0;j<arr.length-1-i; j++)
			{
				if(arr[j]>arr[j+1])
				{
					//��λ
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;		
				}
			}
		}
	}
}


//4:��������
class QuickSort
{
	public void sort(int [] a, int low, int high )
	{

		int pos;
		if (low<high)
		{
			pos = FindPos(a, low, high);
			sort(a, low, pos-1);
			sort(a, pos+1, high);
		}
	}
	public int FindPos(int [] a, int low, int high)
	{
		int val = a[low];
		while (low<high)
		{
			while (low<high && a[high]>=val)
				--high;
			a[low] = a[high];
			while (low<high && a[low]<=val)
				++low;
			a[high] = a[low];
		}
		a[low] = val;
		return low;
	}
}
