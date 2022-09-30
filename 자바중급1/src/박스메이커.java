package generic;

public class 박스메이커 {

	public static void main(String[] args) {
		Box<String> box1 = new Box<String>();
		box1.set("생활코딩");
		System.out.println(box1.get());
		
		
		Cat meaw = new Cat();
		meaw.age = 2000;
		meaw.height = 120;
		meaw.weight = 25;
		Box<Cat> box2 = new Box<Cat>();
		box2.set(meaw);
		System.out.println(box2.get());
		
		Box<Integer> box3= new Box<Integer>();
		box3.set(3);
		System.out.println(box3.get());
		
		//제네릭문법 <매개변수>
		//매개변수는 암묵적으로 E, K, N, T, V 정의할때 들어가는거지. 호출할때가아니라
		//참조형 데이터타입'만' 들어갈수있다.
		
		NumberBox<Number> box4 = new NumberBox<Number>();
		Integer[] arr = {1,2,3,4,5,6,7,8,9,10};
		Double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 10.10};
		//System.out.println(box4.sum(arr2));	//컴파일단계에서 걸러준다.
	}

}
