package 컬렉션프레임워크;

import java.util.ArrayList;

public class 리스트 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(3);
		al.add(200);
		al.add(6);
		al.add(2);
		al.add(1);
		al.add(7);
		al.add(7);
		al.add(13);
		
		System.out.println(al);
		
		//n번째 인덱스 제거
		al.remove(3);
		System.out.println(al);
		
		//값이 있는지 검사
		System.out.println(al.contains(5));
		
		al.sort(null);	//정렬되면서 원본이 바뀜
		System.out.println(al);
		
		//해당값을 가진 요소가 없으면 -1 반환
		//있으면 해당값을 가진 요소중 가장 마지막 index를 반환
		System.out.println(al.lastIndexOf(7));
		
		int total = 0;
		for(int i=0; i<al.size(); i++) {
			total += al.get(i);
		}
		System.out.println(total);
		
		
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
		
		al.add(1000);
		System.out.println(al);
		System.out.println(al.size());
		

		
	}

}
