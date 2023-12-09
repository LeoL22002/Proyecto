/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mantenimientos;

import MenuPrincipal.MenuP;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class DeUsuario extends javax.swing.JFrame {

    /**
     * Creates new form Usuario
     */
    public DeUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Password = new javax.swing.JPasswordField();
        Nombre = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Apellido = new javax.swing.JTextField();
        Login = new javax.swing.JTextField();
        Email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nivel_acceso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Guardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Limpiar = new javax.swing.JButton();
        Salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Registrate");

        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });

        jLabel6.setText("Nombre");

        jLabel1.setText("Login");

        jLabel7.setText("Apellido");

        jLabel2.setText("Password");

        Nivel_acceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(0) Administrador", "(1) Usuario" }));
        Nivel_acceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nivel_accesoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nivel de acceso");

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Email");

        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Guardar)
                        .addGap(52, 52, 52)
                        .addComponent(Limpiar)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Buscar)
                        .addGap(55, 55, 55))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(131, 131, 131)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(202, 202, 202))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nivel_acceso, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                                                .addComponent(Password))
                                            .addGap(0, 0, Short.MAX_VALUE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Nombre)
                                        .addComponent(Apellido)
                                        .addComponent(Email))))
                            .addGap(116, 116, 116)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Limpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Salir)
                .addGap(26, 26, 26))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nivel_acceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(1, 1, 1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        buscarYRellenarUsuario();
    }//GEN-LAST:event_BuscarActionPerformed

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed

    }//GEN-LAST:event_EmailActionPerformed

    private void Nivel_accesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nivel_accesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Nivel_accesoActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String usuario = Login.getText();
        String password = new String(Password.getPassword());
        String acceso = (String) Nivel_acceso.getSelectedItem();
        String nombre = Nombre.getText();
        String apellido = Apellido.getText();
        String email = Email.getText();

        // Validar que el usuario y la contraseña no estén vacíos
        if (usuario.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El usuario y la contraseña son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }
        
        if (!email.isEmpty() && (!email.contains("@") || !email.contains("."))) {
            JOptionPane.showMessageDialog(null, "El correo electrónico debe contener arroba (@) y punto (.)", "Error", JOptionPane.ERROR_MESSAGE);
            return; // Detener el proceso
        }
        
        if(email.isEmpty()){
            email = "-";
        }
        
        try {
            // Intentar abrir el archivo
            File archivo = new File("Archivos\\Usuario.txt");

            // Verificar si el archivo existe
            if (archivo.exists()) {
                // Verificar si el usuario ya existe en el archivo
                if (modificarUsuario(usuario, password, acceso, nombre, apellido, email)) {
                    JOptionPane.showMessageDialog(null, "Información del usuario modificada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
                    LimpiarCampos();
                    return; // Detener el proceso si el usuario ya existe y fue modificado
                }
            }
            else {
                // Si el archivo no existe, intentar crear uno nuevo
                if (archivo.createNewFile()) {
                    System.out.println("Se ha creado un nuevo archivo.");
                }
                else {
                    JOptionPane.showMessageDialog(null, "No se pudo crear el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
                    return; // Detener el proceso si no se pudo crear el archivo
                }
            }

            crearUsuario(archivo, usuario, password, acceso, nombre, apellido, email);

        } catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        LimpiarCampos();
    }//GEN-LAST:event_LimpiarActionPerformed

    private void LimpiarCampos(){
        Login.setText("");
        Password.setText("");
        Nivel_acceso.setSelectedItem("(0) Administrador");
        Nombre.setText("");
        Apellido.setText("");
        Email.setText("");        
    }
    
    
    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MenuP Menu = new MenuP();
        Menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void crearUsuario(File archivo, String usuario, String password, String acceso, String nombre, String apellido, String email){
        // Abrir flujos de escritura
        try (FileWriter FW = new FileWriter(archivo, true);
            BufferedWriter BW = new BufferedWriter(FW)) {

            // Crear la línea formateada
            String linea = String.format("%s,%s,%s,%s,%s,%s", usuario, password, acceso, nombre, apellido, email);
            System.out.println("Linea: " + linea);  // Agregar esta línea para imprimir la línea formateada

            // Aquí se guarda la información
            BW.write(linea);
            BW.newLine(); // Añadir una nueva línea

            JOptionPane.showMessageDialog(null, "Información guardada en el archivo.", "Información", JOptionPane.INFORMATION_MESSAGE);
            LimpiarCampos();

        } 
        catch (IOException e) {
            // Capturar y manejar la excepción en caso de error
            JOptionPane.showMessageDialog(null, "Error al manejar el archivo: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
    
    private boolean modificarUsuario(String usuario, String password, String acceso, String nombre, String apellido, String email) {
        // Crear una lista para almacenar las líneas modificadas
        List<String> lineasModificadas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Usuario.txt"))) {
            String linea;
            boolean usuarioModificado = false;

            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6 && partes[0].equals(usuario) && partes[1].equals(password)) {
                    // Encontramos el partido, rellenamos los campos
                    partes[2] = acceso;
                    partes[3] = nombre;
                    partes[4] = apellido;                    
                    partes[5] = email;                    
                    
                     // Agregamos la línea modificada a la lista
                    lineasModificadas.add(String.join(",", partes));
                    usuarioModificado = true;
                } 
                else {
                    // Si no es el partido que estamos buscando, simplemente agregamos la línea al listado
                    lineasModificadas.add(linea);
                }
            }

            if (usuarioModificado) {
                // Ahora escribimos las líneas modificadas de vuelta al archivo
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Archivos\\Usuario.txt"))) {
                    for (String lineaModificada : lineasModificadas) {
                        bw.write(lineaModificada);
                        bw.newLine(); // Agregamos un salto de línea después de cada línea
                    }
                }
            }

            return usuarioModificado;

        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    private void buscarYRellenarUsuario() {
        String usuario = Login.getText().trim();
        String password = new String(Password.getPassword());
        
        try (BufferedReader br = new BufferedReader(new FileReader("Archivos\\Usuario.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 6 && partes[0].equals(usuario) && partes[1].equals (password)) {
                    // Encontramos el usuario, rellenamos los campos
                    Nivel_acceso.setSelectedItem(partes[2]);
                    Nombre.setText(partes[3]);
                    Apellido.setText(partes[4]);
                    
                    if(!"-".equals(partes[5])){
                       Email.setText(partes[5]);                        
                    }
                    else if("-".equals(partes[5])){
                       Email.setText("");                        
                    }
                    
                    return; // Terminamos la búsqueda una vez encontrado el usuario
                }
            }
        } 
        catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        }

    // Si llegamos aquí, las credenciales son incorrectas o el usuario no fue encontrado
    JOptionPane.showMessageDialog(this, "Credenciales incorrectas o usuario no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
    
    }
    
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeUsuario().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apellido;
    private javax.swing.JButton Buscar;
    private javax.swing.JTextField Email;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JTextField Login;
    private javax.swing.JComboBox<String> Nivel_acceso;
    private javax.swing.JTextField Nombre;
    private javax.swing.JPasswordField Password;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
