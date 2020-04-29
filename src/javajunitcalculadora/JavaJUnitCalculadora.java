
package javajunitcalculadora;

public class JavaJUnitCalculadora 
{
    private int num1;
    private int num2;
 
     
    public JavaJUnitCalculadora(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    
    public void modifica(int n1, int n2)
    {
        System.out.println("Vamos a modificar\n");
        num1 = n1;
        num2 = n2;
    }
    
    public int suma()
    {
        System.out.println("Vamos a sumar\n");
        int resul = 0;
        resul = num1 + num2;
        return(resul);
    }

    public int resta()
    {
        System.out.println("Vamos a restar\n");
        int resul = num1 - num2;
        return(resul);
    }
    
    public int multiplica()
    {
        System.out.println("Vamos a multiplicar\n");
        int resul = num1 * num2;
        return(resul);
    }
    
    public int divide()
    {
        System.out.println("Vamos a dividir\n");
        int resul=0;
        try
        {
            resul = num1 / num2;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("Error en división por 0\n");
            System.out.printf("Ponemos resultado a 0\n");
            resul = 0;
        }
        return(resul);
    }
}
