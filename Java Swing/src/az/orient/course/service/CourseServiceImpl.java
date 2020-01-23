package az.orient.course.service;

import java.util.List;

import az.orient.course.dao.CourseDao;
import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;

public class CourseServiceImpl implements CourseService {

    private CourseDao courseDao;

    public CourseServiceImpl(CourseDao courseDao) {
        this.courseDao = courseDao;
    }

    @Override
    public List<Student> getStudentList() throws Exception {
        return courseDao.getStudentList();
    }

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        return courseDao.getTeacherList();
    }

    @Override
    public boolean addStudent(Student student) throws Exception {
        return courseDao.addStudent(student);
    }

    @Override
    public Student getStudentById(Long studentId) throws Exception {
        return courseDao.getStudentById(studentId);
    }

    @Override
    public boolean updateStudent(Student student, Long studentId) throws Exception {
        return courseDao.updateStudent(student, studentId);
    }

    @Override
    public boolean deleteStudent(Long studentId) throws Exception {
        return courseDao.deleteStudent(studentId);
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        return courseDao.searchStudentData(keyword);
    }

    @Override
    public List<Lesson> getLessonList() throws Exception {
        return courseDao.getLessonList();
    }

    @Override
    public List<Payment> getPaymentList() throws Exception {
          return courseDao.getPaymentList();
    }

    @Override
    public boolean addPayment(Payment payment) throws Exception {
          return courseDao.addPayment(payment);
    }

    @Override
    public Payment getPaymentById(Long paymentId) throws Exception {
         return courseDao.getPaymentById(paymentId);
    }

    @Override
    public boolean updatePayment(Payment payment, Long paymentId) throws Exception {
           return courseDao.updatePayment(payment, paymentId);
    }

}
