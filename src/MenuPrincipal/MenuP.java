/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuPrincipal;

import Login.Login;

import Mantenimientos.DeAlianza;
import Mantenimientos.DeCandidatos;
import Mantenimientos.DeCircunscripciones;
import Mantenimientos.DePartidos;
import Mantenimientos.DeMunicipios;
import Mantenimientos.DeRecinto;
import Mantenimientos.DeUsuario;
import Movimientos.DeColegios;

import Consultas.CDeAlianza;
import Consultas.CDeCandidatos;
import Consultas.CDeCircunscripciones;
import Consultas.CDeMunicipios;
import Consultas.CDePartidos;
import Consultas.CDeUsuario;

/**
 *
 * @author User
 */
public class MenuP extends javax.swing.JFrame {

    /**
     * Creates new form MenuP
     */
    public MenuP() {
        initComponents();

        // Acceder directamente a la variable isAdmin de la clase Login
        boolean isAdmin = Login.admin;

        // Puedes realizar lógica específica aquí o en otros métodos
        if (isAdmin) {
            // Hacer algo específico para el administrador
            System.out.println("Es Administrador");
        } else {
            // Hacer algo específico para usuarios normales
            System.out.println("Es Usuario");
            Mantenimientos.setEnabled(false);
            Procesos.setEnabled(false);
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        Mantenimientos = new javax.swing.JMenu();
        MUsuario = new javax.swing.JMenuItem();
        MPartidos = new javax.swing.JMenuItem();
        MMunicipios = new javax.swing.JMenuItem();
        MCircunscripciones = new javax.swing.JMenuItem();
        MAlianza = new javax.swing.JMenuItem();
        MRecintos = new javax.swing.JMenuItem();
        MCandidatos = new javax.swing.JMenuItem();
        Movimientos = new javax.swing.JMenu();
        Colegios = new javax.swing.JMenuItem();
        Procesos = new javax.swing.JMenu();
        VotosColegios = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CUsuarios = new javax.swing.JMenuItem();
        CPartidos = new javax.swing.JMenuItem();
        CMunicipios = new javax.swing.JMenuItem();
        CCircunscripciones = new javax.swing.JMenuItem();
        CAlianza = new javax.swing.JMenuItem();
        CCandidatos = new javax.swing.JMenuItem();
        CEscaños = new javax.swing.JMenuItem();
        CDipotadosE = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Mantenimientos.setText("Mantenimientos ");

        MUsuario.setText("De usuarios");
        MUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MUsuarioActionPerformed(evt);
            }
        });
        Mantenimientos.add(MUsuario);

        MPartidos.setText("De partidos");
        MPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPartidosActionPerformed(evt);
            }
        });
        Mantenimientos.add(MPartidos);

        MMunicipios.setText("De Municipios");
        MMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMunicipiosActionPerformed(evt);
            }
        });
        Mantenimientos.add(MMunicipios);

        MCircunscripciones.setText("De circunscripciones");
        MCircunscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCircunscripcionesActionPerformed(evt);
            }
        });
        Mantenimientos.add(MCircunscripciones);

        MAlianza.setText("De alianza");
        MAlianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAlianzaActionPerformed(evt);
            }
        });
        Mantenimientos.add(MAlianza);

        MRecintos.setText("De recintos");
        MRecintos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRecintosActionPerformed(evt);
            }
        });
        Mantenimientos.add(MRecintos);

        MCandidatos.setText("De candidatos");
        MCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCandidatosActionPerformed(evt);
            }
        });
        Mantenimientos.add(MCandidatos);

        jMenuBar1.add(Mantenimientos);

        Movimientos.setText("Movimientos");

        Colegios.setText("De colegios");
        Colegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColegiosActionPerformed(evt);
            }
        });
        Movimientos.add(Colegios);

        jMenuBar1.add(Movimientos);

        Procesos.setText("Procesos");

        VotosColegios.setText("Procesar votos de colegios");
        VotosColegios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VotosColegiosActionPerformed(evt);
            }
        });
        Procesos.add(VotosColegios);

        jMenuBar1.add(Procesos);

        jMenu5.setText("Consultas");

        CUsuarios.setText("De usuarios");
        CUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUsuariosActionPerformed(evt);
            }
        });
        jMenu5.add(CUsuarios);

        CPartidos.setText("De partidos");
        CPartidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPartidosActionPerformed(evt);
            }
        });
        jMenu5.add(CPartidos);

        CMunicipios.setText("De Municipios");
        CMunicipios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CMunicipiosActionPerformed(evt);
            }
        });
        jMenu5.add(CMunicipios);

        CCircunscripciones.setText("De circunscripciones");
        CCircunscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCircunscripcionesActionPerformed(evt);
            }
        });
        jMenu5.add(CCircunscripciones);

        CAlianza.setText("De alianza");
        CAlianza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAlianzaActionPerformed(evt);
            }
        });
        jMenu5.add(CAlianza);

        CCandidatos.setText("De candidatos");
        CCandidatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CCandidatosActionPerformed(evt);
            }
        });
        jMenu5.add(CCandidatos);

        CEscaños.setText("De escaños por partidos");
        jMenu5.add(CEscaños);

        CDipotadosE.setText("De diputados elegidos por partidos");
        jMenu5.add(CDipotadosE);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MRecintosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRecintosActionPerformed
        DeRecinto verventana = new DeRecinto();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MRecintosActionPerformed

    private void MUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MUsuarioActionPerformed
        DeUsuario verventana = new DeUsuario();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MUsuarioActionPerformed

    private void MPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPartidosActionPerformed
       DePartidos verventana = new DePartidos();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MPartidosActionPerformed

    private void MMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMunicipiosActionPerformed
        DeMunicipios verventana = new DeMunicipios();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MMunicipiosActionPerformed

    private void MCircunscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCircunscripcionesActionPerformed
       DeCircunscripciones verventana = new DeCircunscripciones();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MCircunscripcionesActionPerformed

    private void MAlianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAlianzaActionPerformed
        DeAlianza verventana = new DeAlianza();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MAlianzaActionPerformed

    private void MCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCandidatosActionPerformed
        DeCandidatos verventana = new DeCandidatos();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MCandidatosActionPerformed

    private void CCandidatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCandidatosActionPerformed
         CDeCandidatos verventana = new CDeCandidatos();
         verventana.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_CCandidatosActionPerformed

    private void CUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUsuariosActionPerformed
         CDeUsuario verventana = new CDeUsuario();
         verventana.setVisible(true);
    }//GEN-LAST:event_CUsuariosActionPerformed

    private void CPartidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPartidosActionPerformed
         CDePartidos verventana = new CDePartidos();
         verventana.setVisible(true); 
         this.dispose();
    }//GEN-LAST:event_CPartidosActionPerformed

    private void CMunicipiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CMunicipiosActionPerformed
         CDeMunicipios verventana = new CDeMunicipios();
         verventana.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_CMunicipiosActionPerformed

    private void CCircunscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CCircunscripcionesActionPerformed
         CDeCircunscripciones verventana = new CDeCircunscripciones();
         verventana.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_CCircunscripcionesActionPerformed

    private void CAlianzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAlianzaActionPerformed
        CDeAlianza verventana = new CDeAlianza();
        verventana.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CAlianzaActionPerformed

    private void ColegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColegiosActionPerformed
        DeColegios Colegio = new DeColegios();
        Colegio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ColegiosActionPerformed

    private void VotosColegiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VotosColegiosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VotosColegiosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CAlianza;
    private javax.swing.JMenuItem CCandidatos;
    private javax.swing.JMenuItem CCircunscripciones;
    private javax.swing.JMenuItem CDipotadosE;
    private javax.swing.JMenuItem CEscaños;
    private javax.swing.JMenuItem CMunicipios;
    private javax.swing.JMenuItem CPartidos;
    private javax.swing.JMenuItem CUsuarios;
    private javax.swing.JMenuItem Colegios;
    private javax.swing.JMenuItem MAlianza;
    private javax.swing.JMenuItem MCandidatos;
    private javax.swing.JMenuItem MCircunscripciones;
    private javax.swing.JMenuItem MMunicipios;
    private javax.swing.JMenuItem MPartidos;
    private javax.swing.JMenuItem MRecintos;
    private javax.swing.JMenuItem MUsuario;
    private javax.swing.JMenu Mantenimientos;
    private javax.swing.JMenu Movimientos;
    private javax.swing.JMenu Procesos;
    private javax.swing.JMenuItem VotosColegios;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    // End of variables declaration//GEN-END:variables
}
