package yoo;

import java.util.ArrayList;
import java.util.List;

public class listStudy {
	public static void main(String[] args) {
		//����Ʈ�� �ߺ��� ������ ����ŭ! 
		List<String> list = new ArrayList<>();
		
		//list �ȿ� 120�� �� ������ �־��� 
		
		//����
		// ��� 0~ ~~~ 120������  �� 120�� �� �����͸��־���
		//���0,���1,���2,���3............. ��  120��
		
		 //    1(�ٽþȿ�)         2              4
		//����  ����� �ʱ�ȭ  ;  ���ǹ� ��, ����    ; ����    
		for(int i = 0 ; i < 120 ; i++) {  //== >> 120�� ������ ���� ������ ��ǻ�� �ڻ� �ȳ���
			//3
			list.add("���"+i);
		}//loop
		
		System.out.println("������� ??" + list.size());
		
		list.stream().forEach(i->{
			System.out.println(i);
		});
	}
}
