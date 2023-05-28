import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PipeTest {

    @Test
    void update() {
        Pipe pipe = new Pipe(510, 0, 78, 200, -1, 0, false);
        assertEquals(510,pipe.x);
        pipe.update();
        assertEquals(509,pipe.x);
    }

    @Test
    void getvX() {
        Pipe pipe = new Pipe(510, 0, 78, 200, -1, 0, false);
        assertEquals(-1,pipe.getvX());
    }

    @Test
    void setvX() {
        Pipe pipe = new Pipe(510, 0, 78, 200, -1, 0, false);
        pipe.setvX(458);
        assertEquals(458,pipe.getvX());
    }

    @Test
    void getvY() {
        Pipe pipe = new Pipe(510, 0, 78, 200, -1, 0, false);
        assertEquals(0,pipe.getvY());
    }

    @Test
    void setvY() {
        Pipe pipe = new Pipe(510, 0, 78, 200, -1, 0, false);
        pipe.setvY(330);
        assertEquals(330,pipe.getvY());
    }
}