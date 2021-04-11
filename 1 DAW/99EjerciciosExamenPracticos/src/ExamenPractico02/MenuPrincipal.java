package ExamenPractico02;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MenuPrincipal.java
 *
 * Created on 19-abr-2012, 18:07:12
 */


import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class MenuPrincipal extends javax.swing.JFrame {

    private ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno>();
    private ArrayList<Modulo> listaModulos = new ArrayList<Modulo>();
    CargarGuardar<Alumno> cgAlumno = new CargarGuardar<Alumno>();
    CargarGuardar<Modulo> cgModulo = new CargarGuardar<Modulo>();

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        botonAñadirAlumno = new javax.swing.JButton();
        botonAñadirModulo = new javax.swing.JButton();
        botonVerAlumno = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAlumnos = new javax.swing.JMenu();
        itemAñadirAlumno = new javax.swing.JMenuItem();
        itemVerAlumno = new javax.swing.JMenuItem();
        itemGuardarAlumno = new javax.swing.JMenuItem();
        itemCargarAlumno = new javax.swing.JMenuItem();
        MenuModulos = new javax.swing.JMenu();
        itemAñadirModulo = new javax.swing.JMenuItem();
        itemGuardarModulo = new javax.swing.JMenuItem();
        itemCargarModulo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AcademiaMas");

        botonAñadirAlumno.setText("Añadir Alumno");
        botonAñadirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirAlumnoActionPerformed(evt);
            }
        });

        botonAñadirModulo.setText("Añadir Módulo");
        botonAñadirModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirModuloActionPerformed(evt);
            }
        });

        botonVerAlumno.setText("Ver Alumno");
        botonVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerAlumnoActionPerformed(evt);
            }
        });

        MenuAlumnos.setMnemonic('a');
        MenuAlumnos.setText("Alumnos");

        itemAñadirAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itemAñadirAlumno.setMnemonic('A');
        itemAñadirAlumno.setText("Añadir Alumno");
        itemAñadirAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAñadirAlumnoActionPerformed(evt);
            }
        });
        MenuAlumnos.add(itemAñadirAlumno);

        itemVerAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        itemVerAlumno.setMnemonic('V');
        itemVerAlumno.setText("Ver Alumno");
        itemVerAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVerAlumnoActionPerformed(evt);
            }
        });
        MenuAlumnos.add(itemVerAlumno);

        itemGuardarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardarAlumno.setMnemonic('g');
        itemGuardarAlumno.setText("Guardar Alumno");
        itemGuardarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarAlumnoActionPerformed(evt);
            }
        });
        MenuAlumnos.add(itemGuardarAlumno);

        itemCargarAlumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_MASK));
        itemCargarAlumno.setMnemonic('c');
        itemCargarAlumno.setText("Cargar Alumno");
        itemCargarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarAlumnoActionPerformed(evt);
            }
        });
        MenuAlumnos.add(itemCargarAlumno);

        jMenuBar1.add(MenuAlumnos);

        MenuModulos.setMnemonic('m');
        MenuModulos.setText("Módulos");

        itemAñadirModulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        itemAñadirModulo.setMnemonic('A');
        itemAñadirModulo.setText("Añadir Módulo");
        itemAñadirModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemAñadirModuloActionPerformed(evt);
            }
        });
        MenuModulos.add(itemAñadirModulo);

        itemGuardarModulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        itemGuardarModulo.setMnemonic('g');
        itemGuardarModulo.setText("Guardar Módulo");
        itemGuardarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemGuardarModuloActionPerformed(evt);
            }
        });
        MenuModulos.add(itemGuardarModulo);

        itemCargarModulo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itemCargarModulo.setText("Cargar Módulo");
        itemCargarModulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCargarModuloActionPerformed(evt);
            }
        });
        MenuModulos.add(itemCargarModulo);

        jMenuBar1.add(MenuModulos);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAñadirModulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAñadirAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonVerAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(botonAñadirAlumno)
                .addGap(18, 18, 18)
                .addComponent(botonAñadirModulo)
                .addGap(18, 18, 18)
                .addComponent(botonVerAlumno)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void botonAñadirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirAlumnoActionPerformed
    JDAñadirAlumno jdac = new JDAñadirAlumno(this, true);
    jdac.setVisible(true);
}//GEN-LAST:event_botonAñadirAlumnoActionPerformed

private void botonAñadirModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirModuloActionPerformed
    JDAñadirModulo jdaa = new JDAñadirModulo(this, true);
    jdaa.setVisible(true);
}//GEN-LAST:event_botonAñadirModuloActionPerformed

private void botonVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerAlumnoActionPerformed
    JDVerAlumno jdvc = new JDVerAlumno(this, true);
    jdvc.setVisible(true);
}//GEN-LAST:event_botonVerAlumnoActionPerformed

private void itemAñadirAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAñadirAlumnoActionPerformed
    JDAñadirAlumno jdac = new JDAñadirAlumno(this, true);
    jdac.setVisible(true);
}//GEN-LAST:event_itemAñadirAlumnoActionPerformed

private void itemVerAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVerAlumnoActionPerformed
    JDVerAlumno jdvc = new JDVerAlumno(this, true);
    jdvc.setVisible(true);
}//GEN-LAST:event_itemVerAlumnoActionPerformed

private void itemAñadirModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemAñadirModuloActionPerformed
    JDAñadirModulo jdaa = new JDAñadirModulo(this, true);
    jdaa.setVisible(true);
}//GEN-LAST:event_itemAñadirModuloActionPerformed

    private void itemGuardarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarAlumnoActionPerformed
        JFileChooser jfcAbrir = new JFileChooser();
        int seleccion = jfcAbrir.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jfcAbrir.getSelectedFile();
            if (cgAlumno.guardar(listaAlumnos, fichero) == true) {
                JOptionPane.showMessageDialog(this, "Fichero guardado correctamente", "Almacenamiento correcto", JOptionPane.INFORMATION_MESSAGE);

            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el fichero", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_itemGuardarAlumnoActionPerformed

    private void itemCargarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarAlumnoActionPerformed
        JFileChooser jfcAbrir = new JFileChooser();
        int seleccion = jfcAbrir.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jfcAbrir.getSelectedFile();
            if ((listaAlumnos = cgAlumno.cargar(fichero)) != null) {
                JOptionPane.showMessageDialog(this, "Fichero cargado correctamente", "Carga correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No ha sido posible abrir el fichero", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_itemCargarAlumnoActionPerformed

    private void itemGuardarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemGuardarModuloActionPerformed
        JFileChooser jfcAbrir = new JFileChooser();
        int seleccion = jfcAbrir.showSaveDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jfcAbrir.getSelectedFile();
            if (cgModulo.guardar(listaModulos, fichero) == true) {
                JOptionPane.showMessageDialog(this, "Fichero guardado correctamente", "Almacenamiento correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al guardar el fichero", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_itemGuardarModuloActionPerformed

    private void itemCargarModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCargarModuloActionPerformed
        JFileChooser jfcAbrir = new JFileChooser();
        int seleccion = jfcAbrir.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fichero = jfcAbrir.getSelectedFile();
            if ((listaModulos = cgModulo.cargar(fichero)) != null) {
                JOptionPane.showMessageDialog(this, "Fichero cargado correctamente", "Carga correcto", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No ha sido posible abrir el fichero", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_itemCargarModuloActionPerformed

    public void añadirModulo(Modulo a) {
        listaModulos.add(a);
    }

    public int dimensionActividades() {
        return listaModulos.size();
    }

    public Modulo obtenerActividad(int i) {
        return listaModulos.get(i);
    }

    public void añadirAlumno(Alumno c) {
        listaAlumnos.add(c);
    }

    public int dimensionClientes() {
        return listaAlumnos.size();
    }

    public Alumno obtenerCliente(int i) {
        return listaAlumnos.get(i);
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAlumnos;
    private javax.swing.JMenu MenuModulos;
    private javax.swing.JButton botonAñadirAlumno;
    private javax.swing.JButton botonAñadirModulo;
    private javax.swing.JButton botonVerAlumno;
    private javax.swing.JMenuItem itemAñadirAlumno;
    private javax.swing.JMenuItem itemAñadirModulo;
    private javax.swing.JMenuItem itemCargarAlumno;
    private javax.swing.JMenuItem itemCargarModulo;
    private javax.swing.JMenuItem itemGuardarAlumno;
    private javax.swing.JMenuItem itemGuardarModulo;
    private javax.swing.JMenuItem itemVerAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
