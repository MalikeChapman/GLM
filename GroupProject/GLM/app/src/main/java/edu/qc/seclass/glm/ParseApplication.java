package edu.qc.seclass.glm;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Item.class);
        ParseObject.registerSubclass(UserLists.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
        .applicationId("E98aek0Yjh9o6haaJ5bkPeqK91KvqBHvREkWPBmn")
        .clientKey("pXI3OaqWu8Cuq48w0v1Zcp0YF80uxjuo49DbazD9")
        .server("https://parseapi.back4app.com")
        .build());
    }
}
