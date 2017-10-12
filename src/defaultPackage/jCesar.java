package defaultPackage;

import org.junit.Test;

public class jCesar {

	@Test
	public void test() {
		Cesar c= Cesar.getCesar();
		System.out.println(c.bestCesarNamification("Sinsajo"));
		System.out.println(c.bestCesarNamificationGerman("Sinsajo"));
	}
}
