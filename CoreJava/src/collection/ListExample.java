package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import abstractexample.Elephant;

public class ListExample {

	public static void main(String[] args) {

		programTwo();
	}
	
	
	public static void programTwo(){
		List<Integer> ageList = new ArrayList<>();
		ageList.add(new Integer(1));
		ageList.add(22);
		ageList.add(33);
		
//		ageList.add("Eight");
		
		for(int i= 0 ; i < ageList.size(); i++){
			Integer val = (Integer)ageList.get(i);
			System.out.println( val+4);
		}
		
		for(Integer val : ageList){
			System.out.println(val+4);
		}
		
	}
	
	
	
	public void programOne(){
		int age[] = {12,34,56};
//		age[3] = 50;
//		System.out.println(age[2]);
		
		List list = new ArrayList();
		list.add("Anusha");
		list.add(1);
		list.add(new Elephant());
		list.add("Helo");
		
		System.out.println(list.contains("Harini"));
		System.out.println(list.size());
		System.out.println(list);
		list.add(2, 22);
		list.addAll(getFruits());
		System.out.println(list);
		list.remove(0);
		
		for(int i = 0 ; i < list.size(); i++){
			System.out.println(list.get(i));
		}
		
		System.out.println("----------ITERATOR--------");
		System.out.println("List Before remove "+ list);
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			Object obj = iter.next();
			if(obj instanceof Elephant){
				iter.remove();
			}
		}
		
		System.out.println(" List After remove "+list);
		
	}
	public static List getFruits(){
		List fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cherry");
		return fruits;
	}
}
