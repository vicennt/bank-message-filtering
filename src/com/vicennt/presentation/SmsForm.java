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
public class SmsForm extends NapierBankFormBase {

    /**
     * Creates new form SmsForm
     */
    public SmsForm(INapierBankService service) {
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

        mainSmsPanel = new javax.swing.JPanel();
        lblSmsMsgId = new javax.swing.JLabel();
        lblTelephone = new javax.swing.JLabel();
        lblSmsBody = new javax.swing.JLabel();
        txtSmsId = new javax.swing.JTextField();
        txtSmsPhone = new javax.swing.JTextField();
        scrollSmsBody = new javax.swing.JScrollPane();
        txtSmsBody = new javax.swing.JTextArea();
        txtSmsType = new javax.swing.JTextField();
        btnSendSms = new javax.swing.JButton();
        lblSmsTitle = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 800));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        mainSmsPanel.setMinimumSize(new java.awt.Dimension(700, 700));

        lblSmsMsgId.setText("Message ID");

        lblTelephone.setText("Telephone");

        lblSmsBody.setText("Message body");

        txtSmsId.setToolTipText("");

        txtSmsBody.setColumns(20);
        txtSmsBody.setRows(5);
        scrollSmsBody.setViewportView(txtSmsBody);

        txtSmsType.setFont(new java.awt.Font("Ubuntu", 1, 29)); // NOI18N
        txtSmsType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSmsType.setText("S");
        txtSmsType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSmsTypeActionPerformed(evt);
            }
        });

        btnSendSms.setText("Send message");

        lblSmsTitle.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblSmsTitle.setText("Write an SMS");

        javax.swing.GroupLayout mainSmsPanelLayout = new javax.swing.GroupLayout(mainSmsPanel);
        mainSmsPanel.setLayout(mainSmsPanelLayout);
        mainSmsPanelLayout.setHorizontalGroup(
            mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSmsPanelLayout.createSequentialGroup()
                .addGroup(mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainSmsPanelLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSendSms)
                            .addGroup(mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblSmsMsgId, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTelephone, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblSmsBody, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSmsPhone, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainSmsPanelLayout.createSequentialGroup()
                                        .addComponent(txtSmsType, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSmsId, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(scrollSmsBody, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainSmsPanelLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(lblSmsTitle)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        mainSmsPanelLayout.setVerticalGroup(
            mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainSmsPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSmsTitle)
                .addGap(42, 42, 42)
                .addComponent(lblSmsMsgId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainSmsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSmsId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSmsType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(lblTelephone)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSmsPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSmsBody)
                .addGap(18, 18, 18)
                .addComponent(scrollSmsBody, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendSms)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainSmsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainSmsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSmsTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSmsTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSmsTypeActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendSms;
    private javax.swing.JLabel lblSmsBody;
    private javax.swing.JLabel lblSmsMsgId;
    private javax.swing.JLabel lblSmsTitle;
    private javax.swing.JLabel lblTelephone;
    private javax.swing.JPanel mainSmsPanel;
    private javax.swing.JScrollPane scrollSmsBody;
    private javax.swing.JTextArea txtSmsBody;
    private javax.swing.JTextField txtSmsId;
    private javax.swing.JTextField txtSmsPhone;
    private javax.swing.JTextField txtSmsType;
    // End of variables declaration//GEN-END:variables
}
