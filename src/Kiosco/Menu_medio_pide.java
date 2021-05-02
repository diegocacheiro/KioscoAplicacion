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
public class Menu_medio_pide extends javax.swing.JPanel implements Runnable{

    /**
     * Creates new form Menu_medio_pide
     */
    String hora, minutos,segundos;
    Thread hilo;
    
    public String primero, postre, bebida, pedidofinal;
    ArrayList<String> pedidos = new ArrayList<String>();
    ArrayList<Integer> precios = new ArrayList<Integer>();
    
    ventana v=new ventana();
    
    public ventana getV() {
        return v;
    }

    public void setV(ventana v) {
        this.v = v;
    }
    public Menu_medio_pide(ArrayList<String> lista, ArrayList<Integer> listap) {
        initComponents();
        pedidos = lista;
        precios = listap;
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Boton31 = new javax.swing.JRadioButton();
        Boton32 = new javax.swing.JRadioButton();
        Boton33 = new javax.swing.JRadioButton();
        Boton34 = new javax.swing.JRadioButton();
        Boton11 = new javax.swing.JRadioButton();
        Boton12 = new javax.swing.JRadioButton();
        Boton13 = new javax.swing.JRadioButton();
        Boton14 = new javax.swing.JRadioButton();
        Boton15 = new javax.swing.JRadioButton();
        Boton16 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Boton21 = new javax.swing.JRadioButton();
        Boton22 = new javax.swing.JRadioButton();
        Boton23 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        lbdia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lbhora = new javax.swing.JLabel();
        erro = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("1/2 Menú");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Platos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Postres");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bebidas");

        buttonGroup3.add(Boton31);
        Boton31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton31.setText("Agua");
        Boton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton31ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Boton32);
        Boton32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton32.setText("Refrescos");
        Boton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton32ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Boton33);
        Boton33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton33.setText("Vino");
        Boton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton33ActionPerformed(evt);
            }
        });

        buttonGroup3.add(Boton34);
        Boton34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton34.setText("Cerveza");
        Boton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton34ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton11);
        Boton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton11.setText("Croquetas de jamón caseras");
        Boton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton11ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton12);
        Boton12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton12.setText("Ensaladilla rusa");
        Boton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton12ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton13);
        Boton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton13.setText("Pimientos de padrón");
        Boton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton13ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton14);
        Boton14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton14.setText("Raxo con patatas");
        Boton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton14ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton15);
        Boton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton15.setText("Chipirones con patatas y ensalada");
        Boton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton15ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Boton16);
        Boton16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton16.setText("Zorza con patatas");
        Boton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton16ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Añadir al carrito");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Boton21);
        Boton21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton21.setText("Helado de vainilla");
        Boton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton21ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Boton22);
        Boton22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton22.setText("Tarta de la abuela");
        Boton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton22ActionPerformed(evt);
            }
        });

        buttonGroup2.add(Boton23);
        Boton23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Boton23.setText("Tarta de santiago");
        Boton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton23ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Selecciona un plato, un postre y una bebida");

        lbdia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbdia.setText("MM/DD/YYYY");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("-");

        lbhora.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbhora.setText("00:00:00");

        erro.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("7€");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbdia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbhora)
                        .addGap(24, 24, 24)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boton12)
                                            .addComponent(Boton11)
                                            .addComponent(Boton13)
                                            .addComponent(Boton14))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boton23)
                                            .addComponent(Boton22)
                                            .addComponent(Boton21))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Boton15)
                                            .addComponent(Boton16))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(63, 63, 63)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Boton34)
                                .addComponent(Boton31)
                                .addComponent(Boton32)
                                .addComponent(Boton33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(19, 19, 19))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(erro)))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(jLabel1)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Boton13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton14))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton31)
                            .addComponent(Boton21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton32)
                            .addComponent(Boton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton33)
                            .addComponent(Boton23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Boton15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(erro)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(lbdia)
                    .addComponent(lbhora)
                    .addComponent(jLabel7))
                .addGap(50, 50, 50))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Boton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton33ActionPerformed
        // TODO add your handling code here:
         if (Boton33.isSelected()==true){
            bebida = "vino";
        }
    }//GEN-LAST:event_Boton33ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.v.getContentPane().setVisible(false);
        Pide pp=new Pide(pedidos, precios);
        pp.setVisible(true);
        pp.setV(this.v);
        this.v.setContentPane(pp);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (Boton11.isSelected()==true || Boton12.isSelected()==true || Boton13.isSelected()==true || Boton14.isSelected()==true || Boton15.isSelected()==true || Boton16.isSelected()==true){
            if (Boton21.isSelected()==true || Boton22.isSelected()==true || Boton23.isSelected()==true){
                if(Boton31.isSelected()==true || Boton32.isSelected()==true || Boton33.isSelected()==true || Boton34.isSelected()==true){
                    pedidofinal = "1/2 Menú: 7€\n " + primero + ", " + postre +", " + bebida;
                    pedidos.add(pedidofinal);
                    precios.add (7);
                    this.v.getContentPane().setVisible(false);
                    Consultar_pedido pp=new Consultar_pedido(pedidos, precios);
                    pp.setVisible(true);
                    pp.setV(this.v);
                    this.v.setContentPane(pp); 
                } else {
                    erro.setText("Seleccione una bebida");
                }
            }else {
                erro.setText("Seleccione un postre");
            }
        } else {
            erro.setText("Seleccione un plato");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Boton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton11ActionPerformed
        // TODO add your handling code here:
        if (Boton11.isSelected()==true){
            primero = "croquetas de jamón caseras";
        }
    }//GEN-LAST:event_Boton11ActionPerformed

    private void Boton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton12ActionPerformed
        // TODO add your handling code here:
        if (Boton12.isSelected()==true){
            primero = "ensaladilla rusa";
        }
    }//GEN-LAST:event_Boton12ActionPerformed

    private void Boton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton13ActionPerformed
        // TODO add your handling code here:
        if (Boton13.isSelected()==true){
            primero = "pimientos de padrón";
        }
    }//GEN-LAST:event_Boton13ActionPerformed

    private void Boton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton14ActionPerformed
        // TODO add your handling code here:
        if (Boton14.isSelected()==true){
            primero = "raxo con patatas";
        }
    }//GEN-LAST:event_Boton14ActionPerformed

    private void Boton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton15ActionPerformed
        // TODO add your handling code here:
        if (Boton15.isSelected()==true){
            primero = "chipirones con patatas y ensalada";
        }
    }//GEN-LAST:event_Boton15ActionPerformed

    private void Boton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton16ActionPerformed
        // TODO add your handling code here:
        if (Boton16.isSelected()==true){
            primero = "zorza con patatas";
        }
    }//GEN-LAST:event_Boton16ActionPerformed

    private void Boton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton21ActionPerformed
        // TODO add your handling code here:
        if (Boton21.isSelected()==true){
            postre = "helado de vainilla";
        }
    }//GEN-LAST:event_Boton21ActionPerformed

    private void Boton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton22ActionPerformed
        // TODO add your handling code here:
        if (Boton22.isSelected()==true){
            postre = "tarta de la abuela";
        }
    }//GEN-LAST:event_Boton22ActionPerformed

    private void Boton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton23ActionPerformed
        // TODO add your handling code here:
        if (Boton23.isSelected()==true){
            postre = "tarta de santiago";
        }
    }//GEN-LAST:event_Boton23ActionPerformed

    private void Boton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton31ActionPerformed
        // TODO add your handling code here:
        if (Boton31.isSelected()==true){
            bebida = "agua";
        }
    }//GEN-LAST:event_Boton31ActionPerformed

    private void Boton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton32ActionPerformed
        // TODO add your handling code here:
        if (Boton32.isSelected()==true){
            bebida = "refrescos";
        }
    }//GEN-LAST:event_Boton32ActionPerformed

    private void Boton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton34ActionPerformed
        // TODO add your handling code here:
        if (Boton34.isSelected()==true){
            bebida = "cerveza";
        }
    }//GEN-LAST:event_Boton34ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Boton11;
    private javax.swing.JRadioButton Boton12;
    private javax.swing.JRadioButton Boton13;
    private javax.swing.JRadioButton Boton14;
    private javax.swing.JRadioButton Boton15;
    private javax.swing.JRadioButton Boton16;
    private javax.swing.JRadioButton Boton21;
    private javax.swing.JRadioButton Boton22;
    private javax.swing.JRadioButton Boton23;
    private javax.swing.JRadioButton Boton31;
    private javax.swing.JRadioButton Boton32;
    private javax.swing.JRadioButton Boton33;
    private javax.swing.JRadioButton Boton34;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel erro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbdia;
    private javax.swing.JLabel lbhora;
    // End of variables declaration//GEN-END:variables
}
