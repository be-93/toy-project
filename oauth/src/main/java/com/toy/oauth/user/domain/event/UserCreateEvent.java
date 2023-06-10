package com.toy.oauth.user.domain.event;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserCreateEvent {

  private Long id;
  private LocalDateTime date;

  public UserCreateEvent(Long id) {
    this.id = id;
    this.date = LocalDateTime.now();
  }
}
