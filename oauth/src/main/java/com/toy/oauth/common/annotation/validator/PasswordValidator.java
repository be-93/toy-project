package com.toy.oauth.common.annotation.validator;

import com.toy.oauth.common.annotation.Password;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import org.springframework.stereotype.Component;

@Component
public class PasswordValidator implements ConstraintValidator<Password, String> {

  private static final int MIN_SIZE = 8;
  private static final int MAX_SIZE = 50;
  private static final String REGEX_PASSWORD =
      "^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{" + MIN_SIZE + "," + MAX_SIZE + "}$";

  @Override
  public boolean isValid(String password, ConstraintValidatorContext context) {
    return password.matches(REGEX_PASSWORD);
  }

  public boolean isValid(String password) {
    return password.matches(REGEX_PASSWORD);
  }

}
