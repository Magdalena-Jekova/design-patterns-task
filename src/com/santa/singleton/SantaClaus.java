package com.santa.singleton;

import com.santa.factories.CommandFactory;
import com.santa.observer.MagicBoard;

public class SantaClaus {
    private static SantaClaus _santa;
    private MagicBoard _magicBoard;

    private SantaClaus(){}

    public static SantaClaus getSantaClaus(){
        if (_santa == null){
            _santa = new SantaClaus();
        }

        return _santa;
    }

    public void addMagicBoard(MagicBoard magicBoard){
        _magicBoard = magicBoard;
    }

    public void readLetter(String message) throws IllegalAccessException {
        if (_magicBoard == null){
            throw new IllegalAccessException("No board found.");
        }

        _magicBoard.addCommand(CommandFactory.genCommand(message));

        _magicBoard.writeOnBoard();
    }
}
