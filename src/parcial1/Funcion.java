package parcial1;

import com.singularsys.jep.JepException;
import javax.swing.JOptionPane;
import org.nfunk.jep.JEP;

public class Funcion 
{
    JEP j= new JEP();
    
    public Funcion(String def) throws JepException
    {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
    }
    
    public double eval(double x) throws Exception
    {
        double r;
        j.addVariable("x", x);
        r= j.getValue();
        if(j.hasError())
            JOptionPane.showMessageDialog(null,j.getErrorInfo());
        return r;
    }
}