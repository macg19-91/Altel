/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altel;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import utils.Message;
import utils.Static;
import utils.Utilities;
import utils.auth;
/**
 *
 * @author Marlon
 */
public class CambioContraseña extends javax.swing.JFrame {
    auth file;
    boolean firstTime;
    /**
     * Creates new form CambioContraseña
     */
    public CambioContraseña() {
        ImageIcon img = new ImageIcon(getClass().getResource("/altel/resurces/Movistar_Logo.png"));
        setIconImage(img.getImage());
        initComponents();
        file=new auth();
        setLocationRelativeTo(null);
        keyListeners();
    }
    public CambioContraseña(boolean firstTime) {
        ImageIcon img = new ImageIcon("/altel/resurces/Movistar_Altel.png");
        setIconImage(img.getImage());
        initComponents();
        file=new auth();
        //txtOld.setText(file.leerArchivo());
        this.firstTime = firstTime;
        if(firstTime){
            txtOld.setVisible(false);
            txtUser.setVisible(true);
            txtId.setVisible(true);            
            lblOld.setVisible(false);
            lblUser.setVisible(true);
            lblId.setVisible(true);
            lblTitulo.setText("Nuevo Usuario");
        }else{
           txtOld.setVisible(false);
            txtUser.setVisible(true);
            txtId.setVisible(true);            
            lblOld.setVisible(false);
            lblUser.setVisible(true);
            lblId.setVisible(true);
            lblTitulo.setText("Nuevo Usuario");         
            txtNew.setText(Static.getPassword());            
            txtAgain.setText(Static.getPassword());
            txtNew.setEditable(firstTime);
            txtAgain.setEditable(firstTime);
        }
         setLocationRelativeTo(null);
         keyListeners();
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
        txtOld = new javax.swing.JPasswordField();
        txtNew = new javax.swing.JPasswordField();
        txtAgain = new javax.swing.JPasswordField();
        lblUser = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblOld = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nuevo Usuario");
        setAlwaysOnTop(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        txtOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtNew.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtAgain.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUser.setText("Usuario:");

        lblId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblId.setText("Num de Terminal:");

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblOld.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblOld.setText("Contraseña antigua:");

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblTitulo.setText("Cambiar Contraseña");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Repetir contraseña:");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Aceptar");
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

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOld)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(lblUser)
                                    .addComponent(lblId))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1)
                                .addGap(129, 129, 129)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 37, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblOld)
                    .addComponent(txtOld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyListeners(){
        txtAgain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtNew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtOld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton1MouseClicked(null);
                }             
            }
         });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent e) {
               if(e.getKeyCode() == KeyEvent.VK_ENTER){ 
                   jButton2MouseClicked(null);
                }             
            }
         });
    }
    
    
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //if(firstTime){
            createUser();
       /* }else{
            changePass();
        }*/
        
    }//GEN-LAST:event_jButton1MouseClicked
    
    private void changePass(){
        try {
            // TODO add your handling code here:
                                
            //if((txtNew.getText().isEmpty() || txtAgain.getText().isEmpty()) || txtOld.getText().isEmpty()){
                if(txtNew.getText().equals(txtAgain.getText())){
                    if(txtOld.getText().equals(file.leerArchivo("Sesion\\archivoPassword.txt"))||txtOld.getText().equals(file.leerArchivo("Sesion/archivoPassword.txt"))){
                        if(!txtOld.getText().equals(txtAgain.getText())){
                            //if(txtNew.getText().equals(txtAgain.getText())&&txtOld.getText().equals(file.leerArchivo())&&!txtOld.getText().equals(txtAgain.getText())){
                            file.escribeFichero(txtNew.getText(),"Sesion/archivoPassword.txt");
                            JOptionPane.showMessageDialog(null,"La contraseña ha sido cambiada", "Éxito!", JOptionPane.INFORMATION_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            /*}else{
                            JOptionPane.showMessageDialog(null,"Los datos introducidos son incorrectos", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            }*/
                        }else{
                            JOptionPane.showMessageDialog(null,"La nueva contraseña debe ser diferente a la anterior", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"La contraseña introducida es incorrecta", "Error!", JOptionPane.ERROR_MESSAGE );
                        txtOld.setText("");
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Las nuevas contraseñas no coinciden", "Error!", JOptionPane.ERROR_MESSAGE );
                    txtNew.setText("");
                    txtAgain.setText("");
                }
           /* }else{
                JOptionPane.showMessageDialog(null,"Debe llenar todos los espacios", "Error!", JOptionPane.ERROR_MESSAGE );
                txtNew.setText("");
                txtAgain.setText("");
            }*/
        } catch (IOException ex) {
            Logger.getLogger(CambioContraseña.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void createUser(){
            // TODO add your handling code here:
          //if((txtNew.getText().isEmpty() || txtAgain.getText().isEmpty()) || txtOld.getText().isEmpty()){
                if(txtNew.getText().equals(txtAgain.getText())){
                    
                    String resp="";
                    Static.setPassword(txtAgain.getText());                    
                    Static.setTerminal(txtId.getText());                   
                    Static.setUsuario(txtUser.getText());
                    Utilities util;
                    try {
                        util = new Utilities();
                        Message msg = new Message();
                        msg.consultaSaldo();
                        Map<String, String> response = util.SendToServer(msg.buildString());
                        msg.setMap(response);
                        resp = msg.getMsgResponse();
                        if(resp.equals("Transacción aprobada en forma exitosa")){
                            //return Static.getSaldo();
                            //if(txtNew.getText().equals(txtAgain.getText())&&txtOld.getText().equals(file.leerArchivo())&&!txtOld.getText().equals(txtAgain.getText())){
                            file.escribeFichero(txtUser.getText(),"Sesion/archivoUser.txt");
                            file.escribeFichero(txtId.getText(),"Sesion/archivoId.txt");
                            file.escribeFichero(txtNew.getText(),"Sesion/archivoPassword.txt");
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null,"Ha ingresado los datos correctamente", "Éxito!", JOptionPane.INFORMATION_MESSAGE );
                            
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtUser.setText("");
                            txtId.setText("");
                            if(!firstTime)new Login().setVisible(true);
                            /*}else{
                            JOptionPane.showMessageDialog(null,"Los datos introducidos son incorrectos", "Error!", JOptionPane.ERROR_MESSAGE );
                            txtNew.setText("");
                            txtAgain.setText("");
                            txtOld.setText("");
                            }*/
                        }else{
                            
                            this.setVisible(false);
                            JOptionPane.showMessageDialog(null,resp, "Error", JOptionPane.ERROR_MESSAGE );
                            
                            this.setVisible(true);
                        }
                    } catch (Exception ex) {
                        Logger.getLogger(CambioContraseña.class.getName()).log(Level.SEVERE, null, ex);
                    }                            
                        
                }else{
                    JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden", "Error!", JOptionPane.ERROR_MESSAGE );
                    txtNew.setText("");
                    txtAgain.setText("");
                }
           /* }else{
                JOptionPane.showMessageDialog(null,"Debe llenar todos los espacios", "Error!", JOptionPane.ERROR_MESSAGE );
                txtNew.setText("");
                txtAgain.setText("");
            }*/
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
       if(firstTime){
            System.exit(0);
        }else{
            new home().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        if(firstTime){
            System.exit(0);
        }else{
            new home().setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CambioContraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CambioContraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblOld;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtAgain;
    private javax.swing.JTextField txtId;
    private javax.swing.JPasswordField txtNew;
    private javax.swing.JPasswordField txtOld;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
