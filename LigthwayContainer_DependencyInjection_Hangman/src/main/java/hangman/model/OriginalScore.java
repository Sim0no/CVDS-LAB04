
package hangman.model;
import hangman.exceptions.*;
/**
 *OriginalScore:
 *Es el esquema actual, se inicia con 100 puntos.
 *No se bonifican las letras correctas.
 *Se penaliza con 10 puntos con cada letra incorrecta.
 *El puntaje minimo es 0.
 * @pre Se inicia con 100 puntos
 * @pos El puntaje final está entre 0 y 100 puntos
 * @param correctCount Letras Correctas  
 * @param incorrectCount  Letras Incorrectas  
 * @throws GameScoreException (correctCount <0 || incorrectCount<0 || incorrectCount>10 )
 */
public class OriginalScore implements GameScore{
    private final int puntaje = 100;
    private final int limite = 100;
    @Override
    public int calculateScore(int correctCount, int incorrectCount) throws GameScoreException{
        if(incorrectCount >10){
            throw new GameScoreException(GameScoreException.PARAMETRO_LIMITE_PUNTUACION);
        }
        if(incorrectCount <0 || incorrectCount <0 ){
            throw new GameScoreException(GameScoreException.PARAMETRO_NEGATIVO);
        }
        return puntaje-(incorrectCount*-10);
    }

    @Override
    public int getScore() {
        return puntaje;
    }

    @Override
    public int getLimit() {
        return limite;
    }
}
