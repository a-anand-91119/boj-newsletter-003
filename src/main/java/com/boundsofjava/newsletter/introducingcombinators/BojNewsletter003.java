package com.boundsofjava.newsletter.introducingcombinators;

public class BojNewsletter003 {

    public static void main(String[] args) {

        // Run Before combinator demo
        new BeforeExample().demo();

        // Run After combinator demo
        new AfterExample().demo();

        // Run Around combinator demo
        new AroundExample().demo();
    }
}
