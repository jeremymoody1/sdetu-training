package DataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// 1. Define the collection.
		Set<String> animals = new TreeSet<>();
		// LinkedHashSet - in order that they were entered.
		// HashSet - complete random order.
		// TreeSet - rearranged to natural order (alphabetical ascending).
		
		// SETS ARE ESSENTIALLY JUST UNIQUE LISTS.
		
		// 2. Adding elements.
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");
		
		
		System.out.println(animals);
		// System.out.println(animals.size());
		
		animals.add("goose");
		animals.add("cat"); // Will only add unique elements. Does not increase size when adding multiples like cat/pig/snake.
		animals.add("pig");
		animals.add("snake");
		
		// System.out.println(animals);
		// System.out.println(animals.size());
		
		
		// Create a new set that we use for comparison.
		Set<String> farmAnimals = new HashSet<>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// What is the intersection between animals and farmAnimals?
		
		// 1. Copy existing set into new set.
		
		Set<String> intersectionSet = new HashSet<>(animals);
		
		// System.out.println(intersectionSet);
		
		// 2. Retain ONLY elements that are also in the other set.
		intersectionSet.retainAll(farmAnimals);
		System.out.println("The intersection is: " + intersectionSet + ".");
		
		// What is the UNION? (Contains all animals and farm animals)
		Set<String> unionSet = new HashSet<>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println(unionSet);
		
		// What is the DIFFERENCE between them (In one but not the other)
		Set<String> differenceSet = new HashSet<>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println(differenceSet);
		
		
		
	}

}
