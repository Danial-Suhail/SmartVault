package pages;

import components.Balance;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class DepositUI extends javax.swing.JFrame {
    Balance bal = new Balance(); 
    /**
     * Creates new form DepositUI
     */
    public DepositUI() {
        initComponents();
        sLabel4.setVisible(false);
        sLabel3.setVisible(false);
        sLabel5.setVisible(false);
        
        
        bal.getUser();
        
        if (bal.Exsist(Balance.username) == true) {
            bal.updateFile();
        }
        
        //bal.getInfo();
        //bal.getBalances();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sLabel5 = new javax.swing.JLabel();
        sPanel1 = new javax.swing.JPanel();
        sLabel1 = new javax.swing.JLabel();
        chequingOrSavings = new javax.swing.JComboBox<>();
        confirmDeposit = new javax.swing.JButton();
        depositAmount = new javax.swing.JTextField();
        sLabel2 = new javax.swing.JLabel();
        Title = new javax.swing.JLabel();
        sLabel4 = new javax.swing.JLabel();
        BackButton = new javax.swing.JButton();
        sLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sLabel5.setText("jLabel1");

        sPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        sLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel1.setText("Select account to deposit into.");

        chequingOrSavings.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Account...", "Chequing", "Savings" }));
        chequingOrSavings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chequingOrSavingsActionPerformed(evt);
            }
        });

        confirmDeposit.setText("Confirm Deposit");
        confirmDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmDepositActionPerformed(evt);
            }
        });

        depositAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                depositAmountActionPerformed(evt);
            }
        });

        sLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel2.setText("Select amount to deposit.");

        Title.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Deposit");

        sLabel4.setForeground(new java.awt.Color(255, 0, 0));
        sLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel4.setText("Try Again. Please fill in all the required fields.");

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        sLabel3.setForeground(new java.awt.Color(255, 0, 0));
        sLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sLabel3.setText("Try again. Please input a value greater than 0.");

        javax.swing.GroupLayout sPanel1Layout = new javax.swing.GroupLayout(sPanel1);
        sPanel1.setLayout(sPanel1Layout);
        sPanel1Layout.setHorizontalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGroup(sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(sLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sLabel3)
                    .addComponent(sLabel4))
                .addGap(34, 34, 34))
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addGroup(sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(sPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(confirmDeposit))
                    .addGroup(sPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(sLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sPanel1Layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(chequingOrSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sPanel1Layout.setVerticalGroup(
            sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chequingOrSavings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sLabel2)
                .addGap(2, 2, 2)
                .addComponent(sLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(depositAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(sPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                        .addComponent(sLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirmDeposit)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sPanel1Layout.createSequentialGroup()
                        .addComponent(BackButton)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(sPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(sLabel5)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(sLabel5)
                .addGap(18, 18, 18)
                .addComponent(sPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chequingOrSavingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chequingOrSavingsActionPerformed
        //if(chequingOrSavings.)
    }//GEN-LAST:event_chequingOrSavingsActionPerformed

    private void confirmDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmDepositActionPerformed
        String user = Balance.username;//for testing purposes
        boolean valGood = false;
        boolean accGood = false;
        String input = depositAmount.getText().toString();
        sLabel5.setText(input);
        String s = sLabel5.getText();
        int depositAmountNum = Integer.valueOf(s);

        //remember to fix the exceptions -> when no value is inputted into the textfield
        if(chequingOrSavings.getSelectedItem().toString().equals("Select an Account...")){
            sLabel4.setVisible(true);
        }else{
            accGood=true;
        }
        if(depositAmountNum<=0||depositAmount.getText().length()<=0){//make sure to include balance to this if statement
            sLabel3.setVisible(true);
            valGood=false;
        }//else if depositAmountNum > balance -> textbox say "The inputted value is invalid, please input a value less than the total money in your account."
        else{
            valGood=true;
        }
        
        
        
        
        
        
        
        
        
        
        
        if(accGood&&valGood){
            double updatedBalance = depositAmountNum;
            boolean chequingSelected = true;

            if (chequingOrSavings.getSelectedItem().toString().equals("Chequing")) {
                chequingSelected = true;
                System.out.println("prev balance"+Balance.currentSaving);
                Balance.currentCheque += depositAmountNum;
                System.out.println("updated balance" + Balance.currentSaving);

                bal.updateBalFile(true);


            } else {
                chequingSelected = false;
                Balance.currentSaving += depositAmountNum;
                bal.updateBalFile(false);

            }

            //MoneyTransfer mt = new MoneyTransfer();
            //mt.updateDepositBalance(updatedBalance, user, chequingSelected);
            
            
            dispose();
        }
    }//GEN-LAST:event_confirmDepositActionPerformed

    private void depositAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_depositAmountActionPerformed

    }//GEN-LAST:event_depositAmountActionPerformed

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButtonActionPerformed
        dispose();
    }//GEN-LAST:event_BackButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DepositUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepositUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepositUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepositUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepositUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackButton;
    private javax.swing.JLabel Title;
    private javax.swing.JComboBox<String> chequingOrSavings;
    private javax.swing.JButton confirmDeposit;
    private javax.swing.JTextField depositAmount;
    private javax.swing.JLabel sLabel1;
    private javax.swing.JLabel sLabel2;
    private javax.swing.JLabel sLabel3;
    private javax.swing.JLabel sLabel4;
    private javax.swing.JLabel sLabel5;
    private javax.swing.JPanel sPanel1;
    // End of variables declaration//GEN-END:variables
private double getBalance(String user, boolean chequingSelected){
 ArrayList<String> usersList = new ArrayList<>();
            ArrayList<String> newUsersList = new ArrayList<>();
            boolean userFound= false;
            
            File users = new File("C:\\Users\\Admin\\Documents\\CompSci\\BankCulminating\\users.txt");
            Scanner scan = null;
            
            try{
                scan = new Scanner(users);
                while(scan.hasNextLine()){
                    usersList.add(scan.nextLine());
                }
                
            }catch(FileNotFoundException e){
                System.out.println("The file was not found and this is an error!");
            }
            
            //text file has now been copied into a String array list to analyze each individual line
            //the program will now search for the occurance of the inputted username to find the balance
            
            System.out.println();

            for(int i = 0; i<usersList.size();i++){
                if(usersList.get(i).equals(user)){
                    if(chequingSelected){
                        double chequingBalance = Double.valueOf(usersList.get(i+1));
                        return chequingBalance;
                    }else{
                        double savingsBalance = Double.valueOf(usersList.get(i+2));
                        return savingsBalance;
                    }
                }else{
                    return -1;
                }
            }
            return -1;
}
    
}