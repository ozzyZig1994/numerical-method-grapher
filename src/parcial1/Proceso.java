package parcial1;

public class Proceso 
{
    double RedoNumero (double p_valorN)
    {
        p_valorN*= Math.pow(10,6);
        p_valorN+= 0.5;
        p_valorN= (int)p_valorN;
        p_valorN/= Math.pow(10,6);
        return p_valorN;
    }
    
    double ConvertirObjectToDouble(Object Obj) 
    {
        String Str = Obj.toString();
        double NumDouble = Double.parseDouble(Str);
        return NumDouble;
    }
}