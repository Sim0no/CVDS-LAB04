
package hangman.model;
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
 * @throws No se hará manejo de excepciones y se hará dentro del codigo.
 */
public class OriginalScore implements GameScore{
    @Override
    public int calculateScore(int correctCount, int incorrectCount){
        return 0;
    }
}
