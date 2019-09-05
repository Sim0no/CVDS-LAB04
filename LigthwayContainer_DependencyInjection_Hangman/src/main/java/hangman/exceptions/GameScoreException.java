package hangman.exceptions;
public class GameScoreException extends Exception{
    public static final String PARAMETRO_NEGATIVO = "Existe un parametro Negativo";
    public static final String PARAMETRO_LIMITE_PUNTUACION = "Hay un parametro que supera la puntuacion limite";    
    public GameScoreException(String message){
        super.getMessage();
    }
}