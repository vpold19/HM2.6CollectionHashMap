import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        List<Integer> nums1 = new ArrayList<>(List.of(1, 8, 2, 10, 4, 4, 5, 5, 6, 7, 8));
        System.out.print(nums1);
        Collections.sort(nums1);
        System.out.println();
        System.out.print(nums1);
        System.out.println();
        int i = nums1.get(0);
        for (Integer num : nums1) {
            if (num % 2 == 0 && num > i) {
                i = num;
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        List<Integer> nums2 = new ArrayList<>(List.of(1, 8, 2, 10, 4, 4, 5, 5, 6, 7, 8, 4, 4, 4, 10, 3));
        Set<Integer> numSet = new HashSet<>(nums2);
        System.out.print(numSet);
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        List<String> strings = new ArrayList<>(List.of("один", "один", "два","два", "два", "три", "три", "три"));
        Map<String, Integer> stringMap = new HashMap<>();
        for (String s : strings) {
            if(stringMap.containsKey(s)){
                stringMap.put(s,stringMap.get(s)+1);
            }else {
                stringMap.put(s,1);
            }
        }
        System.out.println(stringMap);
    }
}