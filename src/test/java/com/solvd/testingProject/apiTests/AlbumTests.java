package com.solvd.testingProject.apiTests;

import com.solvd.testingProject.api.methods.DeleteAlbumByTitle;
import com.solvd.testingProject.api.methods.PostNewAlbum;
import com.solvd.testingProject.api.models.Album;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class AlbumTests {

    @Test
    public void validatePostNewAlbumTest() {
        PostNewAlbum postNewAlbum = new PostNewAlbum();
        postNewAlbum.expectResponseStatus(HttpResponseStatusType.CREATED_201);
        postNewAlbum.callAPI();
        postNewAlbum.validateResponse();
    }

    @Test
    public void validateDeleteAlbumByTitleTest() {
        Album album = new Album();
        album.setTitle("omnis laborum odio");
        DeleteAlbumByTitle deleteAlbumByTitle = new DeleteAlbumByTitle(album.getTitle());
        deleteAlbumByTitle.expectResponseStatus(HttpResponseStatusType.OK_200);
        deleteAlbumByTitle.callAPI();
        deleteAlbumByTitle.validateResponse();
    }
}
