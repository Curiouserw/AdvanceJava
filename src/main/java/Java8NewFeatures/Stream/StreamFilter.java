package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamFilter {

	public static void main(String[] args) {
	//filter ���� ��ԭʼ Stream ����ĳ����ԣ�ͨ�����Ե�Ԫ�ر�����������һ���� Stream��
	//ͨ��һ��predicate�ӿ������˲�ֻ��������������Ԫ�أ��ò��������м������
	//�������ǿ����ڹ��˺�Ľ����Ӧ������Stream����������forEach����
	//forEach��Ҫһ���������Թ��˺��Ԫ������ִ�С�forEach��һ�����ղ������������ǲ�����forEach֮����ִ������Stream����
		List<String> list=Arrays.asList("test","hello","world","java","tom","C","javascript");
		list.stream().filter(s->s.length()>4).forEach(System.out::println);
	}

}
