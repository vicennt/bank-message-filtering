package com.vicennt.presentation;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vicennt.logic.INapierBankService;
import com.vicennt.logic.Tweet;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vicent
 */

public class InputSessionForm extends NapierBankFormBase {

    public InputSessionForm(INapierBankService service) {
        super(service);
        initComponents();
    }
    
    private void closeSession(){
        ListsForm lf = new ListsForm(service);
        service.writeMessagesJSON();
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        lblSendMsg = new javax.swing.JLabel();
        secondPanel = new javax.swing.JPanel();
        btnEmail = new javax.swing.JButton();
        btnTweet = new javax.swing.JButton();
        btnSMS = new javax.swing.JButton();
        lblSubtitle = new javax.swing.JLabel();
        btnEndSession = new javax.swing.JButton();
        mainMenu = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuItemOpenFile = new javax.swing.JMenuItem();
        menuItemShowLists = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        lblSendMsg.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        lblSendMsg.setText("Welcome, you are in an Input Session");

        secondPanel.setBackground(new java.awt.Color(191, 191, 191));

        btnEmail.setBackground(new java.awt.Color(242, 242, 242));
        btnEmail.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnEmail.setText("Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        btnTweet.setBackground(new java.awt.Color(242, 242, 242));
        btnTweet.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnTweet.setText("Tweet");
        btnTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweetActionPerformed(evt);
            }
        });

        btnSMS.setBackground(new java.awt.Color(242, 242, 242));
        btnSMS.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        btnSMS.setText("SMS");
        btnSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSActionPerformed(evt);
            }
        });

        lblSubtitle.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblSubtitle.setText("Please chose one type of message");

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                        .addComponent(btnSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                        .addComponent(lblSubtitle)
                        .addGap(344, 344, 344))))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblSubtitle)
                .addGap(62, 62, 62)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        btnEndSession.setText("Close current session");
        btnEndSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEndSessionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(lblSendMsg)
                        .addGap(291, 291, 291))))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(btnEndSession, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblSendMsg)
                .addGap(32, 32, 32)
                .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnEndSession))
        );

        menuFile.setText("File");

        menuItemOpenFile.setText("Load messages from file");
        menuItemOpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemOpenFileActionPerformed(evt);
            }
        });
        menuFile.add(menuItemOpenFile);

        menuItemShowLists.setText("Close current session");
        menuItemShowLists.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemShowListsActionPerformed(evt);
            }
        });
        menuFile.add(menuItemShowLists);

        mainMenu.add(menuFile);

        setJMenuBar(mainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52))
        );

        mainPanel.getAccessibleContext().setAccessibleName("");

        getAccessibleContext().setAccessibleName("principleFrame");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmailActionPerformed
        EmailForm emailForm = new EmailForm(service);
        emailForm.setLocationRelativeTo(null);
        emailForm.setVisible(true);
    }//GEN-LAST:event_btnEmailActionPerformed

    private void btnSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMSActionPerformed
        SmsForm smsForm = new SmsForm(service);
        smsForm.setLocationRelativeTo(null);
        smsForm.setVisible(true);
    }//GEN-LAST:event_btnSMSActionPerformed

    private void btnTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTweetActionPerformed
        TweetForm tweetForm = new TweetForm(service);
        tweetForm.setLocationRelativeTo(null);
        tweetForm.setVisible(true);
    }//GEN-LAST:event_btnTweetActionPerformed

    private void btnEndSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEndSessionActionPerformed
        closeSession();
    }//GEN-LAST:event_btnEndSessionActionPerformed

    private void menuItemOpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemOpenFileActionPerformed
        ObjectMapper om = new ObjectMapper();
        try {
            File file = new File("./iofiles/result.json");
            Tweet t = om.readValue(file, Tweet.class);
            System.out.println(t.toString());
        } catch (IOException ex) {
            Logger.getLogger(InputSessionForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_menuItemOpenFileActionPerformed

    private void menuItemShowListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemShowListsActionPerformed
        closeSession();
    }//GEN-LAST:event_menuItemShowListsActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
  
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmail;
    private javax.swing.JButton btnEndSession;
    private javax.swing.JButton btnSMS;
    private javax.swing.JButton btnTweet;
    private javax.swing.JLabel lblSendMsg;
    private javax.swing.JLabel lblSubtitle;
    private javax.swing.JMenuBar mainMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemOpenFile;
    private javax.swing.JMenuItem menuItemShowLists;
    private javax.swing.JPanel secondPanel;
    // End of variables declaration//GEN-END:variables
}
