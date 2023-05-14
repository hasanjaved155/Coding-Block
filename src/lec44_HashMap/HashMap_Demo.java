package lec44_HashMap;

import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        //Map<String,Integer> map = new HashMap<>();// map is interface
        HashMap<String,Integer> map = new HashMap<>();// hashmap is class
        map.put("ankit",77);
        map.put("kunal",67);
        map.put("aditya",32);
        map.put("raju",17);
        map.put("mohan",87);
        map.put("amisha",57);
        map.put("sunil",97);
        map.put("ankita",67);
        map.put("shivani",47);
        map.put("shivani",147);
        map.put("bklol",89);
//        map.put(null,89);
        //System.out.println(map);

//        System.out.println(map.containsKey("anku"));
//        System.out.println(map.containsKey("amisha"));
//
//        //System.out.println(map.containsValue(67));
//        System.out.println(map.get("aditya"));
//        System.out.println(map.get("adi"));
//
//        System.out.println(map.remove("mohan"));
//        System.out.println(map);
//        System.out.println(map.remove("shivani",147));// return boolean result

        TreeMap<String,Integer>map1 = new TreeMap<>();// it stores key wise sorted data
        map1.put("ankit",77);
        map1.put("kunal",67);
        map1.put("aditya",32);
        map1.put("raju",17);
        map1.put("mohan",87);
        map1.put("amisha",57);
        map1.put("sunil",97);
        map1.put("ankita",67);
        map1.put("shivani",47);
        map1.put("shivani",147);
        map1.put("bklol",89);
        //System.out.println(map1);

        LinkedHashMap<String,Integer>map2 = new LinkedHashMap<>();
        map2.put("ankit",77);
        map2.put("kunal",67);
        map2.put("aditya",32);
        map2.put("raju",17);
        map2.put("mohan",87);
        map2.put("amisha",57);
        map2.put("sunil",97);
        map2.put("ankita",67);
        map2.put("shivani",47);
        map2.put("shivani",147);
        map2.put("bklol",89);
        map2.put(null,89);
        //System.out.println(map2);
        //System.out.println(map.keySet());
        Set<String>key = map.keySet();
        for(String k : key){
            System.out.println(k + " " + map.get(k));
        }

        for(String k : map.keySet()){
            System.out.println(k + " " + map.get(k));
        }

        for(String k : new ArrayList<>(map.keySet())){
            System.out.println(k + " " + map.get(k));
        }
    }
}
