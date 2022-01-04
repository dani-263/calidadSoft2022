package practica3;
import java.util.ArrayList;
import java.util.LinkedList;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.After;		
import org.junit.AfterClass;		
import org.junit.Before;		
import org.junit.BeforeClass;		


public class TestJUnit {

	
	Pelicula pelicula1 = new Pelicula("2012",2012, "Ca", 5, 0);
	Pelicula pelicula2 = new Pelicula("2013",2012, "In", 4, 1);
	
    MessageUtil messageutil = new MessageUtil(pelicula2.titulo);
    MessageUtil messageutil2 = new MessageUtil(pelicula2.actor);
    
    
    ArrayList<Pelicula> pelis = new ArrayList<Pelicula>();
    


		 //PRUEBA1 (ERROR) //Check that two objects are equal
		 @Test
		 public void testPrintMessage3() {
		assertEquals(pelicula1.titulo, messageutil.printMessage());
		 }
		
		//PRUEBA2 (ERROR) //Check if two object references point to the same object
		 @Test
		 public void testPrintMessage4() {
		assertSame(pelicula1.actor, messageutil2.printMessage());
		 }
		 
		//PRUEBA3 ERROR //Check that a condition is true

		 @Test
		 public void testPrintMessage5() {
			assertTrue(pelicula1.valoracion < pelicula2.valoracion);
		 }
		
		//PRUEBA4 (OK) ///Check that a condition is false
		 @Test
		 public void testPrintMessage6() {
			 assertFalse(pelicula1.actor, false);
		 }
		 
		//PRUEBA5 (OK) //Check that an object isn't null

		 @Test
		 public void testPrintMessage7() {
			 assertNotNull(pelicula1.actor);
		 }
		 
		//PRUEBA6 (OK) //Check that an object is null
		 @Test
		 public void testPrintMessage8() {
			 assertNull(pelicula1.actor);
		 }
		 
		//PRUEBA7 (OK) //Check if two object references not point to the same object
		 @Test
		 public void testPrintMessage9() {
			 assertNotSame(pelicula1.actor, messageutil2.printMessage());
		 }
		 
		//PRUEBA8 (OK) 		 	 //Check whether two arrays are equal to each other
		 @Test
		 public void testPrintMessage10() {
			 //assertArrayEquals(pelicula1.actor, pelicula2.actor);
		 }
		 
		
		 
		 
		  @BeforeClass
		   public static void beforeClass() {
		      System.out.println("---Inicio de los tests---".toUpperCase());
		   }
		   
		   @Before
		   public void before() {
		      System.out.println("Iniciando la prueba ");
		     
		   }
		   
		  
		 
		//execute after test
		   @After
		   public void after() {
		      System.out.println("Fin del test ");
		   }
		   
		 //execute after class
		   @AfterClass
		   public static void  afterClass() {
		      System.out.println("---Fin de los tests---".toUpperCase());
		   }
	 
	 

}
