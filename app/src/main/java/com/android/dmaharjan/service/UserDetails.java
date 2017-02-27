package com.android.dmaharjan.service;

import com.android.dmaharjan.model.User;

/**
 * Created by dmaharjan on 2/27/17.
 */

public interface UserDetails {
    User getUserDetails(String url, String username);
}
