package parcial1;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Grafica 
{
    JFreeChart grafica;
    XYSeriesCollection datos= new XYSeriesCollection();
    String titulo, etiquetaX, etiquetaY;
    
    public Grafica(String t, String x, String y)
    {
        titulo= t;
        etiquetaX= x;
        etiquetaY= y;
        grafica= ChartFactory.createXYLineChart(titulo, x, y, datos, PlotOrientation.VERTICAL, true, true, true);
    }
    
    public Grafica()
    {
        this("Sin titulo", "x", "y");
    }
    
    void agregarGrafica(String id, double[] x, double[] y)
    {
        XYSeries s= new XYSeries(id);
        int n= x.length;
        for(int i= 0; i < n; i++)
            s.add(x[i], y[i]);
        datos.addSeries(s);
    }
    
    void crearGrafica(String id, double[] x, double[] y)
    {
        datos.removeAllSeries();
        agregarGrafica(id, x, y);
    }
    
    public JPanel obtieneGrafica()
    {
        return new ChartPanel(grafica);
    }
}