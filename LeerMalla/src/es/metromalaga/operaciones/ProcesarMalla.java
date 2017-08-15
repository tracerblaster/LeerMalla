package es.metromalaga.operaciones;

import java.io.IOException;
import org.jdom2.Attribute;
import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ProcesarMalla {

	private String xmlSource = "file:///p:/Users/a.alarcon/Programas/workspace/S1_01_V01.xml";
	private SAXBuilder jdomBuilder;
	Document jdomDocument;
	Element malla;

	public ProcesarMalla() {
		proceso();
	}
	
	public String getXmlSource() {
		return xmlSource;
	}

	public void setXmlSource(String xmlSource) {
		this.xmlSource = xmlSource;
	}
	
	public void proceso () {
		
		conectar();
		getRoot();
		
	}
	
	public void conectar() {
		jdomBuilder = new SAXBuilder();
        // jdomDocument is the JDOM2 Object
        try {
			jdomDocument = jdomBuilder.build(xmlSource);
		} catch (JDOMException e) {
			System.err.println("Error: JDOMException al crear jdomDocument");
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("Error: IOException al crear jdomDocument. Compruebe el archivo XML.");
			e.printStackTrace();
		}
		
	}
	
	public void getRoot() {
		malla = jdomDocument.getRootElement();
	}
}
