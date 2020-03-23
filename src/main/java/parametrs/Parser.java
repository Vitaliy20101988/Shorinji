package parametrs;

import org.dom4j.XPath;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.io.IOException;

public class Parser {

    private static Object XPath;
    public static File file;
    public static Document document;
    public static XPathFactory xPathFactory;

    public Parser Parser() throws XPathExpressionException {

        file = new File("auth.xml");

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
        try {
            document = builder.parse(file);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        xPathFactory = XPathFactory.newInstance();
//        String s = XPathFactory.new
//
        return this;
//
//    }
//
//    public Object getXPath() {
//        return XPath;
//    }
//
//    public void setXPath(Object XPath) {
//        this.XPath = XPath;
    }
}


