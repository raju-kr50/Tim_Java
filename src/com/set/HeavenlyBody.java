package com.set;

import java.util.HashSet;
import java.util.Set;

public final class HeavenlyBody {
    private final String name;
    private final int orbitalPeriod;
    private final Set<HeavenlyBody> satellites;

    public HeavenlyBody(String body, int orbitalPeriod) {
        this.name = body;
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(satellites);
    }

    public boolean addMoon(HeavenlyBody moon){
        return this.satellites.add(moon);
    }
}
