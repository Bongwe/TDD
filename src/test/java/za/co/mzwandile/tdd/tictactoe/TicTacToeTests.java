package za.co.mzwandile.tdd.tictactoe;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TicTacToeTests {

    @Test
    public void mainExistsShouldBeTrue(){
        Main main = new Main();

        assertNotNull(main);
    }
}
