package com.company.MilitaryElite.Models.Soldiers;

import com.company.MilitaryElite.Interfaces.Engineer;
import com.company.MilitaryElite.Interfaces.Repair;

import java.util.ArrayList;
import java.util.List;

public class EngineerImpl extends SpecialisedSoldierImpl implements Engineer {

    private List<Repair> repairs;

    public EngineerImpl(int id, String firstName, String lastName, double salary, String corps, List<Repair> repairs) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>(repairs);
    }

    @Override
    public List<Repair> getRepairs() {
        return repairs;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();

        builder.append("\n" + super.toString() + "\n");

        for (int i = 0; i < repairs.size(); i++) {
            builder.append(repairs.get(i) + "\n");
        }

        builder.deleteCharAt(builder.length() - 2);

        return builder.toString();
    }
}
