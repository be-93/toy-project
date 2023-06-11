package com.toy.oauth.user.application.service;

import com.toy.oauth.common.annotation.UseCase;
import com.toy.oauth.user.application.mapstruct.UserApplicationMapstruct;
import com.toy.oauth.user.application.port.in.UserCommandCase;
import com.toy.oauth.user.application.port.in.command.CreateCommand;
import com.toy.oauth.user.application.port.out.UserCommandPort;
import com.toy.oauth.user.application.port.out.UserEventPublisherPort;
import com.toy.oauth.user.application.port.out.UserQueryPort;
import com.toy.oauth.user.domain.event.UserCreateEvent;
import com.toy.oauth.user.domain.exception.InvalidUserProcessException;
import com.toy.oauth.user.domain.model.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@UseCase
@RequiredArgsConstructor
@Transactional
public class UserService implements UserCommandCase {

  private final UserQueryPort userQueryPort;
  private final UserCommandPort userCommandPort;
  private final UserEventPublisherPort userEventPublisherPort;
  private final UserApplicationMapstruct userApplicationMapstruct;

  @Override
  public User create(CreateCommand command) {
    userQueryPort.findByUserId(command.getUserId())
        .ifPresent(it -> {
          throw new InvalidUserProcessException();
        });

    User saved = userCommandPort.save(userApplicationMapstruct.toUser(command));
    userEventPublisherPort.create(new UserCreateEvent(saved.getId()));

    return saved;
  }
}
