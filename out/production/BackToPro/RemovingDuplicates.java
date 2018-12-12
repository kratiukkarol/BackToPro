import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class RemovingDuplicates {

	public static void main(String[] args) {
		
		
		List<String> employeeNameList = new ArrayList<>();
		employeeNameList.add("John");
		employeeNameList.add("Ankiter");
		employeeNameList.add("Rohan");
		employeeNameList.add("Johnny");
		employeeNameList.add("Amit");
		employeeNameList.add("Ankit");
		
		String randomEmp = employeeNameList.get(new Random().nextInt(employeeNameList.size()));
		System.out.println(randomEmp);
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(13);
		numbers.add(22);
		numbers.add(32);
		numbers.add(41);
		numbers.add(54);
		numbers.add(63);
		
		Integer random = numbers.get(new Random().nextInt(numbers.size()));
		System.out.println(random);
		
		
		
		/*
		final List<String> nestedSublist = employeeNameList.subList(2, 5);
		System.out.println(nestedSublist);
		
		Collection<String> mainSublist = employeeNameList.subList(0, 6);
		System.out.println(mainSublist);
		
		Collections.unmodifiableCollection(nestedSublist);
		System.out.println(nestedSublist);
		
		Collections.shuffle(employeeNameList);
		System.out.println(employeeNameList);
		
		employeeNameList.addAll(nestedSublist);
		System.out.println(employeeNameList);
		
		Collections.shuffle(employeeNameList);
		System.out.println(employeeNameList);

		
		/*employeeNameList.forEach(System.out::println);
		System.out.println("After removing duplicates: ");
		ArrayList<String> noDuplicates = new ArrayList<>();
		for(String name : employeeNameList) {
			if(!noDuplicates.contains(name)) {
				noDuplicates.add(name);
			}
		}
		noDuplicates.forEach(System.out::println);
		
		System.out.println("Second way: ");
		ArrayList<String> noDuplicates2 = new ArrayList<>(new HashSet<>(employeeNameList));
		noDuplicates2.forEach(System.out::println);
		
		System.out.println("Third way: ");
		ArrayList<String> noDuplicates3 = new ArrayList<>(new LinkedHashSet<>(employeeNameList));
		noDuplicates3.forEach(System.out::println);
		*/
	}
	
}
