package com.toy.oauth.user.adapter.out.persistence.repository;

import com.toy.oauth.user.adapter.out.persistence.entity.UserEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJPARepository extends JpaRepository<UserEntity, Long> {

  Optional<UserEntity> findByUserId(String userId);

}
