package incedo.lata.demos.inheritance;

public class Address {
	private String address;
	private String city;
	private String state;
	private int zipcode;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Address(String address, String city, String state, int zipcode) {
		
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
}
