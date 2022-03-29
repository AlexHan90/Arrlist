package day08;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex03 {

	public static void main(String[] args) {
		
		HashSet set = new HashSet();
		ArrayList arr = new ArrayList();
		
		set.add("라면"); set.add("진미김밥질려");
		set.add("순대"); set.add("라면");
		arr.add("라면"); arr.add("진미김밥질려");
		arr.add("순대"); arr.add("라면");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr);
		
			Iterator it =	set.iterator();   				 //순서대로 데이터를 가져온다.
			while(it.hasNext()) { 							// 소괄호의 의미 기능을 갖고있다
				System.out.println(it.next());
				
			}
			
			/*System.out.print(it.hasNext()+" : ");   // has next  => 다음값이 있습니까? 있으면  True 없으면 False
			System.out.println(it.next());
			System.out.print(it.hasNext()+" : ");
			System.out.println(it.next());
			System.out.print(it.hasNext()+" : ");
			System.out.println(it.next());
			System.out.print(it.hasNext()+" : ");
			System.out.println(it.next());
			System.out.print(it.hasNext()+" : ");
			System.out.println(it.next());
		
		
		// set.iterator();    // iterator => 반복자
		
	
		
	/*
	 * HashSet
	 - 순서가 없으며, 중복은 허용하지 않는다. 
	 - set은 index로 접근불가
	  
	 
	 */

}
}