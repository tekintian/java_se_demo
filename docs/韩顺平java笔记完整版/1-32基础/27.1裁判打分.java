/**
 * ���д��
 * 3���˵ĳɼ� ȥ����߷� ��ȥ����ͷ�Ȼ������ͷ�
 * �����ж���ͷ֡���
 * ���������Ĳ���
 */
package com.test1;
import java.io.*;
public class Text1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Judge judge=new Judge();
		System.out.println(judge.lastFen());
		System.out.println("��˵Ĳ�����"+(judge.getWorst()));
	}
}
class Judge
{
	//��һһ�����Դ��3��С��������
	float fens[]=null;
	int size=3;
	//���캯�����ڳ�ʼ��
	public Judge()
	{
		fens=new float[size];
		//��ʼ��.
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);	
			try {
				for(int i=0; i<fens.length; i++)
				{
				System.out.println("�������"+(i+1)+"���еĳɼ�");
				fens[i]=Float.parseFloat(br.readLine());
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
//�õ�����������ί
	public int getWorst()
	{
		float lastFen=this.lastFen();
		//��Ϊ��һ����ί������
		int worstIndex=1;
		float cai=Math.abs(fens[0]-lastFen);
		float tempCai=0f;
		for(int i=1; i<fens.length; i++)
		{	
			if(cai<Math.abs(fens[i]-lastFen))
			{
				worstIndex=i+1;
				cai=Math.abs(fens[i]-lastFen);
			}
		}
		return worstIndex;
	}
	//�õ��˶�Ա�����÷�
   public float lastFen()
	{
		
		
		
		//3: �õ�ƽ����
		float allFen=0;
		int minIndex=this.getLowFenIndex();
		int maxIndex=this.getHighnFenIndex();
		for(int i=0; i<fens.length; i++)
		{
			if(i!=minIndex && i!=maxIndex)
			{
				allFen+=fens[i];
			}
		}
		return allFen/(fens.length-2);
	}
	//1: ȥ����ͷ֣������ҵ���ͷֵ��±꣩
	public int getLowFenIndex()
	{
		//ѡ�񷨣������һ������ͷ�
		float minFen=fens[0];
		int minIndex=0;
		for (int i=1; i<fens.length; i++)
		{
			if(minFen>fens[i])
			{
				//�޸���ͷ�
				minFen=fens[i];
				minIndex=i;
			}
		}
		return minIndex;
		              
	}
	//2: ȥ����߷�
	public int getHighnFenIndex()
	{
		//ѡ�񷨣������һ������ͷ�
		float maxFen=fens[0];
		int maxIndex=0;
		for (int i=1; i<fens.length; i++)
		{
			if(maxFen<fens[i])
			{
				//�޸���ͷ�
				maxFen=fens[i];
				maxIndex=i;
			}
		}
		return maxIndex;
		              
	}
}

