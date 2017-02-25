package Feb23_81_88;

import java.util.*;

/**
 * Created by zhupd on 2/23/2017.
 */
public class DesignTwitter_355 {
    Map<Integer, User> userMap = new HashMap<>();
    static int timeStamp = 0;


    public class User {
        int userID;
        Set<Integer> followList;
        Tweet head;

        public User(int ID) {
            userID = ID;
            followList = new HashSet<>();
            this.follow(ID);
            head = null;
        }

        public void follow(int ID) {
            followList.add(ID);
        }

        public void unFollow(int ID) {
            followList.remove(ID);
        }

        public void post(int ID) {
           Tweet tweet = new Tweet(ID);
            tweet.next=head;
            head=tweet;
        }

    }

    public class Tweet {
        int tweetID;
        int time;
        Tweet next;

        public Tweet(int ID) {
            tweetID = ID;
            next=null;
            time=timeStamp++;
        }
    }

    public DesignTwitter_355() {

    }

    public void postTweet(int userID, int tweetID) {
        if (userMap.containsKey(userID)) {
            userMap.get(userID).post(tweetID);
        } else {
            userMap.put(userID, new User(userID));
            userMap.get(userID).post(tweetID);
        }
    }

    public void follow(int followerID, int followeeID) {
        if (!userMap.containsKey(followerID)) {
            userMap.put(followerID, new User(followerID));
        }
        if (!userMap.containsKey(followeeID)) {
            userMap.put(followeeID, new User(followeeID));
        }
        userMap.get(followerID).follow(followeeID);
    }

    public void unfollow(int followerID, int followeeID) {
        if(!userMap.containsKey(followerID) || followeeID==followerID) return;

        userMap.get(followerID).unFollow(followeeID);
    }

    public List<Integer> getNewsFeed(int userID) {
        List<Integer> res = new LinkedList<>();
        if(!userMap.containsKey(userID)) return res;

        Set<Integer> list = userMap.get(userID).followList;
        PriorityQueue<Tweet> pq =
                new PriorityQueue<>(list.size(), (a, b) -> (b.time - a.time));

        for (int x : list) {
            Tweet t = userMap.get(x).head;
            if (t != null) {
                pq.offer(t);
            }
        }
        int n = 0;
        while (!pq.isEmpty()&&n < 10) {
            Tweet cur = pq.poll();
            res.add(cur.tweetID);
            if(cur.next!=null) {
                pq.offer(cur.next);
            }
            n++;
        }
        return res;
    }
}
