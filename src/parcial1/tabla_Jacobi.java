package parcial1;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tabla_Jacobi extends javax.swing.JFrame {

    int incognitas, i, c, cont1= 1, cont2= 1, coeficiente, iteracion= 1;
    String despeje1, despeje2, despeje3, despeje4;
    double x1, x2, x3, x4, x1_n, x2_n, x3_n, x4_n, ep1, ep2, ep3, ep4, er;
    
    DefaultTableModel modelo, modelo2;
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine interprete = manager.getEngineByName("js");
    Proceso objeto= new Proceso();
    
    public tabla_Jacobi() {
        initComponents();
        this.setTitle("METODO JACOBI");
        this.setLocationRelativeTo(null);
        //ENTRADAS INACTIVAS--------------------------------------------------------------------------------
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jTextField3.setVisible(false);
        jTextField4.setVisible(false);
        //RECIBIR NUMERO DE ECUACIONES----------------------------------------------------------------------
        do
        {
            incognitas= Integer.parseInt(JOptionPane.showInputDialog("¿Con cuántas ecuaciones deseas trabajar?"));
            c= incognitas * 3;
            if((incognitas > 4) || (incognitas < 2))
                JOptionPane.showMessageDialog(rootPane, "Solo se puede trabajar de 2 a 4 ecuaciones");
        }while((incognitas > 4) || (incognitas < 2));
        //CARGANDO TABLA 1-----------------------------------------------------------------------------------
        Object col[] = new Object[incognitas];
        for (i= 0; i < incognitas; i++)
            col[i] = "X"+(i + 1);
        modelo= new DefaultTableModel(col, incognitas);
        jTable1.setModel(modelo);
        //CARGANDO TABLA 2-----------------------------------------------------------------------------------
        Object col2[] = new Object[(incognitas*3)+1];
        for (i= 0; i < c+1; i++)
        {
             if (i == 0) 
                 col2[i] = "Iteracion";
             else 
                 if(i <= incognitas)
                     col2[i] = "X" + i;
             else
                     if(i <= (incognitas*2))
                         col2[i] = "Xn" + (cont1++);
             else
                         if(i <= (incognitas*3))
                             col2[i] = "Ep" + (cont2++);
        }
        modelo2= new DefaultTableModel(col2, 0);
        jTable2.setModel(modelo2);
        //---------------------------------------------------------------------------------------------------
        switch(incognitas)
        {
            case 2:
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
            break;
            
            case 3:
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
            break;
            
            case 4:
                jLabel2.setVisible(true);
                jLabel3.setVisible(true);
                jLabel4.setVisible(true);
                jLabel5.setVisible(true);
                jTextField1.setVisible(true);
                jTextField2.setVisible(true);
                jTextField3.setVisible(true);
                jTextField4.setVisible(true);
            break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingresa en cada casilla de la siguiente tabla los coeficientes para cada incognita de cada ecuacion");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("X1: ");

        jLabel3.setText("X2: ");

        jLabel4.setText("X3: ");

        jLabel5.setText("X4: ");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

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

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ayuda");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField4))
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)))
                        .addGap(0, 11, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Object col3[] = new Object[(incognitas*3)+1];
            er= Double.parseDouble(JOptionPane.showInputDialog("Error permitido"));
            switch(incognitas)
            {
                case 2:
                    x1=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x1"));
                    x2=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x2"));
                    col3[0]= iteracion;
                    col3[1]= x1;
                    col3[2]= x2;
                    col3[5]= ep1;
                    col3[6]= ep2;
                    
                    despeje1= jTextField1.getText();
                    interprete.put("x2", x2);
                    x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                    col3[4]= x1_n;
                    
                    despeje2= jTextField2.getText();
                    interprete.put("x1", x1_n);
                    x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                    col3[5]= x2_n;
                    
                    x1= x1_n;
                    x2= x2_n;
                    modelo2.addRow(col3);
                    jTable2.setModel(modelo2);
                    
                    do
                    {
                        iteracion++;
                        col3[0]= iteracion;
                        col3[1]= x1;
                        col3[2]= x2;
                        
                        despeje1= jTextField1.getText();
                        interprete.put("x2", x2);
                        x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                        col3[3]= x1_n;
                    
                        despeje2= jTextField2.getText();
                        interprete.put("x1", x1_n);
                        x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                        col3[4]= x2_n;
                        x2= x2_n;
                    
                        ep1= Math.abs(((x1_n - x1)/x1_n)*100);
                        ep2= Math.abs(((x2_n - x2)/x2_n)*100);
                    
                        col3[5]= ep1;
                        col3[6]= ep2;
                    
                        x1= x1_n;
                        modelo2.addRow(col3);
                        jTable2.setModel(modelo2);
                    }while((ep1 >= er) && (ep2 >= er));
                    break;
                    
                case 3:
                    x1=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x1"));
                    x2=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x2"));
                    x3=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x3"));
                    col3[0]= iteracion;
                    col3[1]= x1;
                    col3[2]= x2;
                    col3[3]= x3;
                    col3[7]= ep1;
                    col3[8]= ep2;
                    col3[9]= ep3;
                    
                    despeje1= jTextField1.getText();
                    interprete.put("x2", x2);
                    interprete.put("x3", x3);
                    x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                    col3[4]= x1_n;
                    
                    despeje2= jTextField2.getText();
                    interprete.put("x1", x1_n);
                    interprete.put("x3", x3);
                    x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                    col3[5]= x2_n;
                    
                    despeje3= jTextField3.getText();
                    interprete.put("x1", x1_n);
                    interprete.put("x2", x2_n);
                    x3_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje3));
                    col3[6]= x3_n;
                    
                    x1= x1_n;
                    x2= x2_n;
                    x3= x3_n;
                    modelo2.addRow(col3);
                    jTable2.setModel(modelo2);
                    
                    do
                    {
                        iteracion++;
                        col3[0]= iteracion;
                        col3[1]= x1;
                        col3[2]= x2;
                        col3[3]= x3;
                        
                        despeje1= jTextField1.getText();
                        interprete.put("x2", x2);
                        interprete.put("x3", x3);
                        x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                        col3[4]= x1_n;
                    
                        despeje2= jTextField2.getText();
                        interprete.put("x1", x1_n);
                        interprete.put("x3", x3);
                        x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                        col3[5]= x2_n;
                    
                        despeje3= jTextField3.getText();
                        interprete.put("x1", x1_n);
                        interprete.put("x2", x2_n);
                        x3_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje3));
                        col3[6]= x3_n;
                        x3= x3_n;
                    
                        ep1= Math.abs(((x1_n - x1)/x1_n)*100);
                        ep2= Math.abs(((x2_n - x2)/x2_n)*100);
                        ep3= Math.abs(((x3_n - x3)/x3_n)*100);
                    
                        col3[7]= ep1;
                        col3[8]= ep2;
                        col3[9]= ep3;
                    
                        x1= x1_n;
                        x2= x2_n;
                        modelo2.addRow(col3);
                        jTable2.setModel(modelo2);
                    }while((ep1 >= er) && (ep2 >= er) && (ep3 >= er));
                    break;
                    
                case 4:
                    x1=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x1"));
                    x2=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x2"));
                    x3=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x3"));
                    x4=  Double.parseDouble(JOptionPane.showInputDialog("Valor inicial para x4"));
                    col3[0]= iteracion;
                    col3[1]= x1;
                    col3[2]= x2;
                    col3[3]= x3;
                    col3[4]= x4;
                    col3[9]= ep1;
                    col3[10]= ep2;
                    col3[11]= ep3;
                    col3[12]= ep4;
                    
                    despeje1= jTextField1.getText();
                    interprete.put("x2", x2);
                    interprete.put("x3", x3);
                    interprete.put("x4", x4);
                    x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                    col3[5]= x1_n;
                    
                    despeje2= jTextField2.getText();
                    interprete.put("x1", x1_n);
                    interprete.put("x3", x3);
                    interprete.put("x4", x4);
                    x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                    col3[6]= x2_n;
                    
                    despeje3= jTextField3.getText();
                    interprete.put("x1", x1_n);
                    interprete.put("x2", x2_n);
                    interprete.put("x4", x4);
                    x3_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje3));
                    col3[7]= x3_n;
                    
                    despeje4= jTextField4.getText();
                    interprete.put("x1", x1_n);
                    interprete.put("x2", x2_n);
                    interprete.put("x3", x3_n);
                    x4_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje4));
                    col3[8]= x4_n;
                    
                    x1= x1_n;
                    x2= x2_n;
                    x3= x3_n;
                    x4= x4_n;
                    modelo2.addRow(col3);
                    jTable2.setModel(modelo2);
                    
                    do
                    {
                        iteracion++;
                        col3[0]= iteracion;
                        col3[1]= x1;
                        col3[2]= x2;
                        col3[3]= x3;
                        col3[4]= x4;
                        
                        despeje1= jTextField1.getText();
                        interprete.put("x2", x2);
                        interprete.put("x3", x3);
                        interprete.put("x4", x4);
                        x1_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje1));
                        col3[5]= x1_n;
                    
                        despeje2= jTextField2.getText();
                        interprete.put("x1", x1_n);
                        interprete.put("x3", x3);
                        interprete.put("x4", x4);
                        x2_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje2));
                        col3[6]= x2_n;
                    
                        despeje3= jTextField3.getText();
                        interprete.put("x1", x1_n);
                        interprete.put("x2", x2_n);
                        interprete.put("x4", x4);
                        x3_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje3));
                        col3[7]= x3_n;
                    
                        despeje4= jTextField4.getText();
                        interprete.put("x1", x1_n);
                        interprete.put("x2", x2_n);
                        interprete.put("x3", x3_n);
                        interprete.put("x4", x4);
                        x4_n= objeto.ConvertirObjectToDouble(interprete.eval(despeje4));
                        col3[8]= x4_n;
                        x4= x4_n;
                    
                        ep1= Math.abs(((x1_n - x1)/x1_n)*100);
                        ep2= Math.abs(((x2_n - x2)/x2_n)*100);
                        ep3= Math.abs(((x3_n - x3)/x3_n)*100);
                        ep4= Math.abs(((x4_n - x4)/x4_n)*100);
                    
                        col3[9]= ep1;
                        col3[10]= ep2;
                        col3[11]= ep3;
                        col3[12]= ep4;
                    
                        x1= x1_n;
                        x2= x2_n;
                        x3= x3_n;
                        modelo2.addRow(col3);
                        jTable2.setModel(modelo2);
                    }while((ep1 >= er) && (ep2 >= er) && (ep3 >= er) && (ep4 >= er));
                    break;
            }
        } catch (ScriptException ex) {
            Logger.getLogger(tabla_Jacobi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(incognitas)
        {
            case 2:
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
                jTextField2.setText("");
            break;
            
            case 3:
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
                jTextField2.setText("");
                jTextField3.setText("");
            break;
            
            case 4:
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
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            break;
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Para mejores resultados en las cajas de texto escriba los despejes de cada x\n"
                + "dela siguiente manera : \n*(-x1-(2*x3)+x4-17)/10\n*(17+x2+x3-4-x4)/6");
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}