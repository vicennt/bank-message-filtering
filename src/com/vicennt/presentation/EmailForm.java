/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;

/**
 *
 * @author vicent
 */
public class EmailForm extends NapierBankFormBase{

    /**
     * Creates new form EmailForm
     */
    public EmailForm(INapierBankService service) {
        super(service);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainEmailPanel = new javax.swing.JPanel();
        lblEmailTitle = new javax.swing.JLabel();
        lblEmailAddress = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        lblEmailType = new javax.swing.JLabel();
        lblEmailSubject = new javax.swing.JLabel();
        txtEmailSubject = new javax.swing.JTextField();
        rbtEmailStandard = new javax.swing.JRadioButton();
        rbtEmailIncident = new javax.swing.JRadioButton();
        lblEmailBody = new javax.swing.JLabel();
        scrollEmailBody = new javax.swing.JScrollPane();
        txtEmailBody = new javax.swing.JTextArea();
        btnSendEmail = new javax.swing.JButton();
        lblEmailId = new javax.swing.JLabel();
        txtEmailType = new javax.swing.JTextField();
        txtEmailId = new javax.swing.JTextField();
        comboEmailIncident = new javax.swing.JComboBox<>();
        lblEmailIncident = new javax.swing.JLabel();

        setResizable(false);

        lblEmailTitle.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblEmailTitle.setText("Write an Email");

        lblEmailAddress.setText("Address");

        lblEmailType.setText("Type of email");

        lblEmailSubject.setText("Subject");

        rbtEmailStandard.setText("Standard Email Message");
        rbtEmailStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmailStandardActionPerformed(evt);
            }
        });

        rbtEmailIncident.setText("Significant Incident Report");
        rbtEmailIncident.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEmailIncidentActionPerformed(evt);
            }
        });

        lblEmailBody.setText("Body");

        txtEmailBody.setColumns(20);
        txtEmailBody.setRows(5);
        scrollEmailBody.setViewportView(txtEmailBody);

        btnSendEmail.setText("Send email");
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });

        lblEmailId.setText("Message ID");

        txtEmailType.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtEmailType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtEmailType.setText("E");

        comboEmailIncident.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblEmailIncident.setText("Nature of Incident");

        javax.swing.GroupLayout mainEmailPanelLayout = new javax.swing.GroupLayout(mainEmailPanel);
        mainEmailPanel.setLayout(mainEmailPanelLayout);
        mainEmailPanelLayout.setHorizontalGroup(
            mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainEmailPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainEmailPanelLayout.createSequentialGroup()
                        .addComponent(lblEmailTitle)
                        .addGap(243, 243, 243))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainEmailPanelLayout.createSequentialGroup()
                        .addComponent(btnSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmailType))
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmailId))
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                                .addComponent(rbtEmailStandard)
                                .addGap(111, 111, 111)
                                .addComponent(lblEmailIncident))
                            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                                .addComponent(rbtEmailIncident)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(comboEmailIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtEmailType, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmailSubject)
                            .addComponent(lblEmailBody)))
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblEmailAddress)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(scrollEmailBody)
                    .addComponent(txtEmailSubject))
                .addGap(63, 63, 63))
        );
        mainEmailPanelLayout.setVerticalGroup(
            mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblEmailTitle)
                .addGap(37, 37, 37)
                .addComponent(lblEmailId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblEmailType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtEmailStandard)
                    .addComponent(lblEmailIncident))
                .addGap(18, 18, 18)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtEmailIncident)
                    .addComponent(comboEmailIncident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailAddress))
                .addGap(18, 18, 18)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmailSubject)
                    .addComponent(txtEmailSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(lblEmailBody)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollEmailBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendEmail)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEmailIncidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmailIncidentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtEmailIncidentActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void rbtEmailStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmailStandardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtEmailStandardActionPerformed

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendEmail;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboEmailIncident;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmailBody;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEmailIncident;
    private javax.swing.JLabel lblEmailSubject;
    private javax.swing.JLabel lblEmailTitle;
    private javax.swing.JLabel lblEmailType;
    private javax.swing.JPanel mainEmailPanel;
    private javax.swing.JRadioButton rbtEmailIncident;
    private javax.swing.JRadioButton rbtEmailStandard;
    private javax.swing.JScrollPane scrollEmailBody;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextArea txtEmailBody;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmailSubject;
    private javax.swing.JTextField txtEmailType;
    // End of variables declaration//GEN-END:variables
}