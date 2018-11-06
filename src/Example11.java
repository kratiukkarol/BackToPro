import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Example11 {

    public static void main(String[] args){
        Supplier<Object> creator = Object::new;
        Object instance = creator.get();
        System.out.println(instance);

        Predicate<Object> equalsMethodOnObject = instance::equals;
        System.out.println(equalsMethodOnObject.test(new Object()));

        BiPredicate<Object, Object> equalsMethodOnClass = Object::equals;
        System.out.println(equalsMethodOnClass.test(instance, new Object()));
    }
}
