package com.prakhar.chefkart.service;

import java.util.List;
import com.prakhar.chefkart.models.Post;
import com.prakhar.chefkart.models.User;

public interface APIService {
    public List<Post> getUserPost(int userId);

    public Post postData(Post post);

    public Post updatePost(Post post);

    public User addUser(User user);

    public void deletePost(Integer id);

    public List<User> getAllUser();

    public List<Post> getAllPost();

}
