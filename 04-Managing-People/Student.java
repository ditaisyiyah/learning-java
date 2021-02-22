package Dita.Peop;
/*
 * this class will define a student and the information about student
 */
public class Student {
	private String stuName = null;
	private int stuId = 0;
	private String stuStatus = null;
	
	//yes, you must declare any possibility of constructor
	public Student() {}
	public Student (String val1) {
		this.stuName = val1;
	}
	public Student (int val2) {
		this.stuId = val2;
	}
	//can't create constructor for only stuStatus
	public Student (String val3, int val4) {
		this.stuName = val3;
		this.stuId = val4;
	}
	public Student (String val5, String val6) {
		this.stuName = val5;
		this.stuStatus = val6;
	}
	public Student (int val7, String val8) {
		this.stuId = val7;
		this.stuStatus = val8;
	}
	public Student (String val9, int val10, String val11) {
		this.stuName = val9;
		this.stuId = val10;
		this.stuStatus = val11;
	}
	
	public void printData() {
		System.out.println(
		"\nStudent Name	: " + this.stuName +
		"\nStudent ID	: " + this.stuId +
		"\nStudent Status	: " + this.stuStatus);
	}

}
