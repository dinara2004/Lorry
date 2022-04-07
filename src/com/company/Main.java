package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import enums.State;

public class Main {

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON = BUILDER.setPrettyPrinting().create();

    public static void main(String[] args) {
        Lorry[] lorries = {
                Lorry.makeLorry(1, "Zil", "", State.BASE),
                Lorry.makeLorry(2, "Mazda", "", State.ROUT),
                Lorry.makeLorry(3, "Scania", "", State.REPAIR)
        };
        String json = GSON.toJson(lorries);
        System.out.println(json);
    }
}
