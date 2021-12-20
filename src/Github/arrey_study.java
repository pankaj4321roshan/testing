package Github;

import java.util.ArrayList;
import java.util.Iterator;

public class arrey_study {
	public static void main(String[] args) {
		// how to create object
		ArrayList al=new ArrayList();   // generic--->will accept all type of data 
		ArrayList<String>al1=new ArrayList<String>(); //only string data will accept
		// how to add elements
		System.out.println(al);
		al.add("pankaj");
		System.out.println(al);
		al.add(30);
		al.add(8.9);
		al.add('A');
		System.out.println(al);
		al.add(1, "livo");    // roght shift operation---> after manupulation
		System.out.println(al);
		al.remove(1);
		System.out.println(al);
		
		System.out.println(al.get(0));
		al.clear();    // remove all data 
		System.out.println(al);
		
		al.add("RAM");
		al.add("SITA");
		al.add("HANUMAN");
		System.out.println(al);
		
		al.add("Ram");
		System.out.println(al);
		
		al.add(null);   // added null value
		System.out.println(al);
		al.add(0, "deshmukh");
		System.out.println(al);
		System.out.println(al.contains("RAM"));
		System.out.println(al.indexOf("Ram"));
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		System.out.println(al.size());
		
		//for(int i=0; i<=al.size()-1;i++) 
	//	{
		//	System.out.println(al.get(i));
		//}
		//2 nd way itterator
		//how to itterator use
		Iterator it=al.iterator();
	//while(it.hasNext())
	//{
//		System.out.println(it.hasNext());
//	}
	// 3rd way ---->for each loop
	
	for(Object o:al) 
	{
		System.out.println(o);
	}
	al1.add("hii");
	al1.add("good");
	al1.add("morning");
	for(Object s:al1) 
	{
		System.out.println(s);
	}
	Iterator<String> it1=al1.iterator();
	while(it1.hasNext())
	{
	System.out.println(it1.next());	
	}
		
		
		
		
		
	}

}
