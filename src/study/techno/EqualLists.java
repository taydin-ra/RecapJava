package study.techno;

import java.util.ArrayList;
import java.util.List;

public class EqualLists {
    public static void main(String[] args) {
        ArrayList <String> list=new ArrayList<>();
        ArrayList <String> list2=new ArrayList<>();
        list.add("Tuba");
        list.add("Rana");

        list2.add("Tuba");
        list2.add("Rana");
        list2.add("Ran");
        System.out.println(check(list,list2));

    }

    public static boolean check(List<String> list,List<String> list2){
        boolean ch=false;
        for (int i = 0; i <list.size() ; i++) {
            for (int j = 0; j < list2.size(); j++) {
                if(list.get(i).equalsIgnoreCase(list2.get(j)) & list.size()==list2.size()){
                    ch=true;
                }else{
                    ch=false;
                }
            }

        }
        return ch;
    }
}
