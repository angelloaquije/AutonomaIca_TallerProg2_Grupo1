/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaventajava.Presentacion;

/**
 *
 * @author Angello Abraham
 */
public class jFrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jFrmPrincipal
     */
    public jFrmPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        mnuVentas = new javax.swing.JMenu();
        mnuIAgregarVenta = new javax.swing.JMenuItem();
        mnuIMostrarVentas = new javax.swing.JMenuItem();
        mnuClientes = new javax.swing.JMenu();
        mnuIAgregarCliente = new javax.swing.JMenuItem();
        mnuIMostrarClientes = new javax.swing.JMenuItem();
        mnuProductos = new javax.swing.JMenu();
        mnuIAgregarProducto = new javax.swing.JMenuItem();
        mnuIMostrarProductos = new javax.swing.JMenuItem();
        mnuTiposDoc = new javax.swing.JMenu();
        mnuIAgregarTipoDoc = new javax.swing.JMenuItem();
        mnuIMostrarTiposDoc = new javax.swing.JMenuItem();
        mnuTiposVentas = new javax.swing.JMenu();
        mnuIAgregarTipoVenta = new javax.swing.JMenuItem();
        mnuIMostrarTiposVenta = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mnuVentas.setText("Ventas");

        mnuIAgregarVenta.setText("Agregar Venta");
        mnuIAgregarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAgregarVentaActionPerformed(evt);
            }
        });
        mnuVentas.add(mnuIAgregarVenta);

        mnuIMostrarVentas.setText("Mostrar Ventas");
        mnuIMostrarVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIMostrarVentasActionPerformed(evt);
            }
        });
        mnuVentas.add(mnuIMostrarVentas);

        jMenuBar1.add(mnuVentas);

        mnuClientes.setText("Clientes");

        mnuIAgregarCliente.setText("Agregar Cliente");
        mnuIAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAgregarClienteActionPerformed(evt);
            }
        });
        mnuClientes.add(mnuIAgregarCliente);

        mnuIMostrarClientes.setText("Mostrar Clientes");
        mnuClientes.add(mnuIMostrarClientes);

        jMenuBar1.add(mnuClientes);

        mnuProductos.setText("Productos");

        mnuIAgregarProducto.setText("Agregar Producto");
        mnuIAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAgregarProductoActionPerformed(evt);
            }
        });
        mnuProductos.add(mnuIAgregarProducto);

        mnuIMostrarProductos.setText("Mostrar Productos");
        mnuIMostrarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIMostrarProductosActionPerformed(evt);
            }
        });
        mnuProductos.add(mnuIMostrarProductos);

        jMenuBar1.add(mnuProductos);

        mnuTiposDoc.setText("Tipo de Documentos");

        mnuIAgregarTipoDoc.setText("Agregar Tipo de Doc.");
        mnuIAgregarTipoDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAgregarTipoDocActionPerformed(evt);
            }
        });
        mnuTiposDoc.add(mnuIAgregarTipoDoc);

        mnuIMostrarTiposDoc.setText("Mostrar Tipos de Doc.");
        mnuIMostrarTiposDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIMostrarTiposDocActionPerformed(evt);
            }
        });
        mnuTiposDoc.add(mnuIMostrarTiposDoc);

        jMenuBar1.add(mnuTiposDoc);

        mnuTiposVentas.setText("Tipos de Ventas");

        mnuIAgregarTipoVenta.setText("Agregar Tipo de Venta");
        mnuIAgregarTipoVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIAgregarTipoVentaActionPerformed(evt);
            }
        });
        mnuTiposVentas.add(mnuIAgregarTipoVenta);

        mnuIMostrarTiposVenta.setText("Mostrar Tipos de Ventas");
        mnuIMostrarTiposVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuIMostrarTiposVentaActionPerformed(evt);
            }
        });
        mnuTiposVentas.add(mnuIMostrarTiposVenta);

        jMenuBar1.add(mnuTiposVentas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuIAgregarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAgregarVentaActionPerformed
        // TODO add your handling code here:
        new jFrmAgregarVenta().setVisible(true);
    }//GEN-LAST:event_mnuIAgregarVentaActionPerformed

    private void mnuIAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAgregarClienteActionPerformed
        // TODO add your handling code here:
        new jFrmAgregarCliente().setVisible(true);
    }//GEN-LAST:event_mnuIAgregarClienteActionPerformed

    private void mnuIAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAgregarProductoActionPerformed
        // TODO add your handling code here:
        new jFrmAgregarProducto().setVisible(true);
    }//GEN-LAST:event_mnuIAgregarProductoActionPerformed

    private void mnuIAgregarTipoDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAgregarTipoDocActionPerformed
        // TODO add your handling code here:
        new jFrmAgregarTipoDocumento().setVisible(true);
    }//GEN-LAST:event_mnuIAgregarTipoDocActionPerformed

    private void mnuIAgregarTipoVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIAgregarTipoVentaActionPerformed
        // TODO add your handling code here:
        new JFrmAgregarTipoVenta().setVisible(true);
    }//GEN-LAST:event_mnuIAgregarTipoVentaActionPerformed

    private void mnuIMostrarVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIMostrarVentasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuIMostrarVentasActionPerformed

    private void mnuIMostrarTiposDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIMostrarTiposDocActionPerformed
        // TODO add your handling code here:
        new jFrmMostrarTipoDocumento().setVisible(true);
       
    }//GEN-LAST:event_mnuIMostrarTiposDocActionPerformed

    private void mnuIMostrarTiposVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIMostrarTiposVentaActionPerformed
        // TODO add your handling code here:
        new jFrmMostrarTipoVenta().setVisible(true);
       
    }//GEN-LAST:event_mnuIMostrarTiposVentaActionPerformed

    private void mnuIMostrarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuIMostrarProductosActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuIMostrarProductosActionPerformed

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
            java.util.logging.Logger.getLogger(jFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuClientes;
    private javax.swing.JMenuItem mnuIAgregarCliente;
    private javax.swing.JMenuItem mnuIAgregarProducto;
    private javax.swing.JMenuItem mnuIAgregarTipoDoc;
    private javax.swing.JMenuItem mnuIAgregarTipoVenta;
    private javax.swing.JMenuItem mnuIAgregarVenta;
    private javax.swing.JMenuItem mnuIMostrarClientes;
    private javax.swing.JMenuItem mnuIMostrarProductos;
    private javax.swing.JMenuItem mnuIMostrarTiposDoc;
    private javax.swing.JMenuItem mnuIMostrarTiposVenta;
    private javax.swing.JMenuItem mnuIMostrarVentas;
    private javax.swing.JMenu mnuProductos;
    private javax.swing.JMenu mnuTiposDoc;
    private javax.swing.JMenu mnuTiposVentas;
    private javax.swing.JMenu mnuVentas;
    // End of variables declaration//GEN-END:variables
}
