package proyecto_so;

import java.awt.Color;


/**
 *
 * @author Cjavi
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    
    boolean[] filosofos = {true, true, true, true, true};
    
    public Principal() 
    {
        initComponents();
        Control control = new Control(new boolean[]{true, true, true, true});
        Thread fA = new Thread(new Filosofo(new boolean[]{false, false, true, true, false}, 0, control));
        Thread fB = new Thread(new Filosofo(new boolean[]{false, false, false, true, true}, 1, control));
        Thread fC = new Thread(new Filosofo(new boolean[]{true, false, false, false, true}, 2, control));
        Thread fD = new Thread(new Filosofo(new boolean[]{true, true, false, false, false}, 3, control));
        Thread fE = new Thread(new Filosofo(new boolean[]{false, true, true, false, false}, 4, control));
        
        fA.start();
        fB.start();
        fC.start();
        fD.start();
        fE.start();
        
        int idFilosofo = 1;
                        String estado = "";

        switch(idFilosofo)
        {
            case 0:
                switch(estado)
                {
                    case "Hambriento":
                        EstadoA.setBackground(Color.RED);
                        break;
                        
                    case "Comiendo":
                        EstadoA.setBackground(Color.GREEN);
                        break;
                        
                        
                    case "Pensando":
                        EstadoA.setBackground(Color.BLUE);
                        break;
                }
                break;
                
            case 1:
                switch(estado)
                {
                    case "Hambriento":
                        EstadoB.setBackground(Color.RED);
                        break;
                        
                    case "Comiendo":
                        EstadoB.setBackground(Color.GREEN);
                        break;
                        
                        
                    case "Pensando":
                        EstadoB.setBackground(Color.BLUE);
                        break;
                }
                break;
                
            case 2:
                switch(estado)
                {
                    case "Hambriento":
                        EstadoC.setBackground(Color.RED);
                        break;
                        
                    case "Comiendo":
                        EstadoC.setBackground(Color.GREEN);
                        break;
                        
                        
                    case "Pensando":
                        EstadoC.setBackground(Color.BLUE);
                        break;
                }
                break;
                
            case 3:
                switch(estado)
                {
                    case "Hambriento":
                        EstadoD.setBackground(Color.RED);
                        break;
                        
                    case "Comiendo":
                        EstadoD.setBackground(Color.GREEN);
                        break;
                        
                        
                    case "Pensando":
                        EstadoD.setBackground(Color.BLUE);
                        break;
                }
                break;
                
            case 4:
                switch(estado)
                {
                    case "Hambriento":
                        EstadoE.setBackground(Color.RED);
                        break;
                        
                    case "Comiendo":
                        EstadoE.setBackground(Color.GREEN);
                        break;
                        
                        
                    case "Pensando":
                        EstadoE.setBackground(Color.BLUE);
                        break;
                }
                break;
        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFilosofoA3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFilosofoA = new javax.swing.JLabel();
        lblFilosofoB = new javax.swing.JLabel();
        lblFilosofoC = new javax.swing.JLabel();
        lblFilosofoD = new javax.swing.JLabel();
        lblFilosofoE = new javax.swing.JLabel();
        btnIniciar = new javax.swing.JButton();
        EstadoB = new javax.swing.JPanel();
        EstadoA = new javax.swing.JPanel();
        EstadoE = new javax.swing.JPanel();
        EstadoC = new javax.swing.JPanel();
        EstadoD = new javax.swing.JPanel();

        lblFilosofoA3.setText("Filosofo A");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblFilosofoA.setText("A");

        lblFilosofoB.setText("B");

        lblFilosofoC.setText("C");

        lblFilosofoD.setText("D");

        lblFilosofoE.setText("E");

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        EstadoB.setBackground(new java.awt.Color(51, 51, 255));
        EstadoB.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EstadoBLayout = new javax.swing.GroupLayout(EstadoB);
        EstadoB.setLayout(EstadoBLayout);
        EstadoBLayout.setHorizontalGroup(
            EstadoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        EstadoBLayout.setVerticalGroup(
            EstadoBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        EstadoA.setBackground(new java.awt.Color(51, 51, 255));
        EstadoA.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EstadoALayout = new javax.swing.GroupLayout(EstadoA);
        EstadoA.setLayout(EstadoALayout);
        EstadoALayout.setHorizontalGroup(
            EstadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        EstadoALayout.setVerticalGroup(
            EstadoALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        EstadoE.setBackground(new java.awt.Color(0, 0, 255));
        EstadoE.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EstadoELayout = new javax.swing.GroupLayout(EstadoE);
        EstadoE.setLayout(EstadoELayout);
        EstadoELayout.setHorizontalGroup(
            EstadoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        EstadoELayout.setVerticalGroup(
            EstadoELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        EstadoC.setBackground(new java.awt.Color(0, 0, 255));
        EstadoC.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EstadoCLayout = new javax.swing.GroupLayout(EstadoC);
        EstadoC.setLayout(EstadoCLayout);
        EstadoCLayout.setHorizontalGroup(
            EstadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        EstadoCLayout.setVerticalGroup(
            EstadoCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        EstadoD.setBackground(new java.awt.Color(0, 0, 255));
        EstadoD.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout EstadoDLayout = new javax.swing.GroupLayout(EstadoD);
        EstadoD.setLayout(EstadoDLayout);
        EstadoDLayout.setHorizontalGroup(
            EstadoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        EstadoDLayout.setVerticalGroup(
            EstadoDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFilosofoE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92)
                                        .addComponent(EstadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFilosofoB))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EstadoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFilosofoD))
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblFilosofoC)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EstadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFilosofoA))
                                .addGap(63, 63, 63))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnIniciar)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(btnIniciar)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(EstadoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFilosofoE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFilosofoA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EstadoA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFilosofoB)
                            .addComponent(EstadoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EstadoD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFilosofoD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(EstadoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblFilosofoC)))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
      
      EstadoA.setBackground(Color.RED);
      EstadoB.setBackground(Color.GREEN);
      EstadoC.setBackground(Color.BLUE);
      // Pensando Azul, Comiento Rojo, Hambriento Verde
        
    }//GEN-LAST:event_btnIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel EstadoA;
    private javax.swing.JPanel EstadoB;
    private javax.swing.JPanel EstadoC;
    private javax.swing.JPanel EstadoD;
    private javax.swing.JPanel EstadoE;
    private javax.swing.JButton btnIniciar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblFilosofoA;
    private javax.swing.JLabel lblFilosofoA3;
    private javax.swing.JLabel lblFilosofoB;
    private javax.swing.JLabel lblFilosofoC;
    private javax.swing.JLabel lblFilosofoD;
    private javax.swing.JLabel lblFilosofoE;
    // End of variables declaration//GEN-END:variables
}
