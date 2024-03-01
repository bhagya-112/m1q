package m1q;    //string position

import java.util.ArrayList;
import java.util.List;

public class q6 {
    
    public List<List<Integer>> printPositions(String K) {
        List<List<Integer>> result = new ArrayList<>();
        
        int i = 0;
        int j = 0;
        
        while (j < K.length()) {
            while (j < K.length() - 1 && K.charAt(j) == K.charAt(j + 1)) {
                j++;
            }
            
            if (j - i >= 2) {
                List<Integer> group = new ArrayList<>();
                group.add(i);
                group.add(j);
                result.add(group);
            }
            
            j++;
            i = j;
        }
        
        return result;
    }
    
    public ArrayList<String> addAfter(ArrayList<String> a, String m, String n) {
        ArrayList<String> result = new ArrayList<>();
        
        for (String str : a) {
            result.add(str);
            if (str.equals(m)) {
                result.add(n);
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        q6 source = new q6();
        
        String K = "mousssssseeee";
        System.out.println(source.printPositions(K));
        ArrayList<String> list = new ArrayList<>();
        list.add("ad");
        list.add("cc");
        list.add("df");
        list.add("ez");
        String m = "cc";
        String n = "kc";
        
       
       
        
        ArrayList<String> updatedList = source.addAfter(list, m, n);
        System.out.println(updatedList);
    }
}