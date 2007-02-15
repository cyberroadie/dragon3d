package net.transformatohuis.dragon3d.test;

import org.junit.Before;
import org.w3c.dom.Document;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.JAXBException;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

import net.transformatorhuis.xsd.ObjectFactory;
import net.transformatorhuis.xsd.Rib;
import net.transformatorhuis.teapot.BrokenTeapotException;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cyberroadie
 * Date: Feb 15, 2007
 * Time: 12:00:00 AM
 * To change this template use File | Settings | File Templates.
 */
public class GeneralRibTest {

    private JAXBContext jc;

    private Marshaller m;

    private ObjectFactory objFactory;

    private Rib rib;

    private List ribList;

    @Before
    public void initialize() throws JAXBException {

        jc = JAXBContext.newInstance("net.transformatorhuis.xsd");
        m = jc.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        objFactory = new ObjectFactory();

        // Intial setup renderman file
        rib = objFactory.createRib();
        rib.setVersion("3.03");
        ribList = rib.getDisplayOrProjectionOrRotate();

    }

    protected void addRibElement(Object ribElement) {
        ribList.add(ribElement);
    }

    protected Document toDOM() throws ParserConfigurationException, JAXBException {

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        dbf.setNamespaceAware(true);
        DocumentBuilder db = null;
        Document doc = null;

        db = dbf.newDocumentBuilder();
        doc = db.newDocument();
        m.marshal(rib, doc);

        return doc;
    }

    protected void toSystemOut() throws JAXBException {
        m.marshal(rib, System.out);
    }

}
