package com.emailvalidationapi.controller;

import com.emailvalidationapi.model.Friend;
import com.emailvalidationapi.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FriendController {

    @Autowired
    FriendsService friendsService;

    @PostMapping("/post-friend")
    Friend create(@RequestBody Friend friend){
        Friend test=friendsService.save(friend);
        return test;
    }

    @PutMapping("/put-friend")
    Friend update(@RequestBody Friend friend){
        return friendsService.save(friend);
    }
    @GetMapping("/get-friend")
    Iterable<Friend> read(){
        Iterable<Friend> listOfFrnds = friendsService.findAll();
        return listOfFrnds;
    }
}
