package com.synergisticit.domain;

public class Address {

	private String streetAddress;
	private String streetAddressOptional;
	private String city;
	private String state;
	private String country;
	private String zip;
	
	public Address() {
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getStreetAddressOptional() {
		return streetAddressOptional;
	}

	public void setStreetAddressOptional(String streetAddressOptional) {
		this.streetAddressOptional = streetAddressOptional;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [streetAddress=" + streetAddress + ", streetAddressOptional=" + streetAddressOptional
				+ ", city=" + city + ", state=" + state + ", country=" + country + ", zip=" + zip + "]";
	}
	
	
	
}
