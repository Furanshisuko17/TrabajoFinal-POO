package utp.trabajofinal.ui;

import com.formdev.flatlaf.extras.FlatAnimatedLafChange;
import com.formdev.flatlaf.extras.FlatInspector; // has to be removed
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;
import utp.trabajofinal.sqlhandler.ConnectionInfo;
import utp.trabajofinal.sqlhandler.MySQLHandler;
import utp.trabajofinal.theme.FlatLafTheme;

public class MainInterface extends javax.swing.JFrame {
    
    private static MySQLHandler sqlconnector;
    
    private final String SQLStatusConnected = "<html>Estado: <font color='GREEN'>Conectado!</font></html>"; 
    private final String SQLStatusDisconnected = "<html>Estado: <font color='RED'>Desconectado</font></html>";
    private boolean isConnectedToDatabase;
    public static ConnectionInfo connectionInfo;
    // <editor-fold defaultstate="collapsed" desc="Icons">
    
    
    
    
    
    //</editor-fold>

    public MainInterface() {
        isConnectedToDatabase = false;
        connectionInfo = new ConnectionInfo();
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DatabaseConnectionWindow = new javax.swing.JDialog(this, true);
        BottomPanel = new javax.swing.JPanel();
        DatabaseConnectionWindowConnectButton = new javax.swing.JButton();
        ConnectionStatus = new javax.swing.JLabel();
        Separator = new com.formdev.flatlaf.extras.components.FlatSeparator();
        DatabaseConnectionPanel = new javax.swing.JTabbedPane();
        ConnectionDatabaseAutenticacionPanel = new javax.swing.JPanel();
        AutenticationPanelMain = new javax.swing.JPanel();
        InfoLabel = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        UsernameInput = new javax.swing.JTextField();
        PasswordLabel = new javax.swing.JLabel();
        PasswordInput = new com.formdev.flatlaf.extras.components.FlatPasswordField();
        DatabaseLabel = new javax.swing.JLabel();
        DatabaseInput = new javax.swing.JTextField();
        ConnectionDatabaseAvanzadoPanel = new javax.swing.JPanel();
        AdvancedPanelMain = new javax.swing.JPanel();
        InfoLabel1 = new javax.swing.JLabel();
        IPLabel = new javax.swing.JLabel();
        IPInput = new javax.swing.JTextField();
        PortLabel = new javax.swing.JLabel();
        PortInput = new javax.swing.JTextField();
        About = new javax.swing.JDialog();
        ThemeButtonGroup = new javax.swing.ButtonGroup();
        ToolBar = new com.formdev.flatlaf.extras.components.FlatToolBar();
        openMunicipalidadButton = new javax.swing.JButton();
        MainWindow = new javax.swing.JPanel();
        mainDesktopPane = new javax.swing.JDesktopPane();
        MenuBar = new javax.swing.JMenuBar();
        ArchivoMenu = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();
        EditarMenu = new javax.swing.JMenu();
        ConexionMenu = new javax.swing.JMenu();
        ConectarseBaseDatos = new javax.swing.JMenuItem();
        DesconectarseBaseDatos = new javax.swing.JMenuItem();
        ConexionMenuSeparator = new javax.swing.JPopupMenu.Separator();
        ConexionDetails = new javax.swing.JMenuItem();
        OpcionesMenu = new javax.swing.JMenu();
        TemaButton = new javax.swing.JMenu();
        TemaClaroButton = new javax.swing.JRadioButtonMenuItem();
        TemaOscuroButton = new javax.swing.JRadioButtonMenuItem();
        AyudaMenu = new javax.swing.JMenu();
        AcercaDeMenu = new javax.swing.JMenuItem();

        DatabaseConnectionWindow.setTitle("Conexión a la base de datos");

        DatabaseConnectionWindowConnectButton.setText("Conectarse");
        DatabaseConnectionWindowConnectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DatabaseConnectionWindowConnectButtonActionPerformed(evt);
            }
        });

        ConnectionStatus.setText(SQLStatusDisconnected);

        javax.swing.GroupLayout BottomPanelLayout = new javax.swing.GroupLayout(BottomPanel);
        BottomPanel.setLayout(BottomPanelLayout);
        BottomPanelLayout.setHorizontalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BottomPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ConnectionStatus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DatabaseConnectionWindowConnectButton)
                .addGap(25, 25, 25))
            .addComponent(Separator, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BottomPanelLayout.setVerticalGroup(
            BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BottomPanelLayout.createSequentialGroup()
                .addComponent(Separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(BottomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatabaseConnectionWindowConnectButton)
                    .addComponent(ConnectionStatus))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        ConnectionDatabaseAutenticacionPanel.setToolTipText("");
        ConnectionDatabaseAutenticacionPanel.setLayout(new java.awt.BorderLayout());

        InfoLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InfoLabel.setText("Establecer una conexión con la base de datos");

        UsernameLabel.setText("Usuario:");
        UsernameLabel.setToolTipText("Especifique el usuario de la base de datos");

        UsernameInput.setText("Fran");
        UsernameInput.setToolTipText("");

        PasswordLabel.setText("Contraseña:");
        PasswordLabel.setToolTipText("Especifique la contraseña de la base de datos");

        PasswordInput.setText("Fran1234");
        PasswordInput.setToolTipText("");
        PasswordInput.setName(""); // NOI18N
        PasswordInput.setPlaceholderText("");

        DatabaseLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        DatabaseLabel.setText("Base de datos:");
        DatabaseLabel.setToolTipText("Especifique el nombre de la base de datos");

        DatabaseInput.setText("arbitrios");

        javax.swing.GroupLayout AutenticationPanelMainLayout = new javax.swing.GroupLayout(AutenticationPanelMain);
        AutenticationPanelMain.setLayout(AutenticationPanelMainLayout);
        AutenticationPanelMainLayout.setHorizontalGroup(
            AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutenticationPanelMainLayout.createSequentialGroup()
                .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutenticationPanelMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(InfoLabel))
                    .addGroup(AutenticationPanelMainLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PasswordLabel)
                            .addComponent(UsernameLabel)
                            .addComponent(DatabaseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(PasswordInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(DatabaseInput, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UsernameInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        AutenticationPanelMainLayout.setVerticalGroup(
            AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AutenticationPanelMainLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(InfoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AutenticationPanelMainLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(UsernameLabel))
                    .addComponent(UsernameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PasswordLabel)
                    .addComponent(PasswordInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(AutenticationPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DatabaseLabel)
                    .addComponent(DatabaseInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );

        ConnectionDatabaseAutenticacionPanel.add(AutenticationPanelMain, java.awt.BorderLayout.CENTER);

        DatabaseConnectionPanel.addTab("Autenticación", ConnectionDatabaseAutenticacionPanel);

        ConnectionDatabaseAvanzadoPanel.setLayout(new java.awt.BorderLayout());

        InfoLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        InfoLabel1.setText("Opciones avanzadas");

        IPLabel.setText("IP: ");
        IPLabel.setToolTipText("IP de la base de datos");

        IPInput.setText("localhost");
        IPInput.setToolTipText("");

        PortLabel.setText("Puerto:");
        PortLabel.setToolTipText("Especifique el puerto de la base de datos");

        PortInput.setText("3307");
        PortInput.setToolTipText("");

        javax.swing.GroupLayout AdvancedPanelMainLayout = new javax.swing.GroupLayout(AdvancedPanelMain);
        AdvancedPanelMain.setLayout(AdvancedPanelMainLayout);
        AdvancedPanelMainLayout.setHorizontalGroup(
            AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdvancedPanelMainLayout.createSequentialGroup()
                .addGroup(AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdvancedPanelMainLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(InfoLabel1))
                    .addGroup(AdvancedPanelMainLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PortLabel)
                            .addComponent(IPLabel))
                        .addGap(7, 7, 7)
                        .addGroup(AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IPInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PortInput, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
        );
        AdvancedPanelMainLayout.setVerticalGroup(
            AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdvancedPanelMainLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(InfoLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdvancedPanelMainLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(IPLabel))
                    .addComponent(IPInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(AdvancedPanelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PortLabel)
                    .addComponent(PortInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        ConnectionDatabaseAvanzadoPanel.add(AdvancedPanelMain, java.awt.BorderLayout.CENTER);

        DatabaseConnectionPanel.addTab("Avanzado", ConnectionDatabaseAvanzadoPanel);

        javax.swing.GroupLayout DatabaseConnectionWindowLayout = new javax.swing.GroupLayout(DatabaseConnectionWindow.getContentPane());
        DatabaseConnectionWindow.getContentPane().setLayout(DatabaseConnectionWindowLayout);
        DatabaseConnectionWindowLayout.setHorizontalGroup(
            DatabaseConnectionWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DatabaseConnectionPanel)
            .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        DatabaseConnectionWindowLayout.setVerticalGroup(
            DatabaseConnectionWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DatabaseConnectionWindowLayout.createSequentialGroup()
                .addComponent(DatabaseConnectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BottomPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        DatabaseConnectionWindow.pack();
        DatabaseConnectionWindow.setLocationRelativeTo(null);
        DatabaseConnectionWindow.setResizable(false);

        About.setTitle("Acerca de");

        javax.swing.GroupLayout AboutLayout = new javax.swing.GroupLayout(About.getContentPane());
        About.getContentPane().setLayout(AboutLayout);
        AboutLayout.setHorizontalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        AboutLayout.setVerticalGroup(
            AboutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        About.pack();
        About.setLocationRelativeTo(null);
        About.setResizable(false);

        ThemeButtonGroup.add(TemaClaroButton);
        ThemeButtonGroup.add(TemaOscuroButton);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de arbitrios");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ToolBar.setRollover(true);

        openMunicipalidadButton.setText("Municipalidad");
        openMunicipalidadButton.setFocusable(false);
        openMunicipalidadButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        openMunicipalidadButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        openMunicipalidadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMunicipalidadButtonActionPerformed(evt);
            }
        });
        ToolBar.add(openMunicipalidadButton);

        MainWindow.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout mainDesktopPaneLayout = new javax.swing.GroupLayout(mainDesktopPane);
        mainDesktopPane.setLayout(mainDesktopPaneLayout);
        mainDesktopPaneLayout.setHorizontalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mainDesktopPaneLayout.setVerticalGroup(
            mainDesktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        MainWindow.add(mainDesktopPane, java.awt.BorderLayout.CENTER);

        MenuBar.setBorderPainted(false);

        ArchivoMenu.setText("Archivo");
        ArchivoMenu.setToolTipText("");

        Salir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Salir.setIcon(new FlatSVGIcon(getClass().getResource("/icons/exit.svg")));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoSalirButton(evt);
            }
        });
        ArchivoMenu.add(Salir);

        MenuBar.add(ArchivoMenu);

        EditarMenu.setText("Editar");
        MenuBar.add(EditarMenu);

        ConexionMenu.setText("Conexión");

        ConectarseBaseDatos.setText("Conectarse a una base de datos");
        ConectarseBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectToDatabaseButton(evt);
            }
        });
        ConexionMenu.add(ConectarseBaseDatos);

        DesconectarseBaseDatos.setText("Desconectarse de la base de datos");
        DesconectarseBaseDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disconnectFromDatabaseButton(evt);
            }
        });
        ConexionMenu.add(DesconectarseBaseDatos);
        ConexionMenu.add(ConexionMenuSeparator);

        ConexionDetails.setText("Detalles de la conexión");
        ConexionDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConexionDetailsActionPerformed(evt);
            }
        });
        ConexionMenu.add(ConexionDetails);

        MenuBar.add(ConexionMenu);

        OpcionesMenu.setText("Opciones");

        TemaButton.setText("Tema");

        TemaClaroButton.setText("Claro");
        TemaButton.add(TemaClaroButton);

        TemaOscuroButton.setSelected(true);
        TemaOscuroButton.setText("Oscuro");
        TemaOscuroButton.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e){
                temaOscuroButtonItemListener(e);
            }
        });
        TemaButton.add(TemaOscuroButton);

        OpcionesMenu.add(TemaButton);

        MenuBar.add(OpcionesMenu);

        AyudaMenu.setText("Ayuda");

        AcercaDeMenu.setText("Acerca de");
        AcercaDeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcercaDeMenuActionPerformed(evt);
            }
        });
        AyudaMenu.add(AcercaDeMenu);

        MenuBar.add(AyudaMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainWindow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void temaOscuroButtonItemListener(ItemEvent e){
        if(e.getStateChange() == ItemEvent.SELECTED){
            FlatAnimatedLafChange.showSnapshot();
            try {
                UIManager.setLookAndFeel("utp.trabajofinal.theme.FlatLafTheme");
            } catch (Exception ex) {
                MessageHandler.exceptionMessage(ex);
            }
            com.formdev.flatlaf.FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        }else if(e.getStateChange() == ItemEvent.DESELECTED){
            FlatAnimatedLafChange.showSnapshot();
            try {
                UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
            } catch (Exception ex) {
                MessageHandler.exceptionMessage(ex);
            }
            com.formdev.flatlaf.FlatLaf.updateUI();
            FlatAnimatedLafChange.hideSnapshotWithAnimation();
        }
    }
    private void ArchivoSalirButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoSalirButton
        dispose();
        System.exit(0);
    }//GEN-LAST:event_ArchivoSalirButton

    private void connectToDatabaseButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connectToDatabaseButton
        DatabaseConnectionWindow.setVisible(true);
    }//GEN-LAST:event_connectToDatabaseButton
  
    private void disconnectFromDatabaseButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disconnectFromDatabaseButton
        if(isConnectedToDatabase){
            int c = MessageHandler.questionMessage("¿Desea desconectarse de la base de datos?");
            
            if(c == JOptionPane.YES_OPTION) { 
                isConnectedToDatabase = false;
                ConnectionStatus.setText(SQLStatusDisconnected);
                //Disable buttons and jtextfields
                DatabaseConnectionWindowConnectButton.setEnabled(true);
                UsernameInput.setEditable(true);
                PasswordInput.setEditable(true);
                IPInput.setEditable(true);
                DatabaseInput.setEditable(true);
                PortInput.setEditable(true);
                connectionInfo.clearData();
                MySQLHandler.clearInstance();
                sqlconnector = null;
                
            }else {
                return;
            }
        } else {
            MessageHandler.informationMessage(
                    "No estas conectado a una base de datos.", 
                    "Desconectarse...");
        }
    }//GEN-LAST:event_disconnectFromDatabaseButton
    
    private void DatabaseConnectionWindowConnectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DatabaseConnectionWindowConnectButtonActionPerformed
        
        int port = 0;
        try {
            port = Integer.parseInt(PortInput.getText());
        }catch (NumberFormatException e){
            MessageHandler.exceptionMessage("El valor introducidoe en el puerto no es un número!");
            PortInput.putClientProperty("JComponent.outline", "error");
            return; //
        }
        connectionInfo.setPort(port);
        connectionInfo.setIP(IPInput.getText());
        connectionInfo.setUser(UsernameInput.getText());
        connectionInfo.setPassword(PasswordInput.getPassword());
        connectionInfo.setDatabase(DatabaseInput.getText());
        
        sqlconnector = MySQLHandler.getInstance(connectionInfo.getIP(), connectionInfo.getPort(), 
                        connectionInfo.getDatabase(), connectionInfo.getUser(), connectionInfo.getPassword());
        //sql.toString();
        sqlconnector.conectar();   
        
        if(sqlconnector.isConnected()){
            System.out.println("CONECTADO!");
            sqlconnector.toString();
            ConnectionStatus.setText(SQLStatusConnected);
            //Disable buttons and jtextfields
            DatabaseConnectionWindowConnectButton.setEnabled(false);
            UsernameInput.setEditable(false);
            PasswordInput.setEditable(false);
            IPInput.setEditable(false);
            DatabaseInput.setEditable(false);
            PortInput.setEditable(false);
            PortInput.putClientProperty("JComponent.outline", "");
            isConnectedToDatabase = true;
        }else {
            MessageHandler.exceptionMessage(null, MessageHandler.EXCEPTION_TITLE, "No se pudo conectar.");
        }
        sqlconnector.desconectar();
    }//GEN-LAST:event_DatabaseConnectionWindowConnectButtonActionPerformed

    //Prompt database login at program start 
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DatabaseConnectionWindow.setVisible(true); 
    }//GEN-LAST:event_formWindowOpened

    private void ConexionDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConexionDetailsActionPerformed
        if(isConnectedToDatabase){
            sqlconnector.conectar();
            MessageHandler.informationMessage(
                    sqlconnector.toString(), 
                    "Detalles de la conexión");
        }else{
            MessageHandler.informationMessage(
                    "No estas conectado a una base de datos.", 
                    "Detalles de la conexión");
        }
        
    }//GEN-LAST:event_ConexionDetailsActionPerformed

    private void AcercaDeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcercaDeMenuActionPerformed
        About.setVisible(true);
    }//GEN-LAST:event_AcercaDeMenuActionPerformed

    private void openMunicipalidadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMunicipalidadButtonActionPerformed
        
        if(isConnectedToDatabase){
                CiudadanoInterface muni = new CiudadanoInterface();
                muni.addInternalFrameListener(new InternalFrameListener() {
                    @Override
                    public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                        openMunicipalidadButton.setEnabled(true);
                    }
                    @Override
                    public void internalFrameOpened(InternalFrameEvent e) {}
                    @Override
                    public void internalFrameClosed(InternalFrameEvent e) {}
                    @Override
                    public void internalFrameIconified(InternalFrameEvent e) {}
                    @Override
                    public void internalFrameDeiconified(InternalFrameEvent e) {}
                    @Override
                    public void internalFrameActivated(InternalFrameEvent e) {}                        
                    @Override
                    public void internalFrameDeactivated(InternalFrameEvent e) {}
                });
                mainDesktopPane.add(muni);
                muni.setVisible(true);
                openMunicipalidadButton.setEnabled(false);
                
                
        }else {
            MessageHandler.exceptionMessage("No estas conectado a una base de datos.");
        }
        
    }//GEN-LAST:event_openMunicipalidadButtonActionPerformed

    public static void defineUI(){
        UIManager.put("PasswordField.showRevealButton", true );
        UIManager.put("PasswordField.showCapsLock", true);
    }
    
    public static void main(String args[]) {
        //FlatDarkLaf look and feel    
        
        FlatLafTheme.setup();
        FlatInspector.install( "ctrl shift alt X" ); //has to be removed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);

            }
        });
        
        defineUI();
    }
    
    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog About;
    private javax.swing.JMenuItem AcercaDeMenu;
    private javax.swing.JPanel AdvancedPanelMain;
    private javax.swing.JMenu ArchivoMenu;
    private javax.swing.JPanel AutenticationPanelMain;
    private javax.swing.JMenu AyudaMenu;
    private javax.swing.JPanel BottomPanel;
    private javax.swing.JMenuItem ConectarseBaseDatos;
    private javax.swing.JMenuItem ConexionDetails;
    private javax.swing.JMenu ConexionMenu;
    private javax.swing.JPopupMenu.Separator ConexionMenuSeparator;
    private javax.swing.JPanel ConnectionDatabaseAutenticacionPanel;
    private javax.swing.JPanel ConnectionDatabaseAvanzadoPanel;
    private javax.swing.JLabel ConnectionStatus;
    private javax.swing.JTabbedPane DatabaseConnectionPanel;
    private javax.swing.JDialog DatabaseConnectionWindow;
    private javax.swing.JButton DatabaseConnectionWindowConnectButton;
    private javax.swing.JTextField DatabaseInput;
    private javax.swing.JLabel DatabaseLabel;
    private javax.swing.JMenuItem DesconectarseBaseDatos;
    private javax.swing.JMenu EditarMenu;
    private javax.swing.JTextField IPInput;
    private javax.swing.JLabel IPLabel;
    private javax.swing.JLabel InfoLabel;
    private javax.swing.JLabel InfoLabel1;
    private javax.swing.JPanel MainWindow;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu OpcionesMenu;
    private com.formdev.flatlaf.extras.components.FlatPasswordField PasswordInput;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JTextField PortInput;
    private javax.swing.JLabel PortLabel;
    private javax.swing.JMenuItem Salir;
    private com.formdev.flatlaf.extras.components.FlatSeparator Separator;
    private javax.swing.JMenu TemaButton;
    private javax.swing.JRadioButtonMenuItem TemaClaroButton;
    private javax.swing.JRadioButtonMenuItem TemaOscuroButton;
    private javax.swing.ButtonGroup ThemeButtonGroup;
    private com.formdev.flatlaf.extras.components.FlatToolBar ToolBar;
    private javax.swing.JTextField UsernameInput;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JDesktopPane mainDesktopPane;
    private javax.swing.JButton openMunicipalidadButton;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>
}
