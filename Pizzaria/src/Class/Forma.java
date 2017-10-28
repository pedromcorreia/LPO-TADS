package Class;

public abstract class Forma  
{
    //array para medidas
    private double medida[]; 
    
    //construtor parametrizado que aloca o array de medidas
    public Forma(int nrMeidas) 
    {
        medida = new double[nrMeidas];
    }
    
    //obtem a medida da forma
    public double getMedida(int i)
    {
        if(i>0 || (i<medida.length))
        {
            return medida[i];
        }else 
            {   
                return -1; 
            }
    }
    /* Metodo setMedida define uma medida da forma
    Metodo é protected para que as subclasses decidam se deve ser public ou não*/
    protected void setMedida(int i, double m)
    {
        if ((i>0) || (i<medida.length) || (m<0)) 
        {
            medida[i] = m;
        }
    }
    
}
