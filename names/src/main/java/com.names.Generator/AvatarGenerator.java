package com.names.Generator;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.names.Generator.Avatar.Avatar;
import com.names.Generator.Avatar.Avatar_;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AvatarGenerator {

    Avatar av;
    Random random;
    int size;

    public AvatarGenerator(){
        String f = "";
        try {
            f = load("avatars.json");
        } catch (Exception e) {
            e.printStackTrace();
        }

        Gson g = new Gson();
        this.av = g.fromJson(f, Avatar.class);
        System.out.println(av.getAvatars().get(0).getName());
        this.size = av.getAvatars().size();
//        this.seed = (int) System.currentTimeMillis();
         random = new Random();

    }

    private String load(String name) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(name), StandardCharsets.US_ASCII));
        String total = "";
        try {
            String line;
            while ((line=r.readLine())!=null)
                total = total.concat(line);
        } finally {
            r.close();
        }

        return total;
    }

    public Avatar getAv() {
        return av;
    }

    public void setAv(Avatar av) {
        this.av = av;
    }

    public Avatar_ getAvatar(String name){
        for (Avatar_ avatar : av.getAvatars()) {
            if (avatar.getName().equals(name)){
                return avatar;
            }
        }
        return null;
    }

    public Avatar_ getRandomAvatar(String theme){
        List<Avatar_> themedav = getAvatars(theme);
        return themedav.get(random.nextInt(themedav.size()));

    }

    public List<Avatar_> getAvatars(String theme){
        List<Avatar_> returnedList = new ArrayList<>();

        for (Avatar_ avatar : av.getAvatars()) {
            if (avatar.getTheme().equals(theme)){
                returnedList.add(avatar);
            }
        }

        return returnedList;
    }
}

