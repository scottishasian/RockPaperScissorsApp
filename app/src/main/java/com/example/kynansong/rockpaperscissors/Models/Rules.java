package com.example.kynansong.rockpaperscissors.Models;

import android.support.annotation.NonNull;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by kynansong on 15/11/2017.
 */

public class Rules {

    private HashMap<String, String> rules;

    public Rules() {
        this.rules = new HashMap();

        this.setRules();
    }

    public HashMap<String, String> getRules() {
        return this.rules;
    }


    public void setRules() {
        rules.put("Rock", "Scissors");
        rules.put("Scissors", "Paper");
        rules.put("Paper", "Rock");
//        rules.put("Scissors", "Rock");  //It will override keys.
//        rules.put("Paper", "Scissors");
//        rules.put("Rock", "Paper");
    }




}
