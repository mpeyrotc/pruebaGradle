import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mpeyrotc on 1/14/17.
 */
public class SquareTest {
    private Square square;

    @Before
    public void setup() {
        square = new Square(3,4);
    }

    @Test
    public void area() throws Exception {
        assertTrue(square.area() == 12);
    }

}