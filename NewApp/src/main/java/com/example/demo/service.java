package com.example.demo;

import java.util.List;

public interface service {
	
	public void getdata(student st);
	
	List<student> getallstudent();
	
	public void deletedata(int id);
	
	student updatedata(int id);
	
	public student update(student stud);

}
