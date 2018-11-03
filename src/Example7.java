import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Example7 {

    public static void main(String[] args){
        List<String> listWithNames = new LinkedList<>();
        listWithNames.add("Karol");
        listWithNames.add("Ania");
        listWithNames.add("Aleksander");

        List<String> otherListWithNames = new LinkedList<>();
        otherListWithNames.add("Janek");
        otherListWithNames.add("Agnieszka");
        otherListWithNames.add("Alicja");

        List<String> joinedListWithNames = new LinkedList<>();
        joinedListWithNames.addAll(listWithNames);
        joinedListWithNames.addAll(otherListWithNames);

        System.out.println(joinedListWithNames.contains("Aleksander"));
        System.out.println(joinedListWithNames.get(4));
        System.out.println(joinedListWithNames.isEmpty());
        System.out.println(joinedListWithNames.indexOf("Alicja"));
        System.out.println(joinedListWithNames.lastIndexOf("Karol"));
        System.out.println(joinedListWithNames.size());

        Map<String, String> sampleMap = new HashMap<>();
        sampleMap.put("Polska", "Warszawa");
        sampleMap.put("Polska", "Poznań");
        sampleMap.put("Niemcy", "Berlin");
        sampleMap.put("Niemcy", "Frankfurt");

        System.out.println("Iterowanie po wartościach");
        for (String value : sampleMap.values()){
            System.out.println(value);
        }

        System.out.println("Iterowanie po kluczach i pobieranie wartości");
        for (String key : sampleMap.keySet()){
            String value = sampleMap.get(key);
            System.out.println(key + ": " + value);
        }

        System.out.println("Iterowanie po kluczach i wartościach");
        for (Map.Entry<String, String> entry : sampleMap.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }

}
