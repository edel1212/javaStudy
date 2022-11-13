package yoo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapStudy {
	public static void main(String[] args) {
		
		//맵의 특징 ? key : value 쌍으로 이뤄져 있다.
		//✔ 다음 특징 ? 반은 맞고 반은 Map에도 종류가있다 ! 순서를 지키는 Map
		// 아닌 Map
		// 가장 중요한것 있음 key 중복이 X << 굳
		// value는 중복이 가능하다!
		
		//데이터 넣는방법?
		
		//맵에 변수명은  addr - > key(String)는 사람이름 value(int) 전화번호임  -- 2  
		Map<String, Long> addr = new LinkedHashMap<>();
		addr.put("yoo", 123L);
		addr.put("yoo2", 124L);
		addr.put("yoo2", 300L); //이거는 Key 중복이라 안나온다
		
		/**
		 * 만약 중복된 Key가 put되면 새로운 값으로 덮어씌워진다.
		 * **/
		
		System.out.println(addr);
		//가장 많이 쓰는 Map 2개임 -- 일단 2개만 알고 기억해 
		//Map<?,?> 순서유지X = new HashMap<>()        
		//Map<?,?> 순서유지O = new LinkedHashMap<>();
		
	}
}
