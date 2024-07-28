import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int i = 0; i < nums1.size(); i++) {
            if (nums1.get(i) % 2 == 1){
                System.out.print(nums1.get(i)+", ");
            }
        }
        System.out.println(" ");

        System.out.println("Task 2");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> evenNumbers= new ArrayList<>();
        for (int i = 0; i < nums2.size(); i++) {
            if (nums2.get(i) % 2 == 0 && !evenNumbers.contains(nums2.get(i))){
                evenNumbers.add(nums2.get(i));
            }
        }
        Collections.sort(evenNumbers);
        System.out.println(evenNumbers.toString());

        System.out.println("Task 3");
        List<String> words = new ArrayList<>(List.of("cat","dog","mouse","dog","cow","cat"));
        Set<String> animals = new HashSet<>();
        for (int i = 0; i < words.size(); i++) {
            animals.add(words.get(i));
        }
        System.out.println(animals.toString());

        System.out.println("Task 4");
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        Map<String,Integer> wordAmount = new HashMap<>();
        for (int i = 0; i < strings.size(); i++) {
            int a=Collections.frequency(strings, strings.get(i));
            if (!wordAmount.containsKey(strings.get(i))){
                wordAmount.put(strings.get(i),a);
            }
        }
        System.out.println(wordAmount.toString());
    }
}