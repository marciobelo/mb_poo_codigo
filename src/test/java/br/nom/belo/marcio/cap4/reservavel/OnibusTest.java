package br.nom.belo.marcio.cap4.reservavel;

import org.junit.Assert;
import org.junit.Test;

public class OnibusTest {
	Reservavel reservavel = new Onibus( 5);
	@Test
	public void testOnibus() {
		Assert.assertEquals( 5,  reservavel.getQtdeVaga());
		Assert.assertEquals( 0,  reservavel.getQtdeOcupada());
		Assert.assertTrue( reservavel.reservar( 5));
		Assert.assertEquals( 4,  reservavel.getQtdeVaga());
		Assert.assertEquals( 1,  reservavel.getQtdeOcupada());
		Assert.assertFalse( reservavel.reservar( 5));
		Assert.assertEquals( 4,  reservavel.getQtdeVaga());
		Assert.assertEquals( 1,  reservavel.getQtdeOcupada());
		Assert.assertTrue( reservavel.liberar( 5));
		Assert.assertEquals( 5,  reservavel.getQtdeVaga());
		Assert.assertEquals( 0,  reservavel.getQtdeOcupada());
		Assert.assertFalse( reservavel.liberar( 1));
		Assert.assertTrue( reservavel.reservar( 1));
		Assert.assertTrue( reservavel.reservar( 2));
		Assert.assertTrue( reservavel.reservar( 3));
		Assert.assertTrue( reservavel.reservar( 4));
		Assert.assertTrue( reservavel.reservar( 5));
		Assert.assertEquals( 0,  reservavel.getQtdeVaga());
		Assert.assertEquals( 5,  reservavel.getQtdeOcupada());
		Assert.assertFalse( reservavel.reservar( 6));
		Assert.assertFalse( reservavel.reservar( 0));
	}
}
