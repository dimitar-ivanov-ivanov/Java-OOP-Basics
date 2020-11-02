package com.company.barracksWars.core.commands;

import com.company.barracksWars.annotations.Inject;
import com.company.barracksWars.interfaces.Repository;
import com.company.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.InvocationTargetException;

public class RetireCommand extends Command {

    @Inject
    private Repository repository;

    public RetireCommand(String[] data) {
        super(data);
    }

    @Override
    public String execute() throws NoSuchMethodException, IllegalAccessException, InstantiationException, ExecutionControl.NotImplementedException, InvocationTargetException, ClassNotFoundException {
        repository.removeUnit(getData()[1]);

        return getData()[1] + " retired!";
    }
}
