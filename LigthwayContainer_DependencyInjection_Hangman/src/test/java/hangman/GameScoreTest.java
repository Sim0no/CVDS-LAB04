package hangman;
import hangman.exceptions.GameScoreException;
import hangman.model.*;
import org.junit.Assert;
import org.junit.Test;
/**
 * Testing del laboratorio + Contenedores livianos.
 * 
 * 
 * ------------------Clases de equivalencia originalScore------------------
 * 1. 0>=incorrectCount<=10 & CorrectCount>=0
 * 
 * Frontera
 * 
 *  calculateScore(-1,-1) (< limite inferior)
 *  calculateScore(0,0) Limite Inferior
 *  calculateScore(1,1) (> inferior)
 * 
 *  calculateScore(235,9) (< limite superior)
 *  calculateScore(SIN_LIMITE,10) Limite Superior
 *  
 * 
 * 2. correctCount<0 or incorrectCount<0
 * 
 * Frontera
 * 
 *  
 *  calculateScore(-1,-1) Limite inferior
 *  calculateScore(-2,-2) (>Limite inferior)
 * 
 * 
 * 3. incorrectCount>10
 * 
 * 
 * Frontera
 * 
 *  calculateScore(0,10) (< LimiteSuperior
 *  calculateScore(0,11) (LimiteSuperior)
 *  calculateScore(0,12) (> LimiteSuperior)
 * 
 * ------------------------------------------------------------------------
 * 
 * ------------------Clases de equivalencia bonusScore------------------
 * 
 * 1. correctCount*2 < IncorrectCount
 * 
 * Frontera
 *  
 *  calculateScore(0,1) Limite Inferior
 *  calculateScore(1,3) (> LimiteInferior)
 * 
 * 2. correctCount<0 or incorrectCount<0
 * 
 * Frontera
 *  calculateScore(-2,-2) (< Limite Superior)
 *  calculateScore(-1,-1) Limite Superior
 *  calculateScore(0,0) (> Limite Superior)
 * 
 * 3. correctCount*2 >= IncorrectCount & CorrectCount>=0 & IncorrectCount >=0
 * Frontera
 *   CalculateScore(1,0) Limite Inferior
 *   CalculateScore(1,1) (> Limite Inferior)
 * 
 * 
 *   CalculateScore(0,0) Limite Inferior 2
 *   CalculateScore(2,0) (> Limite Inferior 2)

 * ------------------------------------------------------------------------
 * 
 * Clases de equivalencia powerScore
 * 
 * 
 * 1.  5^CorrectCount < 8*IncorrectCount & (IncorrectCount >=0 & CorrectCount>=0)
 * Frontera
 *  calculateScore(0,2) (<Limite Inferior)
 *  calculateScore(0,1) Limite Inferior
 * 
 * 2.  5^CorrectCount -8*IncorrectCount > 500 & (IncorrectCount >=0 & CorrectCount>=0)
 * Frontera
 *  calculateScore(4,14) (>Limite Inferior)
 *  calculateScore(4,15) Limite Inferior
 * 
 * 3. IncorrectCount <0 or CorrectCount<0
 * Frontera
 *   calculateScore(-2,0) (<Limite Superior)
 *   calculateScore(-1,-1) Limite Superior
 * 
 * 4. (5^CorrectCount >= 8*IncorrectCount) & (5^CorrectCount -8*IncorrectCount <= 500) & (IncorrectCount >=0 & CorrectCount >= 0)
 * Frontera
 *   calculateScore(2,1) (>Limite Inferior)
 *   calculateScore(0,0) Limite Inferior
 *  
 *  
 * 
 * @author Simon Marin Sergio Bohorquez
 */
public class GameScoreTest {
    private GameScore originalScore;
    private GameScore bonusScore;
    private GameScore powerScore;
    
    @Test
    public void originalScoreTest(){
        
        originalScore = new OriginalScore();
        

        
        
        // 1. 0>=incorrectCount<=10 & CorrectCount>=0
        try{
            originalScore.calculateScore(0,0); //Limite Inferior
            originalScore.calculateScore(1,1); //(> inferior)
            originalScore.calculateScore(235,9); //(< limite superior)
            originalScore.calculateScore(100,10); //Limite Superior            
        }
        catch(GameScoreException e){
            Assert.fail();
        }
         
        // 2. correctCount<0 or incorrectCount<0
        try{
            originalScore.calculateScore(-1,-1); //( limite inferior)
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        try{
            originalScore.calculateScore(-2,-2); //(>Limite inferior).
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        
        
        
         //3. incorrectCount>10
        try{
            originalScore.calculateScore(0,11); //(LimiteSuperior)
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        
        try{
            originalScore.calculateScore(0,12); //(> LimiteSuperior)
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        try{
            originalScore.calculateScore(20,11); //(> Limite superior)  
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        
    }
    
    @Test
    public void bonusScoreTest(){
        bonusScore = new BonusScore(); 
        //1. correctCount*2 < IncorrectCount
         
        //Frontera
        try{
            bonusScore.calculateScore(0,1); //Limite Inferior
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }  
        try{
            bonusScore.calculateScore(1,3); //(> LimiteInferior)
            
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }  
         
        //2. correctCount<0 or incorrectCount<0
        
        //Frontera
        try{
            bonusScore.calculateScore(-2,-2); //(< Limite Superior)
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        try{
            bonusScore.calculateScore(-1,-1); //Limite Superior
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        
        //3. correctCount*2 >= IncorrectCount & CorrectCount>=0 & IncorrectCount >=0
        //Frontera
        try{
            bonusScore.calculateScore(1,0);// Limite Inferior
            bonusScore.calculateScore(1,1); //(> Limite Inferior)         
            bonusScore.calculateScore(1,2); //(> LimiteInferior)
            bonusScore.calculateScore(0,0); //Limite Inferior 2
            bonusScore.calculateScore(2,0); //(> Limite Inferior 2)
        }
        catch(GameScoreException e){
            Assert.fail();
        }
        
    }
    @Test
    public void powerScoreTest(){
        powerScore = new PowerScore();
       //Clases de equivalencia powerScore
       //1.  5^CorrectCount < 8*IncorrectCount & (IncorrectCount >=0 & CorrectCount>=0)
       //Frontera
        try{
            powerScore.calculateScore(0,2); //(<Limite Inferior);
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }  
        try{
            powerScore.calculateScore(0,1); //Limite Inferior2;
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }  
        
        
       //2.  5^CorrectCount -8*IncorrectCount > 500 & (IncorrectCount >=0 & CorrectCount>=0)
       //Frontera
        try{
            powerScore.calculateScore(4,14); //(>Limite Inferior);
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        } 
        try{
            powerScore.calculateScore(4,15); //Limite Inferior;
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        } 
        
        
       //3. IncorrectCount <0 or CorrectCount<0
       //Frontera
        try{
            powerScore.calculateScore(-2,0); //(<Limite Superior)
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        try{
            powerScore.calculateScore(-1,-1); //Limite Superior
            Assert.fail();
        }
        catch(GameScoreException e){
            Assert.assertEquals(e.getMessage(), GameScoreException.PARAMETRO_NEGATIVO);
        }
        
        
       // 4. (5^CorrectCount >= 8*IncorrectCount) & (5^CorrectCount -8*IncorrectCount <= 500) & (IncorrectCount >=0 & CorrectCount >= 0)
       // Frontera
        try{
            powerScore.calculateScore(2,1) ;//(>Limite Inferior)
            powerScore.calculateScore(0,0) ;//Limite Inferior
        }
        catch(GameScoreException e){
            Assert.fail();
        }

          
    }
    
}