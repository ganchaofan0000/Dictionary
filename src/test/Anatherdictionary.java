package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Anatherdictionary extends Dictionary {
	
	public  Map<String, String> getText() {
		// ���ܻ�����쳣
		try {
		// ����·�������ļ�����
		File file = new File("�ʵ�.txt");
		// ����map,�洢��ȡ�õ�������
		Map<String, String> dict = new HashMap<String, String>();
		InputStreamReader reader =new InputStreamReader(new FileInputStream(file),"gbk");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String word = null;
		// ѭ����ȡ�ļ�����
		while ((word=bufferedReader.readLine()) != null) {
		String []arr=word.split("\t");
		// ���и�õ������ݷ���map
		dict.put(arr[0],arr[1]);
		}
		// ��ȡ����,�ر������󲢷��ؽ��
		reader.close();
		return dict;
		} catch (Exception e) {
		System.out.println("�ֵ������˵����⡢�ļ����ݳ�����������");
		e.printStackTrace();
		}
		// ·��ָ��Ĳ����ļ������ļ������ڷ���null
		return null;
		}
	
}
