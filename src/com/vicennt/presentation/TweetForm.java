package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;
import com.vicennt.logic.Tweet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class TweetForm extends NapierBankFormBase {

    /**
     * Creates new form TweetForm
     * @param service
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

        lblTweetTitle.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblTweetTitle.setText("Write an Tweet");

        lblTweetId.setText("ID Message");

        txtTweetType.setEditable(false);
        txtTweetType.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        txtTweetType.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTweetType.setText("T");

        txtTweetId.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N

        lblTweetUser.setText("Twitter user");

        lblTweetBody.setText("Tweet body");

        txtTweetBody.setColumns(20);
        txtTweetBody.setRows(5);
        scrollTweetBody.setViewportView(txtTweetBody);

        btnSendTweet.setText("Send Tweet");
        btnSendTweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendTweetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainTweetPanelLayout = new javax.swing.GroupLayout(mainTweetPanel);
        mainTweetPanel.setLayout(mainTweetPanelLayout);
        mainTweetPanelLayout.setHorizontalGroup(
            mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTweetPanelLayout.createSequentialGroup()
                .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainTweetPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTweetId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTweetUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTweetBody, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSendTweet)
                                .addComponent(scrollTweetBody, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainTweetPanelLayout.createSequentialGroup()
                                    .addComponent(txtTweetType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTweetId))
                                .addComponent(txtTweetUser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainTweetPanelLayout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblTweetTitle)))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        mainTweetPanelLayout.setVerticalGroup(
            mainTweetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainTweetPanelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblTweetTitle)
                .addGap(32, 32, 32)
                .addComponent(lblTweetId)
                .addGap(33, 33, 33)
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainTweetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTweetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendTweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendTweetActionPerformed
        String id = txtTweetType.getText() + txtTweetId.getText();
        String user = txtTweetUser.getText();
        String body = txtTweetBody.getText();
        Tweet tweet = new Tweet(id, user, body, service.getAbbreviations());
        if(tweet.validateMessage()){
            // First replace the abbreviations
            tweet.replaceAbbreviations();
            service.addTweet(tweet);
            this.setVisible(false);

        }else{
            JOptionPane.showMessageDialog(new JFrame(), "You have errors in your form, please check it", "Email format error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSendTweetActionPerformed

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
