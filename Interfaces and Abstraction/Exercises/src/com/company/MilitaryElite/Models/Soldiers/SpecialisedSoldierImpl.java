package com.company.MilitaryElite.Models.Soldiers;

import com.company.MilitaryElite.Interfaces.SpecialisedSoldier;

import java.util.List;
import java.util.ArrayList;

public abstract class SpecialisedSoldierImpl extends PrivateImpl implements SpecialisedSoldier {

    private List<String> validCorps;
    private String corps;

    public SpecialisedSoldierImpl(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary);
        seedCorps();
        setCorps(corps);
    }

    private void seedCorps() {
        validCorps = new ArrayList<>();
        validCorps.add("Airforces");
        validCorps.add("Marines");
    }

    private void setCorps(String corps) throws IllegalArgumentException {
        if (!validCorps.contains(corps)) {
            throw new IllegalArgumentException("Invalid corps!");
        }
        this.corps = corps;
    }

    public String getCorps() {
        return corps;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Corps: " + getCorps();
    }
}
