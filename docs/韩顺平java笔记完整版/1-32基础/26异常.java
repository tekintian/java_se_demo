/**
 * �쳣:
 * finally��һ����ִ�У������� catch �������˳�ϵͳ�����System.exit(-1); finally�Ͳ��ᱻִ��
 *
 */
package com.test3;
import java.io.*;
public class Demo2_5_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����쳣1.���ļ�
		FileReader fr=null;
		try {
			fr=new FileReader("d:\\aa.text");
			//�ڳ����쳣�ĵط�������Ĵ���ľͲ�ִ��
			System.out.println("aaa");
		} catch (Exception e) {
			// TODO: handle exceptionS
			System.exit(-1);
			System.out.println("message="+e.getLocalizedMessage());  //û�б���һ�г���
			e.printStackTrace();   // ��ӡ�����쳣�����ֿ��Ա��������쳣����
		}
		//������鲻�ܷ���û�з����쳣������ִ��
		//һ����˵������Ҫ�رյ���Դ���ļ������ӣ��ڴ��
		finally
		{
			System.out.println("����finally");
			if(fr!=null);
			{
				try {
					fr.close();
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		System.out.println("OK");
		
		
		//����һ��192.168.12.12 ip�˿ں�45678
	//
		// �����쳣  ��ĸΪ0
	//	int a=4/0;
		// ����Խ��
/*		try {
			int arr[]={1,2,3};
		System.out.println(arr[123]);
			
		} catch (Exception e) {
			// TODO: handle exception
		}  */
		
	}

}
