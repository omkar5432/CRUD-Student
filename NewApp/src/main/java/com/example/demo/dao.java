package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class dao implements service{

	@Autowired
	repo rp;
	
	@Override
	public void getdata(student st) {
		rp.save(st);
	}

	@Override
	public List<student> getallstudent() {
		return rp.findAll();
	}

	@Override
	public void deletedata(int id) {
	   
		rp.deleteById(id);
		
	}

	@Override
	public student updatedata(int id) {
		student s=rp.getById(id);
		rp.save(s);
		return s;
	}

	@Override
	public student update(student stud) {

		return rp.save(stud);
	}
	 

}
