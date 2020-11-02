package com.company.MilitaryElite.Models.Repairs;

import com.company.MilitaryElite.Interfaces.Repair;

public class RepairImpl implements Repair {

    private String name;
    private int workedHours;

    public RepairImpl(String name, int workedHours) {
        this.name = name;
        this.workedHours = workedHours;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getWorkedHours() {
        return workedHours;
    }

    @Override
    public String toString() {
        return "Part Name: " + getName() + " Hours Worked: " + getWorkedHours();
    }
}
