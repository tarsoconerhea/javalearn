package advancedJava._5_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        hashSet.add("Kate");
        hashSet.add("Mike");
        hashSet.add("Tom");
        hashSet.add("George");
        hashSet.add("Donald");
        hashSet.add("Tom");
        hashSet.add("Tom");

        for (String name: hashSet){
            System.out.println(name);
        }
        System.out.println(hashSet);
        System.out.println("__________________________");
        linkedHashSet.add("Kate");
        linkedHashSet.add("Mike");
        linkedHashSet.add("Tom");
        linkedHashSet.add("George");
        linkedHashSet.add("Donald");

        for (String name: linkedHashSet){
            System.out.println(name);
        }
        System.out.println("__________________________");

        treeSet.add("Kate");
        treeSet.add("Mike");
        treeSet.add("Tom");
        treeSet.add("George");
        treeSet.add("Donald");

        for (String name: treeSet){
            System.out.println(name);
        }

        System.out.println(hashSet.contains("Tom"));
        System.out.println(hashSet.contains("Tim"));

        System.out.println(hashSet.isEmpty());

        //________________union________________
        Set<Integer> set1 = new HashSet<>();

        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        set1.add(6);

        Set<Integer> set2 = new HashSet<>();

        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        //____union - объединение массивов_____
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println(union);

        //_intersection - пересечение множеств_
        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println(intersection);

        //____difference - зазность множеств___
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(difference);


    }
}
