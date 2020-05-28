package test;

import java.util.Map;

public abstract class Dictionary {
	
	
	public abstract  Map<String, String> getText();
	
	public String Search(String word) {

		Map<String, String> dict = getText();

		String ret = dict.get(word);

		return(ret);


		}

}
