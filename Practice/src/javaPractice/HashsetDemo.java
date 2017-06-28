package javaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hash=new HashSet<String>();
		hash.add("alm");
		hash.add("uft");
		hash.add("selenium");
		hash.add("selenium");
		hash.add("manual");
		hash.add("manual");
		System.out.println("using foreach loop");
		for (String str : hash) {
			System.out.println(str);
		}
		System.out.println("using iterator");
		Iterator<String> it=hash.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("size of hashset is "+hash.size());

	}

}
