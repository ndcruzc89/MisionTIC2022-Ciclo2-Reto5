/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package co.edu.utp.misiontic2022.nelsoncruz.view.gui;

import co.edu.utp.misiontic2022.nelsoncruz.controller.ReportesController;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.LideresVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorClasificacionYCiudadVo;
import co.edu.utp.misiontic2022.nelsoncruz.model.vo.ProyectosPorProveedorYCiudadVo;

import java.sql.SQLException;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nelson
 */
public class FrmPrincipal extends javax.swing.JFrame {

    private ReportesController controlador;
    private DefaultTableModel modelo;

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        controlador = new ReportesController();
        initComponents();
        setSize(613, 425);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Generador de Informes");
        setIconImage(
                new ImageIcon(getClass().getResource("/co/edu/utp/misiontic2022/nelsoncruz/view/gui/images/icono.png"))
                        .getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanelSuperior = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        btnInforme1 = new javax.swing.JButton();
        btnInforme2 = new javax.swing.JButton();
        bntInforme3 = new javax.swing.JButton();
        jPanelCentral = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInformes = new javax.swing.JTable();
        txtTituloTabla = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelSuperior.setBackground(new java.awt.Color(97, 137, 133));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/co/edu/utp/misiontic2022/nelsoncruz/view/gui/images/Image_MicTic.png"))); // NOI18N
        jPanelSuperior.add(jLabel2, new java.awt.GridBagConstraints());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INFORMES RETO 5");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.weightx = 0.7;
        jPanelSuperior.add(jLabel1, gridBagConstraints);

        jLabel4.setIcon(new javax.swing.ImageIcon(
                getClass().getResource("/co/edu/utp/misiontic2022/nelsoncruz/view/gui/images/Image_MicTic_2.png"))); // NOI18N
        jPanelSuperior.add(jLabel4, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(97, 137, 133));

        btnInforme1.setBackground(new java.awt.Color(238, 238, 238));
        btnInforme1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInforme1.setText("Informe 1");
        btnInforme1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme1ActionPerformed(evt);
            }
        });
        jPanelInferior.add(btnInforme1);

        btnInforme2.setBackground(new java.awt.Color(238, 238, 238));
        btnInforme2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnInforme2.setText("Informe 2");
        btnInforme2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInforme2ActionPerformed(evt);
            }
        });
        jPanelInferior.add(btnInforme2);

        bntInforme3.setBackground(new java.awt.Color(238, 238, 238));
        bntInforme3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bntInforme3.setText("Informe 3");
        bntInforme3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntInforme3ActionPerformed(evt);
            }
        });
        jPanelInferior.add(bntInforme3);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.PAGE_END);

        jPanelCentral.setBackground(new java.awt.Color(238, 238, 238));
        jPanelCentral.setLayout(new java.awt.BorderLayout());

        tblInformes.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        {},
                        {},
                        {},
                        {}
                },
                new String[] {

                }));
        jScrollPane2.setViewportView(tblInformes);

        jPanelCentral.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        txtTituloTabla.setBackground(new java.awt.Color(238, 238, 238));
        txtTituloTabla.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        txtTituloTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanelCentral.add(txtTituloTabla, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanelCentral, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInforme1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInforme1ActionPerformed
        primerInforme();
        txtTituloTabla.setText("Primer Informe");
    }// GEN-LAST:event_btnInforme1ActionPerformed

    private void btnInforme2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnInforme2ActionPerformed
        segundoInforme();
        txtTituloTabla.setText("Segundo Informe");
    }// GEN-LAST:event_btnInforme2ActionPerformed

    private void bntInforme3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bntInforme3ActionPerformed
        tercerInforme();
        txtTituloTabla.setText("Tercer Informe");
    }// GEN-LAST:event_bntInforme3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntInforme3;
    private javax.swing.JButton btnInforme1;
    private javax.swing.JButton btnInforme2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCentral;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblInformes;
    private javax.swing.JLabel txtTituloTabla;
    // End of variables declaration//GEN-END:variables

    private void mostrarError(String error, Exception ex) {
        JOptionPane.showMessageDialog(this, error + ": " + ex.getMessage(),
                "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void primerInforme() {
        try {
            List<LideresVo> lideres = controlador.listarLideres();
            modelo = new DefaultTableModel();
            modelo.addColumn("Id Lider");
            modelo.addColumn("Nombre");
            modelo.addColumn("Primer Apellido");
            modelo.addColumn("Ciudad Residencia");

            for (LideresVo lider : lideres) {
                Object[] fila = new Object[4];
                fila[0] = lider.getId();
                fila[1] = lider.getNombre();
                fila[2] = lider.getPrimerApellido();
                fila[3] = lider.getCiudadResidencia();

                modelo.addRow(fila);
            }
            tblInformes.setModel(modelo);
            modelo.fireTableDataChanged();
        } catch (SQLException ex) {
            mostrarError("Error con el primer informe", ex);
        }
    }

    public void segundoInforme() {
        try {
            List<ProyectosPorClasificacionYCiudadVo> proyectos = controlador
                    .listarProyectosPorClasificacionYCiudad();
            modelo = new DefaultTableModel();
            modelo.addColumn("Id Proyecto");
            modelo.addColumn("Constructora");
            modelo.addColumn("Habitaciones");
            modelo.addColumn("Ciudad");

            for (ProyectosPorClasificacionYCiudadVo proyecto : proyectos) {
                Object[] fila = new Object[4];
                fila[0] = proyecto.getId();
                fila[1] = proyecto.getConstructora();
                fila[2] = proyecto.getHabitaciones();
                fila[3] = proyecto.getCiudad();

                modelo.addRow(fila);
            }
            tblInformes.setModel(modelo);
            modelo.fireTableDataChanged();

        } catch (SQLException ex) {
            mostrarError("Error con el segundo informe", ex);
        }
    }

    public void tercerInforme() {
        try {
            List<ProyectosPorProveedorYCiudadVo> proyectos = controlador
                    .listarProyectosPorProveedorYCiudad();
            modelo = new DefaultTableModel();
            modelo.addColumn("Id Compra");
            modelo.addColumn("Constructora");
            modelo.addColumn("Banco Vinculado");

            for (ProyectosPorProveedorYCiudadVo proyecto : proyectos) {
                Object[] fila = new Object[3];
                fila[0] = proyecto.getId();
                fila[1] = proyecto.getConstructora();
                fila[2] = proyecto.getBancoVinculado();

                modelo.addRow(fila);
            }
            tblInformes.setModel(modelo);
            modelo.fireTableDataChanged();

        } catch (SQLException ex) {
            mostrarError("Error con el tercer informe", ex);
        }
    }
}
