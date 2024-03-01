package m1q;   //set operation

import java.util.HashSet;
import java.util.Set;
 
public class q5 {
 
    public static Set<Integer> subtract(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.removeAll(b);
        return result;
    }
 
    public static Set<Integer> union(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.addAll(b);
        return result;
    }
 
    public static Set<Integer> intersect(Set<Integer> a, Set<Integer> b) {
        Set<Integer> result = new HashSet<>(a);
        result.retainAll(b);
        return result;
    }
 
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(6);
        set1.add(7);
        set1.add(8);
 
        HashSet<Integer> set2 = new HashSet<>();
        set2.add(9);
        set2.add(3);
        set2.add(7);
 
        Set<Integer> resultSubtract = subtract(set1, set2);
        System.out.println(resultSubtract);  // Output: [5, 6, 8]
 
        Set<Integer> resultUnion = union(set1, set2);
        System.out.println(resultUnion);  // Output: [3, 5, 6, 7, 8, 9]
 
        Set<Integer> resultIntersect = intersect(set1, set2);
        System.out.println(resultIntersect);  // Output: [7]
    }
}