package 자바중급1;

public class 사육사 {
	//독수리, 코끼리, 호랑이를 하나씩 만들어서
	//moveAnimal이라는 함수를 호출
	
	//오버로딩
	public void moveAnimal(동물 animal) {
		System.out.println("동물을 움직입니다.");
	}
	public void 산책시키다(애완동물 animal) {
		System.out.println("사육사가 애완동물을 산책시킵니다.");
	}

}
