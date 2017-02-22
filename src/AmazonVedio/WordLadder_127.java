package AmazonVedio;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

 Only one letter can be changed at a time.
 Each transformed word must exist in the word list. Note that beginWord is not a transformed word
 *
 * Created by zhupd on 2/13/2017.
 */
public class WordLadder_127 {
    public int ladderLength(String beginWord,
                            String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>();
        wordSet.addAll(wordList);
        Set<String> transformed = new HashSet<>();
        transformed.add(beginWord);
        int len=1;
        while (!transformed.contains(endWord)) {
            Set<String> temp = new HashSet<>();
            for (String x : transformed) {
                for(int i=0;i<x.length();i++) {
                    char[] current = x.toCharArray();
                    for(char c='a';c<='z';c++) {
                        current[i] = c;
                        String after=new String(current);
                        if (wordSet.contains(after)) {
                            temp.add(after);
                            wordSet.remove(after);
                        }
                    }

                }

            }
            if (temp.size()==0) {
                return 0;
            }
            len++;
            transformed=temp;
        }
        return len;
    }
}
