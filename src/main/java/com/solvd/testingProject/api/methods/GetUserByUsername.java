package com.solvd.testingProject.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${config.api_url}/users?username=${username}", methodType = HttpMethodType.GET)
@ResponseTemplatePath(path = "api/users/_get/get_user_rs.json")
public class GetUserByUsername extends AbstractApiMethodV2 {

    public GetUserByUsername(String username) {
        replaceUrlPlaceholder("username", username);
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
