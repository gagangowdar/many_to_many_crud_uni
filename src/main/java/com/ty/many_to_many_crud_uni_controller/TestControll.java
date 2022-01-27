package com.ty.many_to_many_crud_uni_controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.many_to_many_crud_uni.dao.CourseDao;
import com.ty.many_to_many_crud_uni.dto.Course;
import com.ty.many_to_many_crud_uni.dto.Student;

public class TestControll {

	public static void main(String[] args) {
		CourseDao courseDao = new CourseDao();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("tejas");

		Student student2 = new Student();
		student2.setId(2);
		student2.setName("prajwal");
		
		List<Student> list1 = new ArrayList<Student>();
		list1.add(student1);
		list1.add(student2);

		Course course1 = new Course();
		course1.setCourse_id(11);
		course1.setCourse_name("java");
		course1.setDays(60);

		Course course2 = new Course();
		course2.setCourse_id(12);
		course2.setCourse_name("html");
		course2.setDays(30);

		course1.setStudent(list1);
		course2.setStudent(list1);
			
		courseDao.save(course1);
		
	}
}
