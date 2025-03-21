import java.util.ArrayList;
import java.util.Scanner;

public class SubsetGenerator2 {

    public static void printSubset(ArrayList<Integer> subset) {
        if (subset.isEmpty()){
            System.out.println("{}");  // empty subset print hoga
        } else {
        for (int i = 0; i < subset.size(); i++ ){
            System.out.print(subset.get(i) + " ");
        }

        System.out.println();  // move to next line

        }
    }
public static void findSubsets(int n , ArrayList<Integer> subset) {
 
    if (n==0){
        printSubset(subset);
        return;
    }

    // if we add(add hoga then)
    subset.add(n);
    findSubsets( n - 1, subset);

    // if add nahi hoga 
    subset.remove(subset.size() - 1);
    findSubsets(n-1, subset);
}

public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the value of n: ");
    int n = sc.nextInt();

    ArrayList<Integer> subset = new ArrayList<>();
    System.out.println("Subset of first " + n + " natural numbers : ");
    findSubsets(n, subset);
    sc.close();
}

}
