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
		 * 1) key�� ����̸�  - ��ȣ ,���� , ����
		 * 2) value �� ģ���̸��̾� [ ��� 3�� �̻� �־���� ] - ���������� ����  
		 * */
		
		//5�� ? ģ�� �̸� abc �԰��� �ϵ��ڵ� ����
		//�� ������ �ǵ��� �ڷᱸ���� �����ϴ°� Ȯ���ϱ�
		//Map�� ������ ����� ���� �������
		
		Map<String, List<String>> test = new HashMap<>(); 
		
		test.put("��", Arrays.asList("��Ÿ1","��Ÿ1","��Ÿ13"));
		test.put("��", Arrays.asList("��Ÿ1","��Ÿ1","��Ÿ13"));
		test.put("��", Arrays.asList("��Ÿ1","��Ÿ1","��Ÿ13"));
		
		//"300","500","600"...;
		
		final List<String> VALIDATION_CHECK = Arrays.asList("200","400","600"); // ��ﳪ�»��? ���ٲ� 
		
		String[] ��_Ʋ��_���ڸ���Ʈ = new String[] {"200","400","600"};
		
		
		String  ��_�Ѿ�º��� = null;//reqest.get("parmas"); << client ���� �Ѿ�� ��
		if(VALIDATION_CHECK.contains(��_�Ѿ�º���)) {
			//�̷������� validation check �� ������
		}
		
		
		///////////////////////////////////////////////////////////
		
		//1) Ű�� ���־� ? �ַܼα�
		
		//2) value �ѷ��� 
		
		//���� ����
		//ex 1 ) 
		//��
		//��
		//��
		
		//ex 2) 
		//["��Ÿ1","��Ÿ1","��Ÿ13"]
		//["��Ÿ1","��Ÿ1","��Ÿ13"]
		//["��Ÿ1","��Ÿ1","��Ÿ13"]
		
		//���ٽ��ε� ����Ѱ���
		
		
		List<String> arr = Arrays.asList("apple","banana","orange"); //�̰� �빮��
		arr.get(0).toUpperCase(); //������ Ÿ���� �����ϰ�� ��밡��
		String abdc = "yoo";
		abdc.toUpperCase();

		
		/////////////////////////////////////////////////////////
		//////// list�� - stream �̶� ���� �Ѹ��̴� �̷��� ������ 
		//�̰� ���ϸ� �ڵ� 100��¥�� 10�� �ٲ�
		List<String> changUpper = new ArrayList<>();
		for(String abc : arr) {
			changUpper.add(abc.toUpperCase());
		}
		//changUpper.forEach(System.out::println);
		
		List<String> changUpperStream 
			= arr.stream().map(String::toUpperCase)
				.collect(Collectors.toList());
													
		changUpperStream.forEach(System.out::println);
		
		//��Ʈ�� ���θ� �ϸ� �ڵ����� �ڷᱸ���� ���θ� �Ҽ����� <<< 
		
		//��ü ���⵵ �߿��ϰ� �ѵ�
	}
	
}
