package com.names.Generator;

public class RandomNameGenerator {
    private int pos;

    Dictionary dict;

    public RandomNameGenerator(int seed) {
        this.pos = seed;
    }

    public RandomNameGenerator() {
        this((int) System.currentTimeMillis());
    }

    public RandomNameGenerator(String theme) {
        this((int) System.currentTimeMillis());
        this.dict = new Dictionary(theme);
    }
    public synchronized String next_default() {
        Dictionary d = Dictionary.INSTANCE;
        pos = Math.abs(pos+d.getPrime()) % d.size();
        return d.word(pos);
    }

    public synchronized String next() {
        if(this.dict == null){
            return next_default();
        } else{
            pos = Math.abs(pos+dict.getPrime()) % dict.size();
            return dict.word(pos);
        }

    }


}
