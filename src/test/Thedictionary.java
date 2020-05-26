package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Thedictionary {
	
	private static Map<String, String> getText() {
		// ���ܻ�����쳣
		try {
		// ����·�������ļ�����
		File file = new File("ox-edict-utf8.txt");
		// ����map,�洢��ȡ�õ�������
		Map<String, String> dict = new HashMap<String, String>();
		InputStreamReader reader =new InputStreamReader(new FileInputStream(file),"UTF-8");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String word = bufferedReader.readLine();
		// ѭ����ȡ�ļ�����
		while (word != null) {
		String information=bufferedReader.readLine();
		// ���и�õ������ݷ���map
		dict.put(word,information);
		word = bufferedReader.readLine();
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
	
	public String Search(String word) {

		Map<String, String> dict = getText();

		String ret = dict.get(word);

		return(ret);


		}
}
