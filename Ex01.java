package day08;

public class Ex01 {

	public static void main(String[] args) {
		
		int [][] arr =  new int [][] {{1,2} , {10,20}};
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {					//[0][0] = 1 [0][1] = 2
				System.out.println(arr[i][j]);							//[1][0] = 10[1][1] = 20
		}
	
	}


}
}

 
 /*
컬렉션 프레임웍(collections framework)
-  컬렉션(다수의 객체)을 다루기 위한 표준화된 프로그래밍 방식 
- 컬렉션을 쉽고 편리하게 다룰 수 있는 다양한 클래스를 제공
(저장,삭제,검색,정렬) < 객체를 다룬다


컬렉션 클래스(collection class)

- 다수의 데이터를 저장할 수 있는 클래스( Vector, ArrayList, Hastset)


컬렉션(collection)
- 여러 객체(데이터)를 모아 놓은 것을 의미

- List와 Set의 공통부분을 뽑아서 collection이라는 인터페이스를 정의.

 프레임웍(frame work) 
- 표준화,정형화된 체계적인 프로그래밍 방식 (체계적인 틀) = library > 다른사람들이 기술을(기능) 모아놓은것 



컬렉션 프레임웍의 핵심 인터페이스 (다수의 data)

- List (저장)
순서가 있는 데이터의 집합, 데이터의 중복을 허용한다. 예( 대기자 명단) 
구현클래스: ArraysList, LinkedList, Stack, Vector  등

순서 0 중복0


- Set (집합)
순서를 유지하지 않는 데이터의 집합, 데이터의 중복을 허용하지 않는다. 예) 양의 정수집합, 소수의집합, 네발동말(개,고양이,사자 등등 순서 중요하지않고 중복허용 x
구현클래스: HashSet, TreeSet


순서 x 중복x

- Map
키(key)와 값(value)의 쌍(pair)으로 이루어진 데이터의 집합
순서는 유지되지 않으며, 키는 중복을 허용하지않고, 값은 중복을 허용한다. 예) 우편번호, 지역번호(전화번호) (02 서울), (031 경기도),  (ID PASWWORD) 

순서 x
중복 키 x, 값 o                      ex) ID(키) 는 달라도 비밀번호(값)는 같아도된다.

구현클래스 : HashmMp, TreeMap, HashTable, Properties










-- collection 인터페이스의 메서드

		contains (검색)	
 		add (추가)
 		remove (삭제)
 		
 		
 		
 		
 		
 		
 
-- List  인터페이스 - 순서0 중복0

-- List 인터페이스의 메서드
		add (추가)
		get ( 읽어오는거)
		set (변경하는거)
		Indexof  (검색하는거, 객체에 저장된 위치확인) 왼쪽에서 오른쪽으로찾는거
		lastIndexof (Indexof랑 같지만) 오른쪽에서 왼쪽으로 찾기
		sort (정렬)
		subList (전체에서 일부만 뽑아내는거)  from~to
		
		* List와  set은 collection 인터페이스가 가지고있는 모든 메서드들을 가지고 있다, 추가적으로 메서드를 가지고있다.

List
Vector, ArrayList, LinkedList
Stack

ArrayList 와 LinkedList가 핵심

--   Set 인터페이스 - 순서 x  중복 x

Set 인터페이스를 구현하는 대표적인 컬렉션 클래스 Hashset  Treeset가 핵심

Set(집합) --메소드
컬렉션이 가지고 있는 메서드와 동일

Boolean	add (합집합)
Boolean containsAll(부분집합)
Boolean removeAll(차집합)
Boolean retainAll(교집합)

위에 메서드들은 boolean 형을 반환한다, 이메서들을 호출하고나서 변화가있으면 true 없으면 false를 반환


--   Map 인터페이스 - 순서 x  중복=  키x 값 0
key와 value를 저장

Map 
HashMap					(동기화 처리가 안된다) HashTable 은 동기화 가능
LinkedHashMap (원래의 Hashmap 은 순서가 없지만 순서를 쓰고싶은 경우에는  linkedHashMap 사용 가능)

Map 인터페이스 메서드

put (추가)
remove (삭제)
contains(검색)
entryset	키와 쌍 한쌍을 entry라고 부름, 이 Map 안에 있는 모든것을
keyset   	키만 읽어올때 사용
values		값만 읽어올때 사용




*/