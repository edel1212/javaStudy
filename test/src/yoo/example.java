package yoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class example {

	public static void main(String[] args) {
		
		/**  
		 * 1) key는 사람이름  - 정호 ,영규 , 규진
		 * 2) value 는 친구이름이야 [ 적어도 3명 이상 있어야해 ] - 동명이인이 있음  
		 * */
		
		//5분 ? 친구 이름 abc 쌉가능 하드코딩 가능
		//이 시험의 의도는 자료구조를 이해하는걸 확인하기
		//Map의 종류를 어떤것을 쓰던 상관없음
		
		Map<String, List<String>> test = new HashMap<>(); 
		
		test.put("김", Arrays.asList("낙타1","낙타1","낙타13"));
		test.put("유", Arrays.asList("낙타1","낙타1","낙타13"));
		test.put("정", Arrays.asList("낙타1","낙타1","낙타13"));
		
		//"300","500","600"...;
		
		final List<String> VALIDATION_CHECK = Arrays.asList("200","400","600"); // 기억나는사람? 못바꿈 
		
		String[] 나_틀딱_문자리스트 = new String[] {"200","400","600"};
		
		
		String  나_넘어온변수 = null;//reqest.get("parmas"); << client 에서 넘어온 값
		if(VALIDATION_CHECK.contains(나_넘어온변수)) {
			//이런식으로 validation check 가 가능함
		}
		
		
		///////////////////////////////////////////////////////////
		
		//1) 키값 뭐있어 ? 콘솔로그
		
		//2) value 뿌려봐 
		
		//한줄 한주
		//ex 1 ) 
		//김
		//유
		//정
		
		//ex 2) 
		//["낙타1","낙타1","낙타13"]
		//["낙타1","낙타1","낙타13"]
		//["낙타1","낙타1","낙타13"]
		
		//람다식인데 축약한거임
		
		
		List<String> arr = Arrays.asList("apple","banana","orange"); //이거 대문자
		arr.get(0).toUpperCase(); //데이터 타입이 문자일경우 사용가능
		String abdc = "yoo";
		abdc.toUpperCase();

		
		/////////////////////////////////////////////////////////
		//////// list는 - stream 이랑 거의 한몸이다 이렇게 생각해 
		//이거 잘하면 코드 100줄짜리 10로 바뀜
		List<String> changUpper = new ArrayList<>();
		for(String abc : arr) {
			changUpper.add(abc.toUpperCase());
		}
		//changUpper.forEach(System.out::println);
		
		List<String> changUpperStream 
			= arr.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
													
		changUpperStream.forEach(System.out::println);
		
		//스트림 공부를 하면 자동으로 자료구조에 공부를 할수있음 <<< 
		
		//객체 지향도 중요하고 한데
	}
	
}
