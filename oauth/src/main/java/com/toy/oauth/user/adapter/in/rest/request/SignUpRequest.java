package com.toy.oauth.user.adapter.in.rest.request;

import com.toy.oauth.common.annotation.Password;
import com.toy.oauth.user.adapter.out.persistence.entity.UserEntity;
import com.toy.oauth.user.domain.model.User;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
  @NotNull
  private String userId;
  @NotNull
  private String name;
  @NotNull
  @Password
  private String password;

}
