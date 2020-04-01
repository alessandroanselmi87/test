package it.skill.skf3;

import java.util.ArrayList;

/**
 * Class Utility
 *
 */
public class App {
    
	/**
   * Converte l'ArrayList in una stringa con separatore
   * Ritorna Stringa vuota se NULL
   */
	public static String arrayToString(ArrayList arrLst) {
		// Se Null, ritorna Stringa Vuota
		if (arrLst == null) {
			return null;
		}
		String str = "";
		for (int i=0; i < arrLst.size(); i++) {
			if (i > 0) {
				str = str + ",";
			}
			str = str + arrLst.get(i);
		}
		return str;
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
}