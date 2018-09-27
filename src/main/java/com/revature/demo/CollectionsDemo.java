package com.revature.demo;

import java.util.*;
import java.util.Map.Entry;

import javax.print.attribute.HashAttributeSet;

import com.revature.demo.PokedexComparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        Days today = Days.THURSDAY;
        System.out.println(today);

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(6);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(67);

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(3);
        linkedList.add(2);
        linkedList.add(645);
        List<Integer> list = linkedList;

        System.out.println("ArrayList before filter: " + arrayList);
        filter(arrayList);
        System.out.println("ArrayList after filter: " + arrayList);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(4);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(7);

        System.out.println("HashSet: " + hashSet);

        HashSet<Integer> convertedArrayList = new HashSet<>();
        convertedArrayList.addAll(arrayList);

        System.out.println("HashSet: " + convertedArrayList);

        Collections.sort(arrayList);
        System.out.println("ArrayList after sort: " + arrayList);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Volvo");
        hashMap.put(2342, "BMW");
        hashMap.put(-5, "Ford");

        System.out.println(hashMap);
        System.out.println(hashMap.get(-5));

        //use Set to collect info from Map
        for (Entry<Integer, String> entry: hashMap.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }

        Hashtable<String, String> characters = new Hashtable<>();
        characters.put("Frodo", "Bagginses");
        characters.put("Spider", "Man");

        System.out.println(characters.keySet());
        System.out.println(characters.values());

        Enumeration firstnames = characters.keys();

        //Pokemon Comparison
        ArrayList<Pokemon> belt = new ArrayList<>();
        belt.add(new Pokemon(1, "Bulbasaur"));
        belt.add(new Pokemon(7, "Squirtle"));
        belt.add(new Pokemon(4, "Charmander"));

        System.out.println(belt);
        //Sorting with Comparable
        //Collections.sort(belt);

        //Sorting with Comparator
        Collections.sort(belt, new PokedexComparator());
        System.out.println(belt);

        
    }

    static void filter(Collection<Integer> c) {
        for (Iterator<Integer> it = c.iterator(); it.hasNext();) {
            if (it.next() > 7) {
                it.remove();
            }
        }
    }
}