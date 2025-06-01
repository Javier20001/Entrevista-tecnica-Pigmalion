package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberArrayList = new ArrayList<>();
        numberArrayList.add(1);
        numberArrayList.add(2);
        numberArrayList.add(5);
        numberArrayList.add(3);
        System.out.println(hasTwoElementsWithSum_LowResources(numberArrayList, 8));
        System.out.println(plusTwoElementOfAnListManyResources(numberArrayList, 9));
    }

    public static boolean hasTwoElementsWithSum_LowResources(List<Integer> numbers, int expectedSum){

        boolean result = false;
        //loop complexity O(n)

        HashSet<Integer> seen = new HashSet<>(); // i use hashset to store the numbers already processed
        for (Integer number : numbers){
            int complement = expectedSum - number; // subtract the number from the expected total to obtain the complement
            if(seen.contains(complement)){ // i verify if the complement is in the hashset
                result = true; //if this is true, i change the state of the result to true
                break;//and finish the loop
            }
            seen.add(number); // if not, add the complement to the hashset
        }

        // why is this better? because it only uses one loop. A hashset checks for the presence of a number using constant-time lookup (not sequential search).
        //so this solution don't concat two loops, making this spend less resources
        return result;
    }

    public static boolean plusTwoElementOfAnListManyResources(List<Integer> numbers, int expectedSum){

        boolean result = false;
        //loop complexity O(n^2)

        // in this example, i only concat two for and valid every possibility to find the first one who are equals to the expected
        // this function is suitable when development speed matters more than performance or resource usage
        for (int i = 0; i < numbers.size()-1; i++) {
            for (int j = 0; j < numbers.size()-1; j++) {
                int total = numbers.get(i) + numbers.get(j+1);
                if(total == expectedSum){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}