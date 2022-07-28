import java.util.*;

public class Main {
    public static void main(String[] args) {
        oddNumbers();
        evenNumbers();
        task3();
        task4();
    }


    private static void oddNumbers() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>();
        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % 2 == 1)
                nums1.add(nums.get(j));
        }
        System.out.println("Нечетные числа" + " " + nums1);
    }


    private static void evenNumbers() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<Integer> nums1 = new ArrayList<>();
        for (int j = 0; j < nums.size(); j++) {
            if (nums.get(j) % 2 == 0)
                nums1.add(nums.get(j));
        }
        Set<Integer> set = new LinkedHashSet<>(nums);
        List<Integer> set2 = new ArrayList<>(set);
        System.out.println("Четные числа без повторений в порядке возрастания" + " " + set2);
    }

    private static void task3() {
        List<String> words = new ArrayList<>(List.of("достопримечательность", "переосвидетельствование", "Неиссякаемый", "Предприятие", "достопримечательность", "переосвидетельствование", "Неиссякаемый", "Будни", "Лесной"));
        Set<String> words2 = new HashSet<>(words);
        System.out.println(words2);
    }

    private static void task4() {
        List<String> words = new ArrayList<>(List.of("достопримечательность", "переосвидетельствование", "Неиссякаемый", "Предприятие", "достопримечательность", "переосвидетельствование", "Неиссякаемый", "Будни", "Лесной"));
        for (String i : words) {
            System.out.print("Слово " + i + " повторяется " + Collections.frequency(words, i) + " раз/раза. ");
        }
    }
}





