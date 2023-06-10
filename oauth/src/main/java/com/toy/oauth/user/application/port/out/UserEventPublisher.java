package com.toy.oauth.user.application.port.out;

import com.toy.oauth.user.domain.event.UserCreateEvent;

public interface UserEventPublisher {

  void create(UserCreateEvent event);

}
