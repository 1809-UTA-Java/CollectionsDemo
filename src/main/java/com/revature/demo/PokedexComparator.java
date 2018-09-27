package com.revature.demo;

import java.util.Comparator;

public class PokedexComparator implements Comparator<Pokemon> {
    public int compare(Pokemon p1, Pokemon p2) {
        if(p1.getPokedex() > p2.getPokedex()) {
            return 1;
        } else if (p1.getPokedex() < p2.getPokedex()) {
            return -1;
        } else {
            return 0;
        }
    }
}