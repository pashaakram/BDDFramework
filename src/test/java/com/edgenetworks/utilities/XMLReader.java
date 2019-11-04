package com.edgenetworks.utilities;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader 
{
public static String readXML(String value,String path) throws Exception
{
	String read="";
	//System.out.println("----------------------- AOLAP DOCUMENT-------------------");
	File xmlfile = new File(path);
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	Document document = builder.parse(xmlfile);

	document.getDocumentElement().normalize();

	Element root = document.getDocumentElement();
	//System.out.println(root.getNodeName());

	//System.out.println("Root element :" + document.getDocumentElement().getNodeName());

	NodeList nList = document.getElementsByTagName("TestCase");
	//System.out.println("============================================");

	for (int temp = 0; temp < nList.getLength(); temp++) {
		Node nNode = nList.item(temp);
		//System.out.println("Current Element :" + nNode.getNodeName());

		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
			Element eElement = (Element) nNode;
		
			read = eElement.getElementsByTagName(value).item(0).getTextContent().trim();
			
							
    	}
    }
	return read;
}
}
