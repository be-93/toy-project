package com.toy.oauth.user.adapter.in.rest;

import com.toy.oauth.common.annotation.RestAdapter;
import com.toy.oauth.user.adapter.in.rest.mapstruct.UserRestMapstruct;
import com.toy.oauth.user.application.port.in.UserCommandCase;
import com.toy.oauth.user.adapter.in.rest.response.UserResponse;
import com.toy.oauth.user.adapter.in.rest.request.CreateRequest;
import com.toy.oauth.user.domain.model.User;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestAdapter
@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserRestAdapter {

  private final UserRestMapstruct userRestMapstruct;
  private final UserCommandCase userCommandCase;

  @PostMapping
  public ResponseEntity<UserResponse> create(@RequestBody @Valid CreateRequest request) {
    User saved = userCommandCase.create(userRestMapstruct.toCreateCommand(request));
    return ResponseEntity.ok(userRestMapstruct.toResponse(saved));
  }

}
