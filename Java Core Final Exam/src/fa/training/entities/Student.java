package fa.training.entities;

import java.time.LocalDate;

public abstract class Student {
	private String fullName;
	private LocalDate doB;
	private String sex;
	private String phoneNumber;
	private String universityName;
	private String gradeLevel;

	public abstract String ShowMyInfor();

	@Override
	public String toString() {
		return "Student [FullName = " + getFullName() + ", DoB = " + getDoB() + ",  Sex = " + getSex()
				+ ",  PhoneNumber = " + getPhoneNumber() + ",  UniversityName = " + getUniversityName()
				+ ",  GradeLevel = " + getGradeLevel() + ShowMyInfor() + "]";
	}

	public Student() {
		this.fullName = "";
		this.doB = null;
		this.sex = "";
		this.phoneNumber = "";
		this.universityName = "";
		this.gradeLevel = "";
	}

	public Student(String fullName, LocalDate doB, String sex, String phoneNumber, String universityName,
			String gradeLevel) {
		super();
		this.fullName = fullName;
		this.doB = doB;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.universityName = universityName;
		this.gradeLevel = gradeLevel;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getDoB() {
		return doB;
	}

	public void setDoB(LocalDate doB) {
		this.doB = doB;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getGradeLevel() {
		return gradeLevel;
	}

	public void setGradeLevel(String gradeLevel) {
		this.gradeLevel = gradeLevel;
	}

}
