package m1q;  //tv show


import java.util.ArrayList;
 
class Source {

    public String printIndex(ArrayList<String> list, int ind) {

            return list.get(ind);

    }

    public ArrayList<String> addAfter(ArrayList<String> a, String m, String n) {

        int index = a.indexOf(m);

        if (index != -1) {

            a.add(index + 1, n);

        }

        return a;

    }
 
   

    public ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind) {

        if (ind >= 0 && ind < p.size()) {

            String selectedString = p.get(ind);

            p.remove(ind);

            p.add(selectedString);

        }

        return p;

    }

}

public class Q4 {

    public static void main(String[] args) {

        Source source = new Source();
 
        ArrayList<String> tvShows = new ArrayList<>();

        tvShows.add("Breaking Bad");

        tvShows.add("Young Sheldon");

        tvShows.add("Friends");

        tvShows.add("Sherlock");

        tvShows.add("Stranger Things");
 
        

        String elementAtIndex = source.printIndex(tvShows, 2);

        System.out.println(elementAtIndex);
 
        

        ArrayList<String> newList = source.addAfter(tvShows, "Friends", "Game of Thrones");

        System.out.println(newList);
 
       

        ArrayList<String> modifiedList = source.pickIndexAndAppend(tvShows, 2);

        System.out.println(modifiedList);

    }

}

