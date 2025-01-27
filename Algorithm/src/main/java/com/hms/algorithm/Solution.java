package com.hms.algorithm;

import cn.hutool.core.collection.CollectionUtil;

import java.util.*;

/**
 * @Author Hms
 * @Date 2024/11/11 18:54
 **/
public class Solution {
    public static void main(String[] args) {
        Flight f1 = new Flight("F001", "SHA", "HKG");
        Flight f2 = new Flight("F002", "SHA", "TYO");
        Flight f3 = new Flight("F003", "HKG", "NYC");
        Flight f4 = new Flight("F004", "TYO", "NYC");
        Flight f5 = new Flight("F005", "HKG", "TYO");
        Flight f6 = new Flight("F006", "TYO", "HKG");
        Flight f7 = new Flight("F007", "TYO", "OSA");
        Flight f8 = new Flight("F008", "OSA", "NYC");
        Flight f9 = new Flight("F009", "SHA", "OSA");

        List<Flight> flights = new ArrayList<>();
        Map<String, List<String>> routes = getStringListMap();

        dfs(routes,new ArrayList<>(),"SHA");
        System.out.println(res);
    }

    private static Map<String, List<String>> getStringListMap() {
        Map<String ,List<String>> routes = new HashMap<>();
        List<String> v1 = new ArrayList<>();
        v1.add("HKG");
        v1.add("TYO");
        v1.add("OSA");
        routes.put("SHA",v1);
        List<String> v2 = new ArrayList<>();
        v2.add("NYC");
        v2.add("TYO");
        routes.put("HKG",v2);

        List<String> v3 = new ArrayList<>();
        v3.add("NYC");
        v3.add("HKG");
        v3.add("OSA");
        routes.put("TYO",v3);

        List<String> v4 = new ArrayList<>();
        v4.add("NYC");
        routes.put("OSA",v4);
        return routes;
    }

    static List<List<String>> res = new ArrayList<>();

    static class Flight {
        String flightId;
        String depart;
        String arrival;

        Flight(String id, String start, String end) {
            this.flightId = id;
            this.depart = start;
            this.arrival = end;
        }
    }



    private static void dfs(Map<String ,List<String>> routes,List<String> temp ,String city) {
        if(Objects.equals(city, "NYC")){
            temp.add(city);
            res.add(new ArrayList<>(temp));
            return;
        }
        if(!temp.contains(city)){
            temp.add(city);
        }else {
            return;
        }
        List<String> stringList = routes.get(city);
        if(CollectionUtil.isEmpty(stringList)){
            return;
        }
        for (String c : stringList) {
            dfs(routes,temp,c);
            temp.remove(c);
        }

    }

}
