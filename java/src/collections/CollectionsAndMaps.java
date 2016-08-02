package collections;

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Created by gaston on 01/08/16.
 */
public class CollectionsAndMaps {

    public static void main(String args[]){

        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.addAll(ran());

        for (Integer el: treeSet){
            System.out.println(el);
        }
    }

    public static Collection<Integer> ran(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random ran = new Random();

        for(int i =0;i<20;i++){
            list.add(ran.nextInt(15));
        }
        Collections.shuffle(list);

        for (Integer el: list){
            System.out.println(el);
        }
        System.out.println("--------------------");
        return list;
    }


}
