/**
 * LinkdeList �Ĺ��ܣ�
 * addFirst ��ָ��Ԫ�ز�����б�Ŀ�ͷ
 * addLast��ָ��Ԫ����ӵ����б�Ľ�β
 * HashMap�Ĺ���
 * put �������ڴ�ӳ���й���ָ��ֵ��ָ������ע���ֵ�����ظ� ���ظ��Ļ��ͻᱻ���ǵ������ü���ʾ���Ǹ��ǵ���Ϣ
 * containsKey�����������ӳ���������ָ������ӳ���ϵ���򷵻� true��
 * 
 * HashMap��Hashtable������
 * Hashtable��ͬ������֤�̵߳İ�ȫ����ֵ������Ϊ��
 * HashMap���̱߳Ƚϰ�ȫЧ�ʸߣ�����Ϊ��ֵ
 */
package com.test2;
import java.util.*;
public class Demo7_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	/*	// TODO Auto-generated method stub
	 * 
	 * 
	 *   //LinkList 
		LinkedList ll=new LinkedList();
		Emp emp1=new Emp("sa01","aa", 1.2f);
		Emp emp2=new Emp("sa01","bb", 1.2f);
		//��ʾ��emp1�����������ǰ��
		ll.addLast(emp1);
		ll.addFirst(emp2);
		for(int i=0; i<ll.size(); i++)
		{a
			System.out.println(((Emp)ll.get(i)).getName());
		}    */
		// Vector���÷�
	/*	Vector vv=new Vector();
		Emp emp1=new Emp("sa01","aa", 1.2f);
		vv.add(emp1);
		for(int i=0; i<vv.size(); i++)
		{
			Emp emp=(Emp)vv.get(i);
		}  */
	//	Stack stack=new Stack();
	//	stack.
		
		
		
		
		
/*		//����һ��HashMap ����
		HashMap hm=new HashMap();
		
		Emp emp1=new Emp("s001","aaa", 3.5f);
		Emp emp2=new Emp("s002","��ɣ", 3.5f);
		Emp emp3=new Emp("s003","����", 3.5f);
		
		//��emp�ŵ�hm��
		hm.put("s001", emp1);
		hm.put("s002", emp2);
		hm.put("s003", emp3);   // ע���ֵ�����ظ� ��ʱ��s002��ʾ������
   		if(hm.containsKey("s002"))
		{
			System.out.println("�и�Ա��");
			//���ȥ����ֵ
			Emp emp=(Emp)hm.get("s002");
			System.out.println("���֣�"+emp.getName());
		}
		else
		{
			System.out.println("û�и�Ա��");
		}  
		//����HashMap�����е�key��value   ȥ����ֵû��˳��
		Iterator it=hm.keySet().iterator();
		// hasNext����һ��boolean
		while(it.hasNext())
		{
			String key=it.next().toString();
			//ͨ��keyȥ��vale
			Emp emp=(Emp)hm.get(key);
			System.out.println("����"+emp.getName());
			System.out.println("нˮ��"+emp.getSal());
		}   */
		
		//��ʾHashTable
		Hashtable ht=new Hashtable();
		
	}
	

}
