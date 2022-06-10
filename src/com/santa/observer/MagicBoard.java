package com.santa.observer;

import com.santa.commands.Command;
import java.util.LinkedList;
import java.util.List;

public class MagicBoard implements Observable {
    List<Observer> _observers;
    List<Command> _commands;
    List<String> _toysToBeGenerated;
    int commandsNotified;

    public MagicBoard(){
        _observers = new LinkedList<Observer>();
        _commands = new LinkedList<Command>();
        _toysToBeGenerated = new LinkedList<String>();
        commandsNotified = 0;
    }

    public void addCommand(Command command){
        _commands.add(command);
    }

    public void writeOnBoard(){
        for(Command command: _commands.subList(commandsNotified, _commands.size())) {
            if (command.execute().equals("I need dolls!")) {
                _toysToBeGenerated.add("Doll");
                System.out.println("On MagicBoard: Doll");
            } else if (command.execute().equals("I need bicycles!")) {
                _toysToBeGenerated.add("Bicycle");
                System.out.println("On MagicBoard: Bicycle");
            }
        }

        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        _observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        _observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        if (_observers.size() == 0) return;

        if (_commands.size() == commandsNotified) return;

        List<String> toys = _toysToBeGenerated.subList(commandsNotified, _toysToBeGenerated.size());
        for (Observer observer: _observers){
            observer.update(toys);
        }
        commandsNotified = _commands.size();
    }
}
