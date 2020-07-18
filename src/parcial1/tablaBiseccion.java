package parcial1;
import javax.swing.table.DefaultTableModel;
import com.singularsys.jep.JepException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class tablaBiseccion extends javax.swing.JFrame {

    public tablaBiseccion() {
        initComponents();
        this.setTitle("Método Bisección");
        def= ventanaGrafica.txFuncion.getText();
        tx_funcion.setText(def);
        tx_funcion.setEnabled(false);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tx_a = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tx_b = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tx_er = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        tx_funcion = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Valor de a:");

        jLabel2.setText("Valor de b:");

        jLabel3.setText("Error permitido:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Iteracion", "A", "B", "F(A)", "F(B)", "XR", "F(XR)", "EP"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Calcular");
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

        jLabel4.setText("Funcion:");

        jButton3.setText("Limpiar");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_a, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tx_b, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tx_er)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tx_a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tx_b, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tx_er, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tx_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        hide();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        modelo=(DefaultTableModel) jTable1.getModel();
        ff= new Funcion(def);
        a= Double.parseDouble(tx_a.getText());
        b= Double.parseDouble(tx_b.getText());
        ep= Double.parseDouble(tx_er.getText());
        
        fa= obj.RedoNumero(ff.eval(a));
        fb= obj.RedoNumero(ff.eval(b));
        XR= obj.RedoNumero((a+b)/2);
        fxr= obj.RedoNumero(ff.eval(XR));
        er= 0;
        
        fila[0]= i;
        fila[1]= a;
        fila[2]= b;
        fila[3]= fa;
        fila[4]= fb;
        fila[5]= XR;
        fila[6]= fxr;
        fila[7]= er;
        
        i++;
        modelo.addRow(fila);
        jTable1.setModel(modelo);
       
        if (fxr>=0){
            do{
                a= obj.RedoNumero(XR);
                fa= obj.RedoNumero(fxr);
                fb= obj.RedoNumero(ff.eval(b));
                XR= obj.RedoNumero((a+b)/2);
                er= obj.RedoNumero(Math.abs(((XR-a)/XR)*100));
                fxr= obj.RedoNumero(ff.eval(XR));
                
                fila[0]= i;
                fila[1]= a;
                fila[2]= b;
                fila[3]= fa;
                fila[4]= fb;
                fila[5]= XR;
                fila[6]= fxr;
                fila[7]= er;
        
                i++;
                modelo.addRow(fila);
                jTable1.setModel(modelo);
                
                if (fxr<0){
                    b= obj.RedoNumero(XR);
                    fb= obj.RedoNumero(fxr);
                    fa= obj.RedoNumero(ff.eval(a));
                    XR= obj.RedoNumero((a+b)/2);
                    er= obj.RedoNumero(Math.abs(((XR-b)/XR)*100));
                    fxr= obj.RedoNumero(ff.eval(XR));
                    
                    fila[0]= i;
                    fila[1]= a;
                    fila[2]= b;
                    fila[3]= fa;
                    fila[4]= fb;
                    fila[5]= XR;
                    fila[6]= fxr;
                    fila[7]= er;
        
                    i++;
                    modelo.addRow(fila);
                    jTable1.setModel(modelo);
                }
            }while(er>=ep);
        }
        else {
            do{
                b= obj.RedoNumero(XR);
                fb= obj.RedoNumero(fxr);
                fa= obj.RedoNumero(ff.eval(a));
                XR= obj.RedoNumero((a+b)/2);
                er= obj.RedoNumero(Math.abs(((XR-b)/XR)*100));
                fxr= obj.RedoNumero(ff.eval(XR));
                
                fila[0]= i;
                fila[1]= a;
                fila[2]= b;
                fila[3]= fa;
                fila[4]= fb;
                fila[5]= XR;
                fila[6]= fxr;
                fila[7]= er;
        
                i++;
                modelo.addRow(fila);
                jTable1.setModel(modelo);
                
                if (fxr>0){
                    a= obj.RedoNumero(XR);
                    fa= obj.RedoNumero(fxr);
                    fb= obj.RedoNumero(ff.eval(b));
                    XR= obj.RedoNumero((a+b)/2);
                    er= obj.RedoNumero(Math.abs(((XR-a)/XR)*100));
                    fxr= obj.RedoNumero(ff.eval(b));
                    
                    fila[0]= i;
                    fila[1]= a;
                    fila[2]= b;
                    fila[3]= fa;
                    fila[4]= fb;
                    fila[5]= XR;
                    fila[6]= fxr;
                    fila[7]= er;
        
                    i++;
                    modelo.addRow(fila);
                    jTable1.setModel(modelo);
                }
            }while(er>=ep);
        }
        i= 1;
        } catch (JepException ex) {
            Logger.getLogger(ventanaGrafica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ventanaGrafica.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        for (int j = 0; j < jTable1.getRowCount(); j++) 
        {
           modelo.removeRow(j);
           j-=1;
        }
        tx_a.setText("");
        tx_b.setText("");
        tx_er.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tx_a;
    private javax.swing.JTextField tx_b;
    private javax.swing.JTextField tx_er;
    private javax.swing.JTextField tx_funcion;
    // End of variables declaration//GEN-END:variables
    String def;
    double x, fa, fb, XR, fxr, ep, a, b, er, i= 1;
    Object []fila= new Object[8];
    Funcion ff;
    Proceso obj= new Proceso();
    DefaultTableModel modelo;
}