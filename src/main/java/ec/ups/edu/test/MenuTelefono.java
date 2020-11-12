/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ups.edu.test;

import ec.ups.edu.controlador.*;
import ec.ups.edu.modelo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dutan2000
 */
public class MenuTelefono extends javax.swing.JInternalFrame {

    private ControladorTelefono controladorT;
    private ControladorUsuario controladorU;
    private Telefono telefono;
    
    /**
     * Creates new form MenuTelefono
     */
    public MenuTelefono(ControladorTelefono controladorTeneral, ControladorUsuario controladorUsuario) {
        initComponents();
        controladorT=controladorTeneral;
        controladorU=controladorUsuario;
        desactivarBotones();
    }
    
    public void actualizarVista(){
      
        DefaultTableModel modelo= (DefaultTableModel)tablaTelefonos.getModel();
        modelo.setRowCount(0);
        for (Telefono telefono : controladorU.listaDeTelelfonos()) {
            Object[] fila={telefono.getCodigo(),telefono.getTipo(),telefono.getNumero(),telefono.getOperadora()};
            modelo.addRow(fila);
        }
        tablaTelefonos.setModel(modelo);
        
    }
    
    public void cargarSiguienteCodigo(){
        txtCodigo.setText(String.valueOf(controladorT.generarCodigo()));
    }
    
    public void limpiar(){
        cargarSiguienteCodigo();
        txtNumero.setText("");
        cmbxTipo.setSelectedIndex(0);
        cmbxOperadora.setSelectedIndex(0);
        
    }
    
    public void limpiarModificacion(){
        txtModificarCodigo.setText("");
        txtModificarNumero.setText("");
        cmbxModificarTipo.setSelectedIndex(0);
        cmbxModificarOperadora.setSelectedIndex(0);
        
    }
    
    public void activarBotones(){
        btnBuscar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnActualizar.setEnabled(true);
        txtBuscarCodigo.setEditable(true);
    }
    
    public void desactivarBotones(){
        btnBuscar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnActualizar.setEnabled(false);
        txtBuscarCodigo.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMenuTelefono = new javax.swing.JLabel();
        lblRegistrar = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblTipo = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        lblOperadora = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cmbxTipo = new javax.swing.JComboBox<>();
        cmbxOperadora = new javax.swing.JComboBox<>();
        txtNumero = new javax.swing.JFormattedTextField();
        btnRegistrar = new javax.swing.JButton();
        cmbxModificarTipo = new javax.swing.JComboBox<>();
        cmbxModificarOperadora = new javax.swing.JComboBox<>();
        lblModificar = new javax.swing.JLabel();
        txtModificarNumero = new javax.swing.JFormattedTextField();
        lblModificarCodigo = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();
        lblModificarTipo = new javax.swing.JLabel();
        lblModificarNumero = new javax.swing.JLabel();
        lblModificarOperadora = new javax.swing.JLabel();
        txtModificarCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTelefonos = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        lblBuscarCodigo = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscarCodigo = new javax.swing.JTextField();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        lblMenuTelefono.setText("MENU TELEFONO");

        lblRegistrar.setText("REGISTRAR");

        lblCodigo.setText("CODIGO:");

        lblTipo.setText("TIPO:");

        lblNumero.setText("NUMERO:");

        lblOperadora.setText("OPERADORA:");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCodigo.setText("0");

        cmbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "CONVENCIONAL", "MOVIL", "FAX" }));
        cmbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxTipoActionPerformed(evt);
            }
        });

        cmbxOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "CLARO", "MOVILSTAR", "ETAPA", "CNT", "TUENTI" }));

        try {
            txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)- -")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cmbxModificarTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "CONVENCIONAL", "MOVIL", "FAX" }));
        cmbxModificarTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxModificarTipoActionPerformed(evt);
            }
        });

        cmbxModificarOperadora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--SELECIONE UNA OPCION--", "CLARO", "MOVILSTAR", "ETAPA", "CNT", "TUENTI" }));

        lblModificar.setText("MODIFICAR");

        try {
            txtModificarNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)- -")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtModificarNumero.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        lblModificarCodigo.setText("CODIGO:");

        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblModificarTipo.setText("TIPO:");

        lblModificarNumero.setText("NUMERO:");

        lblModificarOperadora.setText("OPERADORA:");

        txtModificarCodigo.setEditable(false);
        txtModificarCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtModificarCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        tablaTelefonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "TIPO", "NUMERO", "OPERADORA"
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
        tablaTelefonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaTelefonosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaTelefonos);

        lblBuscar.setText("BUSCAR");

        lblBuscarCodigo.setText("CODIGO:");

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtBuscarCodigo.setEditable(false);
        txtBuscarCodigo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addComponent(lblCodigo)
                            .addComponent(lblNumero)
                            .addComponent(lblOperadora)
                            .addComponent(lblBuscar)
                            .addComponent(lblBuscarCodigo))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblRegistrar)
                                    .addComponent(cmbxTipo, 0, 1, Short.MAX_VALUE)
                                    .addComponent(cmbxOperadora, 0, 1, Short.MAX_VALUE)
                                    .addComponent(txtNumero)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBuscar)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(btnRegistrar)))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblModificarTipo)
                                    .addComponent(lblModificarCodigo)
                                    .addComponent(lblModificarNumero)
                                    .addComponent(lblModificarOperadora))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblModificar)
                                    .addComponent(txtModificarCodigo)
                                    .addComponent(cmbxModificarTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbxModificarOperadora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtModificarNumero)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(btnActualizar))))
                    .addComponent(btnCancelar))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(lblMenuTelefono)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarCodigo)
                            .addComponent(txtModificarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarTipo)
                            .addComponent(cmbxModificarTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarNumero)
                            .addComponent(txtModificarNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModificarOperadora)
                            .addComponent(cmbxModificarOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblMenuTelefono)
                        .addGap(27, 27, 27)
                        .addComponent(lblRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTipo)
                            .addComponent(cmbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumero)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOperadora)
                            .addComponent(cmbxOperadora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnRegistrar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuscar)
                    .addComponent(btnEliminar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscarCodigo)
                    .addComponent(btnBuscar)
                    .addComponent(btnCancelar)
                    .addComponent(txtBuscarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if(cmbxTipo.getSelectedIndex()!=0&&!txtNumero.getText().equals("(+593)- -")&&cmbxOperadora.getSelectedIndex()!=0){
            int codigo=Integer.parseInt(txtCodigo.getText());
            String tipo=cmbxTipo.getSelectedItem().toString();
            String numero=txtNumero.getText();
            String operadora=cmbxOperadora.getSelectedItem().toString();
            telefono=new Telefono(codigo, numero, tipo, operadora);
            controladorU.crearTelefono(telefono);
            controladorT.create(telefono);
            actualizarVista();
            JOptionPane.showMessageDialog(null, "TELEFONO REGISTRADO EXITOSAMENTE");
            limpiar();
        }else{
        JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");
    }

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void cmbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxTipoActionPerformed
        try {
            String tipo = cmbxTipo.getSelectedItem().toString();
            txtNumero.setValue("");
            switch (tipo) {
                case "CONVENCIONAL":
                    txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)#-###-###")));
                    break;
                case "MOVIL":
                    txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)#-####-####")));
                    break;
                case "FAX":
                    txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)###-###")));
                    break;
                default:
                    break;
            }
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_cmbxTipoActionPerformed

    private void tablaTelefonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaTelefonosMouseClicked
        int fila=tablaTelefonos.getSelectedRow();
        
        if(fila>=0){
        activarBotones();
        btnRegistrar.setEnabled(false);
        String codigo =tablaTelefonos.getValueAt(fila, 0).toString();
        String numero =tablaTelefonos.getValueAt(fila, 1).toString();
        String tipo=tablaTelefonos.getValueAt(fila,2).toString();
        String operadora=tablaTelefonos.getValueAt(fila, 3).toString();
        
        txtModificarCodigo.setText(codigo);
        txtModificarNumero.setText(numero);
        switch (tipo) {
            case "CONVENCIONAL":
                cmbxModificarTipo.setSelectedIndex(1);
                break;
            case "MOVIL":
                cmbxModificarTipo.setSelectedIndex(2);
                break;
            case "FAX":
                cmbxModificarTipo.setSelectedIndex(3);
                break;
            default:
                break;
        }
        
        switch (operadora) {
            case "CLARO":
                cmbxModificarOperadora.setSelectedIndex(1);
                break;
            case "MOVISTAR":
                cmbxModificarOperadora.setSelectedIndex(2);
                break;
            case "ETAPA":
                cmbxModificarOperadora.setSelectedIndex(3);
                break;
            case "CNT":
                cmbxModificarOperadora.setSelectedIndex(4);
                break;
            case "TUENTI":
                cmbxModificarOperadora.setSelectedIndex(5);
                break;
            default:               
                break;
        }
        }

    }//GEN-LAST:event_tablaTelefonosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        int buscar=Integer.parseInt(txtBuscarCodigo.getText());
        
        boolean noEncontrado=true;
        int filas=tablaTelefonos.getRowCount();
        
        for (int i = 0; i < filas; i++) {
            int codigo= Integer.parseInt(tablaTelefonos.getValueAt(i,0).toString());
            if(buscar==codigo){
                noEncontrado=false;
                tablaTelefonos.setRowSelectionInterval(i, i);
                break;
            }
            
        }
        if(noEncontrado) {
                JOptionPane.showMessageDialog(null, "NO SE HA ENCONTRADO EL CODIGO","ERROR",JOptionPane.ERROR_MESSAGE);
                
            }
        txtBuscarCodigo.setText("");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if(!txtBuscarCodigo.getText().isEmpty()){
        int respuesta= JOptionPane.showConfirmDialog(this, "DESEA ELIMINAR ESTE TELEFONO?");
          
            if(respuesta==JOptionPane.YES_OPTION){ 
            int eliminarBuscar= Integer.parseInt(txtBuscarCodigo.getText());
            telefono=new Telefono(eliminarBuscar, null, null, null);
            controladorU.deleteTelefono(controladorT.read(telefono));
            controladorT.delete(telefono);
            actualizarVista();
            
            limpiarModificacion();
            btnRegistrar.setEnabled(true);
            desactivarBotones();
            JOptionPane.showMessageDialog(null, "TELEFONO ELIMINADO EXITOSAMENTE");
            txtBuscarCodigo.setText("");
            }
        }else{
            JOptionPane.showMessageDialog(null, "EXISTE CAMPO VACIO");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       btnRegistrar.setEnabled(true);
        limpiarModificacion();
        desactivarBotones();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        if(cmbxModificarTipo.getSelectedIndex()!=0&&!txtModificarNumero.equals("(+593)- -")&&cmbxModificarOperadora.getSelectedIndex()!=0){
        int codigo=Integer.parseInt(txtModificarCodigo.getText());
        String Numero=txtModificarNumero.getText();
        String tipo=cmbxModificarTipo.getSelectedItem().toString();
        String operadora=cmbxModificarOperadora.getSelectedItem().toString();
        telefono=new Telefono(codigo, Numero, tipo, operadora);
        controladorU.actualizarTelefono(telefono);
        controladorT.update(telefono);
        actualizarVista();
        JOptionPane.showMessageDialog(null, "TELEFONO ACTULAIZADO EXITOSAMENTE"); 
        limpiarModificacion();
        desactivarBotones();
        btnRegistrar.setEnabled(true);
        
        }else{
            JOptionPane.showMessageDialog(null, "EXISTEN CAMPOS VACIOS");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed

    private void cmbxModificarTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxModificarTipoActionPerformed

        try {
            String tipo = cmbxModificarTipo.getSelectedItem().toString();
            txtModificarNumero.setValue("");
            switch (tipo) {
                case "CONVENCIONAL":
                    txtModificarNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)#-###-###")));
                    break;
                case "MOVIL":
                    txtModificarNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)#-####-####")));
                    break;
                case "FAX":
                    txtModificarNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(+593)###-###")));
                    break;
                default:
                    break;
            }
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_cmbxModificarTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cmbxModificarOperadora;
    private javax.swing.JComboBox<String> cmbxModificarTipo;
    private javax.swing.JComboBox<String> cmbxOperadora;
    private javax.swing.JComboBox<String> cmbxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JLabel lblBuscarCodigo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblMenuTelefono;
    private javax.swing.JLabel lblModificar;
    private javax.swing.JLabel lblModificarCodigo;
    private javax.swing.JLabel lblModificarNumero;
    private javax.swing.JLabel lblModificarOperadora;
    private javax.swing.JLabel lblModificarTipo;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblOperadora;
    private javax.swing.JLabel lblRegistrar;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JTable tablaTelefonos;
    private javax.swing.JTextField txtBuscarCodigo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtModificarCodigo;
    private javax.swing.JFormattedTextField txtModificarNumero;
    private javax.swing.JFormattedTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
