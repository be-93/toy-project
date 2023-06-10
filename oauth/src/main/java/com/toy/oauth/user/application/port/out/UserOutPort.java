package com.toy.oauth.user.application.port.out;

import com.toy.oauth.user.domain.model.User;

public interface UserOutPort {

  User save(User user);

}
