package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamSort {

	public static void main(String[] args) {
	//sort ����
	//������һ���м���������ص�������ú��Stream������㲻ָ��һ���Զ����Comparator���ʹ��Ĭ������
	//�� Stream ������ͨ�� sorted ���У���������������ǿ֮��������������ȶ� Stream ���и��� map��filter��limit��skip ���� distinct ������Ԫ�����������������ܰ���������������ִ��ʱ�䡣
	//��Ҫע����ǣ�����ֻ������һ�����кú��Stream��������Ӱ��ԭ�е�����Դ������֮��ԭ����list�ǲ��ᱻ�޸ĵģ�
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
		list.stream().sorted().filter(s->s.startsWith("j")).forEach(System.out::println);
		//�����ַ����ĳ�������
		list.stream().sorted((s1,s2)->s1.length()-s2.length()).forEach(System.out::println);
	}

}
