package com.emailvalidationapi.controller;

import com.emailvalidationapi.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class MessageController {

    @GetMapping("/message")
    Message send(){
        return new Message("Hello here is first message :");

    }
    @PostMapping("/message")
    Message echo(@RequestBody Message message){
        return message;//("Hey here post method call ");
    }


}
//DB details
//SYSTEM
//Mahesh@1715
//Oracle Enterprise Manager Database Express URL: https://localhost:5500/em