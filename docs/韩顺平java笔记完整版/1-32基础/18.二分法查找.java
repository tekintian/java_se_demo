/**
 * ���ܣ����ֲ���
 * 
 */
package com.test1;

public class Demo5_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,5,7,12,25};
		BinaryFind bf=new BinaryFind();
		bf.find(0,arr.length-1,2,arr);
	}

}
//1�����ַ�����
class BinaryFind
{
	public void find(int leftIndex, int rightIndex, int val, int arr[])
	{
		//�����ҵ��м����
		//ԭ�ʼ�������Ǵ���ģ�
		//int midIndex=(rightIndex+leftIndex)/2; 
		
		//��ȷ���м�����ȡ��ʽΪ
		int midIndex= (rightIndex-leftIndex)/2 + leftIndex;
		
		
		int midVal=arr[midIndex];
		if(rightIndex>leftIndex)
		{
		//���Ҫ�ҵ�����midVal��
		    if(midVal>val)
			{
				//�����е������
				find(leftIndex,  midIndex-1, val, arr);	
			}
			else if(midVal<val)
			{
				//��arr���ұ�����
				find(midIndex+1, rightIndex, val,arr);
			}
			else if(midVal==val)
			{
				System.out.println("�ҵ��±�"+midIndex);
			}
		}
	}
  }
