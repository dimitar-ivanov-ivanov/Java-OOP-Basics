package com.company.barracksWars.core.commands;

import com.company.barracksWars.interfaces.Executable;
import com.company.barracksWars.interfaces.Repository;
import com.company.barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable {
    private String[] data;

    protected Command(String[] data) {
        this.data = data;
    }

    protected String[] getData() {
        return data;
    }
}
