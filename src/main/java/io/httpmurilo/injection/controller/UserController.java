package io.httpmurilo.injection.controller;

import io.httpmurilo.injection.model.User;
import io.httpmurilo.injection.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private IUserRepository repository;

    @GetMapping(value = "/search")
    public ResponseEntity<User> findByName(@RequestParam String name) {
        var user = repository.getUserByName(name);
        return ResponseEntity.ok((User) user);
    }
}