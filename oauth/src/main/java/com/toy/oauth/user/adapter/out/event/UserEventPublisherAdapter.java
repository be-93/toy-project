package com.toy.oauth.user.adapter.out.event;

import com.toy.oauth.common.annotation.EventPublisherAdapter;
import com.toy.oauth.user.application.port.out.UserEventPublisher;
import com.toy.oauth.user.domain.event.UserCreateEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@EventPublisherAdapter
@RequiredArgsConstructor
public class UserEventPublisherAdapter implements UserEventPublisher {

  private final ApplicationEventPublisher publisher;

  @Override
  public void create(UserCreateEvent event) {
    publisher.publishEvent(event);
  }

}
