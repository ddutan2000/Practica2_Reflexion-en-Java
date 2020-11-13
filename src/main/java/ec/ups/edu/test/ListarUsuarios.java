/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.controlador.*;
import ec.ups.edu.modelo.*;
import ec.ups.edu.controlador.ControladorTelefono;
import java.util.Collection;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Dutan2000
 */
public class ListarUsuarios extends javax.swing.JInternalFrame {

    private ControladorTelefono controlG;
    private ControladorUsuario controladorU;
    private Usuario usuario;
    

    public ListarUsuarios(ControladorUsuario controladorUsuario, ControladorTelefono controladorTelefono) {
        initComponents();
        controlG=controladorTelefono;
        controladorU=controladorUsuario; 
    }


    public void actualizarVista(List<Telefono> telefonos){
        DefaultTableModel modelo= (DefaultTableModel)tablaTelefonos.getModel();
        modelo.setRowCount(0);
        
        for (Telefono telefono : telefonos) {
            Object[] fila=new Object[4];
            fila[0]=telefono.getCodigo();
            fila[1]=telefono.getNumero();
            fila[2]=telefono.getTipo();
            fila[3]=telefono.getOperadora();
            modelo.addRow(fila);
        }
        tablaTelefonos.setModel(modelo);
    }
    
    public void TodosLosTelefonos(Collection<Telefono> telefonos){
        DefaultTableModel modelo= (DefaultTableModel)tablaTelefonos.getModel();
        modelo.setRowCount(0);
        
        for (Telefono telefono : telefonos) {
            Object[] fila=new Object[4];
            fila[0]=telefono.getCodigo();
            fila[1]=telefono.getNumero();
            fila[2]=telefono.getTipo();
            fila[3]=telefono.getOperadora();
            modelo.addRow(fila);
        }
        tablaTelefonos.setModel(modelo);
    }
    
    public void TodosLosUsuarios(Collection<Usuario> usuarios){
        DefaultTableModel modelo= (DefaultTableModel)tablaUsuarios.getModel();
        modelo.setRowCount(0);
        
        for (Usuario usuario : usuarios) {
            Object[] fila=new Object[5];
            fila[0]=usuario.getId();
            fila[1]=usuario.getCedula();
            fila[2]=usuario.getNombre();
            fila[3]=usuario.getApellido();
            fila[4]=usuario.getCorreo();
            modelo.addRow(fila);
        }
        tablaUsuarios.setModel(modelo);
    }
    
    public void actualizarVistaUsuario(Usuario usuario){
       DefaultTableModel modelo= (DefaultTableModel)tablaUsuarios.getModel();
        modelo.setRowCount(0); 
        
        Object[] fila = new Object[5];
        fila[0]=usuario.getId();
        fila[1]=usuario.getCedula();
        fila[2]=usuario.getNombre();
        fila[3]=usuario.getApellido();
        fila[4]=usuario.getCorreo();
        modelo.addRow(fila);
        
        tablaUsuarios.setModel(modelo);
    }
    
    public void limpiar(){
        txtCedula.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegistroDeDatos = new javax.swing.JLabel();
        lblIngresoDatos = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTelefonos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        cmbxTipoDeBusqueda = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblRegistroDeDatos.setText("REGISTRO DE DATOS");

        lblIngresoDatos.setText("INGRESAR ID DE USUARIO:");

        btnBuscar.setText("BUSCAR ");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnListar.setText("LISTAR");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tablaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NUMERO", "TIPO", "OPERADORA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTelefonos);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "CEDULA", "NOMBRE", "APELLIDO", "CORREO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaUsuarios);

        cmbxTipoDeBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONAR--", "TELEFONO", "USUARIO" }));

        jLabel1.setText("LISTA A VISUALIZAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(lblRegistroDeDatos))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIngresoDatos)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbxTipoDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 753, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblRegistroDeDatos)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIngresoDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbxTipoDeBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnListar))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
        Collection<Telefono> telefonos= controlG.findAll();
        Collection<Usuario> usuarios=controladorU.findAll();
        String tipo =cmbxTipoDeBusqueda.getSelectedItem().toString();
        switch (tipo){
            case "--SELECIONAR--":
                JOptionPane.showMessageDialog(null, "DEBE SELECIONAR UNA OPCION");
                break;
            case "TELEFONO": 
             TodosLosTelefonos(telefonos); 
            break;
            case "USUARIO":
              TodosLosUsuarios(usuarios);
                break;
        }
        
        cmbxTipoDeBusqueda.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
    
        if(!txtCedula.getText().isEmpty()){
            usuario=new Usuario(Integer.parseInt(txtCedula.getText()), null, null, null, null, null);
            Usuario u=controladorU.read(usuario);
            if (u != null){            
            actualizarVista(u.listarTelefonos());
            actualizarVistaUsuario(u);
            }else{
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL USUARIO");
            }
        }else{
        JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");
    }

    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnListar;
    private javax.swing.JComboBox<String> cmbxTipoDeBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblIngresoDatos;
    private javax.swing.JLabel lblRegistroDeDatos;
    private javax.swing.JTable tablaTelefonos;
    private javax.swing.JTable tablaUsuarios;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
