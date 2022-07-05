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
        jLabel1 = new javax.swing.JLabel();

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
        tablaMunicipalidad.getTableHeader().setReorderingAllowed(false);
        municipalidadScrollPane.setViewportView(tablaMunicipalidad);

        jLabel1.setText("Work in progress...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(municipalidadScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(municipalidadScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane municipalidadScrollPane;
    private javax.swing.JTable tablaMunicipalidad;
    // End of variables declaration//GEN-END:variables
}
