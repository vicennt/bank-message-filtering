/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;
import java.util.ArrayList;

/**
 * This form shows each message readed
 * @author vicent
 */
public class ReadMessages extends NapierBankFormBase {

    /**
     * Creates new form ReadMessages
     * @param service
     */
    
    private ArrayList messages;
    private int index;
    public ReadMessages(INapierBankService service, ArrayList messages) {
        super(service);
        initComponents();
        if(messages != null){
            this.messages = messages;
            index = 0;
            btnPrevious.setEnabled(false);
            if(messages.size() <= 1)
                btnNext.setEnabled(false);
        }
        showMessages(index);
    }

    private void showMessages(int index){
        txtMessagesReaded.setText(messages.get(index).toString());
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        scrollMessagesReaded = new javax.swing.JScrollPane();
        txtMessagesReaded = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        lblNext = new javax.swing.JLabel();
        lblPrevious = new javax.swing.JLabel();

        txtMessagesReaded.setEditable(false);
        txtMessagesReaded.setColumns(20);
        txtMessagesReaded.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        txtMessagesReaded.setRows(5);
        scrollMessagesReaded.setViewportView(txtMessagesReaded);

        lblTitle.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("MESSAGE READER");

        btnPrevious.setText("<");
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setText(">");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        lblNext.setText("Next");

        lblPrevious.setText("Previous");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollMessagesReaded, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(53, 53, 53)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(mainPanelLayout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(lblPrevious)
                                    .addGap(205, 205, 205)
                                    .addComponent(lblNext))))
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle)
                .addGap(41, 41, 41)
                .addComponent(scrollMessagesReaded, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevious)
                    .addComponent(btnNext))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrevious)
                    .addComponent(lblNext))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        if(index == 0){
            btnPrevious.setEnabled(false);
        }
        index--;
        showMessages(index);
        btnNext.setEnabled(true);
     
                
    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        index++;
        if(index == messages.size() -1){
            btnNext.setEnabled(false);
        }
        showMessages(index);
        btnPrevious.setEnabled(true);             
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblPrevious;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollMessagesReaded;
    private javax.swing.JTextArea txtMessagesReaded;
    // End of variables declaration//GEN-END:variables
}
