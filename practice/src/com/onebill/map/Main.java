package com.onebill.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		map.put(1, "Audi");
		map.put(2, "BMW");
		map.put(3, "Ferrari");
		map.put(4, "Lamborgini");
		map.put("Jaguar", 5);
		//System.out.println(map);
		
		Set set = map.keySet();
		//System.out.println(set);//
		
		Collection collection = map.values();
		//System.out.println(collection);//
		
		Set set2 = map.entrySet();
		//System.out.println(set2);//
		
		Iterator iterator = set2.iterator();
		while(iterator.hasNext()) {
			Map.Entry me = (Map.Entry) iterator.next();
			//System.out.println(me.getKey()+" : "+me.getValue());
			//System.out.println(iterator.next());//
			if(me.getKey().equals(2)) {
				me.setValue("Continental GT");
			}
			System.out.println(me);
		}
		
		HashSet set3 = new HashSet();
		set3.add(10);
		set3.add(10);
		System.out.println(set3);
	}
}
