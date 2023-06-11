package com.toy.oauth.user.application.port.out;

import com.toy.oauth.user.domain.model.User;
import java.util.Optional;

public interface UserQueryPort {

  Optional<User> findByUserId(String userId);

}
