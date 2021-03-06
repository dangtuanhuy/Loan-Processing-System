/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import data.ContractList;
import data.Customer;
import data.CustomerList;
import data.Details;
import data.DetailsList;
import data.Fine;
import data.FineList;
import data.MyLib;
import data.PlanPayment;
import java.awt.Color;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author tndkh_000
 */
public class PnDetail extends javax.swing.JPanel {

    /**
     * Creates new form PnDetail
     */
    public PnDetail() {
        initComponents();
        initData();
        
        txtLoan.setEnabled(false);
        txtName.setEnabled(false);
        txtNgayvay.setEnabled(false);
        txtPeriod.setEnabled(false);
        txtRemain.setEnabled(false);
        
    }
    
    JPanel PnShow;
    
    public PnDetail(JPanel PnShow) {
        
        this.PnShow = PnShow;
        initComponents();
        initData();
        
        txtLoan.setEnabled(false);
        txtName.setEnabled(false);
        txtNgayvay.setEnabled(false);
        txtPeriod.setEnabled(false);
        txtRemain.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtLoan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPeriod = new javax.swing.JTextField();
        txtRemain = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNgayvay = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtInden = new javax.swing.JTextField();
        cbContract = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDetail = new javax.swing.JTable();

        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(0, 0, 255), new java.awt.Color(153, 153, 255)));
        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER DETAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Agency FB", 1, 18), new java.awt.Color(0, 51, 255))); // NOI18N
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setText("Contrac No. :");

        jLabel1.setText("Name :");

        jLabel3.setText("Indentify Card :");

        jLabel4.setText("Loan Amout :");

        jLabel5.setText("Period :");

        jLabel6.setText("Remaining Amout :");

        txtNgayvay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgayvayActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày Vay :");

        txtInden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIndenActionPerformed(evt);
            }
        });

        cbContract.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Chọn HĐ" }));
        cbContract.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbContractFocusGained(evt);
            }
        });
        cbContract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbContractActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtInden, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbContract, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtName))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(53, 53, 53)
                                .addComponent(txtNgayvay, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(txtRemain, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtInden, txtLoan});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cbContract, txtNgayvay, txtPeriod});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(cbContract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtNgayvay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtRemain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtLoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtInden, txtLoan, txtName});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbContract, txtNgayvay, txtPeriod});

        add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tbDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Period", "Principal/Period", "Interes/Period", "Fine", "Amount", "Remain", "Payment Due", "Status", "Payment Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbDetail.setGridColor(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tbDetail);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
    DefaultComboBoxModel cbmodel;
    private void txtIndenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIndenActionPerformed
        String inden = txtInden.getText().trim();
        ContractList list = new ContractList();
        
        cbmodel = (DefaultComboBoxModel) cbContract.getModel();
        cbmodel.removeAllElements();
        if (!list.getContractID(inden).isEmpty()) {
            for (Integer a : list.getContractID(inden)) {
                cbmodel.addElement(a);
            }
            CustomerList clist = new CustomerList();
            Customer cus = clist.getcus(inden);
            txtName.setText(cus.name);
          
            
            
            
           
            
        } else {
            
            txtInden.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtIndenActionPerformed

    private void cbContractFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbContractFocusGained
         String inden = txtInden.getText().trim();
        ContractList list = new ContractList();
        
        cbmodel = (DefaultComboBoxModel) cbContract.getModel();
        cbmodel.removeAllElements();
        if (!list.getContractID(inden).isEmpty()) {
            for (Integer a : list.getContractID(inden)) {
                cbmodel.addElement(a);
            }
            CustomerList clist = new CustomerList();
            Customer cus = clist.getcus(inden);
            txtName.setText(cus.name);
          
            
            
            
           
            
        } else {
            
            txtInden.requestFocus();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbContractFocusGained

    private void cbContractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbContractActionPerformed
        
        if (cbmodel.getSize() != 0) {
            model.setRowCount(0);
            PlanPayment bl = new PlanPayment();
            for (PlanPayment item : bl.getacc(Integer.parseInt(cbContract.getSelectedItem().toString()))) {
                model.addRow(item.toVector2());
            }
            DetailsList list = new DetailsList();
            Details newdetails = new Details();
            newdetails = list.getdetail(Integer.parseInt(cbContract.getSelectedItem().toString()));
            PlanPayment Plan = new PlanPayment();
            int Paid = Plan.getremain(Integer.parseInt(cbContract.getSelectedItem().toString()));
            double remain = newdetails.loanAmount - Paid;
            NumberFormat fomat = new DecimalFormat("#,###.##");
            txtLoan.setText(fomat.format(newdetails.loanAmount));
            txtRemain.setText(fomat.format(remain));
            txtPeriod.setText(Integer.toString(newdetails.period));
            txtNgayvay.setText(newdetails.date);
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cbContractActionPerformed

    private void txtNgayvayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgayvayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgayvayActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbContract;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDetail;
    private javax.swing.JTextField txtInden;
    private javax.swing.JTextField txtLoan;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNgayvay;
    private javax.swing.JTextField txtPeriod;
    private javax.swing.JTextField txtRemain;
    // End of variables declaration//GEN-END:variables
    DefaultTableModel model;
    TableRowSorter<TableModel> sorter;
    ArrayList<Fine> fList;
    
    private void initData() {
        model = (DefaultTableModel) tbDetail.getModel();
        sorter = (TableRowSorter<TableModel>) tbDetail.getRowSorter();
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tbDetail.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tbDetail.getColumnModel().getColumn(1).setCellRenderer(rightRenderer);
        tbDetail.getColumnModel().getColumn(2).setCellRenderer(rightRenderer);
        tbDetail.getColumnModel().getColumn(3).setCellRenderer(rightRenderer);
        tbDetail.getColumnModel().getColumn(4).setCellRenderer(rightRenderer);
        tbDetail.getColumnModel().getColumn(5).setCellRenderer(rightRenderer);
        tbDetail.getColumnModel().getColumn(6).setCellRenderer(centerRenderer);
        tbDetail.getColumnModel().getColumn(7).setCellRenderer(centerRenderer);
        tbDetail.setShowGrid(true);
        
        tbDetail.getTableHeader().setOpaque(false);
        tbDetail.getTableHeader().setBackground(Color.blue);
        tbDetail.getTableHeader().setForeground(Color.blue);
        FineList fl = new FineList();
        fList = fl.getList();
        

//        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
//        headerRenderer.setBackground(Color.blue);
//        headerRenderer.setForeground(Color.white);
//        
//        for (int i = 0; i < tbDetail.getModel().getColumnCount(); i++) {
//            tbDetail.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
//        }
    }
}
