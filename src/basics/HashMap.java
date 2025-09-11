package basics;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        map.put("Gulnara", 8);
        map.put("Altynai", 11);
        map.put("Aidana", 10);
        map.put("Chynara", 9);


        System.out.println(map);

        System.out.println(map.get("Gulnara"));
//        map.remove();
        System.out.println(map.remove("Chynara"));
        System.out.println(map);
        map.put("Chynara", 9);
        System.out.println(map.remove("C", 9));
        System.out.println("Contains key Alica : " + map.containsKey("Alica"));
        System.out.println("Contains key Aidana : " + map.containsKey("Aidana"));
        System.out.println("Contains value 11 : " + map.containsValue(11));
        System.out.println("Contains value 9 : " + map.containsValue(9));
        System.out.println("Size of the map : " + map.size());
        System.out.println("Is map empty : " + map.isEmpty());
//        map.clear();
//        System.out.println("Map after clear: "+map);
        System.out.println("Set of all keys: " + map.keySet());
        System.out.println("Set of all values: " + map.values());
        System.out.println("Set of all entrySet: " + map.entrySet());
        map.putIfAbsent("Atai", 9);
        map.putIfAbsent("chynara", 6);
        System.out.println(map);
        map.replace("chynara", 12);
        System.out.println("Map after replacing the value for the cpecified key-chynara: " +
                map);
        System.out.println("Default value if key-Gulnara not found: " + map.getOrDefault("Din", 0));
    }
}
