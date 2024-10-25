package hn.gabo.uno_junit_app;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public double suma(double n1, double n2) {
				
		return n1 + n2;
	}

	public double multiplicar(double n1, double n2) {
		// TODO Auto-generated method stub
		return n1 * n2;
	}

	public double dividir(double dividendo, double divisor) {		
		Double resultado;		
		
		if(divisor==0) {
			resultado=null;
		}		else {
			return dividendo/divisor;
		}
		
		return resultado;
	}
}
