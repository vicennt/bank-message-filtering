package com.vicennt.presentation;

import com.vicennt.logic.INapierBankService;

/**
 *
 * @author vicent
 */
public class ListsForm extends NapierBankFormBase {

    /**
     * Creates new form ListsForm
     * @param service
     */
    public ListsForm(INapierBankService service) {
        super(service);
        initComponents();
        showTrending();
        showMentions();
        showSIR();
        showNumMessages();
    }
    
    // This methods show each list in the determined label
    
    private void showTrending(){
        String aux = "<html>";
        for(String s : service.calculateTrendings()){
            aux += s + "<br/>";
        }
        aux += "</html>";
        lblTrending.setText(aux);
    }
    
    private void showMentions(){
        String aux = "<html>";
        for(String s : service.getMentionList()){
            aux += s + "<br/>";
        }
        aux += "</html>";
        lblMentions.setText(aux);      
    }
    
    private void showSIR(){
        String aux = "<html>";
        for(String s : service.getSIRList()){
            aux += s + "<br/>";
        }
        aux += "</html>";
        lblSIRList.setText(aux); 
        
    }
    
    private void showNumMessages(){
        lblNumMessages.setText("Num of messages processed: " + 
                service.getNumberOfMessages());
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
        lblStadisticsTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitleTrending = new javax.swing.JLabel();
        lblTrending = new javax.swing.JLabel();
        lblTitleMention = new javax.swing.JLabel();
        lblMentions = new javax.swing.JLabel();
        lblTitleSIRList = new javax.swing.JLabel();
        lblSIRList = new javax.swing.JLabel();
        lblNumMessages = new javax.swing.JLabel();

        lblStadisticsTitle.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblStadisticsTitle.setText("FINAL STADISTICS");

        jPanel2.setBackground(new java.awt.Color(210, 210, 210));

        lblTitleTrending.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitleTrending.setText("Trending List");

        lblTrending.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblTrending.setText("-");

        lblTitleMention.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitleMention.setText("Mention List");

        lblMentions.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblMentions.setText("-");

        lblTitleSIRList.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        lblTitleSIRList.setText("SIR List");

        lblSIRList.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        lblSIRList.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(lblTitleTrending)
                .addGap(222, 222, 222)
                .addComponent(lblTitleMention)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitleSIRList)
                .addGap(179, 179, 179))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(lblTrending, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(lblMentions, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(lblSIRList, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitleTrending)
                    .addComponent(lblTitleMention)
                    .addComponent(lblTitleSIRList))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMentions)
                        .addComponent(lblTrending))
                    .addComponent(lblSIRList))
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblStadisticsTitle)
                .addGap(478, 478, 478))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblStadisticsTitle)
                .addGap(43, 43, 43)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        lblNumMessages.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        lblNumMessages.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblNumMessages, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(461, 461, 461))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumMessages)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblMentions;
    private javax.swing.JLabel lblNumMessages;
    private javax.swing.JLabel lblSIRList;
    private javax.swing.JLabel lblStadisticsTitle;
    private javax.swing.JLabel lblTitleMention;
    private javax.swing.JLabel lblTitleSIRList;
    private javax.swing.JLabel lblTitleTrending;
    private javax.swing.JLabel lblTrending;
    // End of variables declaration//GEN-END:variables
}
