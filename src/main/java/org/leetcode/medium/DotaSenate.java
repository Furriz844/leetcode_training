package org.leetcode.medium;

import java.util.LinkedList;
import java.util.Queue;

public class DotaSenate {
    public static void main(String[] args) {
        System.out.println(predictPartyVictory("RD")); //Radiant
        System.out.println(predictPartyVictory("RDD")); //Dire
        System.out.println(predictPartyVictory("DDD")); //Dire
        System.out.println(predictPartyVictory("RRRRR")); //Radiant
        System.out.println(predictPartyVictory("DDRRR")); //Dire



    }

    public static String predictPartyVictory(String senate) {
        Queue <Integer> r = new LinkedList<>();
        Queue <Integer> d= new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R')
                r.offer(i);
            else
                d.offer(i);
        }
        while(!r.isEmpty() && !d.isEmpty()){
            int r_place=r.poll();
            int d_place=d.poll();
            if(r_place<d_place)
                r.offer(senate.length()+r_place);
            else
                d.offer(senate.length()+d_place);
        }
        return r.isEmpty() ? "Dire":"Radiant";
    }
    }