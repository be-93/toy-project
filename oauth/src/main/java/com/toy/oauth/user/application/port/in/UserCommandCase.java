package com.toy.oauth.user.application.port.in;

import com.toy.oauth.user.application.port.in.command.CreateCommand;
import com.toy.oauth.user.domain.model.User;

public interface UserCommandCase {

  User create(CreateCommand command);

}
