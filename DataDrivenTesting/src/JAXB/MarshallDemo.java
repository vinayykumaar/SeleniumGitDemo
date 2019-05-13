package JAXB;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MarshallDemo {
	
	public void Marshall() throws Exception {
		
		ItemGetterSetterConstruc TestObj = new ItemGetterSetterConstruc ("A01", "Vinay", "MDC5", 11);
	
		JAXBContext TestJC = JAXBContext.newInstance(ItemGetterSetterConstruc.class);
		Marshaller TestMS = TestJC.createMarshaller();
		
		TestMS.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		TestMS.marshal(TestObj, System.out);
		TestMS.marshal(TestObj, new File("src\\JAXB\\TestObj.xml"));
	}

}
