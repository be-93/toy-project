package com.toy.oauth.user.adapter.in.rest.mapstruct;

import com.toy.oauth.user.adapter.in.rest.request.SignUpRequest;
import com.toy.oauth.user.adapter.in.rest.response.UserResponse;
import com.toy.oauth.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserRestMapstruct {

  User toUser(SignUpRequest request);

  UserResponse toResponse(User user);

}
