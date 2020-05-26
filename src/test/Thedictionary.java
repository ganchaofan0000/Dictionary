package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Thedictionary {
	
	private static Map<String, String> getText() {
		// 可能会出现异常
		try {
		// 根据路径创建文件对象
		File file = new File("ox-edict-utf8.txt");
		// 创建map,存储读取得到的内容
		Map<String, String> dict = new HashMap<String, String>();
		InputStreamReader reader =new InputStreamReader(new FileInputStream(file),"UTF-8");
		BufferedReader bufferedReader = new BufferedReader(reader);
		String word = bufferedReader.readLine();
		// 循环读取文件内容
		while (word != null) {
		String information=bufferedReader.readLine();
		// 把切割得到的内容放入map
		dict.put(word,information);
		word = bufferedReader.readLine();
		}
		// 读取结束,关闭流对象并返回结果
		reader.close();
		return dict;
		} catch (Exception e) {
		System.out.println("字典好像出了点问题、文件内容出错啦。。。");
		e.printStackTrace();
		}
		// 路径指向的不是文件或者文件不存在返回null
		return null;
		}
	
	public String Search(String word) {

		Map<String, String> dict = getText();

		String ret = dict.get(word);

		return(ret);


		}
}
