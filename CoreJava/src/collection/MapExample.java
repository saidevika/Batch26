package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapExample {
	public static void main(String args[]){
		mapExample();
	}
	
	public static void mapExample(){
		Map<String, String> map = new HashMap();
		map.put("one", "ONE");
		map.put("22", "TWO");
		map.put("3", "THREE");
		
		System.out.println(map.get("22"));
	}
	
	public static void mapExampleOne() {
		
		Set<String> johnFriendPhones = new HashSet<>();
		johnFriendPhones.add("123-897-5678");
		johnFriendPhones.add("123-897-3456");
		johnFriendPhones.add("123-897-8888");
		johnFriendPhones.add("123-897-5678");
//		printDetails(phones);
		
		Set<String> johnFriendNames = new TreeSet<>();
		johnFriendNames.add("Apple");
		johnFriendNames.add("Zebra");
		johnFriendNames.add("Boomer");
		johnFriendNames.add("Computer");
//		printDetails(names);
		
		Set<String> maryFriendPhones = new HashSet<>();
		maryFriendPhones.add("123-897-3333");
		maryFriendPhones.add("123-333-3456");
		maryFriendPhones.add("123-444-8888");
		maryFriendPhones.add("123-897-4444");
//		printDetails(phones);
		
		Set<String> maryFriendNames = new TreeSet<>();
		maryFriendNames.add("Raj");
		maryFriendNames.add("Kathy");
		maryFriendNames.add("Mark");
		maryFriendNames.add("Mohan");
		
		
		
		List<Set> johnList = new ArrayList<>();
		johnList.add(johnFriendNames);
		johnList.add(johnFriendPhones);
		
		List<Set> maryList = new ArrayList<>();
		maryList.add(maryFriendNames);
		maryList.add(maryFriendPhones);
		
		
//		List objects = new ArrayList();
//		objects.add(johnList);
//		objects.add(maryList);
		
		Map<String , List<Set>> nameMap = new HashMap<>();
		nameMap.put("John", johnList);
		nameMap.put("Mary", maryList);
		
	}

	public static void printAllDetails(Map<String , List<Set>>  nameMap){
		List<Set> johnList = nameMap.get("John");
		for(Set se : johnList) {
			
		}
	}
	
	public static void printDetails(Set<String> something) {
		
		for(String str : something){
			System.out.println(str);
		}
		System.out.println("============\n");
	}
	
	
	
	
}
