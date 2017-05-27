package za.co.mzwandile.tdd.tictactoe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTests {

    @Test
    public void mainExistsShouldBeTrue(){
        Main main = new Main();

        assertEquals(Main,main);
    }
}
