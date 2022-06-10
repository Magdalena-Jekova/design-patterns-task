package com.santa.factories;

import com.santa.commands.Command;
import com.santa.commands.NeedBicycles;
import com.santa.commands.NeedDolls;

public class CommandFactory {

    public static Command genCommand(String message){
        if (message.toLowerCase().contains("bicycle")){
            return new NeedBicycles();
        } else if (message.toLowerCase().contains("doll")){
            return new NeedDolls();
        } else {
            return null;
        }
    }
}
