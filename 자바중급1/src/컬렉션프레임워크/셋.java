package 컬렉션프레임워크;

import java.util.HashSet;
import java.util.TreeSet;

public class 셋 {

	public static void main(String[] args) {
		//문법 : 컬렉션종류<데이터타입> 이름 = new 컬렉션종류<데이터타입>();
		HashSet<String> 포유류 = new HashSet<String>();
		포유류.add("사자");
		포유류.add("코끼리");
		포유류.add("고래");
		포유류.add("원숭이");
		포유류.add("고래");
		포유류.add("고래");
		System.out.println(포유류);
		for(String 동물 : 포유류) {
			System.out.println(동물);
		}
		//원소갯수 확인
		System.out.println("길이 : "+포유류.size());
		
		//포함되었는지 확인
		System.out.println(포유류.contains("코끼리"));

		//원소 삭제
		포유류.remove("원숭이");
		System.out.println("길이 : "+포유류.size());
		
		
		TreeSet<Integer> intSet = new TreeSet<Integer>();
		intSet.add(7);
		intSet.add(4);
		intSet.add(9);
		intSet.add(13);
		intSet.add(1);
		intSet.add(5);

		
		//제일높은값
		System.out.println(intSet.last());
		//제일낮은값
		System.out.println(intSet.first());
		//5보다 큰수중에 제일 작은수
		System.out.println(intSet.higher(5));
		System.out.println("---------");
		for(Integer 숫자 : intSet) {
			System.out.println(숫자);
		}
	}

}
