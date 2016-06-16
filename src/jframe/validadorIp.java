
package jframe;


public class validadorIp extends javax.swing.JFrame {
    String ip;
    String octeto;
   
    public validadorIp() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lectorIP = new javax.swing.JTextField();
        validador = new javax.swing.JButton();
        indicador = new javax.swing.JTextField();
        octetos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lectorIP.setText("ingrese numero ip");
        lectorIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lectorIPActionPerformed(evt);
            }
        });

        validador.setText("verificar");
        validador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validadorActionPerformed(evt);
            }
        });

        indicador.setText("verificador de ip");

        octetos.setText("octetos generados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(validador)
                        .addGap(325, 325, 325))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(octetos, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lectorIP)
                            .addComponent(indicador))
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lectorIP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(validador)
                .addGap(30, 30, 30)
                .addComponent(indicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(octetos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lectorIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lectorIPActionPerformed
        ip=lectorIP.getText();
    }//GEN-LAST:event_lectorIPActionPerformed

    private void validadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validadorActionPerformed
        if(validarip(ip)){
           indicador.setText("es un numero ip");
           octetos(ip);
        }else{
         indicador.setText("no es un numero ip");
        }
    }//GEN-LAST:event_validadorActionPerformed

 
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
            java.util.logging.Logger.getLogger(validadorIp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(validadorIp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(validadorIp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(validadorIp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new validadorIp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField indicador;
    private javax.swing.JTextField lectorIP;
    private javax.swing.JTextField octetos;
    private javax.swing.JButton validador;
    // End of variables declaration//GEN-END:variables

    public boolean validarip(String ips) {
        ips.matches("[1-9]{1,3}\\.[1-9]{1,3}\\.[1-9]{1,3}\\.[1-9]{1,3}");
        String array[]=ips.split("\\.");
        int octeto;
        int n=0;
        for (int i = 0; i < array.length; i++) {
            octeto=Integer.valueOf(array[i]);
            if(octeto>=0 && octeto<=255){n=n+1;}
        }
        if(n==4){return true;}
        return false;
    }

    private void octetos(String ip) {
        String[] cadena= ip.split("\\.");
        int[] octeto=new int [4];
        String oc=null;
        String octe=null;
        for (int i = 0; i < octeto.length; i++) {
            octeto[i]=Integer.valueOf(cadena[i]);
            oc=Integer.toBinaryString(octeto[i]);
            while(oc.length()<8){
                oc='0'+oc;
            }
            octe=octe+oc+".";
        }
        octetos.setText(octe);
    }
}
