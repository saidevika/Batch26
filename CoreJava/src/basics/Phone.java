package basics;

public class Phone{
	private String name;
	private int version;
	public Phone(String name, int version){
		this.name = name;
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	@Override
	public boolean equals(Object obj2) {
		Phone iphone2 = (Phone)obj2;
		//return (this.name.equals(iphone2.getName()) && this.version == iphone2.getVersion());
		return (this.name.equals(iphone2.getName()));
	}
	
}
