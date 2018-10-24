/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testfolder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tickettoride.Game;


/**
 *
 * @author Ryanfinazzo
 */
public class testGame {
    private Game a;
    public testGame() {
        a = new Game();
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

    @Test
    public void testMoveValid(){
        
        assertTrue(a.makeMove());
    }
    
    @Test
    public void testMoveinValid(){
       
        assertFalse(a.makeMove());
    }
    
    @Test
    public void maxPlayers(){
        assertEquals(5,a.getPlayers().size());
    }
    
    @Test
    public void noPlayers(){
        assertEquals(0,a.getPlayers().size());
    }
    
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
