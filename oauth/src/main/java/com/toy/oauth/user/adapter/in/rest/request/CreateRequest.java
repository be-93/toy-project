package com.toy.oauth.user.adapter.in.rest.request;

import com.toy.oauth.common.annotation.Password;
import com.toy.oauth.user.domain.constants.UserStatus;
import com.toy.oauth.user.domain.constants.UserType;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateRequest {
  @NotNull
  private String userId;
  @NotNull
  private String name;
  @NotNull
  @Password
  private String password;
  @NotNull
  private UserType type;
  private UserStatus status = UserStatus.ACTIVE;
}
