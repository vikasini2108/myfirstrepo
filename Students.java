package com.bean;

public class Students {
	//constructors
	public Students()
	{
		
	}
	//para constructors
public Students(int i, String string, String string2, int j) {
		super();
		this.s_id = s_id;
		Name = getName();
		Address = getAddress();
		Marks = getMarks();
	}

private int s_id;
private String Name;
private String Address;
private int Marks;

public int getS_id() {
	return s_id;
}
public void setS_id(int s_id) {
	this.s_id = s_id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getMarks() {
	return Marks;
}
public void setMarks(int marks) {
	Marks = marks;
}
//tostring method
@Override
public String toString() {
	return "Students [s_id=" + s_id + ", Name=" + Name + ", Address=" + Address + ", Marks=" + Marks + ", getS_id()="
			+ getS_id() + ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getMarks()=" + getMarks()
			+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}

}
