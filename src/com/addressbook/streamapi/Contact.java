package com.addressbook.streamapi;

public class Contact {
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;
	private int zip;
	private String phoneNumber;
	public Contact() {
		super();
	}
	public Contact(int id, String firstName, String lastName, String address, String city, String state,
			String email, int zip, String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.email = email;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return " \n Contact id = " + id + ",\n"
				+ " FirstName = " + firstName + ",\n"
						+ " LastName = " + lastName + ",\n"
								+ " Address =" + address+ ",\n"
										+ " City = " + city + ",\n"
												+ " State = " + state + ",\n"
														+ " Email = " + email + ",\n"
																+ " Zip = " + zip + ",\n"
																		+ " PhoneNumber = "+ phoneNumber + "]\n";
	}
	

}
