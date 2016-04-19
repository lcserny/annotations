package com.teamtreehouse.suppresswarnings;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        System.out.print("How many posts? ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Get number of posts
        int numPosts = Integer.parseInt(reader.readLine());

        // Fetch latest posts
        List<Post> posts = Blog.getLatestPosts(numPosts);

        switch (numPosts) {
            case 0:
                // Display message
                System.out.println("No posts");
            case 1:
                // Display post
                System.out.println(posts.get(0));
                break;
            default:
                // Display posts with separators
                for (Post post : posts) {
                    System.out.println(post);
                    System.out.println("==================");
                }
                break;
        }
    }
}