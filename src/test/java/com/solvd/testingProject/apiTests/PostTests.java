package com.solvd.testingProject.apiTests;

import com.solvd.testingProject.api.methods.GetPostByTitle;
import com.solvd.testingProject.api.methods.PostNewPost;
import com.solvd.testingProject.api.models.Post;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class PostTests {

    @Test
    public void validateGetPostByTitleTest() {
        Post post = new Post();
        post.setTitle("qui est esse");
        post.setBody("est rerum tempore vitae\\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\\nqui aperiam non debitis possimus qui neque nisi nulla");
        GetPostByTitle getPostByTitle = new GetPostByTitle(post.getTitle());
        getPostByTitle.addProperty("post", post);
        getPostByTitle.expectResponseStatus(HttpResponseStatusType.OK_200);
        getPostByTitle.callAPI();
        getPostByTitle.validateResponse();
    }

    @Test
    public void validatePostNewPostTest() {
        PostNewPost postNewPost = new PostNewPost();
        postNewPost.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postNewPost.callAPI();
        postNewPost.validateResponse();
    }
}
