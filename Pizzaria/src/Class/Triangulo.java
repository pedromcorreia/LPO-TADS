package Class;

public class Triangulo extends Forma {
    
    public Triangulo(double lado1, double lado2, double lado3)
    {
        super(3);
        setMedida(0,lado1); //ajuste de medida
        setMedida(1, lado2); //ajuste de medida
        setMedida(2, lado3); //ajuste de medida
    }
    
    //implementação do método abstrato
    public double area()
    {
        double sp = (getMedida(0) + getMedida(1) + getMedida(2))/2;
        double aux = sp * (sp-getMedida(0)) * (sp-getMedida(1)) *(sp-getMedida(2));
        return Math.sqrt(aux);
    }
}
