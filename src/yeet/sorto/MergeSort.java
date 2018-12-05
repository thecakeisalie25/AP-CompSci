package yeet.sorto;
        
import java.util.ArrayList;
        
public class MergeSort
{
    public static void main(String[] args)
    {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(376);
        input.add(173);
        input.add(436);
        input.add(352);
        input.add(263);
        input.add(164);
        input.add(316);
        input.add(194);
        input.add(32);
        input.add(39);
        input.add(100);
        input.add(227);
        input.add(500);
        System.out.println(sort(input));
    }
    private static ArrayList<Integer> sort(ArrayList<Integer> list) {
            ArrayList<Integer> list2 = list;
        if (list2.size() == 1)
            return list2;
        if(list2.size() == 2) {
            if(list2.get(0) > list2.get(1)) {
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
                    if(t1.get(0) < t2.get(0)){
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