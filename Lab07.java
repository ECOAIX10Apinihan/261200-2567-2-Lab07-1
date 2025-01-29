import java.util.List;
import java.util.Map;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.HashMap;

public class Lab07 {
    public static void main(String[] args) {
        List<String> stringnumlist = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            stringnumlist.add(String.valueOf(random.nextInt(100)));
        }
        System.out.println("Original String list: " + stringnumlist);
        Collections.sort(stringnumlist);
        System.out.println("Sorted String list: " + stringnumlist);
        Collections.shuffle(stringnumlist);
        System.out.println("Shuffled String list: " + stringnumlist + "\n");
        
        Set<String> fruitset = new HashSet<>();
        fruitset.add("apple");
        fruitset.add("Banana");
        fruitset.add("orange");
        fruitset.add("Grape");
        fruitset.add("watermelon");
        fruitset.add("Melon");
        System.out.println("Original fruit list: " + fruitset);
        int fruIndex = random.nextInt(fruitset.size());
        String elementToRemove = (String) fruitset.toArray()[fruIndex];
        fruitset.remove(elementToRemove);
        System.out.println("Removed element: " + elementToRemove);
        SortedSet<String> sortedSet = new TreeSet<>(fruitset);
        System.out.println("SortedSet: " + sortedSet);
        System.out.println("HashSet size: " + fruitset.size() + "\n");

        Set<String> vegetableset = new TreeSet<>();
        vegetableset.add("carrot");
        vegetableset.add("potato");
        vegetableset.add("tomato");
        vegetableset.add("cucumber");
        vegetableset.add("lettuce");
        vegetableset.add("spinach");
        System.out.println("Original vegetable list: " + vegetableset);
        int vegIndex = random.nextInt(vegetableset.size());
        String vegElementToRemove = (String) vegetableset.toArray()[vegIndex];
        vegetableset.remove(vegElementToRemove);
        System.out.println("Removed vegetable: " + vegElementToRemove);
        SortedSet<String> sortedVegSet = new TreeSet<>(vegetableset);
        System.out.println("SortedSet: " + sortedVegSet);
        System.out.println("TreeSet size: " + vegetableset.size() + "\n");

        Stack<String> boxstack = new Stack<>();
        boxstack.push("pencil");
        boxstack.push("pen");
        boxstack.push("eraser");
        boxstack.push("ruler");
        boxstack.push("sharpener");
        System.out.println("Original Stack: " + boxstack);
        System.out.println("Top of the stack: " + boxstack.peek());
        System.out.println("Top of the stack: " + boxstack.pop() + "\n");

        Map<String, Color> favoriteColor = new HashMap<String, Color>();
        favoriteColor.put("Juliet", Color.BLUE);
        favoriteColor.put("Romeo", Color.GREEN);
        favoriteColor.put("Adam", Color.RED);
        favoriteColor.put("Eve", Color.BLUE);
        favoriteColor.put("Robert", Color.BLACK);
        favoriteColor.put("Mark", Color.WHITE);
        favoriteColor.put("Pedro", Color.YELLOW);
        favoriteColor.put("Cole", Color.BLUE);
        Set<String> keySet = favoriteColor.keySet();
        for (String key : keySet) {
            Color value = favoriteColor.get(key);
            System.out.println(key + " likes " + value);
        }

        System.out.println("\n");

        Map<String, Color> favoriteeieiColor = new TreeMap<>(favoriteColor);
        Set<String> keySetTreeMap = favoriteeieiColor.keySet();
        for (String key : keySetTreeMap) {
            Color value = favoriteeieiColor.get(key);
            System.out.println(key + " likes " + value);
        }
    }   
}