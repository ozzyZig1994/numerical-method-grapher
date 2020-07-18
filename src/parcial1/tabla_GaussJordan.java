package parcial1;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class tabla_GaussJordan extends javax.swing.JFrame {
    int f, c;// variables usadas para almacenar las dimensiones de la matriz aumentada
   
    DefaultTableModel modelo = new DefaultTableModel();
    Boolean ban = false;
    
    public tabla_GaussJordan() {
        initComponents();
        setTitle("Metodo de Gauss");
        this.setLocationRelativeTo(null);// al momento de ejecutar la aplicacion lo ventana se  centra en la pantalla 
    }

    public double[] cargarMatriz(double m[][], double r[]) {

        // recuerde que el metodo de Gauss Jordan trabaja con la idea de convertir la matriz aumentada en la matriz identidad
        for (int i = 0; i <= r.length - 1; i++) {
            double d, c= 0;
            d = m[i][i];// seleccionamos el pivote
            area_de_texto.append(Double.toString(d/2) + "*fila" + (i + 1) + "\n");// muestra en el area de texto el pivote seleccionado
            for (int s = 0; s <= r.length - 1; s++) {// pasamos a convertir en 1 al pivote seleionado
                m[i][s] = ((m[i][s]) / d);
            }
            r[i] = ((r[i]) / d);

            // paso a mostrar las opraciones realizadas en la matriz aumentada
            for (int j = 0; j < r.length; j++) {
                
                for (int k = 0; k < r.length; k++) {
                    area_de_texto.append(Double.toString(m[j][k]) + "\t");
                }
                area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
            }
            area_de_texto.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada

            for (int x = 0; x <= r.length - 1; x++) {
                if (i != x) {
                    c = m[x][i];
                    area_de_texto.append("-" + Double.toString(c) + " * fila" + (i + 1) + "+ fila" + (x + 1) + "\n");// mustra en pantalla las opraciones que se realizaran por fila
                    for (int y = 0; y <= r.length - 1; y++) {// se hace cero a todos los elemntos de la colunma que no sean el pivote
                        m[x][y] = m[x][y] - c * m[i][y];

                    }
                    r[x] = r[x] - c * r[i];

                    // paso a mostrar las opraciones realizadas en la matriz aumentada
                    for (int j = 0; j < r.length; j++) {
                       
                        for (int k = 0; k < r.length; k++) {
                            area_de_texto.append(Double.toString(m[j][k]) + "\t");
                        }
                        area_de_texto.append("|\t" + Double.toString(r[j]) + "\n");
                    }
                    area_de_texto.append("\n\n");// fin paso a motrar las opraciones realizadas en la matriz aumentada
                }// fin if (i != x)
            }// fin for (int x = 0; x <= r.length - 1; x++)
        }//fin bucle i
        return r;// retorna la solucion l sistema
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldNumeroDeIncognitas = new javax.swing.JTextField();
        jButtoncargar_matriz = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        area_de_texto = new javax.swing.JTextArea();
        jButtoncargar_matriz2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButtoncargar_matriz1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NUMERO DE INCOGNITAS: ");

        jButtoncargar_matriz.setText("Cargar matriz aumentada");
        jButtoncargar_matriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matrizActionPerformed(evt);
            }
        });

        area_de_texto.setColumns(20);
        area_de_texto.setRows(5);
        jScrollPane1.setViewportView(area_de_texto);

        jButtoncargar_matriz2.setText("Limpiar texto");
        jButtoncargar_matriz2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matriz2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("NOTA: Al momento de dar click en el boton de resolver el sistema asegurese ");

        jButtoncargar_matriz1.setText("Resolver el sistema");
        jButtoncargar_matriz1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoncargar_matriz1ActionPerformed(evt);
            }
        });

        jLabel9.setText("que no haya casillas vacias ni seleccionadas y que los datos ingresados sean");

        jLabel3.setText("válidos .");

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtoncargar_matriz1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldNumeroDeIncognitas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButtoncargar_matriz, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtoncargar_matriz2)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldNumeroDeIncognitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtoncargar_matriz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtoncargar_matriz1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jButtoncargar_matriz2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtoncargar_matrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matrizActionPerformed
        /*
         * pasamos a mostrar los cuadros para llenar la matriz aumentada en la pantalla
         */

        /*
         * ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
         */
        try {
            /*
             * ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
             */
            f = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());
            c = f + 1;

            // 
            Object col[] = new Object[c];//  al erreglo mostrara en el titulo del JTabel las las incognitas y su solucion de la ecuaciom
            // ejemplo si el sistema tiene 2 incognitas aparecera en la pantalla una matriz de 2x3
            // se motrara en el titulo del JTable  x1  x2   d
            for (int j = 0; j < c; j++) {
                if (j < c - 1) {
                    col[j] = "X" + (j + 1);
                } else {
                    col[j] = "d";
                }
            }
            modelo = new DefaultTableModel(col, f);// se muestra el titulo y el Jtablet toma la dimension de la matriz aumentada
            jTable1.setModel(modelo);// el Jtablet toma la dimension de la matriz aumentada

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "INGRESO ERRONEO", "MENSAJE", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButtoncargar_matrizActionPerformed

    private void jButtoncargar_matriz1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matriz1ActionPerformed
        /*
         * acontinuacion pasamos a gargar los datos ingresados en los cuadros del Jtablet en la matriz aumntada
         */
        try {

            int n = Integer.parseInt(jTextFieldNumeroDeIncognitas.getText());// alamacena el nuemro de ingonitas ingresado por teclado

            double m[][] = new double[n][n];// almacena los coeficientes de la matriz aumentada 
            double r[] = new double[n];// almacena al valor de la solucion de cada ecuacion ejemplo si 2x+4x2=3 entonces debera ingresar el los cuadors  2   4   3   en donde , m[0][1]=2,m[0][2]=4  y   r[0]=3

            for (int i = 0; i < n; i++) {// pasamos a alamcenar en un arreglo los datos ingresados en el JTable
                for (int j = 0; j < n; j++) {//
                    m[i][j] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, j)));
                }
                r[i] = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, n)));
            }

            r = this.cargarMatriz(m, r);// llamada al metodo a calcula la solucion del sistema de eciones 

            //pasamos a mostrar las soluciones del sistema en el area de texto
            for (int i = 0; i < n; i++) {
                area_de_texto.append("x" + (i + 1) + " = " + r[i] + "\n");
            }
        }//fin try
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error ingreso de datos \n"
                    + "NOTA: verifique que no haya casillas seleccionadas ni vacias\n"
                    + " también verifique que el ingreso de tados sea correctos");
        }
    }//GEN-LAST:event_jButtoncargar_matriz1ActionPerformed

    private void jButtoncargar_matriz2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoncargar_matriz2ActionPerformed
        area_de_texto.setText("");
    }//GEN-LAST:event_jButtoncargar_matriz2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        hide();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area_de_texto;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtoncargar_matriz;
    private javax.swing.JButton jButtoncargar_matriz1;
    private javax.swing.JButton jButtoncargar_matriz2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNumeroDeIncognitas;
    // End of variables declaration//GEN-END:variables
}