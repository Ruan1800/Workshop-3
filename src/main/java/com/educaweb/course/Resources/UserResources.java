package com.educaweb.course.Resources;

import com.educaweb.course.entites.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "ruan","rrjalfim@gmail.com","0999999999999999","123344");
        return  ResponseEntity.ok().body(u);
    }
}
