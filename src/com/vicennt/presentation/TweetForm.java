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
public class TweetForm extends NapierBankFormBase {

    /**
     * Creates new form TweetForm
     */
    public TweetForm(INapierBankService service) {
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

        mainTweetPanel = new javax.swing.JPanel();
        lblTweetTitle = new javax.swing.JLabel();
        lblTweetId = new javax.swing.JLabel();
        txtTweetType = new javax.swing.JTextField();
        txtTweetId = new javax.swing.JTextField();
        lblTweetUser = new javax.swing.JLabel();
        txtTweetUser = new javax.swing.JTextField();
        lblTweetBody = new javax.swing.JLabel();
        scrollTweetBody = new javax.swing.JScrollPane();
        txtTweetBody = new javax.swing.JTextArea();
        btnSendTweet = new javax.swing.JButton();

        lblTweetTitle.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblTweetTitle.setText("Write an Tweet");

        lblTweetId.setText("ID Message");

        txtTweetType.setFont(new java.awt.Font("Ubuntu", 1, 29)); // NOI18N
        txtTweetType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTweetType.setText("T");

        txtTweetId.setFont(new java.awt.Font("Ubuntu", 0, 29)); // NOI18N

        lblTweetUser.setText("Twitter user");

        lblTweetBody.setText("Tweet body");

        txtTweetBody.setColumns(20);
        txtTweetBody.setRows(5);
        scrollTweetBody.setViewportView(txtTweetBody);

        btnSendTweet.setText("Send Tweet");

        javax.swing.GroupLayout mainTweetPanelLayout = new javax.swing.GroupLayout(mainTweetPanel);
        mainTweetPanel.setLayout(mainTweetPanelLayout);
        mainTweetPanelLayout.setHorizontalGroup(
            mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTweetPanelLayout.createSequentialGroup()
                .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainTweetPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSendTweet)
                            .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblTweetId)
                                .addGroup(mainTweetPanelLayout.createSequentialGroup()
                                    .addComponent(txtTweetType, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTweetId, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lblTweetUser)
                                .addComponent(txtTweetUser, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTweetBody)
                                .addComponent(scrollTweetBody, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainTweetPanelLayout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(lblTweetTitle)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        mainTweetPanelLayout.setVerticalGroup(
            mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTweetPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTweetTitle)
                .addGap(54, 54, 54)
                .addComponent(lblTweetId)
                .addGap(18, 18, 18)
                .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTweetType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTweetId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(lblTweetUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTweetUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(lblTweetBody)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scrollTweetBody, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSendTweet)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTweetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTweetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendTweet;
    private javax.swing.JLabel lblTweetBody;
    private javax.swing.JLabel lblTweetId;
    private javax.swing.JLabel lblTweetTitle;
    private javax.swing.JLabel lblTweetUser;
    private javax.swing.JPanel mainTweetPanel;
    private javax.swing.JScrollPane scrollTweetBody;
    private javax.swing.JTextArea txtTweetBody;
    private javax.swing.JTextField txtTweetId;
    private javax.swing.JTextField txtTweetType;
    private javax.swing.JTextField txtTweetUser;
    // End of variables declaration//GEN-END:variables
}