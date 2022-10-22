package hw3.Task2;

import java.util.*;

public class SchoolTask {
    public static void main(String[] args) {

        Set<String> schoolTask = new HashSet<>(15);
        Random rand = new Random();
        int i = 0;
        while (i < 15) {
            int part1 =  rand.nextInt(8) + 2;
            int part2 = rand.nextInt(8) + 2;

            if(!schoolTask.contains(part1 + " * " + part2) &&
               !schoolTask.contains(part2 + " * " + part1)) {
                schoolTask.add("\nSchoolTask: "+part1 + " * " + part2);
                i++;
            }
        }
        System.out.println(schoolTask+" ");
    }
}

