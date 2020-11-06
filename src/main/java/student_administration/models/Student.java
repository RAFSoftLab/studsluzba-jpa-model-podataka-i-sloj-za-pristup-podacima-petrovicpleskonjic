package student_administration.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;


/**
 * The persistent class for the student database table.
 * 
 */
@Entity
@Table(name="student")
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;

	private int enrollementYear;

	private String name;

	private String surname;
	
	private String middlename;
	
	private int jmbg;
	
	private Date birthday;
	
	private String placeOfBirth;
	
	private String countryOfBirth;
	
	private String nationality;
	
	private String gender;
	
	private String address;
	
	private String mobileNumber;
	
	private String email;
	
	private String facultyMail;
	
	private String idCardNumber;
	
	private String idCardIssuer;
	
	@OneToMany(mappedBy= "student")
	private List<StudentIndex> studentIndexes;
	
	@ManyToOne
	private College previousCollege;
		
	public Student() {}
	
	public Student(int enrollementYear, String name, String surname, String middlename, int jmbg,
			Date birthday, String placeOfBirth, String countryOfBirth, String nationality, String genter,
			String address, String mobileNumber, String email, String facultyMail, String idCardNumber,
			String idCardIssuer, HighSchool highSchool, Department department, List<StudentIndex> studentIndexes) {
		super();
		this.enrollementYear = enrollementYear;
		this.name = name;
		this.surname = surname;
		this.middlename = middlename;
		this.jmbg = jmbg;
		this.birthday = birthday;
		this.placeOfBirth = placeOfBirth;
		this.countryOfBirth = countryOfBirth;
		this.nationality = nationality;
		this.gender = genter;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.facultyMail = facultyMail;
		this.idCardNumber = idCardNumber;
		this.idCardIssuer = idCardIssuer;
		this.studentIndexes = studentIndexes;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getEnrollementYear() {
		return enrollementYear;
	}
	
	public College getPreviousCollege() {
		return previousCollege;
	}
	
	public void setPreviousCollege(College previousCollege) {
		this.previousCollege = previousCollege;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public int getJmbg() {
		return jmbg;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public String getNationality() {
		return nationality;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public String getFacultyMail() {
		return facultyMail;
	}

	public String getiDNumber() {
		return idCardNumber;
	}

	public String getIssuedAnIDCard() {
		return idCardIssuer;
	}

	public List<StudentIndex> getStudentIndexes() {
		return studentIndexes;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setEnrollementYear(int enrollementYear) {
		this.enrollementYear = enrollementYear;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public void setJmbg(int jmbg) {
		this.jmbg = jmbg;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFacultyMail(String facultyMail) {
		this.facultyMail = facultyMail;
	}

	public void setiDNumber(String iDNumber) {
		this.idCardNumber = iDNumber;
	}

	public void setIssuedAnIDCard(String issuedAnIDCard) {
		this.idCardIssuer = issuedAnIDCard;
	}

	public void setIndexs(List<StudentIndex> studentIndexes) {
		this.studentIndexes = studentIndexes;
	}

	@Override
	public String toString() {
		return "Student [enrollementYear=" + enrollementYear + ", name=" + name + ", surname=" + surname + "]";
	}

}