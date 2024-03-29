package com.toy.oauth.user.domain.model;

import com.toy.oauth.user.domain.constants.UserStatus;
import com.toy.oauth.user.domain.constants.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Long id;
  private String userId;
  private String name;
  private String password;
  private UserType type;
  private UserStatus status;

}
