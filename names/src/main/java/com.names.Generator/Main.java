package com.names.Generator;

public class Main {


    public static void main(String args[]){

        RandomNameGenerator rn = new RandomNameGenerator("pokemon");
        for (int i = 0; i < 3; i++){
            System.out.println(rn.next());
        }
        AvatarGenerator avatar = new AvatarGenerator();

//        System.out.println(rn.next());
    }





}
