package com.pyildizt.sony.englishword;

/**
 * Created by Rabia on 7.12.2017.
 */

public class Words {

    public String tr;
    public String en;

    public Words() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public Words(String turkce, String english) {
        this.tr = turkce;
        this.en = english;
    }
}
