package com.vicennt.presentation;

import com.vicennt.constants.Constants;
import com.vicennt.logic.Email;
import com.vicennt.logic.EmailSIR;
import com.vicennt.logic.INapierBankService;
import com.vicennt.logic.Sms;
import com.vicennt.logic.Tweet;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author vicent
 */
public class InputSessionForm extends NapierBankFormBase {
    
    private String c;

    public InputSessionForm(INapierBankService service) {
        super(service);
        initComponents();             
        Path currentRelativePath = Paths.get("");
        c = currentRelativePath.toAbsolutePath().toString();
    }

    /**
     * This method get all the information from the current session and pass it
     * to logical layer
     */
    private void closeSession() {
        ListsForm lf = new ListsForm(service);
        lf.setLocationRelativeTo(null);
        lf.setVisible(true);
        ArrayList<Sms> sms = service.getSms();
        ArrayList<Tweet> tweet = service.getTweets();
        ArrayList<Email> emails = service.getEmails();
        ArrayList<EmailSIR> sirs = service.getSirEmails();
        if (!sms.isEmpty()) {
            if (System.getProperty("os.name").contains("Linux")) {
                service.writeMessages(sms, Constants.PATH_TO_SMS_LINUX);
            } else if (System.getProperty("os.name").contains("Windows")) {             
                service.writeMessages(sms, c + Constants.PATH_TO_SMS_WIN);
            }
        }
        if (!tweet.isEmpty()) {
            if (System.getProperty("os.name").contains("Linux")) {
                service.writeMessages(tweet, Constants.PATH_TO_TWEETS_LINUX);
            } else if (System.getProperty("os.name").contains("Windows")) {
                service.writeMessages(tweet, c + Constants.PATH_TO_TWEETS_WIN);
            }
        }
        if (!emails.isEmpty()) {
            if (System.getProperty("os.name").contains("Linux")) {
                service.writeMessages(emails, Constants.PATH_TO_EMAILS_LINUX);
            } else if (System.getProperty("os.name").contains("Windows")) {
                service.writeMessages(emails, c + Constants.PATH_TO_EMAILS_WIN);
            }
        }
        if (!sirs.isEmpty()) {
            if (System.getProperty("os.name").contains("Linux")) {
                service.writeMessages(sirs, Constants.PATH_TO_SIR_LINUX);
            } else if (System.getProperty("os.name").contains("Windows")) {
                service.writeMessages(sirs, c + Constants.PATH_TO_SIR_WIN);
            }
        }
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
        menuItemTweet = new javax.swing.JMenuItem();
        menuItemSMS = new javax.swing.JMenuItem();
        menuItemEmail = new javax.swing.JMenuItem();
        menuItemSIR = new javax.swing.JMenuItem();
        menuItemShowLists = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSendMsg.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblSendMsg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSendMsg.setText("INPUT SESSION");

        secondPanel.setBackground(new java.awt.Color(191, 191, 191));

        btnEmail.setBackground(new java.awt.Color(242, 242, 242));
        btnEmail.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnEmail.setText("Email");
        btnEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmailActionPerformed(evt);
            }
        });

        btnTweet.setBackground(new java.awt.Color(242, 242, 242));
        btnTweet.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnTweet.setText("Tweet");
        btnTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTweetActionPerformed(evt);
            }
        });

        btnSMS.setBackground(new java.awt.Color(242, 242, 242));
        btnSMS.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        btnSMS.setText("SMS");
        btnSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMSActionPerformed(evt);
            }
        });

        lblSubtitle.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        lblSubtitle.setText("Please chose one type of message");

        javax.swing.GroupLayout secondPanelLayout = new javax.swing.GroupLayout(secondPanel);
        secondPanel.setLayout(secondPanelLayout);
        secondPanelLayout.setHorizontalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPanelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                        .addComponent(btnSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                        .addComponent(lblSubtitle)
                        .addGap(243, 243, 243))))
        );
        secondPanelLayout.setVerticalGroup(
            secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, secondPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblSubtitle)
                .addGap(34, 34, 34)
                .addGroup(secondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSMS, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTweet, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        btnEndSession.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(lblSendMsg, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnEndSession, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSendMsg)
                .addGap(30, 30, 30)
                .addComponent(secondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnEndSession, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        menuFile.setText("File");

        menuItemTweet.setText("Load Tweets from file");
        menuItemTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemTweetActionPerformed(evt);
            }
        });
        menuFile.add(menuItemTweet);

        menuItemSMS.setText("Load SMS from file");
        menuItemSMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSMSActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSMS);

        menuItemEmail.setText("Load Emails from file");
        menuItemEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemEmailActionPerformed(evt);
            }
        });
        menuFile.add(menuItemEmail);

        menuItemSIR.setText("Load SIR from file");
        menuItemSIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSIRActionPerformed(evt);
            }
        });
        menuFile.add(menuItemSIR);

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

    private void menuItemTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemTweetActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (System.getProperty("os.name").contains("Linux")) {
            fileChooser.setCurrentDirectory(new File(Constants.PATH_TO_TWEETS_LINUX));
        } else if (System.getProperty("os.name").contains("Windows")) {
            fileChooser.setCurrentDirectory(new File(c + Constants.PATH_TO_TWEETS_WIN));
        }

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
            ReadMessages rm = new ReadMessages(service, service.readTweets(selectedFile.getAbsolutePath()));
            rm.setLocationRelativeTo(null);
            rm.setVisible(true);
        }
    }//GEN-LAST:event_menuItemTweetActionPerformed

    private void menuItemShowListsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemShowListsActionPerformed
        closeSession();
    }//GEN-LAST:event_menuItemShowListsActionPerformed

    private void menuItemSMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSMSActionPerformed
        JFileChooser fileChooser = new JFileChooser();

        if (System.getProperty("os.name").contains("Linux")) {
            fileChooser.setCurrentDirectory(new File(Constants.PATH_TO_SMS_LINUX));
        } else if (System.getProperty("os.name").contains("Windows")) {
            fileChooser.setCurrentDirectory(new File(c + Constants.PATH_TO_SMS_WIN));
        }
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ReadMessages rm = new ReadMessages(service, service.readSms(selectedFile.getAbsolutePath()));
            rm.setLocationRelativeTo(null);
            rm.setVisible(true);
        }
    }//GEN-LAST:event_menuItemSMSActionPerformed

    private void menuItemEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemEmailActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (System.getProperty("os.name").contains("Linux")) {
            fileChooser.setCurrentDirectory(new File(Constants.PATH_TO_EMAILS_LINUX));
        } else if (System.getProperty("os.name").contains("Windows")) {
            fileChooser.setCurrentDirectory(new File(c + Constants.PATH_TO_EMAILS_WIN));
        }
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ReadMessages rm = new ReadMessages(service, service.readEmails(selectedFile.getAbsolutePath()));
            rm.setLocationRelativeTo(null);
            rm.setVisible(true);
        }
    }//GEN-LAST:event_menuItemEmailActionPerformed

    private void menuItemSIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSIRActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (System.getProperty("os.name").contains("Linux")) {
            fileChooser.setCurrentDirectory(new File(Constants.PATH_TO_SIR_LINUX));
        } else if (System.getProperty("os.name").contains("Windows")) {
            fileChooser.setCurrentDirectory(new File(c + Constants.PATH_TO_SIR_WIN));
        }
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            ReadMessages rm = new ReadMessages(service, service.readSir(selectedFile.getAbsolutePath()));
            rm.setLocationRelativeTo(null);
            rm.setVisible(true);
        }
    }//GEN-LAST:event_menuItemSIRActionPerformed


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
    private javax.swing.JMenuItem menuItemEmail;
    private javax.swing.JMenuItem menuItemSIR;
    private javax.swing.JMenuItem menuItemSMS;
    private javax.swing.JMenuItem menuItemShowLists;
    private javax.swing.JMenuItem menuItemTweet;
    private javax.swing.JPanel secondPanel;
    // End of variables declaration//GEN-END:variables
}
