package com.oops.composition;

public class PC {

    private Case aCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case aCase, Monitor monitor, MotherBoard motherBoard) {
        this.aCase = aCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

    public Case getACase() {
        return aCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
}
