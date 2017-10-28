package Class;

public class Quadrado extends Forma 
{
    private double lado;
    
    public Quadrado(double lado) 
    {
        super(2); //Uso obrigatório do construtor da super classe
        setMedida(0,lado);
    }
       
    //implementação do metodo abstrato area
    public double area()
    {
        return getMedida(0) * getMedida(0);
    }
       
}
