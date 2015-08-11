package mapnik;

import java.io.File;
import java.util.Arrays;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test library location and loading
 * @author stella
 *
 */
public class TestLoadLibrary {
	@Test
	public void testInitialize() {
		Mapnik.initialize();
	}
	
	@Test
	public void testPluginAndFontPaths() {
		System.err.println("Installed fonts dir=" + Mapnik.getInstalledFontsDir());
		System.err.println("Installed plugin dir=" + Mapnik.getInstalledInputPluginsDir());
		
		assertNotNull(Mapnik.getInstalledFontsDir());
		assertNotNull(Mapnik.getInstalledInputPluginsDir());
		
		assertTrue(new File(Mapnik.getInstalledFontsDir()).isDirectory());
		assertTrue(new File(Mapnik.getInstalledInputPluginsDir()).isDirectory());
	}
}
