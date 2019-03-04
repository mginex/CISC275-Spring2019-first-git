import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//import firstGit.Dog;
//import firstGit.*;

public abstract class MyCompare3 implements Comparator<Dog> {
	
	public static void main(String[] args){
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("Fido", 4));
		dogs.add(new Dog("Fido", 3));
		dogs.add(new Dog("Alfie", 4));

		System.out.println(dogs);
		Collections.sort(dogs, new Comparator<Dog>(){
			@Override
			public int compare(Dog a, Dog b){
			    return a.getLegs() - b.getLegs();
			}
		});
		System.out.println(dogs);
	}
}
