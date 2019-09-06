
package hangman.model;

import static com.google.common.math.IntMath.pow;
import hangman.exceptions.GameScoreException;

/**
 *PowerBonusScore:
 *El juego inicia en 0 puntos.
 *La $i-ésima$ letra correcta se bonifica con $5^i$.
 *Se penaliza con 8 puntos cada letra incorrecta.
 *El puntaje mínimo es 0
 *Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
 *@pre Se inicia con 0 puntos
 *@pos El puntaje final está entre 0 y 500 puntos
 *@param correctCount Letras Correctas  
 *@param incorrectCount  Letras Incorrectas  
 *@throws GameScoreException (correctCount <0 || incorrectCount<0 || pow(5,correctCount) < 8*incorrectCount || pow(5,correctCount)-8*incorrectCount>500 )
 */
public class PowerScore implements GameScore{
    private final int puntaje = 0;
    private final int limite = 500;
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        if ( correctCount <0 ||  incorrectCount < 0){
            throw new GameScoreException(GameScoreException.PARAMETRO_NEGATIVO);
        }
        else if(pow(5,correctCount) < 8*incorrectCount ){
            throw new GameScoreException(GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        else if(pow(5,correctCount)-8*incorrectCount>500 ){
            throw new GameScoreException(GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        return pow(5,correctCount) - 8*incorrectCount;
    }

    @Override
    public int getScore() {
        return puntaje;
    }
    public int getLimit(){
        return limite;
    }
}
