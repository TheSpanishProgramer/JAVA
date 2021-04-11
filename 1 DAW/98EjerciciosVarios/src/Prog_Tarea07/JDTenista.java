package Prog_Tarea07;

/**
*
* @author José Luis Comesaña
* @version 7.0
*/
public class JDTenista extends javax.swing.JDialog {
   
   private boolean haPulsadoAceptar=false;
   
   public boolean isHaPulsadoAceptar(){
       return haPulsadoAceptar;
   }
   
   /**
    * Creates new form JDTenista
    */
   public JDTenista(java.awt.Frame parent, boolean modal) {
       super(parent, modal);
       initComponents();
       this.textoError.setVisible(false);
   }

   /**
    * This method is called from within the constructor to initialize the form.
    * WARNING: Do NOT modify this code. The content of this method is always
    * regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

       jLabel1 = new javax.swing.JLabel();
       jPanel1 = new javax.swing.JPanel();
       jLabel2 = new javax.swing.JLabel();
       jLabel3 = new javax.swing.JLabel();
       textoNombre = new javax.swing.JTextField();
       textoEdad = new javax.swing.JTextField();
       jSeparator1 = new javax.swing.JSeparator();
       jSeparator2 = new javax.swing.JSeparator();
       aceptar = new javax.swing.JButton();
       cancelar = new javax.swing.JButton();
       textoError = new javax.swing.JLabel();

       setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       setTitle("Añadir Tenista");
       setAlwaysOnTop(true);
       setModal(true);
       setResizable(false);

       jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
       jLabel1.setForeground(new java.awt.Color(255, 0, 0));
       jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       jLabel1.setText("AÑADIR NUEVOS TENISTAS");
       jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

       jLabel2.setText("Nombre:");

       jLabel3.setText("Edad:");

       textoNombre.setToolTipText("Introduzca el nombre del tenista");
       textoNombre.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               textoNombreActionPerformed(evt);
           }
       });
       textoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
           public void keyTyped(java.awt.event.KeyEvent evt) {
               textoNombreKeyTyped(evt);
           }
       });

       textoEdad.setToolTipText("Introduzca la edad del tenista");
       textoEdad.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               textoEdadActionPerformed(evt);
           }
       });
       textoEdad.addKeyListener(new java.awt.event.KeyAdapter() {
           public void keyTyped(java.awt.event.KeyEvent evt) {
               textoEdadKeyTyped(evt);
           }
       });

       javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
       jPanel1.setLayout(jPanel1Layout);
       jPanel1Layout.setHorizontalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jLabel2)
                       .addGap(18, 18, Short.MAX_VALUE)
                       .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGroup(jPanel1Layout.createSequentialGroup()
                       .addComponent(jLabel3)
                       .addGap(31, 31, 31)
                       .addComponent(textoEdad)))
               .addContainerGap())
       );
       jPanel1Layout.setVerticalGroup(
           jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(jPanel1Layout.createSequentialGroup()
               .addContainerGap()
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(jLabel2)
                   .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addGap(18, 18, 18)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(textoEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addComponent(jLabel3))
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       aceptar.setText("Aceptar");
       aceptar.setToolTipText("Memorizar los datos introducidos");
       aceptar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
       aceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       aceptar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               aceptarActionPerformed(evt);
           }
       });

       cancelar.setText("Cancelar");
       cancelar.setToolTipText("Anular los datos introducidos");
       cancelar.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
       cancelar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
       cancelar.addActionListener(new java.awt.event.ActionListener() {
           public void actionPerformed(java.awt.event.ActionEvent evt) {
               cancelarActionPerformed(evt);
           }
       });

       textoError.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
       textoError.setForeground(new java.awt.Color(255, 0, 0));
       textoError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
       textoError.setText("error");

       javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
       getContentPane().setLayout(layout);
       layout.setHorizontalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addGap(10, 10, 10)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                   .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                   .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                       .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                           .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                       .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)))
               .addContainerGap())
           .addGroup(layout.createSequentialGroup()
               .addGap(92, 92, 92)
               .addComponent(aceptar)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
               .addComponent(cancelar)
               .addGap(42, 42, 42))
           .addGroup(layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(textoError, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
               .addContainerGap())
       );
       layout.setVerticalGroup(
           layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
           .addGroup(layout.createSequentialGroup()
               .addContainerGap()
               .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
               .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
               .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                   .addComponent(aceptar)
                   .addComponent(cancelar))
               .addGap(18, 18, 18)
               .addComponent(textoError)
               .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
       );

       pack();
   }// </editor-fold>//GEN-END:initComponents

   // Si pulsamos cancelar dejamos de ver esta pantalla y volvemos al menú
   // principal sin hacer nada más
   private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
       this.haPulsadoAceptar=false;
       this.setVisible(false);
   }//GEN-LAST:event_cancelarActionPerformed

   /**
    * Cuando pulsamos el botón de aceptar comprobamos que se haya introducido
    * algo como nombre del tenista, como edad, ambas cosas y que el valor
    * de la edad sea un dato numérico
    * @param <code>evt</code> evento de clic en el botón
    */
   private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
       boolean error=false;
       try{
           if(this.textoNombre.getText().equals("")&&this.textoEdad.getText().equals("")){
               this.textoError.setText("No ha introducido nombre y edad del tenista");
               error=true;
           }else if(this.textoNombre.getText().equals("")){
               this.textoError.setText("No se ha introducido el nombre del tenista");
               error=true;
           }else if(this.textoEdad.getText().equals("")){
               this.textoError.setText("No se ha introducido la edad del tenista");
               error=true;
           }else{
               int edad = Integer.parseInt(textoEdad.getText());
               this.haPulsadoAceptar=true;
               error=false;
               this.setVisible(false);
           }
       }catch(NumberFormatException nfe){
           this.textoError.setText("No es un valor de edad válido");
           error=true;
       }finally{
           if(error) this.textoError.setVisible(true);
       }
   }//GEN-LAST:event_aceptarActionPerformed

   /**
    * Si pulsamos intro sobre la caja de texto de 'nombre' hará las veces de haber
    * pulsado sobre el botón de aceptar
    * @param <code>evt</code> evento de Intro en caja de texto 
    */
   private void textoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoNombreActionPerformed
       aceptarActionPerformed(evt);
   }//GEN-LAST:event_textoNombreActionPerformed

   /**
    * Si pulsamos intro sobre la caja de texto de edad hará las veces de haber
    * pulsado sobre el botón de aceptar
    * @param <code>evt</code> evento de Intro en caja de texto 
    */
   private void textoEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoEdadActionPerformed
       aceptarActionPerformed(evt);
   }//GEN-LAST:event_textoEdadActionPerformed

   /**
    * Cuando tecleamos algo en nombre desaparece el mensaje de error
    * @param <code>evt</code> evento de pulsación de tecla en 'nombre'
    */
   private void textoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoNombreKeyTyped
       this.textoError.setVisible(false);
   }//GEN-LAST:event_textoNombreKeyTyped

   /**
    * Cuando tecleamos algo en edad desaparece el mensaje de error
    * @param <code>evt</code> evento de pulsación de tecla en 'edad'
    */
   private void textoEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textoEdadKeyTyped
       this.textoError.setVisible(false);
   }//GEN-LAST:event_textoEdadKeyTyped

   /**
    * Obtenemos los datos del tenista (nombre y edad)
    * No necesitamos comprobar el valor numérico de la edad porque no se 
    * puede grabar ninguna que no sea un número (comprobado cuando grabamos
    * la información del tenista)
    */
   public Tenista getTenista(){
       String nombre = textoNombre.getText();
       int edad = Integer.parseInt(textoEdad.getText());
       return new Tenista(nombre,edad);
   }
   /**
    * @param args the command line arguments
    */
   public static void main(String args[]) {
       /*
        * Set the Nimbus look and feel
        */
       //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
       /*
        * If Nimbus (introduced in Java SE 6) is not available, stay with the
        * default look and feel. For details see
        * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
        */
       try {
           for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
               if ("Nimbus".equals(info.getName())) {
                   javax.swing.UIManager.setLookAndFeel(info.getClassName());
                   break;
               }
           }
       } catch (ClassNotFoundException ex) {
           java.util.logging.Logger.getLogger(JDTenista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (InstantiationException ex) {
           java.util.logging.Logger.getLogger(JDTenista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (IllegalAccessException ex) {
           java.util.logging.Logger.getLogger(JDTenista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       } catch (javax.swing.UnsupportedLookAndFeelException ex) {
           java.util.logging.Logger.getLogger(JDTenista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
       }
       //</editor-fold>

       /*
        * Create and display the dialog
        */
       java.awt.EventQueue.invokeLater(new Runnable() {

           public void run() {
               JDTenista dialog = new JDTenista(new javax.swing.JFrame(), true);
               dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                   @Override
                   public void windowClosing(java.awt.event.WindowEvent e) {
                       System.exit(0);
                   }
               });
               dialog.setVisible(true);
           }
       });
   }
   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton aceptar;
   private javax.swing.JButton cancelar;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JSeparator jSeparator1;
   private javax.swing.JSeparator jSeparator2;
   private javax.swing.JTextField textoEdad;
   private javax.swing.JLabel textoError;
   private javax.swing.JTextField textoNombre;
   // End of variables declaration//GEN-END:variables
}
