package com.madeeasy.actuator.controller;

import com.madeeasy.actuator.entity.UserEntity;
import com.madeeasy.actuator.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ActuatorController {

   @Autowired
   private UserService userService;

   @PostMapping(path = "/save-user")
   public UserEntity saveUser(@RequestBody UserEntity userEntity) {
      return userService.saveUser(userEntity);
   }

   @GetMapping(path = "/get-user/{id}")
   public UserEntity getUser(@PathVariable Long id) {
      return userService.getUser(id);
   }
}
