package ventanas;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    public Ventana() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/SoundHound.png")));
        setIconImage(new ImageIcon(getClass().getResource("/images/SoundHound.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        interes = new javax.swing.JLabel();
        tasa = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        casilla = new javax.swing.JTextField();
        dias = new javax.swing.JTextField();
        continuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simulador de Plazo Fijo");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SIMULADOR PLAZO FIJO");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Al final del plazo fijo, recibis");

        total.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        total.setForeground(new java.awt.Color(0, 0, 51));
        total.setText("$0");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("TNA");

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Interes ganado");

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Duración");

        interes.setForeground(new java.awt.Color(0, 0, 0));

        tasa.setForeground(new java.awt.Color(0, 0, 0));

        duracion.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jLabel8Layout = new javax.swing.GroupLayout(jLabel8);
        jLabel8.setLayout(jLabel8Layout);
        jLabel8Layout.setHorizontalGroup(
            jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jLabel8Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jLabel8Layout.createSequentialGroup()
                        .addComponent(tasa, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(255, 255, 255)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jLabel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addGap(82, 82, 82)
                .addGroup(jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jLabel8Layout.setVerticalGroup(
            jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLabel8Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLabel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(interes)
                    .addComponent(duracion)
                    .addComponent(tasa))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        casilla.setBackground(new java.awt.Color(255, 255, 255));
        casilla.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        casilla.setForeground(new java.awt.Color(153, 153, 153));
        casilla.setText("Monto en $");
        casilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casillaActionPerformed(evt);
            }
        });
        casilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                casillaKeyTyped(evt);
            }
        });

        dias.setBackground(new java.awt.Color(255, 255, 255));
        dias.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        dias.setForeground(new java.awt.Color(153, 153, 153));
        dias.setText("Dias...");
        dias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diasActionPerformed(evt);
            }
        });
        dias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                diasKeyTyped(evt);
            }
        });

        continuar.setBackground(new java.awt.Color(255, 255, 255));
        continuar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        continuar.setText("CONTINUAR");
        continuar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                continuarMousePressed(evt);
            }
        });
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("(Más de 30 dias)");

        jLabel4.setBackground(new java.awt.Color(0, 0, 51));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("(Más de $1000)");
        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(casilla)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(dias, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(continuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(casilla, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dias, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(continuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void casillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casillaActionPerformed

    }//GEN-LAST:event_casillaActionPerformed

    private void casillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_casillaKeyTyped
        //VALIDAMOS QUE SOLO SE PUEDAN TIPEAR NUMEROS
        validacionIngresoNumeros(evt);
        if (casilla.getText().equalsIgnoreCase("Monto en $")) {
            casilla.setText("");
        }


    }//GEN-LAST:event_casillaKeyTyped

    private void diasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diasActionPerformed

    }//GEN-LAST:event_diasActionPerformed

    private void diasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_diasKeyTyped
        //VALIDAMOS QUE SOLO SE PUEDAN TIPEAR NUMEROS
        validacionIngresoNumeros(evt);
        if (dias.getText().equalsIgnoreCase("Dias...")) {
            dias.setText("");
        }


    }//GEN-LAST:event_diasKeyTyped

    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed

    }//GEN-LAST:event_continuarActionPerformed

    private void continuarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarMousePressed

       
        try {
            if (Integer.parseInt(casilla.getText()) <= 100000000 && Integer.parseInt(casilla.getText()) >= 1000) {  //VALIDAMOS SI EL IMPORTE ESTA ENTRE $1.000 Y $100.000.000
                if (Integer.parseInt(dias.getText()) <= 365 && Integer.parseInt(dias.getText()) >= 30) { //VALIDAMOS SI EL NUMERO DE DIAS ES MAYOR/IGUAL A 30 Y MENOR/IGUAL A 365

                    //SI DIAS CONTIENE INFORMACION, DURACION ES IGUAL A LA CANTIDAD DE DIAS.
                    if (!dias.getText().equalsIgnoreCase("")) {
                        duracion.setText(dias.getText() + " dias");
                    }
                    calcularInteres();
                    tasa.setText("133.00%");
                }
            }
        } catch (NumberFormatException e) {
            casilla.setText("0");
            dias.setText("0");
        }


    }//GEN-LAST:event_continuarMousePressed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField casilla;
    private javax.swing.JButton continuar;
    private javax.swing.JTextField dias;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel interes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel tasa;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables

    private void calcularInteres() {
        DecimalFormat df = new DecimalFormat("#.00");

        //CASTEAMOS LOS DIAS Y LA INVERSION 
        float inversion = Float.parseFloat(casilla.getText());
        int cantidadDias = Integer.parseInt(dias.getText());

        //REALIZAMOS LA OPERACION PARA CALCULAR EL INTERES
        float porcentajeAnual = 133;
        float interesesGanados = (((inversion * porcentajeAnual) / 100) * cantidadDias) / 365;

//    df.format(interesesGanados);
        float gananciaTotal = interesesGanados + inversion;

        //SETEAMOS LOS TOTALES CONVERTIDOS A STRING
        total.setText("$" + df.format(gananciaTotal));
        interes.setText("$" + df.format(interesesGanados)); //ACORTAR LOS NUMEROS DECIMALES...
    }

    private void validacionIngresoNumeros(KeyEvent evt) {
        int key = evt.getKeyChar();
        boolean numero = key >= 48 && key <= 57;
        if (!numero) {
            evt.consume();
        }
    }
}
