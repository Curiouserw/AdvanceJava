package Utils.XML.XML;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ParserThread extends Thread {
	private XmlParser reader;
	 
	public ParserThread(long start, long end, String fileName, String tagName) throws IOException {
		InputStream is =  new FileInputStream(fileName);
		reader = new XmlParser();
		reader.init(start, end, tagName, is);
	}

	@Override
	public void run() {
		try {
			while (reader.nextKeyValue()) {
				System.out.println("-----------------------");
				System.out.println(getName());
				System.out.println("key " + reader.getCurrentKey().toString());
				System.out.println("value " + reader.getCurrentValue().toString());
				System.out.println("progress " + reader.getProgress());
				System.out.println("-----------------------");
			}
		} catch (IOException | InterruptedException e) {
 			e.printStackTrace();
		}

	}

	public static void main(String[] args) throws IOException {
		String fileName = "data.xml";
		String tagName = "student";
		List<ParserThread> pts = new ArrayList<ParserThread>();
		pts.add(new ParserThread(0, 30, fileName, tagName));
		pts.add(new ParserThread(30, 100, fileName, tagName));
		pts.add(new ParserThread(100, 200, fileName, tagName));
		pts.add(new ParserThread(200, 300, fileName, tagName));
		pts.add(new ParserThread(300, 4000, fileName, tagName));
		for(ParserThread pt : pts)
			pt.start();

	}

}
