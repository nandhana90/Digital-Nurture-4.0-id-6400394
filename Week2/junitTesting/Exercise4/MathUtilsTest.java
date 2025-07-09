package Applictionofjunit;
import org.junit.Test;
import static org.junit.Assert.*;
public class MathUtilsTest {
	

	
	    @Test
	    public void testAdd() {
	        MathUtils mu = new MathUtils();
	        assertEquals(5, mu.add(2, 3));
	    }
	}

}
