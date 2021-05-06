package com.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
    public static Set<HeavenlyBody> planets = new HashSet<>();

    public static void main(String[] args) {
        HeavenlyBody body = new HeavenlyBody("Mercury", 88);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new HeavenlyBody("Venus", 220);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new HeavenlyBody("Earth", 365);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        HeavenlyBody moon = new HeavenlyBody("Moon", 27);
        solarSystem.put(moon.getName(),moon);
        body.addMoon(moon);

        body = new HeavenlyBody("Mars", 450);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        moon = new HeavenlyBody("Deimos", 10);
        solarSystem.put(moon.getName(),moon);
        body.addMoon(moon);

        moon = new HeavenlyBody("Phobos", 12);
        solarSystem.put(moon.getName(),moon);
        body.addMoon(moon);

        body = new HeavenlyBody("Jupiter", 589);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        moon = new HeavenlyBody("Ganymede", 67);
        solarSystem.put(moon.getName(),moon);
        body.addMoon(moon);

        moon = new HeavenlyBody("Callisto", 73);
        solarSystem.put(moon.getName(),moon);
        body.addMoon(moon);

        body = new HeavenlyBody("Saturn", 688);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new HeavenlyBody("Uranus", 821);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new HeavenlyBody("Neptune", 963);
        solarSystem.put(body.getName(), body);
        planets.add(body);

        body = new HeavenlyBody("Pluto", 1078);
        solarSystem.put(body.getName(), body);
        planets.add(body);



        System.out.println("Planets : ");
        for (HeavenlyBody planet:planets){
            System.out.println(planet.getName());
        }

        HeavenlyBody heavenlyBody = solarSystem.get("Jupiter");
        System.out.println("Moons : ");
        for (HeavenlyBody moons: heavenlyBody.getSatellites()){
            System.out.println(moons.getName());
        }

        Set<HeavenlyBody> moons = new HashSet<>();
        for(HeavenlyBody planet: planets ){
            moons.addAll(planet.getSatellites());
        }
        System.out.println("All moons: ");
        for (HeavenlyBody mooon : moons){
            System.out.println(mooon.getName());
        }
    }
}
