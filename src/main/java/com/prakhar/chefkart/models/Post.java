package com.prakhar.chefkart.models;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("Post")
public class Post {
    @Id
    Integer _id;

    String title;

    String description;

    Integer userId;

    String[] images;

    public Post() {
    }

    public Post(Integer _id, String title, String description, Integer userId, String[] images) {
        this._id = _id;
        this.title = title;
        this.description = description;
        this.userId = userId;
        this.images = images;
    }

    public Integer getId() {
        return _id;
    }

    public void setId(Integer _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String[] getImages() {
        return images;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "Post [description=" + description + ", _id=" + _id + ", images=" + Arrays.toString(images) + ", title="
                + title + ", userId=" + userId + "]";
    }
}
