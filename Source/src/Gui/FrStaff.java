/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.User;
import java.io.File;
import javax.swing.JOptionPane;

/**
 *
 * @author tndkh_000
 */
public class FrStaff extends javax.swing.JFrame {

    /**
     * Creates new form FrStaff
     */
    public FrStaff() {
        initComponents();
        
    }
    User user;
    
    public FrStaff(int role, User u) {
        
        initComponents();
        setLocationRelativeTo(this);
        user = u;
        
        if (role == 3) {
            this.Jmenu.remove(txtApproveAdmin);
            this.Jmenu.remove(btnUser);
            this.Jmenu.remove(btnLoanType);
            this.Jmenu.remove(btnGrad);
            this.Jmenu.remove(btnUpdateCus);
            this.Jmenu.invalidate();
        } else if (role == 2) {
            
            this.Jmenu.remove(btnNewCus);
            this.Jmenu.remove(btnStatusApp);
            this.Jmenu.remove(btnUser);
            this.Jmenu.remove(btnPayment);
            
            this.Jmenu.invalidate();
            
        } else if (role == 1) {
            this.Jmenu.remove(txtApproveAdmin);
            this.Jmenu.remove(btnListCus);
            this.Jmenu.remove(btnNewCus);
            this.Jmenu.remove(btnStatusApp);
            this.Jmenu.remove(btnPayment);
            this.Jmenu.remove(btnLate);
            this.Jmenu.remove(btnLoanType);
            this.Jmenu.remove(btnGrad);
            this.Jmenu.remove(btnDetailCus);
            this.Jmenu.remove(btnUpdateCus);
            
            this.Jmenu.invalidate();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PnBanner = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        slider1 = new data.Slider();
        jSplitPane1 = new javax.swing.JSplitPane();
        PnShow = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Jmenu = new javax.swing.JPanel();
        btnNewCus = new javax.swing.JButton();
        btnDetailCus = new javax.swing.JButton();
        btnListCus = new javax.swing.JButton();
        btnLate = new javax.swing.JButton();
        btnStatusApp = new javax.swing.JButton();
        btnGrad = new javax.swing.JButton();
        txtApproveAdmin = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();
        btnLoanType = new javax.swing.JButton();
        btnUpdateCus = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOAN APPLICATION");
        setResizable(false);

        PnBanner.setBackground(new java.awt.Color(255, 204, 204));
        PnBanner.setLayout(new java.awt.BorderLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Fotor0811195259.jpg"))); // NOI18N
        PnBanner.add(jLabel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(PnBanner, java.awt.BorderLayout.PAGE_START);

        jSplitPane1.setDividerSize(0);
        jSplitPane1.setEnabled(false);
        jSplitPane1.setPreferredSize(new java.awt.Dimension(975, 400));

        PnShow.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PnShow.setPreferredSize(new java.awt.Dimension(800, 400));
        PnShow.setLayout(new java.awt.BorderLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Banner-2d-1100x400.png"))); // NOI18N
        PnShow.add(jLabel1, java.awt.BorderLayout.CENTER);

        jSplitPane1.setRightComponent(PnShow);
        PnShow.getAccessibleContext().setAccessibleParent(this);

        Jmenu.setBackground(new java.awt.Color(153, 153, 255));
        Jmenu.setLayout(new java.awt.GridLayout(4, 1));

        btnNewCus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnNewCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add-Male-User-icon.png"))); // NOI18N
        btnNewCus.setText("New Request");
        btnNewCus.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        btnNewCus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNewCus.setIconTextGap(0);
        btnNewCus.setMaximumSize(new java.awt.Dimension(100, 50));
        btnNewCus.setMinimumSize(new java.awt.Dimension(100, 50));
        btnNewCus.setPreferredSize(new java.awt.Dimension(100, 50));
        btnNewCus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNewCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCusActionPerformed(evt);
            }
        });
        Jmenu.add(btnNewCus);

        btnDetailCus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnDetailCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1409471442_preferences-contact-list.png"))); // NOI18N
        btnDetailCus.setText("Customer Detail");
        btnDetailCus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDetailCus.setIconTextGap(0);
        btnDetailCus.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnDetailCus.setMaximumSize(new java.awt.Dimension(100, 50));
        btnDetailCus.setMinimumSize(new java.awt.Dimension(100, 50));
        btnDetailCus.setPreferredSize(new java.awt.Dimension(100, 50));
        btnDetailCus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDetailCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailCusActionPerformed(evt);
            }
        });
        Jmenu.add(btnDetailCus);

        btnListCus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnListCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1409471381_human-folder-public.png"))); // NOI18N
        btnListCus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnListCus.setLabel("List Customers");
        btnListCus.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnListCus.setMaximumSize(new java.awt.Dimension(100, 50));
        btnListCus.setMinimumSize(new java.awt.Dimension(100, 50));
        btnListCus.setPreferredSize(new java.awt.Dimension(100, 50));
        btnListCus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnListCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListCusActionPerformed(evt);
            }
        });
        Jmenu.add(btnListCus);

        btnLate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnLate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user_warning.png"))); // NOI18N
        btnLate.setText("Late List");
        btnLate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLate.setMaximumSize(new java.awt.Dimension(100, 50));
        btnLate.setMinimumSize(new java.awt.Dimension(100, 50));
        btnLate.setPreferredSize(new java.awt.Dimension(100, 50));
        btnLate.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLateActionPerformed(evt);
            }
        });
        Jmenu.add(btnLate);

        btnStatusApp.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        btnStatusApp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Accept-Male-User-icon.png"))); // NOI18N
        btnStatusApp.setText("Results");
        btnStatusApp.setAlignmentY(0.0F);
        btnStatusApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnStatusApp.setMargin(new java.awt.Insets(0, 0, 0, 0));
        btnStatusApp.setMaximumSize(new java.awt.Dimension(100, 50));
        btnStatusApp.setMinimumSize(new java.awt.Dimension(100, 50));
        btnStatusApp.setPreferredSize(new java.awt.Dimension(100, 50));
        btnStatusApp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnStatusApp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatusAppActionPerformed(evt);
            }
        });
        Jmenu.add(btnStatusApp);

        btnGrad.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnGrad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Grade-icon.png"))); // NOI18N
        btnGrad.setText("Grade List");
        btnGrad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGrad.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGradActionPerformed(evt);
            }
        });
        Jmenu.add(btnGrad);

        txtApproveAdmin.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        txtApproveAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1409471471_stock_task.png"))); // NOI18N
        txtApproveAdmin.setText("Pennding");
        txtApproveAdmin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        txtApproveAdmin.setMargin(new java.awt.Insets(2, 0, 2, 0));
        txtApproveAdmin.setMaximumSize(new java.awt.Dimension(100, 50));
        txtApproveAdmin.setMinimumSize(new java.awt.Dimension(100, 50));
        txtApproveAdmin.setPreferredSize(new java.awt.Dimension(100, 50));
        txtApproveAdmin.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        txtApproveAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApproveAdminActionPerformed(evt);
            }
        });
        Jmenu.add(txtApproveAdmin);

        btnPayment.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnPayment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1409989246_Money (1).png"))); // NOI18N
        btnPayment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPayment.setLabel("Payment");
        btnPayment.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnPayment.setMaximumSize(new java.awt.Dimension(100, 50));
        btnPayment.setMinimumSize(new java.awt.Dimension(100, 50));
        btnPayment.setPreferredSize(new java.awt.Dimension(100, 50));
        btnPayment.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });
        Jmenu.add(btnPayment);

        btnUser.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin (1).png"))); // NOI18N
        btnUser.setText("User");
        btnUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUser.setMargin(new java.awt.Insets(2, 8, 2, 14));
        btnUser.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        Jmenu.add(btnUser);

        btnLoanType.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnLoanType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bw.loan.png"))); // NOI18N
        btnLoanType.setText("Loan Type");
        btnLoanType.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnLoanType.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnLoanType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoanTypeActionPerformed(evt);
            }
        });
        Jmenu.add(btnLoanType);

        btnUpdateCus.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnUpdateCus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Edit-Male-User-icon.png"))); // NOI18N
        btnUpdateCus.setText("Update Cus");
        btnUpdateCus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUpdateCus.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUpdateCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCusActionPerformed(evt);
            }
        });
        Jmenu.add(btnUpdateCus);

        jSplitPane1.setLeftComponent(Jmenu);

        javax.swing.GroupLayout slider1Layout = new javax.swing.GroupLayout(slider1);
        slider1.setLayout(slider1Layout);
        slider1Layout.setHorizontalGroup(
            slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
            .addGroup(slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(slider1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        slider1Layout.setVerticalGroup(
            slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
            .addGroup(slider1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(slider1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(slider1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setAutoscrolls(true);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuBar1.setVerifyInputWhenFocusTarget(false);

        jMenu1.setText("File");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Register-icon.png"))); // NOI18N
        jMenuItem5.setText("Change Pass");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Log-Out-icon.png"))); // NOI18N
        jMenuItem1.setText("Log out");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Action-exit-icon.png"))); // NOI18N
        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/FAQ-icon.png"))); // NOI18N
        jMenuItem3.setText("Help...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Actions-help-about-icon.png"))); // NOI18N
        jMenuItem4.setText("About Us");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStatusAppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatusAppActionPerformed
        PnShow.removeAll();
        PnApprovedStaff a = new PnApprovedStaff(PnShow);
        PnShow.add(a);
        validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnStatusAppActionPerformed

    private void btnLateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLateActionPerformed
        PnShow.removeAll();
        pnOverduePayment a = new pnOverduePayment();
        PnShow.add(a);
        this.revalidate();
    }//GEN-LAST:event_btnLateActionPerformed

    private void btnListCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListCusActionPerformed
        PnShow.removeAll();
        PnListOfCustomer a = new PnListOfCustomer(PnShow);
        PnShow.add(a);
        validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnListCusActionPerformed

    private void btnDetailCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailCusActionPerformed
        PnShow.removeAll();
        PnDetail a = new PnDetail(PnShow);
        PnShow.add(a);
        validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnDetailCusActionPerformed

    private void btnNewCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCusActionPerformed
        PnShow.removeAll();
        PnCheckGrade a = new PnCheckGrade(PnShow);
        //PnCheckGrade a = new PnCheckGrade();

        PnShow.add(a);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnNewCusActionPerformed

    private void txtApproveAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApproveAdminActionPerformed
        PnShow.removeAll();
        PnApproved a = new PnApproved(PnShow);
        PnShow.add(a);
        validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtApproveAdminActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        PnShow.removeAll();
        PnPayment a = new PnPayment(PnShow);
        PnShow.add(a);
        validate();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        PnShow.removeAll();
        PnUser a = new PnUser(PnShow);
        PnShow.add(a);
        validate();

// TODO add your handling code here:
    }//GEN-LAST:event_btnUserActionPerformed

    private void btnGradActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGradActionPerformed
        PnShow.removeAll();
        PnGradeList a = new PnGradeList(PnShow);
        PnShow.add(a);
        validate();
    }//GEN-LAST:event_btnGradActionPerformed

    private void btnLoanTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoanTypeActionPerformed
        PnShow.removeAll();
        PnLoanType a = new PnLoanType(PnShow);
        PnShow.add(a);
        validate();

// TODO add your handling code here:
    }//GEN-LAST:event_btnLoanTypeActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        try {
            String path = new File("").getAbsolutePath() + "\\Help.chm";
            File f = new File(path);
            
            if (f.exists()) {
                Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler " + path);
            } else {
                throw new Exception("Error !!!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        FrChangePass n = new FrChangePass(user);
        n.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.dispose();
        FrLogin1 n = new FrLogin1();
        n.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnUpdateCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCusActionPerformed
        PnShow.removeAll();
        PnUpdate a = new PnUpdate(PnShow);
        PnShow.add(a);
        validate();

// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateCusActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        int reply = JOptionPane.showConfirmDialog(null, "Exit Application ?", "Exit", 2);
        if (reply == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
FrAboutUs N = new FrAboutUs();
N.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jmenu;
    private javax.swing.JPanel PnBanner;
    private javax.swing.JPanel PnShow;
    private javax.swing.JButton btnDetailCus;
    private javax.swing.JButton btnGrad;
    private javax.swing.JButton btnLate;
    private javax.swing.JButton btnListCus;
    private javax.swing.JButton btnLoanType;
    private javax.swing.JButton btnNewCus;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnStatusApp;
    private javax.swing.JButton btnUpdateCus;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSplitPane jSplitPane1;
    private data.Slider slider1;
    private javax.swing.JButton txtApproveAdmin;
    // End of variables declaration//GEN-END:variables
}