/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package One;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author saopayne
 */
public class Twitter355 {

   
     /**
     * Your Twitter object will be instantiated and called as such:
     * Twitter obj = new Twitter();
     * obj.postTweet(userId,tweetId);
     * List<Integer> param_2 = obj.getNewsFeed(userId);
     * obj.follow(followerId,followeeId);
     * obj.unfollow(followerId,followeeId);
     */
    
    private final Map<Integer,Set<Integer>> users = new HashMap<>();
    private final Map<Integer,Map<Integer,Integer>> tweets = new HashMap<>();
    private int timeStamp = 0;
    
    /** Initialize your data structure here. */
    public Twitter355() {
        
    }

    /** Compose a new tweet.
     * @param userId
     * @param tweetId */
    public void postTweet(int userId, int tweetId) {
        if(users.get(userId) == null){
            users.put(userId,new HashSet<>());
            tweets.put(userId,new HashMap<>());
        }
        tweets.get(userId).put(timeStamp++,tweetId);
    }
    
    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent.
     * @param userId
     * @return  */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if(users.get(userId) == null) return res;
            Queue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((e1,e2) -> e2.getKey() - e1.getKey());
            
            tweets.get(userId).entrySet().stream().forEach((i) -> {
                queue.offer(i);
        });
            users.get(userId).stream().forEach((user) -> {
                tweets.get(user).entrySet().stream().forEach((e) -> {
                    queue.offer(e);
            });
        });
            
        for(int i = 0; i < 10 && !queue.isEmpty(); i++){
            res.add(queue.poll().getValue());
        }
        
        return res;
    }
    
    /** Follower follows a followee. If the operation is invalid, it should be a no-op.
     * @param followerId
     * @param followeeId */
    public void follow(int followerId, int followeeId) {
        if(followerId == followeeId) return;
        if(users.get(followerId) == null){
            users.put(followerId,new HashSet<>());
            tweets.put(followerId,new HashMap<>());
        }
        if(users.get(followeeId) == null){
            users.put(followeeId,new HashSet<>());
            tweets.put(followeeId,new HashMap<>());
        }
        users.get(followerId).add(followeeId);
        
    }
    
    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op.
     * @param followerId
     * @param followeeId */
    public void unfollow(int followerId, int followeeId) {
        //user cannot follow himself
        if(followerId == followeeId) return;
        //if the follower or the followee does not exist in the user table
        if(users.get(followerId) == null || users.get(followeeId) == null) return;
        
        users.get(followerId).remove(followeeId);
    }
    
    
    public static void main(String [] args){
        
    }
}
