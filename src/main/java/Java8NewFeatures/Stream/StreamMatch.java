package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMatch {

	public static void main(String[] args) {
	//Stream�ṩ�˶���ƥ�������������ָ����Predicate�Ƿ�ƥ������Stream�����е�ƥ������������ղ�����������һ��boolean���͵�ֵ��
	//����Ԫ��ƥ��ɹ��ŷ���true ���򷵻�false
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
		boolean allMatch=list.stream().allMatch(s->s.startsWith("j"));
		System.out.println("allMatch:"+allMatch);
		boolean anyMatch=list.stream().anyMatch(s->s.startsWith("w"));
		System.out.println("annyMatch:"+anyMatch);
		boolean nonMatch=list.stream().noneMatch(s->s.startsWith("o"));
		System.out.println("nonMatch:"+nonMatch);
	}

}
