package utp.trabajofinal.ui;

import utp.trabajofinal.control.EmpresaControl;
import utp.trabajofinal.entities.Empresa;


public class EmpresaInterface extends javax.swing.JInternalFrame {
    
    private final EmpresaControl control;
    private String action;
    private Empresa c;
    private String resp;

    public EmpresaInterface() {
        initComponents();
        this.control = new EmpresaControl();
        this.listar("");
        this.action = "guardar";
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contentTableScrollPane = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        BuscarButton = new javax.swing.JButton();
        NuevoButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();
        DescripcionLabel = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Empresa");

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        contentTableScrollPane.setViewportView(contentTable);

        BuscarButton.setText("Buscar");
        BuscarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarButtonActionPerformed(evt);
            }
        });

        NuevoButton.setText("Nuevo");
        NuevoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoButtonActionPerformed(evt);
            }
        });

        EditarButton.setText("Editar");
        EditarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarButtonActionPerformed(evt);
            }
        });

        EliminarButton.setText("Eliminar");
        EliminarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarButtonActionPerformed(evt);
            }
        });

        DescripcionLabel.setText("Descripción");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contentTableScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DescripcionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(BuscarButton)
                        .addGap(18, 18, 18)
                        .addComponent(NuevoButton)
                        .addGap(18, 18, 18)
                        .addComponent(EditarButton)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarButton)
                    .addComponent(NuevoButton)
                    .addComponent(EditarButton)
                    .addComponent(EliminarButton)
                    .addComponent(DescripcionLabel)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contentTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listar(String text){
        contentTable.setModel(this.control.listar(text));
    }
    
    private void BuscarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarButtonActionPerformed
        this.listar(this.TextField.getText());
    }//GEN-LAST:event_BuscarButtonActionPerformed

    private void NuevoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoButtonActionPerformed
       
    }//GEN-LAST:event_NuevoButtonActionPerformed

    private void EditarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarButtonActionPerformed
        
    }//GEN-LAST:event_EditarButtonActionPerformed

    private void EliminarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarButtonActionPerformed
        
    }//GEN-LAST:event_EliminarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BuscarButton;
    private javax.swing.JLabel DescripcionLabel;
    private javax.swing.JButton EditarButton;
    private javax.swing.JButton EliminarButton;
    private javax.swing.JButton NuevoButton;
    private javax.swing.JTextField TextField;
    private javax.swing.JTable contentTable;
    private javax.swing.JScrollPane contentTableScrollPane;
    // End of variables declaration//GEN-END:variables
}
