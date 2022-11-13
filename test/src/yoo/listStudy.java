package yoo;

import java.util.ArrayList;
import java.util.List;

public class listStudy {
	public static void main(String[] args) {
		//리스트는 중복이 가능함 가장큼! 
		List<String> list = new ArrayList<>();
		
		//list 안에 120개 의 정보를 넣어줘 
		
		//내용
		// 흑곰 0~ ~~~ 120개까지  총 120개 의 데이터를넣어주
		//흑곰0,흑곰1,흑곰2,흑곰3............. 총  120개
		
		 //    1(다시안와)         2              4
		//순서  여기는 초기화  ;  조건문 참, 거짓    ; 증감    
		for(int i = 0 ; i < 120 ; i++) {  //== >> 120번 무조건 돌아 무조건 컴퓨터 박살 안나며
			//3
			list.add("흑곰"+i);
		}//loop
		
		System.out.println("사이즈는 ??" + list.size());
		
		list.stream().forEach(i->{
			System.out.println(i);
		});
	}
}
