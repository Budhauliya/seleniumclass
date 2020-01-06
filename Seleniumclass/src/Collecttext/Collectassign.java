package Collecttext;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import com.google.common.collect.LinkedListMultimap;

public class Collectassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> raw=new HashMap<Integer,String>();
		raw.put(4, "Akanksha");
		raw.put(7, "Sanu");
		raw.put(8, "Pooja");
		raw.put(6, "KAvya");
		raw.put(4, "Akanksha");
		Set<Integer> all=raw.keySet();
		System.out.println("Hashmap is not allow to duplicate value and also mainten order as ASC  ");
		for(Integer i : all)
		{
			System.out.println("Key is " +i+" value is "+raw.get(i));
		}
		
		LinkedList<Integer> lm=new LinkedList<Integer>();
		lm.add(11);
		lm.add(13);
		lm.add(16);
		lm.add(99);
		lm.add(16);
		System.out.println("Linkedlist is allowed duplicate and not mainten order");
		for(Integer i : lm)
		{
		System.out.println(i);	
		}
		TreeSet<Integer> tm=new TreeSet();
		tm.add(88);
		tm.add(55);
		tm.add(14);
		tm.add(88);
		tm.add(14);
		System.out.println("Tree Set is not allowed duplicate value  and mainten order as ASC");
		for(Integer s: tm)
		{
			System.out.println(s);
		}
		
	ArrayList<Integer> ar=new ArrayList<Integer>();
	ar.add(14);
	ar.add(19);
	ar.add(55);
	ar.add(55);
	System.out.println("ArrayList is not allowed duplicate and not mainten order");
	for(Integer j: ar)
	{
		//System.out.println(" ");
		System.out.println(" "+j);
	}

	}

}
//collection class done