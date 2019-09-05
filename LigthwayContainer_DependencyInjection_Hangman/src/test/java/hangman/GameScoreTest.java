package hangman;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Testing del laboratorio + Contenedores livianos.
 * 
 * 
 * 
 * 
 * 
 * ---Clases de equivalencia originalScore---
 * 1. 0>=incorrectCount<=10 & CorrectCount>=0
 * 
 * Frontera
 * calculateScore() (< limite inferior)
 * calculateScore(0,0) Limite Inferior
 * calculateScore() (> inferior)
 * calculateScore() (<limite superior)
 * calculateScore(SIN_LIMITE,10) Limite Superior 
 * 
 * 2. correctCount<0 or incorrectCount<0
 * 
 * Frontera
 * calculateScore(-1,-1) (<Limite inferior)
 * calculateScore(-1,-1) Limite inferior
 * calculateScore(-1,-1) (>Limite inferior)
 * 
 * 
 * 3. incorrectCount>10
 * 
 * Frontera
 * 
 * ----------------------------------------------
 * 
 * 
 * 
 * 
 * 
 * Clases de equivalencia powerScore
 * 1
 * 2
 * 3
 * 
 * 
 * Frontera
 * 
 * @author Simon Marin Sergio Bohorquez
 */
public class GameScoreTest {
    private GameScore originalScore;
    private GameScore bonusScore;
    private GameScore powerScore;
    
    @Test
    void originalScoreTest(){
        
    }
    @Test
    void bonusScoreTest(){
        
    }
    @Test
    void powerScoreTest(){
        
    }
    
}
