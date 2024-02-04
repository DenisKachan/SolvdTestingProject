package com.solvd.testingProject.apiTests;

import com.solvd.testingProject.api.methods.GetUserByUsername;
import com.solvd.testingProject.api.models.Address;
import com.solvd.testingProject.api.models.Company;
import com.solvd.testingProject.api.models.Geo;
import com.solvd.testingProject.api.models.User;
import com.zebrunner.carina.api.http.HttpResponseStatusType;
import org.testng.annotations.Test;

public class UserTests {

    @Test
    public void validateGetUserByUsernameTest() {
        User user = new User();
        Address address = new Address();
        Geo geo = new Geo();
        Company company = new Company();
        geo.setLat("-68.6102");
        geo.setLng("-47.0653");
        address.setStreet("Douglas Extension");
        address.setSuite("Suite 847");
        address.setCity("McKenziehaven");
        address.setZipcode("59590-4157");
        address.setGeo(geo);
        company.setName("Romaguera-Jacobson");
        company.setCatchPhrase("Face to face bifurcated interface");
        company.setBs("e-enable strategic applications");
        user.setName("Clementine Bauch");
        user.setUsername("Samantha");
        user.setEmail("Nathan@yesenia.net");
        user.setAddress(address);
        user.setPhone("1-463-123-4447");
        user.setWebsite("ramiro.info");
        user.setCompany(company);

        GetUserByUsername getUserByUsername = new GetUserByUsername(user.getUsername());
        getUserByUsername.addProperty("user", user);
        getUserByUsername.addProperty("address", address);
        getUserByUsername.addProperty("geo", geo);
        getUserByUsername.addProperty("company", company);
        getUserByUsername.expectResponseStatus(HttpResponseStatusType.OK_200);
        getUserByUsername.callAPI();
        getUserByUsername.validateResponse();
    }
}
