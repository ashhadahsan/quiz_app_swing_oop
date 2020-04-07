import java.io.Serializable;

public class Subject implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name[]=new String[3];
	
	private String code[]=new String[3];
	
	public Subject() {
		name[0]="PHYSICS";code[0]="PHY";
		name[1]="MATHEMATICS";code[1]="MTH";
		name[2]="COMPUTER Science";code[2]="CS";
		
		
	}
	public Subject(String nam[],String cd[]) {
		name=nam;code=cd;
		
	
	

	}
	public String[] getName() {
		return name;
	}
	public void setName(String[] name) {
		this.name = name;
	}
	public String[] getCode() {
		return code;
	}
	public void setCode(String[] code) {
		this.code = code;
	}
	
}
