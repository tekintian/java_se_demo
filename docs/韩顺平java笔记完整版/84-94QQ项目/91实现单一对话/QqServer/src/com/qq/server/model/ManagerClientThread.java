
package com.qq.server.model;
import java.util.*;
public class ManagerClientThread  {

	public static HashMap hm=new HashMap<String, SerConClientThread>();
	
	public static void addClientThread(String uid, SerConClientThread ct)
	//��hm�����һ���ͻ���ͨѶ�߳�
	{
		hm.put(uid, ct);
	}
	public static SerConClientThread getClientThread(String uid)
	{
		return (SerConClientThread)hm.get(uid);
	}
}
