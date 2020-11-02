package com.company.barracksWars.core.factories;

import com.company.barracksWars.interfaces.Unit;
import com.company.barracksWars.interfaces.UnitFactory;
import jdk.jshell.spi.ExecutionControl;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME =
            "com.company.barracksWars.models.units.";

    @Override
    public Unit createUnit(String unitType) throws ExecutionControl.NotImplementedException, NoSuchMethodException, ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> clazz = Class.forName(UNITS_PACKAGE_NAME + unitType);
        Constructor<?> ctor = clazz.getConstructor();
        Unit unit = (Unit) ctor.newInstance(new Object[]{});
        return unit;
    }
}
