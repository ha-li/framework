package com.gecko

/**
 * Created by hlieu on 11/15/16.
 */

/**
 * an example of operator override in groovy
 */
class Modulo {
    int value;
    int modulo;

    public Modulo(int value, int modulo) {
        this.value = value;
        this.modulo = modulo;
    }

    // by defining the method plus, we are saying that
    // client of this class can use + as an operator
    public Modulo plus(Modulo other) {
        if (null == other) {
            return this;
        }
        if (other.modulo != this.modulo) {
            throw new IllegalArgumentException("Cannot add different modulo together");
        }
        return new Modulo((this.value + other.value) % modulo, modulo);
    }

    public String toString() {
        return "val: " + value + ", modulo: " + modulo;
    }

    public static void main(String[] args) {
        Modulo five_eiight = new Modulo(5, 8);
        Modulo six_eight = new Modulo(6, 8);
        Modulo my = five_eiight + six_eight;
        System.out.println(my);
    }
}


