package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamForEach {

	public static void main(String[] args) {
	//forEach ���� ����һ�� Lambda ���ʽ��Ȼ���� Stream ��ÿһ��Ԫ����ִ�иñ��ʽ��
	//forEach �� terminal ������ִ����stream�Ͳ���������
		List<String> list=Arrays.asList("test","hello","world","java","tom","C","javascript");
		list.stream().forEach(System.out::print);
	}

}
