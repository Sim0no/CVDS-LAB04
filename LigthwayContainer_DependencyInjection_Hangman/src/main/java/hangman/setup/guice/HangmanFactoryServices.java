/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */


import hangman.model.*;
import hangman.model.dictionary.*;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {
    private static HangmanFactoryServices instance = new HangmanFactoryServices();

    @Override
    protected void configure() {
        /* Guice dependency injection */
        bind(Language.class).to(English.class);
        //bind(Language.class).to(French.class);
        //bind(Language.class).to(Spanish.class);
        bind(HangmanDictionary.class).to(EnglishDictionaryDataSource.class);
        //bind(HangmanDictionary.class).to(FrenchDictionaryDataSource.class);
        //bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
        bind(GameScore.class).to(OriginalScore.class);
        //bind(GameScore.class).to(BonusScore.class);
        //bind(GameScore.class).to(PowerScore.class);
    }
    

}
