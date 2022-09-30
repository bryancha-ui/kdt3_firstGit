package generic;

//Box클래스를 생성할때 전달한 데이터타입을 T라는 이름으로 쓰겠다.
public class NumberBox <T>{
	private T t;

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
	/**
	 * 
	 * @param arr은 숫자형 배열
	 * @return Double형 데이터타입
	 */
	public Double sum(T[] arr) {
		Double sum = 0.0;
		for(T ele : arr) {
			sum += Double.parseDouble(ele+"");
		}
		return sum;
	}
	
}
