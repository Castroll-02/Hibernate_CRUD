/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import models.Usuarios;
import controllers.MtoUsuarios;
import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Diego
 */
public class Usuario extends javax.swing.JFrame {

    /**
     * Creates new form usuarios
     */
    public Usuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        borrarCampos();
    }
    
    MtoUsuarios obj = new MtoUsuarios();
    String[] columnas = {"ID","Usuario","Clave","Creacion"};
    
    private void borrarCampos(){
        JTFID.setText("");
        JTFUsuario.setText("");
        JTFClave.setText("");
        JTFFecha.setText("");
        JTFBusqueda.setText("");
        cargarTabla(columnas);
    }
    
    private void cargarTabla(String columnas[]){
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);
        
        for (int i = 0; i < columnas.length; i++) {
            modelo.addColumn(columnas[i]);
        }
        
        List datos = obj.readAll();
        Iterator it = datos.iterator();
        
        while (it.hasNext()){  
            models.Usuarios o = (models.Usuarios)it.next();
            Object[] fila = new Object[4];
            fila[0] = o.getId();
            fila[1] = o.getUsuario();
            fila[2] = o.getClave();
            fila[3] = o.getCreacion();
            modelo.addRow(fila);
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

        jLabel1 = new javax.swing.JLabel();
        JTFID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTFClave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTFUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTFFecha = new javax.swing.JTextField();
        BTNIngresar = new javax.swing.JButton();
        BTNBorrarCampos = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        JTFBusqueda = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID");

        jLabel2.setText("Clave");

        jLabel3.setText("Usuarios");

        jLabel4.setText("Fecha");

        BTNIngresar.setText("INGRESAR");
        BTNIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNIngresarActionPerformed(evt);
            }
        });

        BTNBorrarCampos.setText("BORRAR CAMPOS");
        BTNBorrarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBorrarCamposActionPerformed(evt);
            }
        });

        BTNModificar.setText("MODIFICAR");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("ELIMINAR");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Clave", "Creacion"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setText("MANTENIMIENTO DE USUARIOS");

        JTFBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFBusquedaKeyTyped(evt);
            }
        });

        jLabel6.setText("Buscar por usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFID, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(JTFClave))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTFFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(JTFUsuario))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(BTNIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNBorrarCampos)
                        .addGap(12, 12, 12)
                        .addComponent(BTNModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTNEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel5)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTFID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTFClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JTFFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTNIngresar)
                    .addComponent(BTNBorrarCampos)
                    .addComponent(BTNModificar)
                    .addComponent(BTNEliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNIngresarActionPerformed
        
        Usuarios usuario = new Usuarios();
        
        usuario.setId(Integer.parseInt(JTFID.getText()));
        usuario.setUsuario(JTFUsuario.getText());
        usuario.setClave(JTFClave.getText());
        usuario.setCreacion(Date.valueOf(JTFFecha.getText()));
        
        if (obj.saveRow(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuario ingresado correctamente");
            borrarCampos();
        } else {
            JOptionPane.showMessageDialog(null, "Error al ingresar usuario");
        }
        
    }//GEN-LAST:event_BTNIngresarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        Usuarios usuario = new Usuarios();
        
        usuario = obj.getRow(Integer.parseInt(JTFID.getText()));
       
        if (usuario != null) {
            usuario.setId(Integer.parseInt(JTFID.getText()));
            usuario.setUsuario(JTFUsuario.getText());
            usuario.setClave(JTFClave.getText());
            usuario.setCreacion(Date.valueOf(JTFFecha.getText()));


            if (obj.updateRow(usuario)) {
                JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                borrarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inexistente");
        }
        
        

    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNBorrarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBorrarCamposActionPerformed
        borrarCampos();
    }//GEN-LAST:event_BTNBorrarCamposActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        Usuarios usuario = new Usuarios();      
        usuario = obj.getRow(Integer.parseInt(JTFID.getText()));
        if (usuario != null) {
            if (obj.deleteRow(usuario)) {
            JOptionPane.showMessageDialog(null,"Usuario eliminado con exito");
            borrarCampos();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar usuario");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usuario inexistente");
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int fila = jTable1.getSelectedRow();
        JTFID.setText(jTable1.getValueAt(fila, 0).toString());
        JTFUsuario.setText(jTable1.getValueAt(fila, 1).toString());
        JTFClave.setText(jTable1.getValueAt(fila, 2).toString());
        JTFFecha.setText(jTable1.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void JTFBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFBusquedaKeyTyped
        if (JTFBusqueda.getText().length() > 1) {
            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);

            for (int i = 0; i < columnas.length; i++) {
                modelo.addColumn(columnas[i]);
            }

            String query = "from Usuarios where usuario LIKE '%"+JTFBusqueda.getText()+"%'";
            List datos = obj.searchRows(query);
            Iterator it = datos.iterator();

            while (it.hasNext()){
                Usuarios o = (Usuarios)it.next();
                Object[] fila = new Object[4];

                fila[0] = o.getId();
                fila[1] = o.getUsuario();
                fila[2] = o.getClave();
                fila[3] = o.getCreacion();

                modelo.addRow(fila);
            }
        } else {
            cargarTabla(columnas);
        }
    }//GEN-LAST:event_JTFBusquedaKeyTyped

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBorrarCampos;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNIngresar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JTextField JTFBusqueda;
    private javax.swing.JTextField JTFClave;
    private javax.swing.JTextField JTFFecha;
    private javax.swing.JTextField JTFID;
    private javax.swing.JTextField JTFUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
