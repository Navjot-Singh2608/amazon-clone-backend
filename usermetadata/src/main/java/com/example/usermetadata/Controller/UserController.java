package com.example.usermetadata.Controller;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/amazon/users/")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("saveUserDetails")
    public UserMetaData saveUserDetail(@RequestBody UserMetaData userData) {
        UserMetaData user= userService.saveUserMetaDataTODB(userData);
        return user;
    }

    @GetMapping("getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable String userId) {
        UserMetaData user=userService.getsUserDetailsFromDB(userId);
        return user;
    }
}