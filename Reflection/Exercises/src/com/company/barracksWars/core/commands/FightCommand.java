package com.company.barracksWars.core.commands;

import com.company.barracksWars.interfaces.Repository;
import com.company.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class FightCommand extends Command {
    public FightCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws NoSuchMethodException, IllegalAccessException, InstantiationException, ExecutionControl.NotImplementedException, InvocationTargetException, ClassNotFoundException {
        return "fight";
    }
}
