/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.Customer;
import data.CustomerList;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author tndkh_000
 */
public class PnUpdate extends javax.swing.JPanel {

    /**
     * Creates new form PnUpdateCus
     */
    Customer cuss;
    JPanel PnShow;

    public PnUpdate(JPanel PnShow) {

        this.PnShow = PnShow;
        initComponents();
//        cuss = cus;
//        txtindentify.setText(cus.icard);
//        txtAcc.setText(Integer.toString(cus.acc));
//        txtAddress.setText(cus.address);
//        txtDob.setDate(cus.Dob);
//        txtJob.setText(cus.organization);
//        txtPhone.setText(cus.phone);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btnAppcept = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtindentify = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtAcc = new javax.swing.JTextField();
        txtDob = new com.toedter.calendar.JDateChooser();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JFormattedTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtJob = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "UPDATE CUSTOMER DETAILS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 24), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnAppcept.setText("Update");
        btnAppcept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppceptActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 308, 38, 0);
        jPanel1.add(btnAppcept, gridBagConstraints);

        jLabel14.setText("Indentify Card :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 6, 0, 0);
        jPanel1.add(jLabel14, gridBagConstraints);

        txtindentify.setMaximumSize(new java.awt.Dimension(0, 30));
        txtindentify.setMinimumSize(new java.awt.Dimension(0, 30));
        txtindentify.setName(""); // NOI18N
        txtindentify.setPreferredSize(new java.awt.Dimension(0, 30));
        txtindentify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtindentifyActionPerformed(evt);
            }
        });
        txtindentify.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtindentifyKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 4, 0, 0);
        jPanel1.add(txtindentify, gridBagConstraints);

        jLabel15.setText("Account No. :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(65, 85, 0, 0);
        jPanel1.add(jLabel15, gridBagConstraints);

        txtAcc.setEditable(false);
        txtAcc.setMaximumSize(new java.awt.Dimension(0, 30));
        txtAcc.setMinimumSize(new java.awt.Dimension(0, 30));
        txtAcc.setPreferredSize(new java.awt.Dimension(0, 30));
        txtAcc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAccFocusGained(evt);
            }
        });
        txtAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(57, 4, 0, 13);
        jPanel1.add(txtAcc, gridBagConstraints);

        txtDob.setMaximumSize(new java.awt.Dimension(0, 30));
        txtDob.setMinimumSize(new java.awt.Dimension(0, 30));
        txtDob.setPreferredSize(new java.awt.Dimension(0, 30));
        txtDob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDobKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 254;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel1.add(txtDob, gridBagConstraints);

        txtName.setMaximumSize(new java.awt.Dimension(0, 30));
        txtName.setMinimumSize(new java.awt.Dimension(0, 30));
        txtName.setPreferredSize(new java.awt.Dimension(0, 30));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel1.add(txtName, gridBagConstraints);

        jLabel2.setText("Full Name :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 23, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("DoB :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 15, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel8.setText("Phone :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 4, 0, 0);
        jPanel1.add(jLabel8, gridBagConstraints);

        txtPhone.setMaximumSize(new java.awt.Dimension(0, 30));
        txtPhone.setMinimumSize(new java.awt.Dimension(0, 30));
        txtPhone.setPreferredSize(new java.awt.Dimension(0, 30));
        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneKeyPressed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 275;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 13);
        jPanel1.add(txtPhone, gridBagConstraints);

        txtAddress.setMaximumSize(new java.awt.Dimension(0, 30));
        txtAddress.setMinimumSize(new java.awt.Dimension(0, 30));
        txtAddress.setPreferredSize(new java.awt.Dimension(0, 30));
        txtAddress.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAddressFocusGained(evt);
            }
        });
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel1.add(txtAddress, gridBagConstraints);

        jLabel4.setText("Address :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 29, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setText("Company :");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 23, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        txtJob.setMaximumSize(new java.awt.Dimension(0, 30));
        txtJob.setMinimumSize(new java.awt.Dimension(0, 30));
        txtJob.setPreferredSize(new java.awt.Dimension(0, 30));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 360;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 4, 0, 0);
        jPanel1.add(txtJob, gridBagConstraints);

        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 36, 38, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAppceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppceptActionPerformed

        String name = txtName.getText().trim();
        String Add = txtAddress.getText().trim();
        String organization = txtJob.getText().trim();

        String phone = txtPhone.getText().trim();
        if (txtindentify.getText().trim().length() != 9) {
            JOptionPane.showMessageDialog(null, "Indentify 's lenght must be 9");
            txtindentify.requestFocus();
        } else if (txtName.getText().trim().length() < 10) {
            JOptionPane.showMessageDialog(null, "Name's length must over 10");
            txtName.requestFocus();
        } else if (txtAddress.getText().trim().length() < 15) {
            JOptionPane.showMessageDialog(null, "Address's length must over 10");
            txtAddress.requestFocus();
        } else if (txtJob.getText().trim().length() < 1) {
            JOptionPane.showMessageDialog(null, "Company cannot blank");
            txtJob.requestFocus();

        } else if (txtPhone.getText().trim().length() < 9 || txtPhone.getText().trim().length() > 15) {
            JOptionPane.showMessageDialog(null, "Phone's lenght must more than 9 and less than 15");
            txtPhone.requestFocus();
        } else if (txtDob.getDateFormatString().isEmpty()) {
            JOptionPane.showMessageDialog(null, "DoB cannot blank");
            txtDob.requestFocus();
        } else if (!checkdob()) {

        } else {
            java.util.Date utilDate = new java.util.Date();
            utilDate = txtDob.getDate();
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            Customer cus = new Customer(cuss.acc, name, cuss.icard, sqlDate, Add, organization, phone, cuss.salary);
            CustomerList cl = new CustomerList();
            cl.update(cus);
            JOptionPane.showMessageDialog(null, "Update Successfully !");

        }


    }//GEN-LAST:event_btnAppceptActionPerformed

    private void txtindentifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtindentifyActionPerformed
        if (txtindentify.getText().trim().length() != 9) {
            txtindentify.requestFocus();
            JOptionPane.showMessageDialog(null, "Indentify 's lenght must be 9");
            
        } else {
            CustomerList cl = new CustomerList();
            cuss = cl.getcus(txtindentify.getText());
            if (cuss == null) {
                txtindentify.requestFocus();
                JOptionPane.showMessageDialog(null, "Indentify is not correct");

            } else {
                txtindentify.setText(cuss.icard);
                txtName.setText(cuss.name);
                txtAcc.setText(Integer.toString(cuss.acc));
                txtAddress.setText(cuss.address);
                txtDob.setDate(cuss.Dob);
                txtJob.setText(cuss.organization);
                txtPhone.setText(cuss.phone);
                txtindentify.setEnabled(false);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtindentifyActionPerformed

    private void txtAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccActionPerformed

    private void txtDobKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDobKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobKeyPressed

    private void txtPhoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyPressed
        txtPhone.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneKeyPressed

    private void txtAddressFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAddressFocusGained
        checkdob();

        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressFocusGained

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed

    private void txtAccFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAccFocusGained
        if (txtindentify.getText().trim().length() != 9) {

            txtindentify.requestFocus();
            JOptionPane.showMessageDialog(null, "Indentify 's lenght must be 9");

        } else {
            CustomerList cl = new CustomerList();
            cuss = cl.getcus(txtindentify.getText());
            if (cuss == null) {
                txtindentify.requestFocus();
                JOptionPane.showMessageDialog(null, "Indentify is not correct");

            } else {
                txtindentify.setText(cuss.icard);
                txtName.setText(cuss.name);
                txtAcc.setText(Integer.toString(cuss.acc));
                txtAddress.setText(cuss.address);
                txtDob.setDate(cuss.Dob);
                txtJob.setText(cuss.organization);
                txtPhone.setText(cuss.phone);
                txtindentify.setEnabled(false);
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_txtAccFocusGained

    private void txtindentifyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtindentifyKeyPressed
        txtindentify.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                char vChar = e.getKeyChar();
                if (!(Character.isDigit(vChar)
                        || (vChar == KeyEvent.VK_BACK_SPACE)
                        || (vChar == KeyEvent.VK_DELETE))) {
                    e.consume();
                }
            }
        });          // TODO add your handling code here:
    }//GEN-LAST:event_txtindentifyKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        txtindentify.setText(null);
        txtName.setText(null);
        txtAcc.setText(null);
        txtAddress.setText(null);
        txtDob.setDate(null);
        txtJob.setText(null);
        txtPhone.setText(null);
        txtindentify.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        if (txtindentify.getText().trim().length() != 9) {
            txtindentify.requestFocus();
            JOptionPane.showMessageDialog(null, "Indentify 's lenght must be 9");

        } else {
            CustomerList cl = new CustomerList();
            cuss = cl.getcus(txtindentify.getText());
            if (cuss == null) {
                txtindentify.requestFocus();
                JOptionPane.showMessageDialog(null, "Indentify is not correct");

            } else {
                txtindentify.setText(cuss.icard);
                txtName.setText(cuss.name);
                txtAcc.setText(Integer.toString(cuss.acc));
                txtAddress.setText(cuss.address);
                txtDob.setDate(cuss.Dob);
                txtJob.setText(cuss.organization);
                txtPhone.setText(cuss.phone);
                txtindentify.setEnabled(false);
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameFocusGained
    private boolean checkdob() {
        boolean check = true;
        Calendar dob = Calendar.getInstance();
        try {
            dob.setTime(txtDob.getDate());
            Calendar today = Calendar.getInstance();
            int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
            if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
                age--;
            } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
                age--;
            }

            if (age < 18) {
                txtDob.requestFocus();
                JOptionPane.showMessageDialog(null, "Customer must over 18 years old");
                check = false;

            }
        } catch (Exception e) {
            txtDob.requestFocus();
            JOptionPane.showMessageDialog(null, "Date format is incorrect");
            check = false;

        }
        return check;

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppcept;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAcc;
    private javax.swing.JTextField txtAddress;
    private com.toedter.calendar.JDateChooser txtDob;
    private javax.swing.JTextField txtJob;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPhone;
    private javax.swing.JTextField txtindentify;
    // End of variables declaration//GEN-END:variables
}
