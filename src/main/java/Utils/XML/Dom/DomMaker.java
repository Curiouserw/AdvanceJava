package Utils.XML.XML.Dom;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;


public class DomMaker {
	private DocumentBuilderFactory factory;
	private DocumentBuilder parser;
	private Document doc;
	
	
	public static void main(String[] args) throws Exception {
		DomMaker maker=new DomMaker();
		maker.create();
		maker.output();
		maker.transfer();
//		DomMaker maker=new DomMaker(new File("src/day1/xml/nameCard.xml"));
//		Node node=maker.doc.getElementsByTagName("address").item(0);
//		maker.add(node);
//		maker.output();
//		maker.remove();
//		maker.modify();
//		maker.output();
		
	}
	{
		factory=DocumentBuilderFactory.newInstance();
		try {
			parser=factory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
	}
	public DomMaker(){
		doc=parser.newDocument();
	}
	public DomMaker(File file){
		try {
			doc=parser.parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void create(){
		Element root=doc.createElement("nameCard");
		root.setAttribute("color", "blue");
		root.setAttribute("style", "rectangle");
		Element sulation=doc.createElement("sulation");
		sulation.appendChild(doc.createCDATASection("Mr."));
		Element firstName=doc.createElement("first-name");
		firstName.appendChild(doc.createTextNode("ren"));
//		firstName.setNodeValue("Ren");
		Element lastName=doc.createElement("last-name");
		lastName.appendChild(doc.createTextNode("terry"));
		
		Element country=doc.createElement("country");
		country.appendChild(doc.createTextNode("China"));
//country.setNodeValue("China");
		Element city=doc.createElement("city");
		city.appendChild(doc.createTextNode("shanghai"));
		Element street=doc.createElement("street");
		street.appendChild(doc.createTextNode("XueYuan.Rd"));
		Element address=doc.createElement("address");
		address.appendChild(country);
		address.appendChild(city);
		address.appendChild(street);
		Element email=doc.createElement("Email");
		email.appendChild(doc.createTextNode("renqs@briup.com"));
//		email.setNodeValue("renqs@briup.com");
		
		Element comment=doc.createElement("comment");
		comment.appendChild(doc.createComment("comment test"));
		Element phone =doc.createElement("phone");
		phone.appendChild(doc.createTextNode("123456"));
//		phone.setNodeValue("1233");
		root.appendChild(sulation);
		root.appendChild(firstName);
		root.appendChild(lastName);
		root.appendChild(address);
		root.appendChild(comment);
		root.appendChild(email);
		root.appendChild(phone);
	    doc.appendChild(root);
	    NameCardDomParser.parser(doc);
	}
	public void modify() {
		Node node=doc.getElementsByTagName("city").item(0);
//		node.replaceChild(doc.createTextNode("shanghai"),node.getFirstChild());
		node.replaceChild(doc.createTextNode("shanghai"),node.getFirstChild());
	}
	public void remove() {
		Node node=doc.getElementsByTagName("street").item(0);
		node.getParentNode().removeChild(node);
	}
	public void add(Node node) {
		Element newNode=doc.createElement("phone");
		newNode.appendChild(doc.createCDATASection("0521-58173239"));
//		node.appendChild(newNode);
		node.getParentNode().insertBefore(newNode, node);
	}
	public void output() throws IOException {
		OutputFormat output=new OutputFormat(doc);
		output.setIndenting(true);
		Writer out=new FileWriter("src/day1/Dom/newCard_output.xml");
		XMLSerializer serializer=new XMLSerializer(out,output);
		serializer.asDOMSerializer();
		//ִ�����л�����
		serializer.serialize(doc.getDocumentElement());
		out.close();
		System.out.println("������ɣ�");
	}
	public void transfer() throws TransformerException, IOException {
		TransformerFactory factory=TransformerFactory.newInstance();
		Transformer transfor=factory.newTransformer();
		transfor.setOutputProperty(OutputKeys.INDENT,"yes");
		
		DOMSource source=new DOMSource(doc);
		StreamResult target=new StreamResult(new FileOutputStream("src/day1/Dom/newCard_tran.xml"));
		
		transfor.transform(source, target);
		System.out.println("������ɣ���");
		
	}
	
	
}
