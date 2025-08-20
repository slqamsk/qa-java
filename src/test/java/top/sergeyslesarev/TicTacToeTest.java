package top.sergeyslesarev;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void test_row() {
        // Первая строка (1, 2, 3)
        assertEquals(0, TicTacToe.row(1));
        assertEquals(0, TicTacToe.row(2));
        assertEquals(0, TicTacToe.row(3));

        // Вторая строка (4, 5, 6)
        assertEquals(1, TicTacToe.row(4));
        assertEquals(1, TicTacToe.row(5));
        assertEquals(1, TicTacToe.row(6));

        // Третья строка (7, 8, 9)
        assertEquals(2, TicTacToe.row(7));
        assertEquals(2, TicTacToe.row(8));
        assertEquals(2, TicTacToe.row(9));
    }


    @Test
    void test_col() {
        // Первая колонка (1, 4, 7)
        assertEquals(0, TicTacToe.col(1));
        assertEquals(0, TicTacToe.col(4));
        assertEquals(0, TicTacToe.col(7));

        // Вторая колонка (2, 5, 8)
        assertEquals(1, TicTacToe.col(2));
        assertEquals(1, TicTacToe.col(5));
        assertEquals(1, TicTacToe.col(8));

        // Третья колонка (3, 6, 9)
        assertEquals(2, TicTacToe.col(3));
        assertEquals(2, TicTacToe.col(6));
        assertEquals(2, TicTacToe.col(9));
    }
}