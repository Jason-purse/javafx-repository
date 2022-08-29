package com.baeldung.student.client;
import com.baeldung.student.model.Student;
import com.baeldung.student.service.StudentService;
import com.baeldung.student.service.dbimpl.StudentDbService;
public class StudentClient {
	public static void main(String[] args) {
		StudentService service = new StudentDbService();
		service.create(new Student());
		service.read("17SS0001");
		service.update(new Student());
		service.delete("17SS0001");
		System.out.println("invoke studentClient module main function");
	}
}
