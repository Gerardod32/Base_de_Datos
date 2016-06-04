package forms;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.Rectangle2D;
import java.awt.print.*;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gerardo
 */
public class Reporte_Integrantes extends javax.swing.JFrame implements Printable{

    /**
     * Creates new form Reporte_Integrantes
     */
    public Reporte_Integrantes() {
        this.con = new Conexion();
        
     
        initComponents();
        rutafoto.setVisible(false);
        rutadpi.setVisible(false);
        this.setLocationRelativeTo(null);
    }

    Reporte_Integrantes(Principal aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        ima = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        apellido = new javax.swing.JRadioButton();
        nombre = new javax.swing.JRadioButton();
        grupo = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        fotodpi = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        rutafoto = new javax.swing.JTextField();
        rutadpi = new javax.swing.JTextField();

        ima.setText("Cargar Imagenes");
        ima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imaActionPerformed(evt);
            }
        });
        jPopupMenu1.add(ima);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ordenar Por", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        buttonGroup1.add(apellido);
        apellido.setText("Apellido");
        apellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                apellidoMouseClicked(evt);
            }
        });
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        buttonGroup1.add(nombre);
        nombre.setText("Nombre");
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreMouseClicked(evt);
            }
        });

        buttonGroup1.add(grupo);
        grupo.setText("grupo");
        grupo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grupoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre)
                .addGap(18, 18, 18)
                .addComponent(apellido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(grupo)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre)
                    .addComponent(apellido)
                    .addComponent(grupo))
                .addContainerGap())
        );

        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setText("Imagen");
        imagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        fotodpi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fotodpi.setText("Imagen");
        fotodpi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Foto");

        jLabel2.setText("Fotocopia Dpi");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Reporte de Integrantes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(fotodpi, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(61, 61, 61))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fotodpi, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.setComponentPopupMenu(jPopupMenu1);
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(417, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rutafoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutafotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addComponent(rutafoto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutadpi, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(45, 45, 45)
                        .addComponent(jButton2)
                        .addGap(358, 358, 358))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rutafoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rutadpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoActionPerformed

    private void nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreMouseClicked

        Nombre("");
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreMouseClicked

    private void apellidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoMouseClicked
        Apellido("");
        // TODO add your handling code here:
    }//GEN-LAST:event_apellidoMouseClicked

    private void grupoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grupoMouseClicked
        Grupo("");
        // TODO add your handling code here:
    }//GEN-LAST:event_grupoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try 
    {
        
        PrinterJob gap = PrinterJob.getPrinterJob();
            gap.setPrintable((Printable) this);
            boolean top=gap.printDialog();
            if (top)
            {
                gap.print();
            }
    } catch (PrinterException ex) 
    {
            Logger.getLogger(Reporte_Integrantes.class.getName()).log(Level.SEVERE, null, ex);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void imaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imaActionPerformed
        int fila= jTable1.getSelectedRow();
        if(fila>=0){
          
        rutafoto.setText(jTable1.getValueAt(fila, 15).toString());
        Image foto= getToolkit().createImage(rutafoto.getText());
        foto = foto.getScaledInstance(128, 117, Image.SCALE_DEFAULT);
        imagen.setIcon(new ImageIcon(foto));
        rutadpi.setText(jTable1.getValueAt(fila, 16).toString());
        Image fotod= getToolkit().createImage(rutadpi.getText());
        fotod = fotod.getScaledInstance(128, 117, Image.SCALE_DEFAULT);
        fotodpi.setIcon(new ImageIcon(fotod));
        
        }
    }//GEN-LAST:event_imaActionPerformed

    private void rutafotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutafotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutafotoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed
 void Nombre(String valor){
   DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("dpi");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("comunidad");
        modelo.addColumn("region");
        modelo.addColumn("estado civil");
        modelo.addColumn("oficio");
        modelo.addColumn("cargo");
        modelo.addColumn("idioma");
        modelo.addColumn("idioma 2");
        modelo.addColumn("lee");
        modelo.addColumn("escribe");
        modelo.addColumn("foto");
        modelo.addColumn("fotocopia dpi");
        modelo.addColumn("Proyecto");
        modelo.addColumn("Grupo");
        
         jTable1.setModel(modelo);
        
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM integrante order by nombre1"; 
        }
        
        String[] datos= new String[20];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString (1);
                datos[1]= rs.getString(2);
                datos[2]=rs.getString (5);
                datos[3]=rs.getString (24);
                datos[4]=rs.getString (11);
                datos[5]=rs.getString (8);
                datos[6]=rs.getString (12);
                datos[7]=rs.getString (13);
                datos[8]=rs.getString (21);
                datos[9]=rs.getString(22);
                datos[10]=rs.getString(14);
                datos[11]=rs.getString(16);
                datos[12]=rs.getString(17);
                datos[13]=rs.getString(9);
                datos[14]=rs.getString(10);
                datos[15]=rs.getString(19);
                datos[16]=rs.getString(25);
                datos[17]=rs.getString(27);
                datos[18]=rs.getString(28);
                
                modelo.addRow(datos);
            }
            
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(NewMember.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
 
 void Apellido(String valor){
   DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("dpi");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("comunidad");
        modelo.addColumn("region");
        modelo.addColumn("estado civil");
        modelo.addColumn("oficio");
        modelo.addColumn("cargo");
        modelo.addColumn("idioma");
        modelo.addColumn("idioma 2");
        modelo.addColumn("lee");
        modelo.addColumn("escribe");
        modelo.addColumn("foto");
        modelo.addColumn("fotocopia dpi");
        modelo.addColumn("Proyecto");
        modelo.addColumn("Grupo");
        
         jTable1.setModel(modelo);
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM integrante order by apellido1"; 
        }
        
        String[] datos= new String[20];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString (1);
                datos[1]= rs.getString(2);
                datos[2]=rs.getString (5);
                datos[3]=rs.getString (24);
                datos[4]=rs.getString (11);
                datos[5]=rs.getString (8);
                datos[6]=rs.getString (12);
                datos[7]=rs.getString (13);
                datos[8]=rs.getString (21);
                datos[9]=rs.getString(22);
                datos[10]=rs.getString(14);
                datos[11]=rs.getString(16);
                datos[12]=rs.getString(17);
                datos[13]=rs.getString(9);
                datos[14]=rs.getString(10);
                datos[15]=rs.getString(19);
                datos[16]=rs.getString(25);
                datos[17]=rs.getString(27);
                datos[18]=rs.getString(28);
                
                
                modelo.addRow(datos);
            }
            
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(NewMember.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
 
 void Grupo(String valor){
    DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("id");
        modelo.addColumn("nombre");
        modelo.addColumn("apellido");
        modelo.addColumn("dpi");
        modelo.addColumn("direccion");
        modelo.addColumn("telefono");
        modelo.addColumn("comunidad");
        modelo.addColumn("region");
        modelo.addColumn("estado civil");
        modelo.addColumn("oficio");
        modelo.addColumn("cargo");
        modelo.addColumn("idioma");
        modelo.addColumn("idioma 2");
        modelo.addColumn("lee");
        modelo.addColumn("escribe");
        modelo.addColumn("foto");
        modelo.addColumn("fotocopia dpi");
        modelo.addColumn("Proyecto");
        modelo.addColumn("Grupo");
        
         jTable1.setModel(modelo);
        String sql="";
        if(valor.equals(""))
        {
            sql="SELECT * FROM integrante order by GRUPO_id"; 
        }
        
        String[] datos= new String[26];
        try {
            Statement at= reg.createStatement();
            ResultSet rs= at.executeQuery(sql);
            while(rs.next()){
                 datos[0]=rs.getString (1);
                datos[1]= rs.getString(2);
                datos[2]=rs.getString (5);
                datos[3]=rs.getString (24);
                datos[4]=rs.getString (11);
                datos[5]=rs.getString (8);
                datos[6]=rs.getString (12);
                datos[7]=rs.getString (13);
                datos[8]=rs.getString (21);
                datos[9]=rs.getString(22);
                datos[10]=rs.getString(14);
                datos[11]=rs.getString(16);
                datos[12]=rs.getString(17);
                datos[13]=rs.getString(9);
                datos[14]=rs.getString(10);
                datos[15]=rs.getString(19);
                datos[16]=rs.getString(25);
                datos[17]=rs.getString(27);
                datos[18]=rs.getString(28);
                
                
                modelo.addRow(datos);
            }
            
            jTable1.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(NewMember.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            java.util.logging.Logger.getLogger(Reporte_Integrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Integrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Integrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Integrantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Integrantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton apellido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel fotodpi;
    private javax.swing.JRadioButton grupo;
    private javax.swing.JMenuItem ima;
    private javax.swing.JLabel imagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton nombre;
    private javax.swing.JTextField rutadpi;
    private javax.swing.JTextField rutafoto;
    // End of variables declaration//GEN-END:variables

    Conexion con=new Conexion();
Connection reg=con.conexion();

public int print(Graphics graf, PageFormat pagfor, int index) throws PrinterException 
        {
            if (index>0)
            {
               return  NO_SUCH_PAGE;                
            }
            
        Graphics2D hub= (Graphics2D) graf;
        hub.translate(pagfor.getImageableX()+20,pagfor.getImageableY()+15);
        hub.scale(0.68,0.93);
         jPanel3.printAll(graf);
        return PAGE_EXISTS;

        }     

}
