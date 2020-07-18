package parcial1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tabla_LaGrange extends javax.swing.JFrame {

    int n, i, j, c;
    double x_i, fx_i, fx_n= 0;
    DefaultTableModel modelo;
    Object []fila= new Object[2];
    Proceso objeto= new Proceso();
    
    public tabla_LaGrange() {
        initComponents();
        this.setTitle("METODO LAGRANGE");
        this.setLocationRelativeTo(null);
        do
        {
            n= Integer.parseInt(JOptionPane.showInputDialog("Ingresa el grado del polinomio"));
            if(n < 1 || n >3)
                JOptionPane.showMessageDialog(rootPane, "Debe ser de grado 1 a 3");
        }while((n < 1) || (n >  3));
        c= n+1;
        jTextField3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xi", "F(Xi)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("X:");

        jLabel2.setText("F(X):");

        jLabel3.setText("NUEVA F(X):");

        jButton1.setText("Ingresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Cerrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(136, 136, 136)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 97, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       modelo=(DefaultTableModel) jTable1.getModel();
       x_i= Double.parseDouble(jTextField1.getText());
       jTextField1.setText(""+x_i);
       fx_i= Double.parseDouble(jTextField2.getText());
       jTextField2.setText(""+fx_i);
       
       double x[]= new double [c];
       double fx[]= new double [c];
       
       for(i= 0; i < c; i++)
           x[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de X"+i));
       
       for(i= 0; i < c; i++)
           fx[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de FX"+i));
       
       for(i= 0; i < c; i++)
       {
           fila[0]= x[i];
           fila[1]= fx[i];
           
           modelo.addRow(fila);
           jTable1.setModel(modelo);
       }
       
       switch(n)
       {
           case 1:
               fx_n= objeto.RedoNumero((((x_i - x[1])/(x[0] - x[1])) * fx[0]) + (((x_i - x[0])/(x[1] - x[0])) * fx[1]));
               jTextField3.setText(""+fx_n);
           break;
 
           case 2:
               fx_n= objeto.RedoNumero(((((x_i - x[1])*(x_i - x[2]))/((x[0] - x[1])*(x[0] - x[2])))*fx[0]) + 
                                        ((((x_i - x[0])*(x_i - x[2]))/((x[1] - x[0])*(x[1] - x[2])))*fx[1]) + 
                                          ((((x_i - x[0])*(x_i - x[1]))/((x[2] - x[0])*(x[2] - x[1])))*fx[2]));
               jTextField3.setText(""+fx_n);
           break;
           
           case 3:
               fx_n= objeto.RedoNumero(((((x_i - x[1])*(x_i - x[2])*(x_i - x[3]))/((x[0] - x[1])*(x[0] - x[2])*(x[0] - x[3])))*fx[0])+
                                         ((((x_i - x[0])*(x_i - x[2])*(x_i - x[3]))/((x[1] - x[0])*(x[1] - x[2])*(x[1] - x[3])))*fx[1])+
                                           ((((x_i - x[0])*(x_i - x[1])*(x_i - x[3]))/((x[2] - x[0])*(x[2] - x[1])*(x[2] - x[3])))*fx[2])+
                                             ((((x_i - x[0])*(x_i - x[1])*(x_i - x[2]))/((x[3] - x[0])*(x[3] - x[1])*(x[3] - x[2])))*fx[3]));
               jTextField3.setText(""+fx_n);
           break;
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        for (j = 0; j < jTable1.getRowCount(); j++) 
                {
                    modelo.removeRow(j);
                    j-=1;
                }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}