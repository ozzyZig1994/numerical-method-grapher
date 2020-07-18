package parcial1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tabla_diferenciasDivididas extends javax.swing.JFrame {

    int f, i, cont, c;// variables usadas para almacenar las dimensiones de la matriz aumentada
    double fx_nueva, xo;
    
    DefaultTableModel modelo, modelo2;
    Object []fila= new Object[2];
    Proceso objeto= new Proceso();
    
    public tabla_diferenciasDivididas() {
        initComponents();
        this.setLocationRelativeTo(null);
        setTitle("METODO DE DIFERENCIAS DIVIDIDAS");
        jTextField3.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero", "Logaritmo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Ingresar datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("X: ");

        jLabel3.setText("NUEVA F(X): ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(145, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       modelo=(DefaultTableModel) jTable1.getModel();
       xo= Double.parseDouble(jTextField1.getText());
       do
       {
           f= Integer.parseInt(JOptionPane.showInputDialog("¿De que orden?"));
           if(f > 3)
               JOptionPane.showMessageDialog(rootPane, "Maximo de tercer orden");
       }while(f > 3);
       
       double x[]= new double [f+1];
       double fx[]= new double [f+1];
       double b[]= new double [f+1];
       
       //TABLA UNO--------------------------------------------------------------------------------
       for(i= 0; i < f+1; i++)
           x[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor de X"+i));
       for(i= 0; i < f+1; i++)
           fx[i]= Double.parseDouble(JOptionPane.showInputDialog("Ingresa valor de FX"+i));
       for(i= 0; i < f+1; i++)
       {
           fila[0]= x[i];
           fila[1]= fx[i];
            
           modelo.addRow(fila);
           jTable1.setModel(modelo);
       }
       //TABLA DOS---------------------------------------------------------------------------------
       Object col[] = new Object[f+1];
       for (i= 0; i < f+1; i++) 
           col[i] = "b"+i;
       modelo2= new DefaultTableModel(col, 1);
       jTable2.setModel(modelo2);
       //CALCULANDO RESULTADOS Y MOSTRANDOLOS EN TABLA 2--------------------------------------------
       for (i= 0; i < f+1; i++)
       {
           switch(i)
           {
               case 0: b[i]= fx[i];
                    jTable2.setValueAt(b[i], 0, 0);
                break;
               
               case 1: b[i]= objeto.RedoNumero((fx[1] - fx[0]) / (x[1] - x[0]));
                    jTable2.setValueAt(b[i], 0, 1);
                break;
               
               case 2: b[i]= objeto.RedoNumero((((fx[2] - fx[1]) / (x[2] - x[1])) - b[1]) / (x[2] - x[0]));
                    jTable2.setValueAt(b[i], 0, 2);
                break;
               
               case 3: b[i]= objeto.RedoNumero((((((fx[3] - fx[2]) / (x[3] - x[2])) - ((fx[2] - fx[1]) / (x[2] - x[1]))) / (x[3] - x[1])) - b[2]) / (x[3] - x[0]));
                    jTable2.setValueAt(b[i], 0, 3);
                break;
           }
           //CALCULANDO NUEVA FX
           switch(f)
           {
               case 1: fx_nueva= objeto.RedoNumero(b[0] + (b[1] * (xo - x[0])));
                    jTextField3.setText(""+ fx_nueva);
               break;
               
               case 2: fx_nueva= objeto.RedoNumero(b[0] + (b[1] * (xo - x[0])) + (b[2] * (xo - x[0]) * (xo - x[1])));
                    jTextField3.setText(""+ fx_nueva);
               break;
               
               case 3: fx_nueva= objeto.RedoNumero(b[0] + (b[1] * (xo - x[0])) + (b[2] * (xo - x[0]) * (xo - x[1])) + (b[3] * (xo - x[0]) * (xo - x[1]) * (xo - x[2])));
                    jTextField3.setText(""+ fx_nueva);
                break;
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int j = 0; j < jTable1.getRowCount(); j++) 
        {
           modelo.removeRow(j);
           j-=1;
        }
        
        for (int j = 0; j < jTable2.getRowCount(); j++) 
        {
           modelo.removeRow(j);
           j-=1;
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}