package az.orient.course.dao;

import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import java.util.List;

import az.orient.course.model.Student;
import az.orient.course.model.Teacher;

public interface CourseDao {

    List<Student> getStudentList() throws Exception;

    List<Teacher> getTeacherList() throws Exception;

    boolean addStudent(Student student) throws Exception;

    Student getStudentById(Long studentId) throws Exception;

    boolean updateStudent(Student student, Long studentId) throws Exception;

    boolean deleteStudent(Long studentId) throws Exception;

    List<Student> searchStudentData(String keyword) throws Exception;

    List<Lesson> getLessonList() throws Exception;

    List<Payment> getPaymentList() throws Exception;

    boolean addPayment(Payment payment) throws Exception;
    
    Payment getPaymentById(Long paymentId) throws Exception;
    
    boolean updatePayment(Payment payment,Long paymentId) throws Exception;
            ;

}
