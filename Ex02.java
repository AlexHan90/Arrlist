package day08;

import java.util.ArrayList;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList arr = new ArrayList();        //첫번쨰 글자가 대문자면 클래스, 클래스는 기능을 갖고있다
		arr.add("aaa");
		arr.add("111");
		arr.add("222");
		System.out.println(arr.get(0));
		System.out.println(arr.get(1));
		System.out.println(arr.get(2));
		
		System.out.println(arr.size());          //size = 데이터 개수
		System.out.println(arr.contains("aaa"));      // contains =  존재유무를 묻는다 존재하면  true,  없으면 false     
		System.out.println(arr.contains("aaa11"));  // false
		System.out.println("remove : " +arr.remove("235"));				//remove  삭제완료면 true  아니면 false
		System.out.println("====삭제후 확인====");
		System.out.println(arr.size());
		System.out.println(arr.get(0));			// remove가 성공적으로 수행되면, remove 한 값이 사라지므로  get 값에 인덱스번호가 하나씩 당겨진다. 
		arr.clear();
		System.out.println(arr.size());
		
		arr.add("aaa");
		arr.add("111");
		arr.add("222");
		
		System.out.println(arr.indexOf("aaa"));  //indexof  해당하는값의 위치를(index) 가져온다.
		System.out.println(arr.indexOf("111"));  
		arr.set(0, "bbb");
		System.out.println(arr.get(0));
	 
		
		
		
		// boolean bool = arr.remove("aaa");
		// if(bool = true) 삭제 성공
		
		
		/*
		 컬렉션
		 - 자료구조 (데이터를 어떠한 방식으로 처리하냐?)
		 
		 프레임워크
		 - 틀, 형식에 맞춰져 있다. (하나의 틀)
		
		 	Arraylist
		 - 순서가 유지 되는 자료형
		 - 배열과 비슷하게 사용된다
		 - 가변적인 크기를 가지고 있다  (처리속도가 늦다)
		 
		 
		 
		 */

	}

}
