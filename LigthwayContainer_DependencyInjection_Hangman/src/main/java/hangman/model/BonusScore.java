
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
 *@throws GameScoreException correctCount < 0 || incorrectCount < 0||correctCount*2<incorrectCount.
 */
public class BonusScore implements GameScore{
    private static int puntaje = 0;
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

    @Override
    public int getScore() {
        return puntaje;
    }

    @Override
    public int getLimit() {
        return 0;
    }
}

