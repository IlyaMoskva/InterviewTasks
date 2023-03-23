package com.company.hackerrank;

/**
 * HackerRank Java questions quiz. 10/10.
 */
class Exc0 extends Exception {
    public Exc0() {
        System.out.println("Exc0");
    }
}
class Exc1 extends Exc0 {
    public Exc1() {
        System.out.println("Exc1");
    }
}
public class JavaQuestions {
    public static void main(String[] args){
        try {
            throw new Exc1();
        } catch (Exc0 exc) {
            System.out.println("Exception0 caught " + exc.getMessage());
        } catch (Exception e) {
            System.out.println("Normal exception");
        }
    }
}
