import java.util.*;

public class Solution {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        Set<Integer> repeatedSet = new HashSet<>();
        
        int size = sc.nextInt();
        
        int array[] = new int[size];
        
        for(int i=0; i<array.length; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        for (int i=0; i<array.length-1; i++) {
            if (array[i] == array[i+1])
                repeatedSet.add(array[i]);
        }
        
        System.out.println(repeatedSet);
    }  
}
