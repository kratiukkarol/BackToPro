import java.util.*;

public class Example8 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Set<String> names = new HashSet<>();
        String name;
        do {
            System.out.println("Type a name: ");
            name = input.next();
            if (!name.equals("-")) {
                names.add(name);
            }
        } while (!name.equals("-"));
            System.out.println("You typed " + names.size() + " distinct names");

            Map<String, String> pairs = new HashMap<>();
            String name1,name2;

            while (true){
                System.out.println("Type a name");
                name1 = input.next();
                if (name1.equals("-")){
                    break;
                }
                System.out.println("Type a name of your partner");
                name2 = input.next();
                if (name2.equals("-")){
                    break;
                }
                pairs.put(name1, name2);
            }
            System.out.println("Choose one of typed name");
            name1 = input.next();
            System.out.println("Name of your partner is: " + pairs.get(name1));
    }
}
