package Class;

public class Circunferencia extends Forma
{
    private double raio;
    
    public Circunferencia(double raio) 
    {
        super(1); //uso obrigatório do construtor da superclass
        setMedida (0, raio); //ajuste da meedida do raio
    }
    
    //implementação do metodo abstrato area
    public double area ()
    {
        return Math.PI * Math.pow(getMedida(0),2);
    }
}
