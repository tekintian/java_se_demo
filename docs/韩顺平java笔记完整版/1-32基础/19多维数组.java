/**
 * ���ܣ���ά����
 * ע�⣺���εĶ�ά���鲻��Ļ�Ĭ��Ϊ0
 */
package com.test1;

public class Demo5_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[4][6];
		a[1][1]=1;
		a[2][1]=2;
		a[2][3]=3;
		//��ͼ�����
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<6; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			//����
			System.out.println();	
		}
  }

}
