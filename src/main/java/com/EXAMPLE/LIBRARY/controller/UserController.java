package com.EXAMPLE.LIBRARY.controller;

import com.EXAMPLE.LIBRARY.DTO.UserBookDTO;
import com.EXAMPLE.LIBRARY.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("books")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user-Books")
    public List<UserBookDTO> getAllUserBooks() {
        return userService.getAllUserBooks();

    }
}
