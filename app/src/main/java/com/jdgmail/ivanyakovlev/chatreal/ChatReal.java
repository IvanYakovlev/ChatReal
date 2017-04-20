package com.jdgmail.ivanyakovlev.chatreal;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by venom on 22.03.2017.
 */


public class ChatReal extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}