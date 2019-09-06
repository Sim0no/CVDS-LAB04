
package hangman.model;

import hangman.exceptions.GameScoreException;


public interface GameScore {

    int getScore();
    int getLimit();
    int calculateScore(int correctCount, int incorrectCount)  throws GameScoreException;
    
}
