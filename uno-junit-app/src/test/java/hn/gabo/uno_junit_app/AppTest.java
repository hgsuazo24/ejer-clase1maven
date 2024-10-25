package hn.gabo.uno_junit_app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	
 //  @Before
 //  public void setup() {
	//   System.out.println("Se acaba de imprimir método SetUp");
	   
   //}
   

   //@Test
  // public void miSegundaPrueba() {
	//   System.out.println("Se acaba de imprimir método prueba2");
	   
   //}
   
   //@After
   //public void teardown() {
	   
   //}
   
   //@AfterClass
   //public static void teardownClass() {
	   
   //}
   
	private static App calculadora;
	
   @BeforeClass
   public static void setUpClass() {
	   System.out.println("Se acaba de imprimir método SetUpClass");
	   calculadora=new App();
	   
   }
   
   @Test
   public void probandolasumap1() {
	   double n1=1;
	   double n2=1;
	   double resultado=calculadora.suma(n1,n2);
	   assertEquals(n1+n2,resultado,0.001);	  	   
   }
   
   @Test
   public void probandolasumap2() {
	   double n1=0.5;
	   double n2=0.4;
	   double resultado=calculadora.suma(n1,n2);
	   assertEquals(n1+n2,resultado, 0.001);	  	   
   }
   
   @Test
   public void probandolasumap3() {
	   double n1=-1;
	   double n2=-2;
	   double resultado=calculadora.suma(n1,n2);
	   assertTrue(n1+n2==resultado);	  	   
   }
   
   @Test
   public void probandolamultip1() {
	   double n1=5000;
	   double n2=3000;
	   double resultado=calculadora.multiplicar(n1,n2);
	   assertEquals(n1*n2,resultado, 0.001);	  	   
   }
   
   @Test
   public void probandolamultip2() {
	   double n1=0.33;
	   double n2=0.45;
	   double resultado=calculadora.multiplicar(n1,n2);
	   assertEquals(n1*n2,resultado, 0.001);	  	   
   }
   
   @Test
   public void probandoladivi1() {
	   double dividendo=8;
	   double divisor=4;
	   double resultado=calculadora.dividir(dividendo,divisor);
	   assertEquals(dividendo/divisor,resultado, 0.000001);	  	   
   }
   @Test
   public void probandoladivi2() {
	   double dividendo=9;
	   double divisor=4;
	   double resultado=calculadora.dividir(dividendo,divisor);
	   assertEquals(dividendo/divisor,resultado, 0.000001);	  	   
   }
   
   @Test
   public void probandoladivi3() {
	   double dividendo=2;
	   double divisor=400;
	   double resultado=calculadora.dividir(dividendo,divisor);
	   assertEquals(dividendo/divisor,resultado, 0.000001);	  	   
   }
   
   @Test
   public void probandoladivi4() {
	   double dividendo=0;
	   double divisor=20;
	   double resultado=calculadora.dividir(dividendo,divisor);
	   assertEquals(dividendo/divisor,resultado, 0.000001);	  	   
   }
   
 //  @Test
   //public void probandoladivi5() {
	 //  double dividendo=100;
	   //double divisor=0;
	   //Double resultado=calculadora.dividir(dividendo,divisor);
	   //assertEquals(dividendo/divisor,resultado, 0.000001);	  	   
  // }
   
   @Test
   public void probandoladivi55() {
	   double dividendo=100;
	   double divisor=0;
	   Double resultado=calculadora.dividir(dividendo,divisor);
	   assertNull(resultado);	  	   
   }
   
   @Test
   public void probandoladivi6() {
	   double dividendo=0.29;
	   double divisor=0.0034;
	   Double resultado=calculadora.dividir(dividendo,divisor);
	   if(divisor==0) {
	   	   fail("No es posible dividir entre cero");
	   }
	   else {
		   assertTrue(dividendo/divisor==resultado);
	   }
	   	  	   
   }
   
   
   
    
}
