package com.company.codility;

import java.lang.reflect.Field;

public class InteractiveBrokers {

    private final Character m = 'a';
    public String toString() { return "" + m; }

    public static void main(String[] args) {
        try  {
            Field f = InteractiveBrokers.class.getDeclaredField("m");
            f.setAccessible(true);
            InteractiveBrokers a = new InteractiveBrokers();
            f.set(a, (char)'b');
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
