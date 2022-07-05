package utp.trabajofinal.ui;

import utp.trabajofinal.control.CategoriaControl;
import utp.trabajofinal.entities.Categoria;


public class CategoriaInterface extends javax.swing.JInternalFrame {

    private final CategoriaControl control;
    private String action;
    private Categoria c;
    private String resp;
    
    public CategoriaInterface() {
        initComponents();
        this.control = new CategoriaControl();
        this.listar("");
        this.action = "guardar";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        contentTable = new javax.swing.JTable();
        DescripcionLabel = new javax.swing.JLabel();
        TextField = new javax.swing.JTextField();
        BuscarButton = new javax.swing.JButton();
        NuevoButton = new javax.swing.JButton();
        EditarButton = new javax.swing.JButton();
        EliminarButton = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Categoría");

        contentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(contentTable);

        DescripcionLabel.setText("Descripción");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DescripcionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextField, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
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
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BuscarButton)
                    .addComponent(NuevoButton)
                    .addComponent(EditarButton)
                    .addComponent(EliminarButton)
                    .addComponent(DescripcionLabel)
                    .addComponent(TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
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
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
