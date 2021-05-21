package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Entité.Convertisseur;

public class examenTest {
	private static int i = 0;
	Convertisseur convertisseur;
	
	@Before
	public void init() {
		convertisseur = new Convertisseur(15);
		System.out.println("i = "+ i++);
	}	
	
	@Test
	public void testing1() {
		convertisseur.Convertir(1.5);
		Assert.assertEquals(22.5, convertisseur.getResultat(), 0.1);
	}
	
	@Test
	public void testing2() {
		convertisseur.Convertir(2.5);
		Assert.assertTrue(convertisseur.getResultat() == 37.5);
	}
	
	@Test
	public void testing3() {
		convertisseur.Convertir(0);
		Assert.assertEquals(15, convertisseur.getResultat(), 0);
	}
	
	@After
	public void End() {
		System.out.println("i = "+ i);
		System.out.println("Resultat= "+convertisseur.getResultat());		
	}
}