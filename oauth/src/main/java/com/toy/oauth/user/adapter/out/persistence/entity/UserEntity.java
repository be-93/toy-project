package com.toy.oauth.user.adapter.out.persistence.entity;

import com.toy.oauth.common.domain.entity.BaseEntity;
import com.toy.oauth.user.domain.constants.UserStatus;
import com.toy.oauth.user.domain.constants.UserType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "user_id", length = 30, unique = true)
  private String userId;

  @Column(name = "name", length = 20)
  private String name;

  @Column(name = "password", length = 50)
  private String password;

  @Column(name = "type", length = 30)
  private UserType type;

  @Column(name = "status", length = 10)
  private UserStatus status;
}
