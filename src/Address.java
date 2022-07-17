public class Address {
	private String City;
	private String Town;
	private String Street;
	private int DoorNumber;
	private int FlatNumber;
	public Address(String city, String town, String street, int doorNumber, int flatNumber) {
		super();
		City = city;
		Town = town;
		Street = street;
		DoorNumber = doorNumber;
		FlatNumber = flatNumber;}
	public Address(String city,String town,String street) {
		super();
		City = city;
		Town = town;
		Street=street;}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getTown() {
		return Town;
	}
	public void setTown(String town) {
		Town = town;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public int getDoorNumber() {
		return DoorNumber;
	}
	public void setDoorNumber(int doorNumber) {
		DoorNumber = doorNumber;
	}
	public int getFlatNumber() {
		return FlatNumber;
	}
	public void setFlatNumber(int flatNumber) {
		FlatNumber = flatNumber;
	}
	public String display() {
		String temp=Street+" Street Door Number:"+DoorNumber+" Flat Number:"+FlatNumber+Town+"/"+City+"\n";
		return temp;
	}
	public String displayNormalType() {
		return Street+"Street "+Town+"/"+City+"\n";
	}
}
