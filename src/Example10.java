import java.util.*;

public class Example10 implements Comparator<String> {

    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Type four names");
        for (int i = 0; i<4; i++){
            names.add(input.next());
        }
        System.out.println(names);
        Comparator<String> comparator = new Example10();
        Collections.sort(names, comparator);
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, Comparator.comparingInt(String::length).reversed());
        System.out.println(names);
        names.sort((a, b) -> b.length() - a.length());
        System.out.println(names);

    }

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
