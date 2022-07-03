package utp.trabajofinal.ui;

import utp.trabajofinal.control.CiudadanoControl;
import utp.trabajofinal.entities.Ciudadano;

public class CiudadanoInterface extends javax.swing.JInternalFrame {

    private final CiudadanoControl control;
    private String action;
    private Ciudadano muni;
    private String resp;
    
    public CiudadanoInterface() {
        initComponents();
        this.control = new CiudadanoControl();
        this.listar("");
        this.action = "guardar";
        
            
    }
    
    private void listar(String text){
        tablaMunicipalidad.setModel(this.control.listar(text));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        municipalidadScrollPane = new javax.swing.JScrollPane();
        tablaMunicipalidad = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Ciudadano");
        setToolTipText("");
        setFrameIcon(null);

        tablaMunicipalidad.setAutoCreateRowSorter(true);
        tablaMunicipalidad.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaMunicipalidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaMunicipalidad.setRowSelectionAllowed(true);
        tablaMunicipalidad.getTableHeader().setReorderingAllowed(false);
        municipalidadScrollPane.setViewportView(tablaMunicipalidad);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(municipalidadScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(municipalidadScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane municipalidadScrollPane;
    private javax.swing.JTable tablaMunicipalidad;
    // End of variables declaration//GEN-END:variables
}
