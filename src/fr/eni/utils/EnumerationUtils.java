package fr.eni.utils;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumerationUtils {
	public static <T> List<T> enumToList(Enumeration<T> e){
		List<T> l = new ArrayList<>();
		while(e.hasMoreElements()) {
			l.add(e.nextElement());
		}
		return l;
	}
	
	public static <K, Integer> Map<K, Integer> enumToMap(Enumeration<K> e){
		Map<K, Integer> m = new HashMap<>();
		while(e.hasMoreElements()) {
			m.put(e.nextElement(), null);
		}
		return m;
	}
}
