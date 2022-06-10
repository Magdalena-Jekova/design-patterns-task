package com.santa;

import com.santa.observer.Dwarf;
import com.santa.observer.MagicBoard;
import com.santa.repositories.SantasBag;
import com.santa.singleton.SantaClaus;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SantaClaus santa = SantaClaus.getSantaClaus();
        MagicBoard magicBoard = new MagicBoard();
        santa.addMagicBoard(magicBoard);
        SantasBag santasBag = new SantasBag();
        Dwarf dwarf1 = new Dwarf(santasBag);
        Dwarf dwarf2 = new Dwarf(santasBag);
        Dwarf dwarf3 = new Dwarf(santasBag);
        magicBoard.registerObserver(dwarf1);
        magicBoard.registerObserver(dwarf2);
        magicBoard.registerObserver(dwarf3);

        List<String> letters = new ArrayList<String>();
        letters.add("Dear Santa, I want a doll.");
        letters.add("Dear Santa, I want a bicycle.");

        try{
            for(String letter: letters){
                santa.readLetter(letter);
            }
        } catch(IllegalAccessException e){
            e.printStackTrace();
        }

        santasBag.giveToysToChildren();
    }
}
