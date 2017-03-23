package Feb28_105_112;

import java.util.*;

/**
 * Created by zhupd on 3/1/2017.
 */
public class SortCharactersByFrequency_451 {
    public String frequencySort(String s) {

        Map<Character, Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(c[i])) {
                map.put(c[i],0);
            }
            map.put(c[i],map.get(c[i])+1);
        }

        List<List<Character>> list=new ArrayList<>(s.length());
        for(int i=0;i<s.length();i++) list.add(new LinkedList<Character>());
        for(char cur:map.keySet()){
            int frequncy=map.get(cur)-1;
            list.get(frequncy).add(cur);

        }

        char[] res=new char[s.length()];
        int index=0;
        for(int i=s.length()-1;i>=0;i--){
            if(list.get(i).size()!=0){
                for(int j=0;j<list.get(i).size();j++){
                    for(int cout=0;cout<=i;cout++){
                        res[index]=list.get(i).get(j);
                        index++;
                    }
                }
            }
        }
        return String.valueOf(res);

/*        Map<Character, Integer> map=new HashMap<>();
        char[] c=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(c[i])) {
                map.put(c[i],0);
            }
            map.put(c[i],map.get(c[i])+1);
        }

        List<List<Character>> list=new ArrayList<>(s.length());
        for(int i=0;i<s.length();i++) list.add(null);
        for(char cur:map.keySet()){
            int frequncy=map.get(cur)-1;
            if(list.get(frequncy)==null){
                list.add(frequncy,new LinkedList<Character>());
                list.get(frequncy).add(cur);

            }
            else
                list.get(frequncy).add(cur);

        }

        char[] res=new char[s.length()];
        int index=0;
        for(int i=s.length()-1;i>=0;i--){
            if(list.get(i)!=null){
                for(int j=0;j<list.get(i).size();j++){
                    for(int cout=0;cout<=i;cout++){
                        res[index]=list.get(i).get(j);
                        index++;
                    }
                }
            }
        }
        return String.valueOf(res);*/
    }
}
