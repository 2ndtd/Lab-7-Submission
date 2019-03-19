/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tue45957
 */
public class TictactoeTest {
    
    public TictactoeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of MakeMove method, of class Tictactoe.
     */
    @Test
    public void testMakeMove() {
        System.out.println("MakeMove");
        Tictactoe instance = new Tictactoe();
        instance.MakeMove();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CreateBoard method, of class Tictactoe.
     */
    @Test
    public void testCreateBoard() {
        System.out.println("CreateBoard");
        Tictactoe instance = new Tictactoe();
        instance.CreateBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CurrentPlayer method, of class Tictactoe.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("CurrentPlayer");
        Tictactoe instance = new Tictactoe();
        instance.CurrentPlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ChangePlayer method, of class Tictactoe.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("ChangePlayer");
        Tictactoe instance = new Tictactoe();
        instance.ChangePlayer();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SpaceInUse method, of class Tictactoe.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("SpaceInUse");
        Tictactoe instance = new Tictactoe();
        boolean expResult = false;
        boolean result = instance.SpaceInUse();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
