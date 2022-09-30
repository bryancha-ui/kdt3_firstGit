package 컬렉션프레임워크;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class 맵 {

	public static void main(String[] args) {
		//맵은 키와 밸류의 쌍
		Map<String, String> dict = new HashMap<String, String>();
		
		dict.put("apple", "사과");
		dict.put("banana", "바나나");
		dict.put("peach", "복숭아");
		dict.put("pear", "배");
		dict.put("pineapple", "파인애플");
		
		//키를 통해서 값을 가져온다.
		//System.out.println(dict.get("banana"));
		
		//반복1. forEach
//		dict.forEach(
//				(strKey, strValue)->{
//					 System.out.println(strKey + " : " + strValue);
//				}
//				//자바스크립트에서는 화살표함수, 자바에서는 람다식
//		);
		
		//반복2. Iterator(반복자) 사용
//		Iterator<String> keys = dict.keySet().iterator();
//		while(keys.hasNext()) {
//			String key = keys.next();
//			String value = dict.get(key);
//			System.out.println(key + " : " + value);
//		}
		
		//반복3. keySet활용. 제일쉬워보이는 문법
//		for(String key : dict.keySet()) {
//			System.out.println(key + " : " + dict.get(key));
//		}
		
		
		
		// <퀴즈 : 한글보고 영어단어 맞추기>
		//제한시간 : 1시간
		//구현내용 : korDict라는 <String, String>맵을 만들고 
		//        랜덤으로 한글단어를 보여주고 
		//        Scanner로 유저가 영어를 입력하면
		//        맞다 아니다를 보여줘보세요.
		//힌트 : get함수를 써서 '키'로 '값'을 가져오는건 쉽게 할수있다.
		//   반대로 '값'으로 '키'를 찾으려면 keySet()에 반복문 돌려야한다.
		//핵심 : key를 한글단어로 할지, 영어단어로 할지 판단
		
		//1. 해쉬맵 껍데기 생성
		//2. 해쉬맵에 한글단어, 영어단어 데이터 넣기
			//3. 해쉬맵에서 랜덤 인덱스 추출
			//4. 랜덤인덱스로 랜덤 키 추출(문제)
			//5. 키로 밸류 추출(정답)
			//6. 유저에게 랜덤키 보여주기(문제 출력)
		//7. 유저에게 답 스캐너로 받기(정답 제출)
		//8. 제출받은것과 실제정답 비교
		//9. 결과 출력
		//10. 스캐너 닫기
		
		HashMap<String, String> korDict = new HashMap<String, String>();
		korDict.put("tiger", "호랑이");
		korDict.put("lion", "사자");
		korDict.put("whale", "고래");
		korDict.put("monkey", "원숭이");
		korDict.put("human", "인간");
		
		int 랜덤인덱스 = new Random().nextInt(korDict.size());
		String randomKey = (String) korDict.keySet().toArray()[랜덤인덱스];
		String answerWord = korDict.get(randomKey);

		Scanner sc = new Scanner(System.in);
		System.out.printf("%s에 해당하는 영단어를 입력해주세요 : ", answerWord);
		String userInput = sc.nextLine();
		if(userInput.equals(randomKey)) {
			System.out.println("맞았음");
		}else {
			System.out.println("틀렸음");
		}
		sc.close();
		
	}

}
