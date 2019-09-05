
package hangman.model;

import hangman.exceptions.GameScoreException;

/**
 * BonusScore:
 *El juego inicia en 0 puntos.
 *Se bonifica con 10 puntos cada letra correcta.
 *Se penaliza con 5 puntos cada letra incorrecta.
 *El puntaje mínimo es 0
 *@pre Se inicia con 0 puntos
 *@pos El puntaje final es mayor o igual a 0
 *@param correctCount Letras Correctas  
 *@param incorrectCount  Letras Incorrectas  
 *@throws No se hará manejo de excepciones y se hará dentro del codigo.
 */
public class BonusScore implements GameScore{
    @Override
    public int calculateScore(int correctCount, int incorrectCount)  throws GameScoreException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new GameScoreException(GameScoreException.PARAMETRO_NEGATIVO);
        }
        else if(correctCount*2<incorrectCount){
            throw new GameScoreException(GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        return correctCount*10-incorrectCount*5;
    }
}

