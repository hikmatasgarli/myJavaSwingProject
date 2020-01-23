/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.course.gui;

import az.orient.course.model.Lesson;
import az.orient.course.model.Payment;
import az.orient.course.model.Student;
import az.orient.course.model.Teacher;
import az.orient.course.service.CourseService;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ideas.az
 */
public class MainFrame extends javax.swing.JFrame {

    private CourseService courseService;
    private String globBtnName = "123";

    public MainFrame() {
        initComponents();
    }

    public MainFrame(CourseService courseService) {
        initComponents();
        this.courseService = courseService;
        //   showStudentData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        studentDataBtn = new javax.swing.JButton();
        teacherDataBtn = new javax.swing.JButton();
        lessonDataBtn = new javax.swing.JButton();
        paymentDataBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        newBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        keywordTxt = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        studentDataMenu = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        teacherDataMenu = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        newPaymentMenu = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        studentDataBtn.setText("Student Data");
        studentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDataBtnActionPerformed(evt);
            }
        });

        teacherDataBtn.setText("Teacher Data");
        teacherDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDataBtnActionPerformed(evt);
            }
        });

        lessonDataBtn.setText("Lesson Data");
        lessonDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lessonDataBtnActionPerformed(evt);
            }
        });

        paymentDataBtn.setText("Payment Data");
        paymentDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentDataBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                    .addComponent(lessonDataBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teacherDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentDataBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(teacherDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lessonDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        newBtn.setText("New");
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        keywordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keywordTxtKeyReleased(evt);
            }
        });

        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(newBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delBtn)
                .addGap(349, 349, 349)
                .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn)
                    .addComponent(editBtn)
                    .addComponent(delBtn)
                    .addComponent(keywordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addContainerGap())
        );

        jMenu2.setText("Student");

        studentDataMenu.setText("Student Data");
        studentDataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentDataMenuActionPerformed(evt);
            }
        });
        jMenu2.add(studentDataMenu);

        jMenuItem3.setText("New Student");
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Teacher");

        teacherDataMenu.setText("Teacher Data");
        teacherDataMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDataMenuActionPerformed(evt);
            }
        });
        jMenu3.add(teacherDataMenu);

        jMenuItem5.setText("New Teacher");
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Lesson");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Payment");

        jMenuItem2.setText("Payment Data");
        jMenu5.add(jMenuItem2);

        newPaymentMenu.setText("New Payment");
        newPaymentMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPaymentMenuActionPerformed(evt);
            }
        });
        jMenu5.add(newPaymentMenu);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lessonDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lessonDataBtnActionPerformed
        globBtnName = "lesson";
        showLessonData();
    }//GEN-LAST:event_lessonDataBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        int rowIndex = jTable1.getSelectedRow();
        long selectedRow = (long) jTable1.getValueAt(rowIndex, 0);
        switch (globBtnName) {
            case "student":
                EditStudentFrame editStudentFrame = new EditStudentFrame(selectedRow, courseService);
                editStudentFrame.setVisible(true);
                break;
            case "teacher":

                break;
            case "lesson":

                break;
            case "payment":
                EditPaymentFrame editPaymentFrame = new EditPaymentFrame(selectedRow, courseService);
                editPaymentFrame.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please , select menu!", "Warning", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_editBtnActionPerformed

    private void studentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDataBtnActionPerformed
        try {
            globBtnName = "student";
            showStudentData(courseService.getStudentList());
            keywordTxt.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_studentDataBtnActionPerformed

    private void teacherDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDataBtnActionPerformed
        globBtnName = "teacher";
        keywordTxt.setText("");
        showTeacherData();
    }//GEN-LAST:event_teacherDataBtnActionPerformed

    private void teacherDataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDataMenuActionPerformed
        showTeacherData();
        keywordTxt.setText("");
    }//GEN-LAST:event_teacherDataMenuActionPerformed

    private void studentDataMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentDataMenuActionPerformed
        studentDataBtnActionPerformed(evt);
    }//GEN-LAST:event_studentDataMenuActionPerformed

    private void paymentDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentDataBtnActionPerformed
        globBtnName = "payment";
        showPaymentData();
        keywordTxt.setText("");
    }//GEN-LAST:event_paymentDataBtnActionPerformed

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed

        switch (globBtnName) {
            case "student":
                NewStudentFrame newStudentFrame = new NewStudentFrame(courseService);
                newStudentFrame.setVisible(true);
                break;
            case "teacher":

                break;
            case "lesson":

                break;
            case "payment":
                NewPaymentFrame newPaymentFrame = new NewPaymentFrame(courseService);
                newPaymentFrame.setVisible(true);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Please , select menu!", "Warning", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_newBtnActionPerformed

    private void newPaymentMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPaymentMenuActionPerformed
        NewPaymentFrame newPaymentFrame = new NewPaymentFrame(courseService);
        newPaymentFrame.setVisible(true);
    }//GEN-LAST:event_newPaymentMenuActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (evt.getClickCount() == 2) {
            editBtnActionPerformed(null);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        try {
            int rowIndex = jTable1.getSelectedRow();
            long selectedRow = (long) jTable1.getValueAt(rowIndex, 0);
            switch (globBtnName) {
                case "student":
                    int isMessage = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete Student", JOptionPane.YES_NO_OPTION);
                    if (isMessage == JOptionPane.YES_OPTION) {
                        boolean isDelete = courseService.deleteStudent(selectedRow);
                        if (isDelete) {
                            JOptionPane.showMessageDialog(null, "Student has been successfully deleted!");
                            showStudentData(courseService.getStudentList());
                        } else {
                            JOptionPane.showMessageDialog(null, "Problem! Student has not been successfully deleted!", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                case "teacher":

                    break;
                case "lesson":

                    break;
                case "payment":
                    //      NewPaymentFrame newPaymentFrame = new NewPaymentFrame(courseService);
                    //    newPaymentFrame.setVisible(true);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please , select menu!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        try {
            String keyword = keywordTxt.getText();
            switch (globBtnName) {
                case "student":
                    List<Student> studentList = courseService.searchStudentData(keyword);
                    showStudentData(studentList);
                    break;
                case "teacher":

                    break;
                case "lesson":

                    break;
                case "payment":

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Please , select menu!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void keywordTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keywordTxtKeyReleased
        searchBtnActionPerformed(null);
    }//GEN-LAST:event_keywordTxtKeyReleased

    private void showStudentData(List<Student> studentList) {
        try {
            DefaultTableModel model = new DefaultTableModel() {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("ID");
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of birth");
            model.addColumn("Phone");

            for (Student student : studentList) {
                Object[] data = new Object[]{
                    student.getId(), student.getR(), student.getName(), student.getSurname(), student.getAddress(), student.getDob(), student.getPhone()
                };
                model.addRow(data);
            }
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField keywordTxt;
    private javax.swing.JButton lessonDataBtn;
    private javax.swing.JButton newBtn;
    private javax.swing.JMenuItem newPaymentMenu;
    private javax.swing.JButton paymentDataBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton studentDataBtn;
    private javax.swing.JMenuItem studentDataMenu;
    private javax.swing.JButton teacherDataBtn;
    private javax.swing.JMenuItem teacherDataMenu;
    // End of variables declaration//GEN-END:variables

    private void showTeacherData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Name");
            model.addColumn("Surname");
            model.addColumn("Address");
            model.addColumn("Date of birth");
            List<Teacher> teacherList = courseService.getTeacherList();
            for (Teacher teacher : teacherList) {
                Object[] data = new Object[]{
                    teacher.getId(), teacher.getName(), teacher.getSurname(), teacher.getAddress(), teacher.getDob()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showLessonData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("№");
            model.addColumn("Lesson Name");
            model.addColumn("Lesson Time");
            model.addColumn("Lesson Price");
            List<Lesson> lessonList = courseService.getLessonList();
            for (Lesson lesson : lessonList) {
                Object[] data = new Object[]{
                    lesson.getId(), lesson.getLessonName(), lesson.getLessonTime(), lesson.getLessonPrice()
                };
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private void showPaymentData() {
        try {
            DefaultTableModel model = new DefaultTableModel() {

                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            jTable1.setModel(model);
            model.addColumn("ID");
            model.addColumn("№");
            model.addColumn("Student Fullname");
            model.addColumn("Lesson name");
            model.addColumn("Teacher Fullname");
            model.addColumn("Amount");
            model.addColumn("Payment Date");
            List<Payment> paymentList = courseService.getPaymentList();
            for (Payment payment : paymentList) {
                Object[] data = new Object[]{
                    payment.getId(), payment.getR(), payment.getStudent().getName() + " " + payment.getStudent().getSurname(),
                    payment.getLesson().getLessonName(), payment.getTeacher().getName() + " " + payment.getTeacher().getSurname(),
                    payment.getAmount(), payment.getPayDate()
                };
                jTable1.getColumnModel().getColumn(0).setMinWidth(0);
                jTable1.getColumnModel().getColumn(0).setWidth(0);
                jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
                model.addRow(data);
            }
            model.fireTableDataChanged();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
