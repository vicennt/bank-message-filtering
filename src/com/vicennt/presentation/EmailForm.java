package com.vicennt.presentation;

import com.vicennt.logic.Email;
import com.vicennt.logic.INapierBankService;
import com.vicennt.logic.EmailSIR;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vicent
 */
public class EmailForm extends NapierBankFormBase {

    private boolean comboReady;

    /**
     * Creates new form EmailForm
     *
     * @param service
     */
    public EmailForm(INapierBankService service) {
        super(service);
        comboReady = false;
        initComponents();
        setGUI();

    }

    public void setGUI() {
        buttonGroup.add(rbtEmailIncident);
        buttonGroup.add(rbtEmailStandard);
        rbtEmailStandard.setSelected(true);
        txtEmailType.setEditable(false);
        comboEmailIncident.addItem("-");
        comboEmailIncident.addItem("Theft");
        comboEmailIncident.addItem("Staff Attack");
        comboEmailIncident.addItem("ATM Theft");
        comboEmailIncident.addItem("Raid");
        comboEmailIncident.addItem("Customer Attack");
        comboEmailIncident.addItem("Staff Abuse");
        comboEmailIncident.addItem("Bomb Threat");
        comboEmailIncident.addItem("Terrorism");
        comboEmailIncident.addItem("Suspicious Incident");
        comboEmailIncident.addItem("Intelligence");
        comboEmailIncident.addItem("Cash Loss");
        panelSIR.setVisible(false);
        comboReady = true;
    }

    public void controlSortCode() {
        if (comboReady) {
            txtEmailBody.setText("Sort Code:" + txtSorCode1.getText() + "-" + txtSortCode2.getText()
                    + "-" + txtSortCode3.getText() + "\nNature of Incident:" + comboEmailIncident.getSelectedItem());
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

        buttonGroup = new javax.swing.ButtonGroup();
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
        panelSIR = new javax.swing.JPanel();
        lblEmailIncident = new javax.swing.JLabel();
        comboEmailIncident = new javax.swing.JComboBox<>();
        lblSortCode = new javax.swing.JLabel();
        txtSorCode1 = new javax.swing.JTextField();
        txtSortCode2 = new javax.swing.JTextField();
        txtSortCode3 = new javax.swing.JTextField();

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

        panelSIR.setBackground(new java.awt.Color(219, 219, 219));

        lblEmailIncident.setText("Nature of Incident");

        comboEmailIncident.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboEmailIncidentItemStateChanged(evt);
            }
        });

        lblSortCode.setText("Sort Code");

        txtSorCode1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSorCode1FocusLost(evt);
            }
        });

        txtSortCode2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSortCode2FocusLost(evt);
            }
        });

        txtSortCode3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSortCode3FocusLost(evt);
            }
        });

        javax.swing.GroupLayout panelSIRLayout = new javax.swing.GroupLayout(panelSIR);
        panelSIR.setLayout(panelSIRLayout);
        panelSIRLayout.setHorizontalGroup(
            panelSIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSIRLayout.createSequentialGroup()
                .addGap(42, 60, Short.MAX_VALUE)
                .addComponent(lblEmailIncident)
                .addGap(50, 50, 50))
            .addGroup(panelSIRLayout.createSequentialGroup()
                .addGroup(panelSIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSIRLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(txtSorCode1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSortCode2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtSortCode3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelSIRLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(lblSortCode))
                    .addGroup(panelSIRLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(comboEmailIncident, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panelSIRLayout.setVerticalGroup(
            panelSIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSIRLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(lblEmailIncident)
                .addGap(18, 18, 18)
                .addComponent(comboEmailIncident, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSortCode)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelSIRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSortCode2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSortCode3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSorCode1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout mainEmailPanelLayout = new javax.swing.GroupLayout(mainEmailPanel);
        mainEmailPanel.setLayout(mainEmailPanelLayout);
        mainEmailPanelLayout.setHorizontalGroup(
            mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(lblEmailTitle)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmailId)
                            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                                        .addComponent(txtEmailType, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rbtEmailStandard)
                                            .addComponent(rbtEmailIncident)))
                                    .addComponent(lblEmailType))
                                .addGap(42, 42, 42)
                                .addComponent(panelSIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnSendEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(txtEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmailSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(scrollEmailBody, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        mainEmailPanelLayout.setVerticalGroup(
            mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainEmailPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblEmailTitle)
                .addGap(41, 41, 41)
                .addComponent(lblEmailId)
                .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainEmailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmailType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmailId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEmailType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtEmailStandard)
                        .addGap(18, 18, 18)
                        .addComponent(rbtEmailIncident)
                        .addGap(33, 33, 33))
                    .addGroup(mainEmailPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(panelSIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSendEmail)
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainEmailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEmailIncidentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmailIncidentActionPerformed
        panelSIR.setVisible(true);
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("dd/MM/yy");
        String today = formatter.format(date);
        txtEmailSubject.setText("SIR " + today);
        txtEmailBody.setText("Sort Code: \nNature of Incident:");
        txtEmailSubject.setEditable(false);
    }//GEN-LAST:event_rbtEmailIncidentActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        String id = txtEmailId.getText();
        String address = txtEmailAddress.getText();
        String subject = txtEmailSubject.getText();
        String body = txtEmailBody.getText();
        boolean errorForm = true;
        // Check if is a standar email or SIR
        if (rbtEmailIncident.isSelected()) {
            String sortCode = txtSorCode1.getText() + "-"
                    + txtSortCode2.getText() + "-" + txtSortCode3.getText();
            String natureIncident = comboEmailIncident.getSelectedItem().toString();
            EmailSIR sir = new EmailSIR(id, address, body,
                    subject, sortCode, natureIncident);
            if (sir.validateMessage()) {
                errorForm = false;
                sir.removeURLS();
                service.addSir(sir);
            }
        } else {
            Email sem = new Email(id, address, body, subject);
            if (sem.validateMessage()) {
                errorForm = false;
                sem.removeURLS();
                service.addEmail(sem);
            }
        }

        // Show a dialog if the message is wrong formed
        if (errorForm) {
            JOptionPane.showMessageDialog(new JFrame(), "You have errors in your form, please check it", "Email format error",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnSendEmailActionPerformed

    private void rbtEmailStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEmailStandardActionPerformed
        panelSIR.setVisible(false);
        txtEmailSubject.setText("");
        txtEmailSubject.setEditable(true);
        txtEmailBody.setText("");
    }//GEN-LAST:event_rbtEmailStandardActionPerformed

    private void comboEmailIncidentItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboEmailIncidentItemStateChanged
        if (comboReady) {
            txtEmailBody.setText("Sort Code:" + txtSorCode1.getText() + "-" + txtSortCode2.getText()
                    + "-" + txtSortCode3.getText() + "\nNature of Incident:" + comboEmailIncident.getSelectedItem());
        }
    }//GEN-LAST:event_comboEmailIncidentItemStateChanged

    private void txtSorCode1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSorCode1FocusLost
        controlSortCode();
    }//GEN-LAST:event_txtSorCode1FocusLost

    private void txtSortCode2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSortCode2FocusLost
        controlSortCode();
    }//GEN-LAST:event_txtSortCode2FocusLost

    private void txtSortCode3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSortCode3FocusLost
        controlSortCode();
    }//GEN-LAST:event_txtSortCode3FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSendEmail;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JComboBox<String> comboEmailIncident;
    private javax.swing.JLabel lblEmailAddress;
    private javax.swing.JLabel lblEmailBody;
    private javax.swing.JLabel lblEmailId;
    private javax.swing.JLabel lblEmailIncident;
    private javax.swing.JLabel lblEmailSubject;
    private javax.swing.JLabel lblEmailTitle;
    private javax.swing.JLabel lblEmailType;
    private javax.swing.JLabel lblSortCode;
    private javax.swing.JPanel mainEmailPanel;
    private javax.swing.JPanel panelSIR;
    private javax.swing.JRadioButton rbtEmailIncident;
    private javax.swing.JRadioButton rbtEmailStandard;
    private javax.swing.JScrollPane scrollEmailBody;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextArea txtEmailBody;
    private javax.swing.JTextField txtEmailId;
    private javax.swing.JTextField txtEmailSubject;
    private javax.swing.JTextField txtEmailType;
    private javax.swing.JTextField txtSorCode1;
    private javax.swing.JTextField txtSortCode2;
    private javax.swing.JTextField txtSortCode3;
    // End of variables declaration//GEN-END:variables
}
