
package curaopega;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author Eduardo QF
 */
public class curaOpega_1 extends javax.swing.JFrame {
    Random rdn=new Random();
    int jugador1=100;
    int jugador2=100;
    int jugador3=100;
    int jugador4=100;
    int turnos=0;
    int contM=0;
    ImageIcon icono=new ImageIcon("C:/Documents and Settings/Eduardo QF/Escritorio/imagenes/icono.JPEG");
    public curaOpega_1() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        vit3 = new javax.swing.JProgressBar();
        vit4 = new javax.swing.JProgressBar();
        vit1 = new javax.swing.JProgressBar();
        vit2 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        curar = new javax.swing.JButton();
        pegar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Jturn = new javax.swing.JLabel();
        VIT1 = new javax.swing.JLabel();
        VIT2 = new javax.swing.JLabel();
        VIT3 = new javax.swing.JLabel();
        VIT4 = new javax.swing.JLabel();
        ingreso1 = new javax.swing.JButton();
        ingresar3 = new javax.swing.JButton();
        ingresar4 = new javax.swing.JButton();
        ingresar2 = new javax.swing.JButton();
        Jicono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        JBinf = new javax.swing.JButton();
        new_game = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("jugador 1");

        jLabel3.setText("jugador 2");

        jLabel4.setText("jugador 3");

        jLabel5.setText("jugador 4");

        vit3.setForeground(new java.awt.Color(0, 51, 255));

        vit4.setForeground(new java.awt.Color(0, 51, 255));

        vit1.setForeground(new java.awt.Color(0, 51, 255));

        vit2.setForeground(new java.awt.Color(0, 51, 255));

        jLabel1.setText("vitalidad");

        curar.setText("curar");
        curar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                curarActionPerformed(evt);
            }
        });

        pegar.setText("pegar");
        pegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pegarActionPerformed(evt);
            }
        });

        jLabel6.setText("turno jugador");

        ingreso1.setText("ingresar");
        ingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso1ActionPerformed(evt);
            }
        });

        ingresar3.setText("ingresar");
        ingresar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar3ActionPerformed(evt);
            }
        });

        ingresar4.setText("ingresar");
        ingresar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar4ActionPerformed(evt);
            }
        });

        ingresar2.setText("ingresar");
        ingresar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar2ActionPerformed(evt);
            }
        });

        Jicono.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                JiconoComponentAdded(evt);
            }
        });

        titulo.setText("cura o pega 2.0");

        JBinf.setText("informacion");
        JBinf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBinfActionPerformed(evt);
            }
        });

        new_game.setText("new game");
        new_game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                new_gameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(new_game)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBinf)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBinf)
                    .addComponent(titulo)
                    .addComponent(new_game))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(ingreso1)
                                .addComponent(ingresar4, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(ingresar3)
                            .addComponent(ingresar2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vit4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vit1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(vit3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(VIT2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VIT1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(VIT3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(VIT4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(curar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pegar))
                                    .addComponent(Jturn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Jicono, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VIT1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vit1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingreso1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vit2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VIT2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingresar2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingresar3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(vit3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VIT3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ingresar4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(VIT4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vit4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Jturn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(curar)
                            .addComponent(pegar)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jicono, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void curarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_curarActionPerformed
        
        int i;
        int vitmas;
        if(jugada()){
            JOptionPane.showMessageDialog(null,"ingrese jugadores primero","ingrese jugadores",JOptionPane.WARNING_MESSAGE);
        }else{
            i=JOptionPane.showOptionDialog(null, "a quien vas a curar","seleccione jugador",JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,new Object[] { "jugador 1", "jugador 2", "jugador 3","jugador 4"},"");

            do{
            vitmas=(int) (rdn.nextDouble()*10+15);    
            }while(vitmas<15 ||vitmas>25);

            switch (i) {
                case 0:if(jugador1<75){jugador1=jugador1+vitmas;}break;
                case 1:if(jugador2<75){jugador2=jugador2+vitmas;}break;
                case 2:if(jugador3<75){jugador3=jugador3+vitmas;}break;
                case 3:if(jugador4<75){ jugador4=jugador4+vitmas;}break;    
            }

            Vit();
            turnos();
        }
    }//GEN-LAST:event_curarActionPerformed

    private void ingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso1ActionPerformed
        if(jLabel2.getText().equals("jugador 1")){
            String jugador;
            do {
                jugador=JOptionPane.showInputDialog(null,"ingrese nombre del jugador 1");
            } while (jugador.equals(""));
            jLabel2.setText(jugador);
            Jturn.setText(jugador);
            VIT1.setText(Integer.toString(jugador1));
            vit1.setValue(jugador1);
             contM++;
        }else{
            JOptionPane.showMessageDialog(null, "este jugador ya esta inscrito");
        }
        turnos=1;
    }//GEN-LAST:event_ingreso1ActionPerformed

    private void ingresar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar2ActionPerformed
        if(jLabel3.getText().equals("jugador 2")){
            String jugador;
            do {
                jugador=JOptionPane.showInputDialog(null,"ingrese nombre del jugador 2");
            } while (jugador.equals(""));
            jLabel3.setText(jugador);
            VIT2.setText(Integer.toString(jugador2));
            vit2.setValue(jugador2);
            contM++;
        }else{
            JOptionPane.showMessageDialog(null, "este jugador ya esta inscrito");
        }
        turnos=1;
        
    }//GEN-LAST:event_ingresar2ActionPerformed

    private void ingresar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar3ActionPerformed
        if(jLabel4.getText().equals("jugador 3")){
            String jugador;
            do{
               jugador=JOptionPane.showInputDialog(null,"ingrese nombre del jugador 3");
            }while(jugador.equals(""));
            jLabel4.setText(jugador);
            VIT3.setText(Integer.toString(jugador3));
            vit3.setValue(jugador3);
            contM++;
        }else{
            JOptionPane.showMessageDialog(null, "este jugador ya esta inscrito");
        }
        turnos=1;
        
    }//GEN-LAST:event_ingresar3ActionPerformed

    private void ingresar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar4ActionPerformed
        if(jLabel5.getText().equals("jugador 4")){
            String jugador;
            do{
             jugador=JOptionPane.showInputDialog(null,"ingrese nombre del jugador 4");    
            }while(jugador.equals(""));
            jLabel5.setText(jugador);
            VIT4.setText(Integer.toString(jugador4));
            vit4.setValue(jugador4);
            contM++;
        }else{
            JOptionPane.showMessageDialog(null, "este jugador ya esta inscrito");
        }
        turnos=1;
    }//GEN-LAST:event_ingresar4ActionPerformed

    private void pegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pegarActionPerformed
        
        int i;
        int vitmenos;
        
        if(jugada()){
            JOptionPane.showMessageDialog(null,"ingrese jugadores primero","ingrese jugadores",JOptionPane.WARNING_MESSAGE);
        }else{
            do{
                i=JOptionPane.showOptionDialog(null, "a quien vas a dañar","seleccione jugador",JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,new Object[] { "jugador 1", "jugador 2", "jugador 3","jugador 4"},"");

                do{
                    vitmenos=(int) (rdn.nextDouble()*10+15);    
                }while(vitmenos<15 ||vitmenos>25);

                switch (i) {
                    case 0:if(jLabel2.getText().equals("jugador 1")){
                                JOptionPane.showMessageDialog(null, "Este jugador no esta partisipando");
                            }else{
                                if(jugador1>0){
                                    jugador1=jugador1-vitmenos;
                                }else{
                                    JOptionPane.showMessageDialog(null, "jugador 1 muerto, no lo puede dañar mas,elija otro");
                                }
                            }
                        break;
                    case 1:if(jLabel3.getText().equals("jugador 2")){
                                JOptionPane.showMessageDialog(null, "Este jugador no esta partisipando");
                            }else{
                                if(jugador2>0){
                                    jugador2=jugador2-vitmenos;
                                }else{
                                    JOptionPane.showMessageDialog(null, "jugador 2 muerto, no lo puede dañar mas,elija otro");
                                }
                            }
                         break;
                    case 2:if(jLabel4.getText().equals("jugador 3")){
                                JOptionPane.showMessageDialog(null, "Este jugador no esta partisipando");
                            }else{
                                if(jugador3>0){
                                    jugador3=jugador3-vitmenos;
                                }else{
                                    JOptionPane.showMessageDialog(null, "jugador 3 muerto, no lo puede dañar mas,elija otro");
                                }
                            }        
                        break;
                    case 3:if(jLabel5.getText().equals("jugador 4")){
                                JOptionPane.showMessageDialog(null, "Este jugador no esta partisipando");
                            }else{
                                if(jugador4>0){
                                    jugador4=jugador4-vitmenos;
                                }else{
                                    JOptionPane.showMessageDialog(null, "jugador 4 muerto, no lo puede dañar mas,elija otro");
                                }
                           }        
                        break;    
                }
            }while(muerto(i));
            Vit();
            turnos();
        }
    }//GEN-LAST:event_pegarActionPerformed

    private void JiconoComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_JiconoComponentAdded

    }//GEN-LAST:event_JiconoComponentAdded

    private void JBinfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBinfActionPerformed
        inf inf =new inf();
        inf.setVisible(true);
    }//GEN-LAST:event_JBinfActionPerformed

    private void new_gameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_new_gameActionPerformed
        newGame();
        
        
    }//GEN-LAST:event_new_gameActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new curaOpega_1().setVisible(true);
                
                
            }

            private void vit(int jugador1, int jugador2, int jugador3, int jugador4) {

                

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBinf;
    private javax.swing.JLabel Jicono;
    private javax.swing.JLabel Jturn;
    private javax.swing.JLabel VIT1;
    private javax.swing.JLabel VIT2;
    private javax.swing.JLabel VIT3;
    private javax.swing.JLabel VIT4;
    private javax.swing.JButton curar;
    private javax.swing.JButton ingresar2;
    private javax.swing.JButton ingresar3;
    private javax.swing.JButton ingresar4;
    private javax.swing.JButton ingreso1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton new_game;
    private javax.swing.JButton pegar;
    private javax.swing.JLabel titulo;
    private javax.swing.JProgressBar vit1;
    private javax.swing.JProgressBar vit2;
    private javax.swing.JProgressBar vit3;
    private javax.swing.JProgressBar vit4;
    // End of variables declaration//GEN-END:variables

    private void Vit() {
        if(!jLabel2.getText().equals("jugador 1")){
            if(jugador1>0){
                VIT1.setText(Integer.toString(jugador1));
                vit1.setValue(jugador1);
            }else{
                VIT1.setText("muerto");
                vit1.setValue(0);
            }    
        }
        if(!jLabel3.getText().equals("jugador 2")){
            if(jugador2>0){
                VIT2.setText(Integer.toString(jugador2));
                vit2.setValue(jugador2);
            }else{
                VIT2.setText("muerto");
                vit2.setValue(0);
            }    
        }
        if(!jLabel4.getText().equals("jugador 3")){
            if(jugador3>0){
                VIT3.setText(Integer.toString(jugador3));
                vit3.setValue(jugador3);
            }else{
                VIT3.setText("muerto");
                vit3.setValue(0);
            }
        }
        if(!jLabel5.getText().equals("jugador 4")){
            if(jugador4>0){
                VIT4.setText(Integer.toString(jugador4));
                vit4.setValue(jugador4);
            }else{
                VIT4.setText("muerto");
                vit4.setValue(0);
            }    
        }
    }    

    private boolean jugada() {
        if(jLabel2.getText().equals("jugador 1") && jLabel3.getText().equals("jugador 2") && jLabel4.getText().equals("jugador 3") && jLabel5.getText().equals("jugador 4")){
            return true;
        }
        return false;
    }

    private void turnos() {
        if(ganador()){
            turnos=turnos+1;
            switch (turnos) {
                case 1:if(VIT1.getText().equalsIgnoreCase("muerto")||jLabel2.getText().equalsIgnoreCase("jugador 1")){
                            turnos++;
                            turnos();
                        }else{
                            if(!jLabel2.getText().equals("jugador 1")){
                                Jturn.setText(jLabel2.getText());
                            }
                        }    
                    break;
                case 2:if(VIT2.getText().equalsIgnoreCase("muerto")||jLabel3.getText().equalsIgnoreCase("jugador 2")){
                            turnos++;
                            turnos();
                        }else{   
                            if(!jLabel3.getText().equals("jugador 2")){
                                Jturn.setText(jLabel3.getText());
                            }
                        }
                    break;
                case 3:if(VIT3.getText().equalsIgnoreCase("muerto")||jLabel4.getText().equalsIgnoreCase("jugador 3")){
                            turnos++;
                            turnos();
                        }else{
                            if(!jLabel4.getText().equals("jugador 3")){
                                Jturn.setText(jLabel4.getText());
                            }
                        }
                    break;
                default:if(!VIT4.getText().equalsIgnoreCase("muerto")&& !jLabel5.getText().equalsIgnoreCase("jugador 4")){
                            if(!jLabel5.getText().equals("jugador 4")){
                                Jturn.setText(jLabel5.getText());
                            }
                        }
                    turnos=0;
                    turnos();
                    break;
            }          
        }else{
            if(!VIT1.getText().equalsIgnoreCase("muerto")&&!jLabel2.getText().equalsIgnoreCase("jugador 1")){
                JOptionPane.showMessageDialog(null," FELIZIDADES "+jLabel2.getText()+", eres el ganador");
            }else{
                if(!VIT2.getText().equalsIgnoreCase("muerto")&&!jLabel3.getText().equalsIgnoreCase("jugador 2")){
                    JOptionPane.showMessageDialog(null," FELIZIDADES "+jLabel3.getText()+", eres el ganador");
                }else{
                    if(!VIT3.getText().equalsIgnoreCase("muerto")&&!jLabel4.getText().equalsIgnoreCase("jugador 3")){
                        JOptionPane.showMessageDialog(null," FELIZIDADES "+jLabel4.getText()+", eres el ganador");
                    }else{
                        JOptionPane.showMessageDialog(null," FELIZIDADES "+jLabel5.getText()+", eres el ganador");
                    }
                }
            }
            newGame();
        }
    }

    private boolean ganador() {
        int contMuertos=0;
        int jugadoresTotales=contM-1;
        if(VIT1.getText().equalsIgnoreCase("muerto")){
            contMuertos++;
        }
        if(VIT2.getText().equalsIgnoreCase("muerto")){
            contMuertos++;
        }
        if(VIT3.getText().equalsIgnoreCase("muerto")){
            contMuertos++;
        }
        if(VIT4.getText().equalsIgnoreCase("muerto")){
            contMuertos++;
        }
        if (contMuertos>=jugadoresTotales) {
            return false;
        }else{
            return true;
        }
    }

    private boolean muerto(int i) {
        switch (i) {
            case 0:if(VIT1.getText().equals("muerto")||VIT1.getText().equals("")){return true;}else{return false;}
            case 1:if(VIT2.getText().equals("muerto")||VIT2.getText().equals("")){return true;}else{return false;}
            case 2:if(VIT3.getText().equals("muerto")||VIT3.getText().equals("")){return true;}else{return false;}
            case 3:if(VIT4.getText().equals("muerto")||VIT4.getText().equals("")){return true;}else{return false;}

        }
        return true;
    }

    private void newGame() {
        jLabel2.setText("jugador 1");
        jLabel3.setText("jugador 2");
        jLabel4.setText("jugador 3");
        jLabel5.setText("jugador 4");
        vit1.setValue(0);
        vit2.setValue(0);
        vit3.setValue(0);
        vit4.setValue(0);
        Jturn.setText("");
        VIT1.setText("");
        VIT2.setText("");
        VIT3.setText("");
        VIT4.setText("");
        jugador1=100;
        jugador2=100;
        jugador3=100;
        jugador4=100;
        turnos=0;
        contM=0;
        Jicono.setIcon(icono);
    }
}
