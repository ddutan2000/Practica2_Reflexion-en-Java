/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;
import ec.ups.edu.controlador.*;
import ec.ups.edu.controlador.ControladorTelefono;
import ec.ups.edu.controlador.ControladorUsuario;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
/**
 *
 * @author Dutan2000
 */
public class MenuPrincipal extends javax.swing.JFrame {

    //vistas 
    private InicioSession inicioSession;
    private ListarUsuarios listarUsuario;
    private MenuTelefono menuTelefono;
    private MenuUsuario menuUsuario;
    private RegistrarUsuario registrarUsuario;

    
    //controlador
    private ControladorTelefono controladorTelefono;
    private ControladorUsuario controladorUsuario;
    
    
    public MenuPrincipal() {
        initComponents();
        
        tabCerrarSession.setVisible(false);
        tabMenu.setVisible(false);
        
        controladorTelefono= new ControladorTelefono();
        controladorUsuario= new ControladorUsuario();    
        
        inicioSession= new InicioSession(this, controladorUsuario);
        listarUsuario=new ListarUsuarios(controladorUsuario, controladorTelefono);
        menuTelefono= new MenuTelefono(controladorTelefono, controladorUsuario);
        menuUsuario=new MenuUsuario(controladorUsuario);
        registrarUsuario=new RegistrarUsuario(controladorUsuario);
        
        desktopPane.add(inicioSession);
        desktopPane.add(listarUsuario);
        desktopPane.add(menuTelefono);
        desktopPane.add(menuUsuario);
        desktopPane.add(registrarUsuario);
        
        
    }
    
    public JMenu getTabMenu(){
        return tabMenu;
    } 
    
    public JMenuItem getIniciarSession(){
        return tabIniciarSession;
    }
    public JMenuItem getregistrarUsuario(){
        return tabRegistrarU;
    }
    public JMenuItem getCerrarSession(){
        return tabCerrarSession;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        tabInicio = new javax.swing.JMenu();
        tabIniciarSession = new javax.swing.JMenuItem();
        tabListar = new javax.swing.JMenuItem();
        tabRegistrarU = new javax.swing.JMenuItem();
        tabCerrarSession = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        tabMenu = new javax.swing.JMenu();
        tabMenuTelefono = new javax.swing.JMenuItem();
        tabMenuUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desktopPane.setLayout(null);

        tabInicio.setMnemonic('f');
        tabInicio.setText("INICIO");

        tabIniciarSession.setMnemonic('o');
        tabIniciarSession.setText("I. SESSION");
        tabIniciarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabIniciarSessionActionPerformed(evt);
            }
        });
        tabInicio.add(tabIniciarSession);

        tabListar.setMnemonic('s');
        tabListar.setText("LISTAR");
        tabListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabListarActionPerformed(evt);
            }
        });
        tabInicio.add(tabListar);

        tabRegistrarU.setMnemonic('a');
        tabRegistrarU.setText("REGISTRAR U.");
        tabRegistrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabRegistrarUActionPerformed(evt);
            }
        });
        tabInicio.add(tabRegistrarU);

        tabCerrarSession.setMnemonic('a');
        tabCerrarSession.setText("CERRAR SESSION");
        tabCerrarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabCerrarSessionActionPerformed(evt);
            }
        });
        tabInicio.add(tabCerrarSession);

        exitMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("EXIT");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        tabInicio.add(exitMenuItem);

        menuBar.add(tabInicio);

        tabMenu.setMnemonic('e');
        tabMenu.setText("MENU");

        tabMenuTelefono.setMnemonic('t');
        tabMenuTelefono.setText("TELEFONOS");
        tabMenuTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabMenuTelefonoActionPerformed(evt);
            }
        });
        tabMenu.add(tabMenuTelefono);

        tabMenuUsuario.setMnemonic('y');
        tabMenuUsuario.setText("USUARIO");
        tabMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabMenuUsuarioActionPerformed(evt);
            }
        });
        tabMenu.add(tabMenuUsuario);

        menuBar.add(tabMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 624, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void tabRegistrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabRegistrarUActionPerformed
        registrarUsuario.setVisible(true);

    }//GEN-LAST:event_tabRegistrarUActionPerformed

    private void tabCerrarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabCerrarSessionActionPerformed
        tabMenu.setVisible(false);
        tabCerrarSession.setVisible(false);
        tabIniciarSession.setVisible(true);
        tabRegistrarU.setVisible(true);

    }//GEN-LAST:event_tabCerrarSessionActionPerformed

    private void tabIniciarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabIniciarSessionActionPerformed
        inicioSession.setVisible(true);

    }//GEN-LAST:event_tabIniciarSessionActionPerformed

    private void tabListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabListarActionPerformed
       listarUsuario.setVisible(true);
    }//GEN-LAST:event_tabListarActionPerformed

    private void tabMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabMenuUsuarioActionPerformed
        menuUsuario.setVisible(true);
        
    }//GEN-LAST:event_tabMenuUsuarioActionPerformed

    private void tabMenuTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabMenuTelefonoActionPerformed
        menuTelefono.setVisible(true);
    }//GEN-LAST:event_tabMenuTelefonoActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem tabCerrarSession;
    private javax.swing.JMenuItem tabIniciarSession;
    private javax.swing.JMenu tabInicio;
    private javax.swing.JMenuItem tabListar;
    private javax.swing.JMenu tabMenu;
    private javax.swing.JMenuItem tabMenuTelefono;
    private javax.swing.JMenuItem tabMenuUsuario;
    private javax.swing.JMenuItem tabRegistrarU;
    // End of variables declaration//GEN-END:variables

}
