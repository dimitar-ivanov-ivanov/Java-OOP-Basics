package com.company.MilitaryElite.Models.Soldiers;

import com.company.MilitaryElite.Interfaces.LeutenantGeneral;
import com.company.MilitaryElite.Interfaces.Private;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LeutenantGeneralImpl extends PrivateImpl implements LeutenantGeneral {

    private List<Private> privates;

    public LeutenantGeneralImpl(int id, String firstName, String lastName, double salary, List<Private> privates) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>(privates);
    }

    @Override
    public List<Private> getPrivates() {
        return this.privates;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("\n" + super.toString() + "\n");
        List<Private> privatesSortedInDescendingOrderById = getPrivates().stream()
                .sorted((p1, p2) -> Integer.compare(p2.getId(), p1.getId()))
                .collect(Collectors.toList());

        for (int i = 0; i < privatesSortedInDescendingOrderById.size(); i++) {
            builder.append(privatesSortedInDescendingOrderById.get(i).toString() + "\n");
        }

        //remove the new line
        builder.deleteCharAt(builder.length() - 2);

        return builder.toString();
    }
}
