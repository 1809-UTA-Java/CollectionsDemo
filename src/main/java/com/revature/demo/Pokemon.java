package com.revature.demo;

class Pokemon implements Comparable<Pokemon> {
    private int pokedex;
    private String name;

    public Pokemon (int pokedex, String name) {
        this.pokedex = pokedex;
        this.name = name;
    }

    public int compareTo(Pokemon p) {
        return this.pokedex - p.getPokedex();
    }

    public int getPokedex() {
        return this.pokedex;
    }
    public String getName() {return name;}

    public String toString() {
        return this.name;
    }
}