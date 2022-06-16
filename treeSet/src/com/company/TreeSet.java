package com.company;

public class TreeSet implements Comparable<TreeSet> {
private int id;
private String name;

public TreeSet(int id, String name){
    this.id = id;
    this.name = name;
}

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int compareTo(TreeSet test){
    return String.CASE_INSENSITIVE_ORDER.compare(this.name,test.getName());
    }

}
