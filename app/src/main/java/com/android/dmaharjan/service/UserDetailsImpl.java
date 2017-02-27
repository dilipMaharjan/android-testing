package com.android.dmaharjan.service;

import com.android.dmaharjan.model.User;

/**
 * Created by dmaharjan on 2/27/17.
 */

public class UserDetailsImpl implements UserDetails {
    @Override
    public User getUserDetails(String url, String username) {
        return new User(1, "Dilip", "Maharjan", "android-developer", "dilip@dilip.com");
    }
}
