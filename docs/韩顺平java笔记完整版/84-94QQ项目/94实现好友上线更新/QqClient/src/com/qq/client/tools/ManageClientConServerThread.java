/**
 * ����ͨѶ�ͻ��������������ͬѧ���߳���
 */
package com.qq.client.tools;
import java.util.*;
public class ManageClientConServerThread {
	
		private static HashMap  hm=new HashMap<String, ClientConServerThread>();
		
		//�Ѵ����õ�ClientConServerThread���뵽HashMap��
		public static void addClientConServerThread(String qqId, ClientConServerThread ccst)
		{
			hm.put(qqId, ccst);
		}
		//���Թ���qqIdȡ�ø��߳�
		public static ClientConServerThread getClientConServerTherad(String qqId)
		{
			return (ClientConServerThread)hm.get(qqId);
		}
}
