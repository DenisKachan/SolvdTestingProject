package com.solvd.testingProject.api.methods;

import com.zebrunner.carina.api.AbstractApiMethodV2;
import com.zebrunner.carina.api.annotation.Endpoint;
import com.zebrunner.carina.api.annotation.ResponseTemplatePath;
import com.zebrunner.carina.api.apitools.builder.NotStringValuesProcessor;
import com.zebrunner.carina.api.http.HttpMethodType;

@Endpoint(url = "${config.api_url}/albums/title=${title}", methodType = HttpMethodType.DELETE)
@ResponseTemplatePath(path = "api/albums/_delete/delete_album_rs.json")
public class DeleteAlbumByTitle extends AbstractApiMethodV2 {

    public DeleteAlbumByTitle(String title) {
        replaceUrlPlaceholder("title", title);
        ignorePropertiesProcessor(NotStringValuesProcessor.class);
    }
}
