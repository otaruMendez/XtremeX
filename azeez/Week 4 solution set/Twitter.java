/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xtremehackerprep;

import java.util.*;
import javafx.util.Pair;

public class Twitter {

    /**
     * Initialize your data structure here.
     */
    ArrayList<Pair<Integer, Integer>> newsFeed = new ArrayList<>();
  //  LinkedHashMap<Object, Object> x = new LinkedHashMap<>();

    ArrayList<Pair<Integer, Integer>> userRelation = new ArrayList<>();

    public Twitter() {
    }

    /**
     * Compose a new tweet.
     */
    public void postTweet(int userId, int tweetId) {
        newsFeed.add(new Pair(userId, tweetId));
    }

    /**
     * Retrieve the 10 most recent tweet ids in the user's news feed. Each item
     * in the news feed must be posted by users who the user followed or by the
     * user herself. Tweets must be ordered from most recent to least recent.
     */
    public List<Integer> getNewsFeed(int userId) {
        ArrayList<Integer> followers = getFollowers(userId);

        ArrayList<Integer> userFeed = new ArrayList<>();

        int count = 0;
        for (int i = newsFeed.size() - 1; i >= 0; --i) {
            if (count == 10) {
                break;
            }
            Pair newsFeedPair = newsFeed.get(i);
            int id_of_user = (int) newsFeedPair.getKey();
            if (followers.contains(id_of_user) || id_of_user == userId) {
                ++count;
                userFeed.add((int) newsFeedPair.getValue());
            }
        }
        return userFeed;
    }

    /**
     * Follower follows a followee. If the operation is invalid, it should be a
     * no-op.
     */
    public void follow(int followerId, int followeeId) {
        userRelation.add(new Pair(followerId, followeeId));
    }

    /**
     * Follower unfollows a followee. If the operation is invalid, it should be
     * a no-op.
     */
    public void unfollow(int followerId, int followeeId) {
        for (int i = 0; i < userRelation.size(); ++i) {
            Pair s = userRelation.get(i);
            if ((int) s.getKey() == followerId && (int) s.getValue() == followeeId) {
                userRelation.remove(i);

            }
        }
    }

    public ArrayList<Integer> getFollowers(int userId) {
        ArrayList<Integer> followers = new ArrayList<>();
        for (Pair s : userRelation) {
            if ((int) s.getKey() == userId) {
                followers.add((int) s.getValue());
            }
        }
        return followers;
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        twitter.postTweet(1, 101);
        twitter.postTweet(1, 13);
        twitter.postTweet(1, 10);
        twitter.postTweet(1, 2);
        twitter.postTweet(1, 94);
        twitter.postTweet(1, 505);
        twitter.postTweet(1, 133);
        twitter.postTweet(1, 22);
        twitter.postTweet(1, 11);

        List<Integer> s = twitter.getNewsFeed(1);
        System.out.println(s);

//       // User 1 follows user 2.
//        twitter.follow(1, 2);
//
//// User 2 posts a new tweet (id = 6).
//        twitter.postTweet(2, 6);
//
//// User 1's news feed should return a list with 2 tweet ids -> [6, 5].
//// Tweet id 6 should precede tweet id 5 because it is posted after tweet id 5.
//         List<Integer> s2 =twitter.getNewsFeed(1);
//         System.out.println(s2);
//
//// User 1 unfollows user 2.
//        twitter.unfollow(1, 2);
////
////// User 1's news feed should return a list with 1 tweet id -> [5],
////// since user 1 is no longer following user 2.
//         List<Integer> s3 = twitter.getNewsFeed(1);
//         System.out.println(s3);
    }
}
