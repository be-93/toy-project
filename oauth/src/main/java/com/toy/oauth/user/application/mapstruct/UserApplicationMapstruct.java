package com.toy.oauth.user.application.mapstruct;

import com.toy.oauth.user.adapter.in.rest.request.CreateRequest;
import com.toy.oauth.user.adapter.in.rest.response.UserResponse;
import com.toy.oauth.user.application.port.in.command.CreateCommand;
import com.toy.oauth.user.domain.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserApplicationMapstruct {

  User toUser(CreateCommand command);

}
