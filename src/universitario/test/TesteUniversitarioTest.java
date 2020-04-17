package universitario.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import universitario.models.Universitario;

class TesteUniversitarioTest {

	@Test
	public void testeSono() {
		Universitario uni = new Universitario("Gabriel Lopes","SI");
		Boolean expected = true;
		Boolean actual = uni.sono();
		assertEquals(expected, actual);
	}

}
