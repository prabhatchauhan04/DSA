package Map_Set;

import java.util.*;

public class MapBasics {
    public static void main(String[] args) {
        // HASHMAP
        HashMap<String , Integer> map = new HashMap<>();
		map.put("Ankita", 59);
		map.put("Vishal", 77);
		map.put("Pooja", 88);
		map.put("Anku", 88);
		map.put("Puneet", 73);
		map.put("Ankita", 38);
        map.put(null, 78);
		System.out.println(map);
        // Contains
		System.out.println(map.containsKey("Aniket"));
   		System.out.println(map.containsKey("Anku"));
   		// Get
   		System.out.println(map.get("Aniket"));// null aaega bcoz its not present
  		System.out.println(map.get("Anku"));// value print hojaegi
    	// remove
    	System.out.println(map.remove("Aniket"));// null aaega bcoz its not present
    	System.out.println(map.remove("Anku"));// value print hojaegi
        System.out.println(map);
        // size
        System.out.println(map.size());
        //TREEMAP
        TreeMap<String, Integer> map1 = new TreeMap<>();
		// put
		map1.put("Raj", 89);
		map1.put("Ankit", 79);
		map1.put("Kaju", 99);
		map1.put("Ankita", 59);
		map1.put("Vishal", 77);
		map1.put("Pooja", 88);
		map1.put("Anku", 88);
		map1.put("Puneet", 73);
		map1.put("Ankita", 38);
		System.out.println(map1);
        // LINKEDHASHMAP
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		// put
		map2.put("Raj", 89);
		map2.put("Ankit", 79);
		map2.put("Kaju", 99);
		map2.put("Ankita", 59);
		map2.put("Vishal", 77);
		map2.put("Pooja", 88);
		map2.put("Anku", 88);
		map2.put("Puneet", 73);
		map2.put("Ankita", 38);
		map2.put(null, 78);
		System.out.println(map2);
        // SET
		// "keySet" map ka method hai jo Set<KeyKaDataType> return krrha saari keys ka
		Set<String> set = map.keySet();
		System.out.println(set);
		for (String key : set) {
			System.out.println(key + " " + map.get(key));
		}

		for (String key : map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
    }
}






