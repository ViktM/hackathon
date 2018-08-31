package com.names.Generator;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.names.Generator.Avatar.Avatar;
import com.names.Generator.Avatar.Avatar_;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class AvatarGenerator {

    Avatar av;

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

    public String getAvatar(String name){
        for (Avatar_ j : av.getAvatars()) {

        }
        return null;
    }

    public String getAvatars(String theme){
        return null;
    }
}

