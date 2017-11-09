package com.cg.ems.dtos;

import java.sql.Date;









import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="EMPLOYEE_TABLE")
@NamedQueries({@NamedQuery(name = "getAllEmployee", query = "SELECT Emp FROM EmployeeBean Emp"),
@NamedQuery(name = "getEmployeeById", query = "SELECT Emp FROM EmployeeBean Emp WHERE Emp.empId =:eId"),
@NamedQuery(name = "getAllEmployees" ,query = "SELECT Emp FROM EmployeeBean Emp")
})  
public class EmployeeBean {

	@Id
	@Column(name="EMP_ID")
	@GeneratedValue(strategy=GenerationType.AUTO, generator="employee_SEQUENCE")
	@SequenceGenerator(name="employee_SEQUENCE", sequenceName="EMPLOYEE_ID_SEQ")
	private int empId;
	
	/*@NotEmpty(message="Employee firstName is Required")
	@Size(min = 3,message="FirstName should have atleast 6 character")
	*/
	@Column(name="EMP_FIRSTNAME")
	private String firstName;
	

	/*@NotEmpty(message="Employee Lastname is Required")
	@Size(min = 3,message="LastName should have atleast 6 character")
	*/
	@Column(name="EMP_LASTNAME")
	private String lastName;
	
	/*@Column(name="EMP_DATE_OF_JOIN")
	@NotEmpty(message="date is required")
	@Past
	*/
	@Column(name="EMP_DATE_OF_JOIN")
	private Date dateOfJoining;
	
	/*
	@NotEmpty(message="date of birth is required")
	@Past
	*/
	@Column(name="EMP_DATE_OF_BIRTH")
	private Date dateOfBirth;
	
	@Column(name="EMP_DEPT_ID")
	private int deptId;
	
	@Column(name="EMP_DESIGNATION_ID")
	private int designationId;
	
	@Column(name="EMP_GRADE")
	private String grade;
	
	@Column(name="EMP_GENDER")
	private String gender;
	
	//@NotNull(message="Salary Required")
	
	@Column(name="EMP_SALARY")
	private long salary;
	
	@Column(name="EMP_MARITAL_STATUS")
	private String maritalStatus;
	
	//@NotNull(message="Contact no. is Required")
	@Column(name="EMP_CONTACT")
	private long contactNo;
	
	
	//@NotEmpty(message="address is required")

	@Column(name="ADDRESS_LINE1")
	private String addressline1;
	
	@Column(name="ADDRESS_LINE2")
	private String addressline2;
	
	private String city;
	private int pincode;
	private String state;
	

		public int getEmpId() {
			return empId;
		}

		public void setEmpId(int empId) {
			this.empId = empId;
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

		public Date getDateOfJoining() {
			return dateOfJoining;
		}

		public void setDateOfJoining(Date dateOfJoining) {
			this.dateOfJoining = dateOfJoining;
		}

		public Date getDateOfBirth() {
			return dateOfBirth;
		}

		public void setDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}

		public int getDeptId() {
			return deptId;
		}

		public void setDeptId(int deptId) {
			this.deptId = deptId;
		}

		public int getDesignationId() {
			return designationId;
		}

		public void setDesignationId(int designationId) {
			this.designationId = designationId;
		}

		public String getGrade() {
			return grade;
		}

		public void setGrade(String grade) {
			this.grade = grade;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public long getSalary() {
			return salary;
		}

		public void setSalary(long salary) {
			this.salary = salary;
		}

		public String getMartialStatus() {
			return maritalStatus;
		}

		public void setMartialStatus(String martialStatus) {
			this.maritalStatus = martialStatus;
		}


		public long getContactNo() {
			return contactNo;
		}

		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}

		public String getAddressline1() {
			return addressline1;
		}

		public void setAddressline1(String addressline1) {
			this.addressline1 = addressline1;
		}

		public String getAddressline2() {
			return addressline2;
		}

		public void setAddressline2(String addressline2) {
			this.addressline2 = addressline2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getPincode() {
			return pincode;
		}

		public void setPincode(int pincode) {
			this.pincode = pincode;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			return "EmployeeBean [empId=" + empId + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", dateOfJoining="
					+ dateOfJoining + ", dateOfBirth=" + dateOfBirth
					+ ", deptId=" + deptId + ", designationId=" + designationId
					+ ", grade=" + grade + ", gender=" + gender + ", salary="
					+ salary + ", maritalStatus=" + maritalStatus
					+ ", contactNo=" + contactNo + ", addressline1="
					+ addressline1 + ", addressline2=" + addressline2
					+ ", city=" + city + ", pincode=" + pincode + ", state="
					+ state + "]";
		}

}