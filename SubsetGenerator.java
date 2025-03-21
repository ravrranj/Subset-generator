import java.util.Scanner;
import java.util.*;

public class SubsetGenerator {

    public static void generateSubsets(int n, int index, ArrayList<Integer> subset){
    
    // Base case : If we reach beyond n, print the subset
    if (index > n) {
        System.out.println(subset);
        return;
    }    
    
    //Case 1: Exclude the current number and move to the next

    generateSubsets(n, index + 1, subset);

    //Case 2: Include the current number and move to the next

    subset.add(index);
    generateSubsets(n, index + 1, subset);

    //Backtrack: Remove the last element to revert the change
    subset.remove(subset.size() - 1);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number for which we want to find the subset for : ");
        int n = sc.nextInt();

        ArrayList<Integer> subset = new ArrayList<>();
        System.out.println("\nSubset of the first " + n + " natural numbers : ");
        generateSubsets(n, 1, subset);
        sc.close();


    }
    
}