package az.orient.course.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import az.orient.course.dao.CourseDao;
import az.orient.course.dao.CourseDaoImpl;
import az.orient.course.gui.LoginFrame;
import az.orient.course.gui.MainFrame;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import az.orient.course.service.CourseService;
import az.orient.course.service.CourseServiceImpl;
import az.orient.course.util.Method;

public class MainClass {

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            Locale.setDefault(Locale.ENGLISH);
            CourseDao courseDao = new CourseDaoImpl();
            CourseService courseService = new CourseServiceImpl(courseDao);
            System.out.println(courseService.getStudentList());
            LoginFrame loginFrame = new LoginFrame(courseService);
            loginFrame.setVisible(true);
        //    MainFrame mainFrame = new MainFrame(courseService);
        //    mainFrame.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
