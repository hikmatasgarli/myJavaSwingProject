package az.orient.course.dao;

import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import az.orient.course.util.JdbcUtility;

public class CourseDaoImpl implements CourseDao {

    @Override
    public List<Student> getStudentList() throws Exception {
        List<Student> studentList = new ArrayList<Student>();
        Connection c = null; // baza ile elaqe yaradir.
        PreparedStatement ps = null; // sql - i run etmek ucun hazirlayir
        ResultSet rs = null; // sql -den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ROWNUM r,ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM STUDENT " + "WHERE ACTIVE = 1 ";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Student student = new Student();
                    student.setR(rs.getLong("r"));
                    student.setId(rs.getLong("ID"));
                    student.setName(rs.getString("NAME"));
                    student.setSurname(rs.getString("SURNAME"));
                    student.setAddress(rs.getString("ADDRESS"));
                    student.setDob(rs.getDate("DOB"));
                    student.setPhone(rs.getString("PHONE"));
                    studentList.add(student);

                }
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return studentList;
    }

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        List<Teacher> teacherList = new ArrayList<>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT ROWNUM r,ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM TEACHER\r\n" + "WHERE ACTIVE = 1 ";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Teacher teacher = new Teacher();
                    teacher.setR(rs.getLong("r"));
                    teacher.setId(rs.getLong("ID"));
                    teacher.setName(rs.getString("NAME"));
                    teacher.setSurname(rs.getString("SURNAME"));
                    teacher.setAddress(rs.getString("ADDRESS"));
                    teacher.setDob(rs.getDate("DOB"));
                    teacher.setPhone(rs.getString("PHONE"));
                    teacherList.add(teacher);
                }
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return teacherList;
    }

    @Override
    public boolean addStudent(Student student) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO STUDENT(ID,NAME,SURNAME,ADDRESS,DOB,PHONE)\r\n"
                + "VALUES(STUDENT_SEQ.NEXTVAL,?,?,?,?,?)";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, student.getName());
                ps.setString(2, student.getSurname());
                ps.setString(3, student.getAddress());
                ps.setDate(4, new java.sql.Date(student.getDob().getTime()));
                ps.setString(5, student.getPhone());
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return result;
    }

    @Override
    public Student getStudentById(Long studentId) throws Exception {
        Student student = new Student();
        Connection c = null; // baza ile elaqe yaradir.
        PreparedStatement ps = null; // sql - i run etmek ucun hazirlayir
        ResultSet rs = null; // sql -den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM STUDENT " + "WHERE ACTIVE = 1 AND ID = ? ";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, studentId);
                rs = ps.executeQuery();
                while (rs.next()) {

                    student.setId(rs.getLong("ID"));
                    student.setName(rs.getString("NAME"));
                    student.setSurname(rs.getString("SURNAME"));
                    student.setAddress(rs.getString("ADDRESS"));
                    student.setDob(rs.getDate("DOB"));
                    student.setPhone(rs.getString("PHONE"));

                }
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return student;
    }

    @Override
    public boolean updateStudent(Student student, Long studentId) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE STUDENT SET NAME = ?,SURNAME = ?,ADDRESS = ?,DOB = ?,PHONE = ? "
                + " WHERE ID = ?";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, student.getName());
                ps.setString(2, student.getSurname());
                ps.setString(3, student.getAddress());
                ps.setDate(4, new java.sql.Date(student.getDob().getTime()));
                ps.setString(5, student.getPhone());
                ps.setLong(6, studentId);
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return result;
    }

    @Override
    public boolean deleteStudent(Long studentId) throws Exception {
        boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE STUDENT SET ACTIVE = 0 "
                + " WHERE ID = ?";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, studentId);
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return result;
    }

    @Override
    public List<Student> searchStudentData(String keyword) throws Exception {
        List<Student> studentList = new ArrayList<Student>();
        Connection c = null; // baza ile elaqe yaradir.
        PreparedStatement ps = null; // sql - i run etmek ucun hazirlayir
        ResultSet rs = null; // sql -den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ROWNUM r,ID,NAME,SURNAME,ADDRESS,DOB,PHONE FROM STUDENT WHERE ACTIVE = 1\r\n"
                + "AND (LOWER(NAME) LIKE LOWER(?) OR LOWER(SURNAME) LIKE LOWER(?) OR LOWER(ADDRESS) LIKE LOWER(?))";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setString(1, "%" + keyword + "%");
                ps.setString(2, "%" + keyword + "%");
                ps.setString(3, "%" + keyword + "%");
                rs = ps.executeQuery();
                while (rs.next()) {
                    Student student = new Student();
                    student.setR(rs.getLong("r"));
                    student.setId(rs.getLong("ID"));
                    student.setName(rs.getString("NAME"));
                    student.setSurname(rs.getString("SURNAME"));
                    student.setAddress(rs.getString("ADDRESS"));
                    student.setDob(rs.getDate("DOB"));
                    student.setPhone(rs.getString("PHONE"));
                    studentList.add(student);

                }
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return studentList;
    }

    @Override
    public List<Lesson> getLessonList() throws Exception {
        List<Lesson> lessonList = new ArrayList<Lesson>();
        Connection c = null; // baza ile elaqe yaradir.
        PreparedStatement ps = null; // sql - i run etmek ucun hazirlayir
        ResultSet rs = null; // sql -den qayidan neticeni ozunde saxlayir
        String sql = "SELECT ROWNUM r,ID,LESSON_NAME,LESSON_TIME,LESSON_PRICE FROM LESSON\n"
                + "WHERE ACTIVE = 1 ";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Lesson lesson = new Lesson();
                    lesson.setR(rs.getLong("r"));
                    lesson.setId(rs.getLong("ID"));
                    lesson.setLessonName(rs.getString("LESSON_NAME"));
                    lesson.setLessonTime(rs.getInt("LESSON_TIME"));
                    lesson.setLessonPrice(rs.getDouble("LESSON_PRICE"));
                    lessonList.add(lesson);

                }
            } else {
                System.out.println("Connection is null!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return lessonList;
    }

    @Override
    public List<Payment> getPaymentList() throws Exception {
        List<Payment> paymentList = new ArrayList<>();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT ROWNUM r,P.ID,\n"
                + "       S.ID STUDENT_ID,\n"
                + "       S.NAME STUDENT_NAME,\n"
                + "       S.SURNAME STUDENT_SURNAME,\n"
                + "       T.ID TEACHER_ID,\n"
                + "       T.NAME TEACHER_NAME,\n"
                + "       T.SURNAME TEACHER_SURNAME,\n"
                + "       L.ID LESSON_ID,\n"
                + "       L.LESSON_NAME LESSON_NAME,\n"
                + "       P.AMOUNT,\n"
                + "       P.PAY_DATE\n"
                + "  FROM PAYMENT P\n"
                + "       INNER JOIN STUDENT S\n"
                + "          ON P.S_ID = S.ID\n"
                + "       INNER JOIN TEACHER T\n"
                + "          ON P.T_ID = T.ID\n"
                + "       INNER JOIN LESSON L\n"
                + "          ON P.L_ID = L.ID\n"
                + " WHERE P.ACTIVE = 1";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                rs = ps.executeQuery();
                while (rs.next()) {
                    Payment payment = new Payment();
                    payment.setR(rs.getLong("r"));
                    payment.setId(rs.getLong("ID"));
                    Student student = new Student();
                    Teacher teacher = new Teacher();
                    Lesson lesson = new Lesson();
                    student.setId(rs.getLong("STUDENT_ID"));
                    student.setName(rs.getString("STUDENT_NAME"));
                    student.setSurname(rs.getString("STUDENT_SURNAME"));
                    payment.setStudent(student);
                    teacher.setId(rs.getLong("TEACHER_ID"));
                    teacher.setName(rs.getString("TEACHER_NAME"));
                    teacher.setSurname(rs.getString("TEACHER_SURNAME"));
                    payment.setTeacher(teacher);
                    lesson.setId(rs.getLong("LESSON_ID"));
                    lesson.setLessonName(rs.getString("LESSON_NAME"));
                    payment.setLesson(lesson);
                    payment.setAmount(rs.getDouble("AMOUNT"));
                    payment.setPayDate(rs.getDate("PAY_DATE"));
                    paymentList.add(payment);
                }
            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return paymentList;
    }

    @Override
    public boolean addPayment(Payment payment) throws Exception {
        boolean isAdded = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "INSERT INTO PAYMENT(ID,S_ID,T_ID,L_ID,AMOUNT)\n"
                + "VALUES(PAYMENT_SEQ.NEXTVAL,?,?,?,?)";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, payment.getStudent().getId());
                ps.setLong(2, payment.getTeacher().getId());
                ps.setLong(3, payment.geLesson().getId());
                ps.setDouble(4, payment.getAmount());
                ps.execute();
                isAdded = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            c.commit();
            JdbcUtility.close(c, ps, null);
        }

        return isAdded;
    }

    @Override
    public Payment getPaymentById(Long paymentId) throws Exception {
        Payment payment = new Payment();
        Connection c = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "SELECT ROWNUM r,P.ID,\n"
                + "       S.ID STUDENT_ID,\n"
                + "       S.NAME STUDENT_NAME,\n"
                + "       S.SURNAME STUDENT_SURNAME,\n"
                + "       T.ID TEACHER_ID,\n"
                + "       T.NAME TEACHER_NAME,\n"
                + "       T.SURNAME TEACHER_SURNAME,\n"
                + "       L.ID LESSON_ID,\n"
                + "       L.LESSON_NAME LESSON_NAME,\n"
                + "       P.AMOUNT,\n"
                + "       P.PAY_DATE\n"
                + "  FROM PAYMENT P\n"
                + "       INNER JOIN STUDENT S\n"
                + "          ON P.S_ID = S.ID\n"
                + "       INNER JOIN TEACHER T\n"
                + "          ON P.T_ID = T.ID\n"
                + "       INNER JOIN LESSON L\n"
                + "          ON P.L_ID = L.ID\n"
                + " WHERE P.ACTIVE = 1 AND P.ID = ?";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, paymentId);
                rs = ps.executeQuery();
                while (rs.next()) {

                    payment.setR(rs.getLong("r"));
                    payment.setId(rs.getLong("ID"));
                    Student student = new Student();
                    Teacher teacher = new Teacher();
                    Lesson lesson = new Lesson();
                    student.setId(rs.getLong("STUDENT_ID"));
                    student.setName(rs.getString("STUDENT_NAME"));
                    student.setSurname(rs.getString("STUDENT_SURNAME"));
                    payment.setStudent(student);
                    teacher.setId(rs.getLong("TEACHER_ID"));
                    teacher.setName(rs.getString("TEACHER_NAME"));
                    teacher.setSurname(rs.getString("TEACHER_SURNAME"));
                    payment.setTeacher(teacher);
                    lesson.setId(rs.getLong("LESSON_ID"));
                    lesson.setLessonName(rs.getString("LESSON_NAME"));
                    payment.setLesson(lesson);
                    payment.setAmount(rs.getDouble("AMOUNT"));
                    payment.setPayDate(rs.getDate("PAY_DATE"));
                }
            } else {
                System.out.println("Connection is null");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            JdbcUtility.close(c, ps, rs);
        }
        return payment;
    }

    @Override
    public boolean updatePayment(Payment payment, Long paymentId) throws Exception {
         boolean result = false;
        Connection c = null;
        PreparedStatement ps = null;
        String sql = "UPDATE PAYMENT SET S_ID = ?,T_ID = ?,L_ID = ?,AMOUNT = ? "
                + " WHERE ID = ?";
        try {
            c = DbHelper.dbConnect();
            if (c != null) {
                ps = c.prepareStatement(sql);
                ps.setLong(1, payment.getStudent().getId());
                ps.setLong(2, payment.getTeacher().getId());
                ps.setLong(3, payment.getLesson().getId());
                ps.setDouble(4, payment.getAmount());
                ps.setLong(5, paymentId);
                ps.execute();
                result = true;
            } else {
                System.out.println("Connection is null!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            c.commit();
            JdbcUtility.close(c, ps, null);
        }
        return result;
    }

}
