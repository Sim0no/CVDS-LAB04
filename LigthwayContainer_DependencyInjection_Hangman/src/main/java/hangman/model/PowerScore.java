
package hangman.model;

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
 *@throws No se hará manejo de excepciones y se hará dentro del codigo.
 */
public class PowerScore implements GameScore{
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
