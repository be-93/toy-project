package com.toy.oauth.user.adapter.out.persistence.mapstruct;

import com.toy.oauth.user.adapter.in.rest.request.SignUpRequest;
import com.toy.oauth.user.adapter.in.rest.response.UserResponse;
import com.toy.oauth.user.adapter.out.persistence.entity.UserEntity;
import com.toy.oauth.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserPersistenceMapstruct {

  UserEntity toUserEntity(User user);

  User toUser(UserEntity user);

}
