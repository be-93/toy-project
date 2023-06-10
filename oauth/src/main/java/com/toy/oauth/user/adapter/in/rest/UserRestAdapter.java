package com.toy.oauth.user.adapter.in.rest;

import com.toy.oauth.common.annotation.RestAdapter;
import com.toy.oauth.user.adapter.in.rest.mapstruct.UserRestMapstruct;
import com.toy.oauth.user.application.port.in.UserUseCase;
import com.toy.oauth.user.adapter.in.rest.response.UserResponse;
import com.toy.oauth.user.adapter.in.rest.request.SignUpRequest;
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
  private final UserUseCase userUseCase;

  @PostMapping
  public ResponseEntity<UserResponse> create(@RequestBody @Valid SignUpRequest request) {
    User saved = userUseCase.creat(userRestMapstruct.toUser(request));
    return ResponseEntity.ok(userRestMapstruct.toResponse(saved));
  }

}
