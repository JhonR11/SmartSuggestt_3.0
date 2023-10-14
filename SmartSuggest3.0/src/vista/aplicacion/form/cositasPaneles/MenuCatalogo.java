package vista.aplicacion.form.cositasPaneles;

import entidades.Catalogo;
import entidades.TarjetaGrafica;
import javax.swing.JOptionPane;
import raven.toast.Notifications;
import com.formdev.flatlaf.FlatClientProperties;
/**
 *
 * JhonRoca
 */
public class MenuCatalogo extends javax.swing.JPanel {

    Catalogo catalogo;

    /**
     *
     */
    public MenuCatalogo() {
        int id=0;
        initComponents();
        catalogo = new Catalogo() {};
        catalogo.CrearCatalogo();
        //Nvidia gt series 700
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GT 710","2/1 ","DDR3",19,false,"ninguno","PCI 2.0 x8",192,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GT 720","1/2","DDR3/GDDR5",23,false,"ninguno","PCI 2.0 x8",192,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GT 730","2","GDDR5",35,false,"ninguno","PCI 2.0 x16",384,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GT 740","1/2","GDDR5/DDR3",64,true,"0/1x6","PCI 3.0 x16",384,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 750","2","GDDR5",55,false,"ninguno","PCI 3.0 x16",512,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 750 ti","2","GDDR5",60,false,"ninguno","PCI 3.0 x16",640,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 760","2","GDDR5",170,true,"2x16","PCI 3.0 x16",1152,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 770","2","GDDR5",230,true,"1x6/1x8","CPCI 3.0 x16",1536,"baja"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 780","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2304,"baja-media"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX 780 ti","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2880,"baja-media"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX TITAN","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2688,"baja-alta"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GTX TITAN BLACK","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",2880,"baja-alta"));
        catalogo.InsertarTarjeta(new TarjetaGrafica(id++,"Nvidia","GT TITAN Z","2","GDDR5",250,true,"1x6/1x8","PCI 3.0 x16",5780,"baja-alta"));
        
        ///////
        initComponents();
        
        AgregarTarjeta.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        Catalogo.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        Modificar.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        Borrar.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        regresar.putClientProperty(FlatClientProperties.STYLE, ""
                + "borderWidth:0;"
                + "focusWidth:0");
        
        
        }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AgregarTarjeta = new javax.swing.JButton();
        Catalogo = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mainPanel1 = new vista.swing.win_button.MainPanel();
        winButton1 = new vista.swing.win_button.WinButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jta_imprimir = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Modificar = new javax.swing.JButton();

        AgregarTarjeta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AgregarTarjeta.setText("Agregar Tarjeta");

        Catalogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Catalogo.setText("Ver Tarjetas");
        Catalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatalogoActionPerformed(evt);
            }
        });

        Borrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });

        regresar.setText("Salir");
        regresar.setBorder(null);
        regresar.setBorderPainted(false);
        regresar.setName(""); // NOI18N
        regresar.setOpaque(true);
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel1Layout = new javax.swing.GroupLayout(mainPanel1);
        mainPanel1.setLayout(mainPanel1Layout);
        mainPanel1Layout.setHorizontalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(winButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanel1Layout.setVerticalGroup(
            mainPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel1Layout.createSequentialGroup()
                .addComponent(winButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jta_imprimir.setColumns(20);
        jta_imprimir.setRows(5);
        jScrollPane1.setViewportView(jta_imprimir);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 50)); // NOI18N
        jLabel1.setText("Smart Suggest       Proveerdor Version´s");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/icon/png/Logo.png"))); // NOI18N

        Modificar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Modificar.setText("Modificar Tarjeta");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Catalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AgregarTarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 913, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel2))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgregarTarjeta)
                        .addGap(18, 18, 18)
                        .addComponent(Catalogo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                        .addComponent(regresar)
                        .addGap(99, 99, 99))
                    .addComponent(jScrollPane1)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarTarjetaPerformed(java.awt.event.ActionEvent evt){
        
        //ingreso de una grafica o varias
        int id=0;
        catalogo.InsertarTarjeta(catalogo.CrearTarjeta(id));
    }
    
    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
        
       int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la id de la tarjeta a eliminar :D"));
        if(catalogo.eliminartarjeta(id)){
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Se elimino con exito :D");
            
            
        }    else{
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Nos se encontro el id");   
            }   
    }//GEN-LAST:event_BorrarActionPerformed

    private void CatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatalogoActionPerformed
         //catalogo

        jta_imprimir.setText(" "); 
        
        jta_imprimir.setText(catalogo.Imprimir());
        
        
    }//GEN-LAST:event_CatalogoActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        
        int id=Integer.parseInt(JOptionPane.showInputDialog("Ingresa la id de la tarjeta a modificar :D"));
        if(catalogo.modificartarjeta(catalogo.CrearTarjeta(id))){
            Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "se registro con exito :D");
        }    else{
            Notifications.getInstance().show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "No se Pudo Registrar, verifique el ID");
        
    }//GEN-LAST:event_ModificarActionPerformed
    }
    
    
    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
         Notifications.getInstance().show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "no se como devolverme jaja lol");
         Notifications.getInstance().show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "no se como devolverme jaja lol");
         Notifications.getInstance().show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "no se como devolverme jaja lol");
        
    }//GEN-LAST:event_regresarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarTarjeta;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Catalogo;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jta_imprimir;
    private vista.swing.win_button.MainPanel mainPanel1;
    private javax.swing.JButton regresar;
    private vista.swing.win_button.WinButton winButton1;
    // End of variables declaration//GEN-END:variables
}
