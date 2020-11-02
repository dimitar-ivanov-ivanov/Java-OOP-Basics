package com.company.BorderControl.Models;

import com.company.BorderControl.Interfaces.Identifiable;

public abstract class IdentifiableImpl implements Identifiable {
    private String id;

    public IdentifiableImpl(String id) {
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }
}
