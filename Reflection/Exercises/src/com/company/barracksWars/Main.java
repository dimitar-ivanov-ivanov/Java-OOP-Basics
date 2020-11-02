package com.company.barracksWars;

import com.company.barracksWars.core.commands.CommandInterpreterImpl;
import com.company.barracksWars.data.UnitRepository;
import com.company.barracksWars.interfaces.CommandInterpreter;
import com.company.barracksWars.interfaces.Repository;
import com.company.barracksWars.interfaces.Runnable;
import com.company.barracksWars.interfaces.UnitFactory;
import com.company.barracksWars.core.Engine;
import com.company.barracksWars.core.factories.UnitFactoryImpl;

public class Main {

    public static void main(String[] args) {
        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        CommandInterpreter commandInterpreter = new CommandInterpreterImpl(repository, unitFactory);

        Runnable engine = new Engine(commandInterpreter);
        engine.run();
    }
}
