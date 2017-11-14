package Utils.XML.XML.sax;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CDHandler extends DefaultHandler{
	private List<CD> cds;
	private CD cd;
	private String tagFlag;
	
	
	public CDHandler(){
		cds=new ArrayList<>();
	}
	public List<CD> getCds(){
		return cds;
	}

	
	
	@Override
	public void startDocument() throws SAXException {
		System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("parse over!!");
	}
	
	
	/*
	 * uri:nameSpace
	 * localName:Ԫ�ص����ƣ��������������ռ��ʶ
	 * qName��Ԫ��ȫ�������������ռ��ʶ
	 * attribute�����Եļ���
	 */
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.printf("<%s",localName);
		tagFlag=localName;
		String aValue="";
		
		for(int i=0;i<attributes.getLength();i++){
			String aName=attributes.getLocalName(i);
			aValue=attributes.getValue(i);
			System.out.printf(" %s=\"%s\"",aName,aValue);
			
		}
		if("cd".equals(localName)){
			cd=new CD();
			cd.setId(aValue);
		}
		System.out.print(">");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.printf("</%s>",localName);
		if("cd".equals(localName)&&cd!=null){
			cds.add(cd);
			cd=null;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content=new String(ch, start, length);
		System.out.printf("%s",content);
		if(cd!=null&&!"".equals(tagFlag)&&tagFlag!=null&&content!=null&&!"cd".equals(tagFlag)){
			setValue(cd, tagFlag, content);
			tagFlag=null;
		}
	}
	public void setValue(CD cd,String tagName,String param){
		tagName=tagName.trim();
		String methodName="set"+(tagName.substring(0,1).toUpperCase()
								+tagName.substring(1));
		//��������
		try {
			
			Object arg=null;
			if("price".equals(tagName)){
				arg=Double.parseDouble(param);
			}else if ("year".equals(tagName)) {
				arg=Integer.parseInt(param);
			}else{
				arg=param;
			}
			Method method=cd.getClass().getDeclaredMethod(methodName,arg.getClass());
			method.invoke(cd, arg);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

}
