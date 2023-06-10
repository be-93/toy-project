package com.toy.oauth.user.application.service;

import com.toy.oauth.common.annotation.UseCase;
import com.toy.oauth.user.adapter.out.persistence.entity.UserEntity;
import com.toy.oauth.user.adapter.in.rest.request.SignUpRequest;
import com.toy.oauth.user.application.port.in.UserUseCase;
import com.toy.oauth.user.application.port.out.UserEventPublisher;
import com.toy.oauth.user.application.port.out.UserOutPort;
import com.toy.oauth.user.domain.event.UserCreateEvent;
import com.toy.oauth.user.domain.model.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@UseCase
@RequiredArgsConstructor
@Transactional
public class UserService implements UserUseCase {

  private final UserOutPort userOutPort;
  private final UserEventPublisher userEventPublisher;

  @Override
  public User creat(User user) {
    User saved = userOutPort.save(user);
    userEventPublisher.create(new UserCreateEvent(saved.getId()));

    return saved;
  }
}
