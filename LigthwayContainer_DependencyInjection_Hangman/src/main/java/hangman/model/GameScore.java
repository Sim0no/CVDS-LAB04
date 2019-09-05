
package hangman.model;

import hangman.exceptions.GameScoreException;

public interface GameScore {
    int calculateScore(int correctCount, int incorrectCount)  throws GameScoreException;
}
