package com.prakhar.chefkart.service.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.prakhar.chefkart.models.Post;
import com.prakhar.chefkart.models.User;
import com.prakhar.chefkart.repository.PostRepository;
import com.prakhar.chefkart.repository.UserRepository;
import com.prakhar.chefkart.service.APIService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIServiceImpl implements APIService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getUserPost(int userId) {
        return postRepository.findPostByUserId(userId);
    }

    @Override
    public Post postData(Post post) {
        Integer userId = post.getUserId();
        System.out.println("User id: " + userId);
        User user = userRepository.findUserById(userId);
        System.out.println("User: " + user);
        int oldVal = user.getPostCount();
        System.out.println("Old Post count value: " + oldVal);
        user.setPostCount(oldVal + 1);
        System.out.println("User after Post: " + user);
        userRepository.save(user);
        return postRepository.insert(post);
    }

    @Override
    public Post updatePost(Post post) {
        return postRepository.save(post);
    }

    @Override
    public void deletePost(Integer id) {
        postRepository.deleteById(id);
        return;
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public List<Post> getAllPost() {
        return postRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

}
