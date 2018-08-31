package com.names.Generator;

public class Main {


    public static void main(String args[]){

        RandomNameGenerator rn = new RandomNameGenerator("starwars");
        for (int i = 0; i < 3; i++){
            System.out.println(rn.next());
        }
//        System.out.println(rn.next());
    }





}
