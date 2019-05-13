package JAXB;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class UnmarshallDemo {
	
	public void Unmarshall() throws Exception {
		
		
	
		JAXBContext TestJCUm = JAXBContext.newInstance(ItemGetterSetterConstruc.class);
		Unmarshaller TestUMS = TestJCUm.createUnmarshaller();
		
		
		ItemGetterSetterConstruc TestObj1 = (ItemGetterSetterConstruc)TestUMS.unmarshal(new File ("src\\JAXB\\TestObj.xml"));
		
	
		System.out.println("Employee Details are: ");
		System.out.println(TestObj1.getEmplId());
		System.out.println(TestObj1.getEmpName());
		System.out.println(TestObj1.getEmpLocation());
		System.out.println(TestObj1.getEmpLevel());
	}

}
