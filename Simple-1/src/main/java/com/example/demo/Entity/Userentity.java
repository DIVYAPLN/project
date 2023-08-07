package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Userentity {
	@Id
	private int Id;
	private String name;
	private int age;
	private String DOB;
	private String Degree;
	private String Fathername;
	private String Mothername;
	private long Phnum;
	private String Emil;
	private String password;
	
	
	
	public Userentity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Userentity(int id, String name, int age, String dOB, String degree, String fathername, String mothername,
			long phnum, String emil, String password) {
		super();
		Id = id;
		this.name = name;
		this.age = age;
		DOB = dOB;
		Degree = degree;
		Fathername = fathername;
		Mothername = mothername;
		Phnum = phnum;
		Emil = emil;
		this.password = password;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getDegree() {
		return Degree;
	}
	public void setDegree(String degree) {
		Degree = degree;
	}
	public String getFathername() {
		return Fathername;
	}
	public void setFathername(String fathername) {
		Fathername = fathername;
	}
	public String getMothername() {
		return Mothername;
	}
	public void setMothername(String mothername) {
		Mothername = mothername;
	}
	public long getPhnum() {
		return Phnum;
	}
	public void setPhnum(long phnum) {
		Phnum = phnum;
	}
	public String getEmil() {
		return Emil;
	}
	public void setEmil(String emil) {
		Emil = emil;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
