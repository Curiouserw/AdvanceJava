package Utils.XML.XML.sax;

import java.io.IOException;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class CDParserDemo {
	public static void main(String[] args) throws IOException{
		XMLReader parser;
		try {
			//1������������
			parser = XMLReaderFactory.createXMLReader();
			//2������������
			DefaultHandler handler=new CDHandler();
			//3��������ע�ᴦ����
			parser.setContentHandler(handler);
			//4:����������XML�ļ�
//*����1*/   parser.parse("src/day1/sax/cd.xml");
/*����2*/ 	parser.parse(new InputSource(CDParserDemo.class.getResourceAsStream("cd.xml")));
			List<CD> cds=((CDHandler)handler).getCds();
			for(CD cd : cds){
				System.out.println(cd.getTitle()+""+cd.getArtist()+""+cd.getCompany());
			}
		} catch (SAXException e) {
			e.printStackTrace();
		}
	}
}
