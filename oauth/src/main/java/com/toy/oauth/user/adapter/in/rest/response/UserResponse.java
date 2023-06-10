package com.toy.oauth.user.adapter.in.rest.response;

import com.toy.oauth.user.domain.model.User;
import lombok.Builder;

@Builder
public record UserResponse(String userId, String name, String password) {

}
