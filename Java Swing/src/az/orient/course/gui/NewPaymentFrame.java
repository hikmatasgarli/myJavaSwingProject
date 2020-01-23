/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.course.gui;

import az.orient.course.model.Item;
import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import az.orient.course.service.CourseService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ideas.az
 */
public class NewPaymentFrame extends javax.swing.JFrame {

    private CourseService courseService;

    public NewPaymentFrame() {
        initComponents();
    }

    public NewPaymentFrame(CourseService courseService) {
        initComponents();
        this.courseService = courseService;
        showStudentCombo();
        showTeacherCombo();
        showLessonCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        studentCmb = new javax.swing.JComboBox();
        teacherCmb = new javax.swing.JComboBox();
        lessonCmb = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        teacherCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Teacher" }));

        lessonCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Lesson" }));

        jLabel1.setText("Student");

        jLabel2.setText("Teacher");

        jLabel3.setText("Lesson");

        jLabel4.setText("Amount");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        clearBtn.setText("Clear");

        jLabel5.setText("AZN");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(studentCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(teacherCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lessonCmb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(52, 52, 52))
                                    .addComponent(jLabel2))
                                .addGap(60, 60, 60))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jLabel3)))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(studentCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(teacherCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lessonCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(67, 67, 67))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            Item studentItem = (Item) studentCmb.getSelectedItem();
            Item teacherItem = (Item) teacherCmb.getSelectedItem();
            Item lessonItem = (Item) lessonCmb.getSelectedItem();
            if (studentItem.getId() == 0) {
                JOptionPane.showMessageDialog(null, "Please select student!", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {
                Double amount = Double.valueOf(jTextField1.getText());
                Payment payment = new Payment();
                Student student = new Student();
                student.setId(studentItem.getId());
                Teacher teacher = new Teacher();
                teacher.setId(teacherItem.getId());
                Lesson lesson = new Lesson();
                lesson.setId(lessonItem.getId());
                payment.setStudent(student);
                payment.setTeacher(teacher);
                payment.setLesson(lesson);
                payment.setAmount(amount);
                boolean isAdded = courseService.addPayment(payment);
                if (isAdded) {
                    JOptionPane.showMessageDialog(null, "Payment has been successfully added!", "Success", JOptionPane.INFORMATION_MESSAGE);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Problem! Payment has not been successfully added!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Problem! Payment has not been successfully added!", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_saveBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox lessonCmb;
    private javax.swing.JButton saveBtn;
    private javax.swing.JComboBox studentCmb;
    private javax.swing.JComboBox teacherCmb;
    // End of variables declaration//GEN-END:variables

    private void showStudentCombo() {
        try {
            DefaultComboBoxModel studentCombo = new DefaultComboBoxModel();
            studentCmb.setModel(studentCombo);
            studentCombo.addElement(new Item((long) 0, "Select Student"));
            List<Student> studentList = courseService.getStudentList();
            for (Student student : studentList) {
                studentCombo.addElement(new Item(student.getId(), student.getName() + " " + student.getSurname()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showTeacherCombo() {
        try {
            DefaultComboBoxModel teacherCombo = (DefaultComboBoxModel) teacherCmb.getModel();
            List<Teacher> teacherList = courseService.getTeacherList();
            for (Teacher teacher : teacherList) {
                teacherCombo.addElement(new Item(teacher.getId(), teacher.getName() + " " + teacher.getSurname()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showLessonCombo() {
        try {
            DefaultComboBoxModel lessonCombo = (DefaultComboBoxModel) lessonCmb.getModel();
            List<Lesson> lessonList = courseService.getLessonList();
            for (Lesson lesson : lessonList) {
                lessonCombo.addElement(new Item(lesson.getId(), lesson.getLessonName()));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
