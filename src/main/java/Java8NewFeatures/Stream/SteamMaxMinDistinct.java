package Java8NewFeatures.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class SteamMaxMinDistinct {

	public static void main(String[] args) throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader("E:\\Workplace-Eclispe\\SpiderDemo\\src\\Stream\\a.txt"));
		int maxlen=br.lines().mapToInt(String::length).max().getAsInt();
		System.out.println(maxlen);
	}

}
