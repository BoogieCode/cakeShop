/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cakeshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JFormattedTextField;
import javax.swing.ListModel;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Boo
 */
public class client extends javax.swing.JFrame {

    
    public static DefaultListModel<String> list = new DefaultListModel<>();
    public static cake[] c = new cake[10];
    int kgramPrice;
    int index;
    int CurrentQuantity;
    int CurrentPrice;
    public static int i=0;
    public static File cakeDetalies=new File("cakeDetalies.txt");
    public static PrintWriter iutput;
    
    void readFile(){
        
        try {
            Scanner output=new Scanner(cakeDetalies);
            while(output.hasNext()){
                c[i]=new cake();
                String s=output.next();
                c[i].setName(s);
                s=output.next();
                c[i].setQuantity(Integer.parseInt(s));
                s=output.next();
                c[i].setPrice(Integer.parseInt(s));
                list.addElement(c[i].name);
                i++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void writeFile(int size){
        try {
            iutput = new PrintWriter("cakeDetalies.txt");
             for(int i=0;i<size;i++)
                    iutput.println(c[i].getProduct());
            iutput.close();
        } catch (FileNotFoundException ex) {
            
        }
    }
    void initializeList(int size){
        try {
            iutput = new PrintWriter(cakeDetalies);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(client.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<size;i++){
                list.addElement(c[i].getName());
                iutput.println(c[i].getProduct());
            }
            iutput.close();
    }
    
    void enableCakeOptions(){
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jTextField1.setEnabled(true);
        jTextField2.setEnabled(true);
    }
    /**
     * Creates new form client
     */
    public client() {
       
       
        initComponents();
        //this.setExtendedState(MAXIMIZED_BOTH);
        this.setTitle("CakeShop Main Menu");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        jList1.setModel(list);
        readFile();
       // initializeList();
//       Cheese Cake 5000 21 
//    Orange Cake 3000 18
//    Other Cheese Cake 3000 19
//    Chocolate Cake 3000 33
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleName("");
        jList1.getAccessibleContext().setAccessibleDescription("");

        jButton1.setText("addItem");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("A beautiful name for a CakeShop...idk");

        jButton2.setText("Buy");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.setText("0");
        jTextField1.setEnabled(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTextField2.setText("0");
        jTextField2.setEnabled(false);
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        jLabel3.setText("Weight");

        jLabel4.setText("Price");

        jButton3.setText("Adjust price");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Adjust Weight");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Select a cake:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)))
                        .addGap(44, 44, 44))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
       new addCake().setVisible(true);
       //
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
//         //jList1.getSelectedIndex();
            enableCakeOptions();
            jLabel5.setText("");
            index=jList1.getSelectedIndex();
            jLabel2.setText("<html>Cake name: "+c[index].name+"<br>"+"Quantity: "+c[index].quantity+" grams<br>"+"Price: "+c[index].price+" §/kg</html");
            kgramPrice=c[index].getPrice();
            CurrentQuantity=c[index].getQuantity();
           // System.out.print(kgramPrice+" ");
            jTextField1.setText(""+c[index].getQuantity());//in grams
            jTextField2.setText(""+(c[index].getQuantity()*kgramPrice)/1000);
        
    
         //System.out.print(""+c[jList1.getSelectedIndex()].getProduct());
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        c[index].setQuantity(c[index].getQuantity()-CurrentQuantity);
        if(c[index].getQuantity()<CurrentQuantity){
            CurrentQuantity=c[index].getQuantity();
            jTextField1.setText(""+CurrentQuantity);
        }
         
        jLabel2.setText("<html>Cake name: "+c[index].name+"<br>"+"Quantity: "+c[index].getQuantity()+" grams<br>"+"Price: "+c[index].price+" §/kg</html");
        int size=list.getSize();
        list.removeAllElements();
        initializeList(size);
        //this.dispose();
       
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CurrentQuantity=Integer.parseInt(jTextField1.getText());
        jTextField2.setText(""+(CurrentQuantity*kgramPrice)/1000);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CurrentPrice=Integer.parseInt(jTextField2.getText());
        jTextField1.setText(""+(CurrentPrice*1000)/kgramPrice);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        try{
        System.out.print(Integer.parseInt(jTextField1.getText()));
        if(Integer.parseInt(jTextField1.getText())>c[index].getQuantity()){
             //System.out.print(Integer.parseInt(jTextField1.getText())+" "+c[index].getQuantity());
             jTextField1.setText("");
         }}
        catch(java.lang.NumberFormatException ev){
            jTextField1.setText("");
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased
        // TODO add your handling code here:
        try{
        System.out.print(Integer.parseInt(jTextField2.getText()));
        if(Integer.parseInt(jTextField2.getText())<0){
             //System.out.print(Integer.parseInt(jTextField1.getText())+" "+c[index].getQuantity());
             jTextField2.setText("");
         }}
        catch(java.lang.NumberFormatException ev){
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField2KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
