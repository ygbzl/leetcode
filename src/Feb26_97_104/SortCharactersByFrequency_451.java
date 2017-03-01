package Feb26_97_104;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhupd on 2/28/2017.
 */
public class SortCharactersByFrequency_451 {
    public String frequencySort(String s) {
        int[] map=new int[256];
        for(char c:s.toCharArray()){
            map[c-'a']+=1;
        }

        List<List<Character>> list = new ArrayList<>();
        for(int i=0;i<map.length;i++) {
            if(map[i]>0){
                while (list.size()<map[i]-1) {
                    list.add(map[i], new ArrayList<>());
                }
                    list.get(map[i]).add((char) (i + 'a'));

            }
        }

        List<Character> res=new ArrayList<>();
        for(int i=list.size()-1;i>=0;i--) {
            for(int j=0;j<list.get(i).size();j++){
                for(int k=0;k<i;k++) res.add(list.get(i).get(j));
            }
        }

        char[] cha=new char[res.size()];
        for(int i=0;i<res.size();i++) {
            cha[i]=res.get(i);
        }

        return String.valueOf(cha);
    }
}
