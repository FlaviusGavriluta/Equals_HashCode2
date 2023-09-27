package org.example;

import java.util.HashMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashMap<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student(1, "s1", 18), "Rec1");
        studentMap.put(new Student(2, "s2", 21), "Rec2");
        studentMap.put(new Student(3, "s3", 17), "Rec3");

        System.out.println("size: " + studentMap.size());
        System.out.println("student: " + studentMap);

        TreeSet<Student> studentTreeSet = new TreeSet<>();
        studentTreeSet.add(new Student(1, "s1", 18));
        studentTreeSet.add(new Student(2, "s3", 22));
        studentTreeSet.add(new Student(3, "s2", 17));

        System.out.println("size studentTreeSet: " + studentTreeSet.size());
        System.out.println("studentsTreeSet: " + studentTreeSet);
    }
}