package es.metromalaga.operaciones;

import java.io.IOException;
import java.util.List;

import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;


public class Prueba {
    private static String xmlSource = "file:///p:/Users/a.alarcon/Programas/workspace/S1_01_V01.xml";
    //private static String xmlSource = "http://feeds.bbci.co.uk/news/technology/rss.xml?edition=int";
    
    public static void main(String[] args) throws JDOMException, IOException {
    	
    	ProcesarMalla pm = new ProcesarMalla();
    }
    
    /*    public static void main(String[] args) throws JDOMException, IOException {
        // the SAXBuilder is the easiest way to create the JDOM2 objects.
        SAXBuilder jdomBuilder = new SAXBuilder();
  
        // jdomDocument is the JDOM2 Object
        Document jdomDocument = jdomBuilder.build(xmlSource);
  
        // The root element is the root of the document. we print its name
        System.out.println(jdomDocument.getRootElement().getName()); // prints "malla"
  
        Element malla = jdomDocument.getRootElement();
 
        // the getContent method traverses through the document and gets all the
        // contents. We print the CType (an enumeration identifying the Content
        // Type), value and class of the Content. we print only the
        // first two values, since this is only an example.
        List<Content> mallaContents = malla.getContent();
        for (int i = 0; i < 2; i++) {
            Content content = mallaContents.get(i);
            System.out.println("CType " + content.getCType());
            System.out.println("Class " + content.getClass());
        }

        List<Element> mallaChildren= malla.getChildren();
        for (int i = 0; i < mallaChildren.size(); i++) {
        	Element mallaChild = mallaChildren.get(i);
        	System.out.println("Nodo: " + mallaChild.getName());

        	List<Attribute> elementoAttr = mallaChild.getAttributes();
        	for (int j = 0; j < elementoAttr.size(); j++){
        		System.out.println("Atributo SCHEDULE: " + elementoAttr.get(j));
        	}
        }
        
        
        Element nodoSchedule = malla.getChild("SCHEDULE"); // Se coge el nodo SCHEDULE
        Element nodoTrips = nodoSchedule. getChild("TRIPS"); // Se coge el nodo TRIPS
        System.out.println("Nodo: " + nodoTrips.getName());
        List<Element> tripsChildren = nodoTrips.getChildren();
        System.out.println("Nodos hijo totales de TRIPS: " + tripsChildren.size());
        
        //Prueba con el primer TRIP
        Element pruebaTrip = tripsChildren.get(0);
        List<Attribute> tripAttribute = pruebaTrip.getAttributes();
        for (int i = 0; i < tripAttribute.size();i++){
        	System.out.println("Atributo TRIP: " + tripAttribute.get(i));
        }
        System.out.println("Atributo ENTRY_TIME: " + pruebaTrip.getAttributeValue("ENTRY_TIME"));
        
        List<Element> pruebaTripStop = pruebaTrip.getChildren();
        Element pruebaTripStop1 = pruebaTripStop.get(0);
        
        
    }
*/}
