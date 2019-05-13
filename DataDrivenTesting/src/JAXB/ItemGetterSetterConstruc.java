package JAXB;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TestName")
public class ItemGetterSetterConstruc {
	
	private String emplId, empName, empLocation;
	private int empLevel;

	//Add getters and setters below
	//And create constructors with fields and without fields below
	

	public ItemGetterSetterConstruc(String emplId, String empName, String empLocation, int empLevel) {
		super();
		this.emplId = emplId;
		this.empName = empName;
		this.empLocation = empLocation;
		this.empLevel = empLevel;
	}
	
	public ItemGetterSetterConstruc() {
		super();
	}
	
	@XmlElement
	public String getEmplId() {
		return emplId;
	}
	public void setEmplId(String emplId) {
		this.emplId = emplId;
	}
	
	@XmlElement
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@XmlElement
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	
	@XmlElement
	public int getEmpLevel() {
		return empLevel;
	}
	public void setEmpLevel(int empLevel) {
		this.empLevel = empLevel;
	}
	
	

}
