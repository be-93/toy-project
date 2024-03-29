package com.toy.oauth.user.adapter.out.persistence;

import com.toy.oauth.common.annotation.PersistenceAdapter;
import com.toy.oauth.user.adapter.out.persistence.entity.UserEntity;
import com.toy.oauth.user.adapter.out.persistence.mapstruct.UserPersistenceMapstruct;
import com.toy.oauth.user.adapter.out.persistence.repository.UserJPARepository;
import com.toy.oauth.user.application.port.out.UserCommandPort;
import com.toy.oauth.user.application.port.out.UserQueryPort;
import com.toy.oauth.user.domain.model.User;
import java.util.Optional;
import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class UserPersistenceAdapter implements UserQueryPort, UserCommandPort {

  private final UserPersistenceMapstruct userPersistenceMapstruct;
  private final UserJPARepository userJPARepository;

  @Override
  public User save(User user) {
    UserEntity saved = userJPARepository.save(userPersistenceMapstruct.toUserEntity(user));
    return userPersistenceMapstruct.toUser(saved);
  }

  @Override
  public Optional<User> findByUserId(String userId) {
    return userJPARepository.findByUserId(userId)
        .map(userPersistenceMapstruct::toUser);
  }

}
