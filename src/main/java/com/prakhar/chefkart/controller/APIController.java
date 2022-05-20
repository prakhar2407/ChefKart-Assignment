package com.prakhar.chefkart.controller;

import java.util.List;

import com.prakhar.chefkart.models.Post;
import com.prakhar.chefkart.models.User;
import com.prakhar.chefkart.service.serviceImpl.APIServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class APIController {

    @Autowired
    private APIServiceImpl apiService;

    @GetMapping("/getUserPost/{userId}")
    public List<Post> getUserPost(@PathVariable("userId") Integer userId) {
        return apiService.getUserPost(userId);
    }

    @PostMapping("/addUser")
    public User postUser(@RequestBody User user) {
        return apiService.addUser(user);
    }

    @PostMapping("/postData")
    public Post postData(@RequestBody Post post) {
        return apiService.postData(post);
    }

    @PutMapping("/updatePost")
    public Post updatePost(@RequestBody Post post) {
        return apiService.updatePost(post);
    }

    @DeleteMapping("/deletePost/{id}")
    public void deletePost(@PathVariable("id") Integer id) {
        apiService.deletePost(id);
    }

    @GetMapping("/allPosts")
    public List<Post> allPosts() {
        return apiService.getAllPost();
    }

    @GetMapping("/allUsers")
    public List<User> allUsers() {
        return apiService.getAllUser();
    }

}
