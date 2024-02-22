package com.solvd.testingProject.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${config.api_url}/posts?title=${title}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/posts/_get/get_post_rs.json")
public class GetPostByTitle extends AbstractApiMethodV2 {

    public GetPostByTitle(String title) {
        replaceUrlPlaceholder("title", title);
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
