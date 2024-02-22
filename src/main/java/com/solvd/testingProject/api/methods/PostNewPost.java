package com.solvd.testingProject.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${config.api_url}/posts", methodType = HttpMethodType.POST)
@ResponseTemplatePath(path = "api/posts/_post/post_post_rs.json")
@RequestTemplatePath(path = "api/posts/_post/post_post_rq.json")
public class PostNewPost extends AbstractApiMethodV2 {

}
