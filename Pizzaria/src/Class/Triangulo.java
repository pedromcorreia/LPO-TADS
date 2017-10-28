package Class;

public class Triangulo extends Forma {
    
    private double lado;
    
    public Triangulo(double lado)
    {
        super(3);                 
        setMedida(0,lado); //ajuste de medida
    }
    
    //implementação do método abstrato
    public double area()
    {
        return ((getMedida(0) * getMedida(0)) * 1.7)/4;
    }
}
