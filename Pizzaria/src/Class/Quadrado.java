package Class;

public class Quadrado extends Forma 
{
    
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
    
    //implementação do metodo especifido desta subclasse
    public double perimetro() 
    {
        return 4*(getMedida(0)); 
    }
            
    
}
