package com.example.parstagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("aVLxTNSWOUp1rvift6nwxafNK7CM78wAPumwBYCN")
                .clientKey("qvvkWIaq5d1w5NoC9CTsNCOF9YtiThPqDGvD7z1q")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
