package az.orient.course.util;

import java.util.List;

import az.orient.course.model.Student;

public class Method {
	
	public static void getStudentList(List<Student> studentList) {
		for (Student student : studentList) {
			System.out.println(student.getId() + " -- " + student.getName() + " " + student.getSurname()
					+ " -- " + student.getAddress() + " -- " + student.getDob()+ " -- "+student.getPhone());
		}
	}

}
