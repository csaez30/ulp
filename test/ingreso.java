/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cris
 */
public class ingreso extends javax.swing.JFrame {
DefaultTableModel model;
Connection conn = null;
ResultSet rs;
PreparedStatement ps;
    
    public ingreso() {
        initComponents();
        limpiar();
        bloquear();
        cargar();
    }
    Connection getConexion(){
         conectar  cc= new conectar();
         conn = cc.conexion();
         return conn;
    }

    
    void cargar(){
    String[] titulos={"Codigo", "Nombre","Apellido","DNI"};
    String [] registros = new String[4];
    String sql="SELECT * FROM cliente";
    model = new DefaultTableModel(null,titulos);
    conn=getConexion();   
    
      
           
          
    try {
        ps = conn.prepareStatement(sql);
    
        rs=ps.executeQuery(sql); //no necesito asignar porque es insert
    
             
         while (rs.next()){
                registros[0] = rs.getString("cod");
                registros[1] = rs.getString("nom");
                registros[2] = rs.getString("ape");
                registros[3] = rs.getString("dni");
                model.addRow(registros);
             } 
         
    } catch (SQLException ex) {
        Logger.getLogger(ingreso.class.getName()).log(Level.SEVERE, null, ex);
    } 
         t_datos.setModel(model);
         
        
  }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_cod = new javax.swing.JTextField();
        t_nom = new javax.swing.JTextField();
        t_ape = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        t_dni = new javax.swing.JTextField();
        t_valor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("INGRESO DE CRIENTES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("NOMBRE: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("CODIGO");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO");

        t_cod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_codActionPerformed(evt);
            }
        });

        t_nom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_nomActionPerformed(evt);
            }
        });

        t_ape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_apeActionPerformed(evt);
            }
        });

        jButton2.setText("NUEVO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Nombre de Registro para Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("GUARDAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("SALIR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(t_datos);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("DNI:");

        t_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_dniActionPerformed(evt);
            }
        });

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(t_cod, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(41, 41, 41))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jButton1)
                                .addGap(94, 94, 94)
                                .addComponent(jButton5))
                            .addComponent(t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_cod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton6))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(t_ape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(t_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(t_valor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    void limpiar(){
        t_cod.setText("");
        t_nom.setText("");
        t_ape.setText("");
        t_dni.setText("");
        
    }
    void bloquear(){
        t_cod.setEnabled(false);
        t_nom.setEnabled(false);
        t_ape.setEnabled(false);
         t_dni.setEnabled(false);
        
       // jButton2.setEnabled(false);  
       // jButton3.setEnabled(false);  
        jButton4.setEnabled(false); 
    }
    void desbloquear(){
        t_cod.setEnabled(true);
        t_nom.setEnabled(true);
        t_ape.setEnabled(true);
         t_dni.setEnabled(true);
    
        jButton2.setEnabled(true);  
      //  jButton3.setEnabled(true);  
        jButton4.setEnabled(true); 
    }
    
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       desbloquear();
       limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
        String cod,nom,ape,dni;
       
        String sql="";

        cod = t_cod.getText();
        nom = t_nom.getText();
        ape = t_ape.getText();
        dni = t_dni.getText();
        
        sql= "INSERT INTO cliente (cod, nom, ape,dni) VALUES (?,?,?,?)";
        
       
     
      conn = getConexion();
      
      
       try {
            ps= conn.prepareStatement(sql);
            ps.setString(1,cod);
            ps.setString(2,nom);
            ps.setString(3,ape);
            ps.setString(4,dni);
            
            int n=ps.executeUpdate();
            if (n>0){
              JOptionPane.showMessageDialog(null,"Registo Guardado");
              //bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
      cargar();
      
      
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Connection conn = null;
        String cod,nom,ape,dni,valor;
       
        String sql="";

        cod = t_cod.getText();
        nom = t_nom.getText();
        ape = t_ape.getText();
        dni = t_dni.getText();
        valor= t_valor.getText();
        sql= "DELETE FROM cliente WHERE nom='valor'";
        
       
      conectar  cc= new conectar();
      conn = cc.conexion();
      
      
       try {
            PreparedStatement st= conn.prepareStatement(sql);
            
            int n=st.executeUpdate();
            if (n>0){
              JOptionPane.showMessageDialog(null,"Registo Borrado");
              bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ingreso.class.getName()).log(Level.SEVERE, null, ex);
        }
       cargar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void t_codActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_codActionPerformed
        t_cod.transferFocus();
    }//GEN-LAST:event_t_codActionPerformed

    private void t_nomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_nomActionPerformed
        t_nom.transferFocus();
    }//GEN-LAST:event_t_nomActionPerformed

    private void t_apeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_apeActionPerformed
       t_ape.transferFocus();
    }//GEN-LAST:event_t_apeActionPerformed

    private void t_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_dniActionPerformed

    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        conn=getConexion();
    try {
        ps=conn.prepareStatement("SELECT * FROM cliente WHWRE cod=? ");
        ps.setString(1,t_cod.getText());
        rs=ps.executeQuery();
        

    } catch (SQLException ex) {
        Logger.getLogger(ingreso.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField t_ape;
    private javax.swing.JTextField t_cod;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField t_dni;
    private javax.swing.JTextField t_nom;
    private javax.swing.JTextField t_valor;
    // End of variables declaration//GEN-END:variables
}
