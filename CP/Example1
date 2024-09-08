import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        
        System.out.println(pairs(k, arr));
        
        scanner.close();
    }
    
    public static int pairs(int k, int[] arr) {
        Set<Integer> elements = new HashSet<>();
        int count = 0;
        
        for (int num : arr) {
            
            if (elements.contains(num - k)) {
                count++;
            }
        
            if (elements.contains(num + k)) {
                count++;
            }
            
            elements.add(num);
        }
        
        return count;
    }
}
