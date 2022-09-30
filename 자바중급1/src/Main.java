package 자바중급1;

public class Main {

	public static void main(String[] args) {
		사육사 man = new 사육사();
		동물 eagle = new 독수리();
		동물 tiger = new 호랑이();
		동물 elephant = new 코끼리();
		man.moveAnimal(eagle);
		
		애완동물 내고양이 = new 고양이();
		man.산책시키다(내고양이);
		
//		자바의 jdbc의 connect함수를 만든사람은 인자로 디비인스턴스를 
//		인터페이스로 받도록 했을거다.
//		왜냐하면 실질적으로 어떤 인스턴스가 만들어지든지간에 영향을 받지않고
//		내코드를 변하지 않아도 정상작동하기위해서.
//		
//		오라클,	mysql,	postgressql 뭐가됐든 코드 안바뀜

	}

}
