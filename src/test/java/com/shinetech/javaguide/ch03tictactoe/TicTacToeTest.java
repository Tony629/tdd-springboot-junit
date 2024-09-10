package com.shinetech.javaguide.ch03tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private TicTacToe ticTacToe;

    @BeforeEach
    void setUp() {
        ticTacToe = new TicTacToe();
    }

    @Test
    public void whenXOutsideboardThenRuntimeException(){
        assertEquals('X', ticTacToe.nextPlayer());
        ticTacToe.play(1,2);
        assertEquals('O', ticTacToe.nextPlayer());
    }
}