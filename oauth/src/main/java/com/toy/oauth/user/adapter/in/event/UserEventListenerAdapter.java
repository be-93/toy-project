package com.toy.oauth.user.adapter.in.event;

import com.toy.oauth.user.domain.event.UserCreateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserEventListenerAdapter {

  @EventListener
  public void createHandle(UserCreateEvent event){
    log.info("user created id : {} date : {}", event.getId(), event.getDate());
  }
  
}
