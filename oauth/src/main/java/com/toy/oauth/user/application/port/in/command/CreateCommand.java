package com.toy.oauth.user.application.port.in.command;

import com.toy.oauth.user.domain.constants.UserStatus;
import com.toy.oauth.user.domain.constants.UserType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateCommand {
  private String userId;
  private String name;
  private String password;
  private UserType type;
  private UserStatus status;
}
