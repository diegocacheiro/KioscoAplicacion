/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kiosco;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Diego
 */
public class Introducir_pin extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form Introducir_pin
     */
    String f;
    ArrayList<String> pedidos = new ArrayList<String>();
    ArrayList<Integer> precios = new ArrayList<Integer>();
    String hora, minutos,segundos;
    Thread hilo;
    
    ventana v=new ventana();
    
    public ventana getV() {
        return v;
    }

    public void setV(ventana v) {
        this.v = v;
    }
    
    public Introducir_pin(String fecha, ArrayList<String> lista, ArrayList<Integer>listap) {
        initComponents();
        f = fecha;
        precios = listap;
        pedidos = lista;
        lbdia.setText (Fecha ());
        hilo = new Thread(this);
        hilo.start();
        setVisible(true);
    }

    public void Hora(){
        Calendar calendario = new GregorianCalendar ();
        Date horaactual = new Date();
        calendario.setTime(horaactual);
        hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }

    public void run(){
        Thread current = Thread.currentThread();
        while (current ==hilo){
            Hora();
            lbhora.setText(hora+":"+minutos+":"+segundos);
        }
    }
    
    public static String Fecha(){
        Date fecha = new Date ();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
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
        pin = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        erro = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbdia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 400));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Introduzca el PIN de la tarjeta");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 35, -1, -1));

        pin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinActionPerformed(evt);
            }
        });
        add(pin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 101, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("PIN");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(":");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Finalizar pago");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, -1, 30));

        erro.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        erro.setForeground(new java.awt.Color(255, 0, 0));
        add(erro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Eliminar pedido");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Su tarjeta ha sido leída con éxito");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 95, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Introduzca el pin para finalizar el pago");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 123, -1, -1));

        lbdia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdia.setText("MM/DD/YYYY");
        add(lbdia, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("-");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        lbhora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbhora.setText("00:00:00");
        add(lbhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        char lon[] = pin.getPassword();
        
        if (lon.length == 4){
            this.v.getContentPane().setVisible(false);
            Retirar_tarjeta pp=new Retirar_tarjeta(f);
            pp.setVisible(true);
            pp.setV(this.v);
            this.v.setContentPane(pp);
        } else {
            erro.setText("Introduce 4 dígitos");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pinActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Confirmacion_pago_no pp=new Confirmacion_pago_no(f, pedidos, precios);
        pp.setVisible(true);
        pp.setV(this.v);
        this.v.setContentPane(pp);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel erro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbdia;
    private javax.swing.JLabel lbhora;
    private javax.swing.JPasswordField pin;
    // End of variables declaration//GEN-END:variables
}
