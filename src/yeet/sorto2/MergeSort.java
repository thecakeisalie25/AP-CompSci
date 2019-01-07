package yeet.sorto2;
        
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
        
public class MergeSort
{
    public static void main(String[] args) throws IOException, InterruptedException
    {
        ArrayList<Integer> data = new ArrayList<Integer>();
        Scanner input = new Scanner(new File("src/yeet/sorto/numbers.txt"));
        // input.useDelimiter("\n");
        while(input.hasNext())
        {
            String next = input.next();
            // System.out.println(next);
            data.add(Integer.decode(next));
        }
        System.out.println(sort(data));
        for (int e : sort(data)) {
            System.out.println("==" + e + "==");
            Thread.sleep(1); // required for printing in vscode terminal, works fine without i think.
        } input.close();
    } 
    private static ArrayList<Integer> sort(ArrayList<Integer> list) {
            ArrayList<Integer> list2 = list;
        if (list2.size() == 1)
            return list2;
        if(list2.size() == 2) {
            if(list2.get(0).compareTo(list2.get(1)) > 0) {
                int t = list2.get(0);
                list2.set(0, list2.get(1));
                list2.set(1, t);
            }
            return list2;
        }
        else {
            ArrayList<Integer> t1, t2;
                t1 = new ArrayList<Integer>(list2.subList(0, (int)Math.round(Math.ceil(list2.size()/2f))));
                t2 = new ArrayList<Integer>(list2.subList((int)Math.round(Math.ceil(list2.size()/2d)), list2.size()));
                sort(t1);
                sort(t2);
                list2.clear();
                while (t2.size() != 0 && t1.size() != 0) {
                    if(t1.get(0).compareTo(t2.get(0)) < 0){
                        list2.add(t1.get(0));
                        t1.remove(0);
                    }
                    else{
                        list2.add(t2.get(0));
                        t2.remove(0);
                    }
                }
                if(t1.size() == 0){
                    list2.addAll(t2);
                    t2.clear();
                }
                else{
                    list2.addAll(t1);
                    t1.clear();
                }
                return list2;
            }
        }
}