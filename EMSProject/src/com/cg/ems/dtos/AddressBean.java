package com.cg.ems.dtos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity
@Table(name="ADDRESS_TABLE")
public class AddressBean {
	
		@Id
		@Column(name="ADDRESS_ID")
		@GeneratedValue(strategy=GenerationType.AUTO, generator="Address_SEQUENCE")
		@SequenceGenerator(name="Address_SEQUENCE", sequenceName="ADDRESS_ID_SEQ")
		private int addressId;
		
		@Column(name="ADDRESS_1")
		private String address1;
		
		@Column(name="ADDRESS_2")
		private String address2;
		
		@Column(name="PINCODE")
		private int pincode;
		
		@Column(name="CITY")
		private String city;
		
		@Column(name="STATE")
		private String state;
		
		@Column(name="COUNTRY")
		private String country;

		@Override
		public String toString() {
			return "AddressBean [addressId=" + addressId + ", address1="
					+ address1 + ", address2=" + address2 + ", pincode="
					+ pincode + ", city=" + city + ", state=" + state
					+ ", country=" + country + "]";
		}

		public int getAddressId() {
			return addressId;
		}

		public void setAddressId(int addressId) {
			this.addressId = addressId;
		}

		public String getAddress1() {
			return address1;
		}

		public void setAddress1(String addr1) {
			address1 = addr1;
		}

		public String getAddress2() {
			return address2;
		}

		public void setAddress2(String addr2) {
			address2 = addr2;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
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

	
		
		
	}

