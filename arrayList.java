
import java.util.*;
import java.lang.*;
import java.io.*;

class arrayList
{
    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp=list.get(idx1);
        list.set(idx1 , list.get(idx2));
        list.set(idx2 , temp);
    }
    public static int Maxinmun(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        return max;
    }
    public static int storewater(ArrayList<Integer> height){
        int maxwater =0;
        // brute force
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht = Math.min(height.get(i),height.get(j));
                int width = j-i;
                int currwater = ht * width;
                maxwater = Math.max(maxwater, currwater);
            }
        }
        return maxwater;
    }
    public static int storewaters(ArrayList<Integer> height){
        int maxwater =0;
        int lp = 0;
        int rp = height.size()-1;
        while(lp<rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            maxwater = Math.max(maxwater,currwater);
            if(lp<rp){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // ADD OPERATION
        list.add(1); // O(1)
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(1,9); //O(n)
        System.out.println(list);

        // GET OPERATION // O(1)
        int element = list.get(2);
        System.out.println(element);

        // DELETE OPERATION O(n)
        list.remove(2);
        System.out.println(list);

        // SET ELEMENT AT INDEX O(n)
        list.set(2,10);
        System.out.println(list);

        // CONTAINS ELEMENT O(n)
        System.out.println(list.contains(1));

        // SIZE OF ArrayList
        System.out.println(list.size());

        // print the ArrayList
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        // reverse ArrayList
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        int max = Maxinmun(list);
        System.out.println(max);
        int idx1 =1 , idx2 = 3;
        System.out.println(list);
        swap(list,idx1,idx2);
        System.out.println(list);

        // SORTING AN ArrayList
        Collections.sort(list); // ascending order
        System.out.println(list);

        // descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        // Container with most water
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(1);
        list4.add(8);
        list4.add(6);
        list4.add(2);
        list4.add(5);
        list4.add(4);
        list4.add(8);
        list4.add(3);
        list4.add(7);
        System.out.println(storewater(list4));
        System.out.println(storewaters(list4));

    }
}
