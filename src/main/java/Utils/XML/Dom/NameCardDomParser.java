package Utils.XML.XML.Dom;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

public class NameCardDomParser {
	public static void main(String[] args) {
		try {
			//1:����Dom�������Ĺ���
			DocumentBuilderFactory factory=DocumentBuilderFactory.newInstance();
			//2:����Dom������
			DocumentBuilder parser;
			parser = factory.newDocumentBuilder();
			//3:����XML�ļ��������ڴ���Document
			Document doc=parser.parse(new InputSource(NameCardDomParser.class.getResourceAsStream("nameCard.xml")));
			//4������
			parser(doc);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void parser(Node node){
		switch(node.getNodeType()){
		case Node.DOCUMENT_NODE: 
			System.out.printf("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
			Document doc=(Document)node;
			Element root=doc.getDocumentElement();
			parser(root);
			break;
		case Node.ELEMENT_NODE: 
			//1��
			Element ele=(Element)node;
			System.out.printf("<%s",ele.getNodeName());
			//2:��������
			NamedNodeMap atts=ele.getAttributes();
			for(int i=0;i<atts.getLength();i++){
				Node att=atts.item(i);
				parser(att);
			}
			System.out.print(">");
			//3:������Ԫ�أ�tag,text,comment,CDATA��
			NodeList nodes=ele.getChildNodes();
			for(int i=0;i<nodes.getLength();i++){
				Node subNode=nodes.item(i);
				parser(subNode);
			}
			//4�����������ǩ
			System.out.printf("</%s>",node.getNodeName());
			break;
		case Node.TEXT_NODE: 
			System.out.printf("%s",node.getNodeValue());
			break;
		case Node.ATTRIBUTE_NODE: 
			System.out.printf(" %s=%s", node.getNodeName(),node.getNodeValue());
			break;
		case Node.CDATA_SECTION_NODE: 
			System.out.printf("<!CDATA[%s]>", node.getNodeValue());
			break;
		case Node.COMMENT_NODE: 
			System.out.printf("<--%S-->", node.getNodeValue());
			break;
		default:
		}
	}
}
