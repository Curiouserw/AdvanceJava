package Java8NewFeatures.Stream;

import java.util.Arrays;
import java.util.List;

public class StreamMap2 {

	public static void main(String[] args) {
	//Map ӳ��
	//�м����map�ὫԪ�ظ���ָ����Function�ӿ������ν�Ԫ��ת������Ķ���
	//�����ʾ��չʾ�˽��ַ���ת��Ϊ��д�ַ�������Ҳ����ͨ��map��������ת�����������ͣ�map���ص�Stream�����Ǹ�����map���ݽ�ȥ�ĺ����ķ���ֵ�����ġ�	
		List<String> list = Arrays.asList("test","hello","world","java","tom","C","javascript");
		list.stream().map(s->s.toUpperCase()).forEach(System.out::println);;
	}

}
