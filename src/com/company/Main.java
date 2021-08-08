package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,5,2,3,7,3,8,9);
        Integer pos = Integer.valueOf(3);
        list.remove(pos);
        System.out.println(list);

    }
}
