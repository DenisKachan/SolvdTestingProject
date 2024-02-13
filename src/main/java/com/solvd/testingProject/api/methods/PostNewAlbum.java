package com.solvd.testingProject.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.RequestTemplatePath;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${config.api_url}/albums", methodType = HttpMethodType.POST)
@ResponseTemplatePath(path = "api/albums/_post/post_album_rs.json")
@RequestTemplatePath(path = "api/albums/_post/post_album_rq.json")
public class PostNewAlbum extends AbstractApiMethodV2 {

}
