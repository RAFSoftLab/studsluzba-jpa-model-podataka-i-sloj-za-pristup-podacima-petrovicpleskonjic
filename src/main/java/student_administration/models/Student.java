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
public class Student{
	private static final long serialVersionUID = 1L;

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
	
	private String genter;
	
	private String address;
	
	private String mobileNumber;
	
	private String email;
	
	private String facultyMail;
	
	private String iDNumber;
	
	private String issuedAnIDCard;
	
	//@ManyToOne(fetch = FetchType.LAZY)
	//private HighSchool highSchool;
	
	@OneToMany(mappedBy= "student")
	private List<StudentIndex> studentIndexes;
	
	//private List<PassedSubject> passedSubjects;
	
	public Student() {}
	
	public Student(int enrollementYear, String name, String surname, String middlename, int jmbg,
			Date birthday, String placeOfBirth, String countryOfBirth, String nationality, String genter,
			String address, String mobileNumber, String email, String facultyMail, String iDNumber,
			String issuedAnIDCard, HighSchool highSchool, Department department, List<StudentIndex> indexs) {
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
		this.genter = genter;
		this.address = address;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.facultyMail = facultyMail;
		this.iDNumber = iDNumber;
		this.issuedAnIDCard = issuedAnIDCard;
		//this.highSchool = highSchool;
		//this.studentIndexes = studentIndexes;
	}

	public int getStudentId() {
		return studentId;
	}

	public int getEnrollementYear() {
		return enrollementYear;
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

	public String getGenter() {
		return genter;
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
		return iDNumber;
	}

	public String getIssuedAnIDCard() {
		return issuedAnIDCard;
	}

	//public HighSchool getHighSchool() {
	//	return highSchool;
	//}

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

	public void setGenter(String genter) {
		this.genter = genter;
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
		this.iDNumber = iDNumber;
	}

	public void setIssuedAnIDCard(String issuedAnIDCard) {
		this.issuedAnIDCard = issuedAnIDCard;
	}

	//public void setHighSchool(HighSchool highSchool) {
	//	this.highSchool = highSchool;
	//}

	public void setIndexs(List<StudentIndex> studentIndexes) {
		this.studentIndexes = studentIndexes;
	}

//	public List<PassedSubject> getPassedSubjects() {
//		return passedSubjects;
//	}
//
//	public void setPassedSubjects(List<PassedSubject> passedSubjects) {
//		this.passedSubjects = passedSubjects;
//	}
	
	

}