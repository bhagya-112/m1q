package m1q;  //student information

import java.util.ArrayList;

 public class q8 {
    
    public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(m)) {
                a.set(i, n);
            }
        }
        return a;
    }
    
    public String listIndex(ArrayList<String> list) {
        return list.get(0);
    }
    
    public ArrayList<String> listAfter(ArrayList<String> a, String m, String n) {
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).equals(m)) {
                a.add(i + 1, n);
                break;
            }
        }
        return a;
    }
   
    public static void main(String[] args) {
        q8 source = new q8();
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("S");
        list1.add("D");
        
        System.out.println(source.changeOccurrence(list1, "S", "C"));
        System.out.println(source.listIndex(list1));
        
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("D");
        list2.add("E");
        
        System.out.println(source.listAfter(list2, "B", "C"));
    }
 }
 
