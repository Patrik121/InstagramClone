package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JzkyFI1NWEXj5v0kTITDMwy6WgR7GNRexWK5pMoE")
                // if defined
                .clientKey("SSC5LODQicUimOmf7tenpfaWHg00K172CwvR7xvT")
                .server("https://parseapi.back4app.com/")
                .build()
        );


    }
}
