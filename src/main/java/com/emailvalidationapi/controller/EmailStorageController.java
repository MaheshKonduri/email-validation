package com.emailvalidationapi.controller;

import com.emailvalidationapi.dto.EmailStorage;
import com.emailvalidationapi.model.Friend;
import com.emailvalidationapi.repository.EmailStorageRepository;
import com.emailvalidationapi.service.EmailStorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmailStorageController {

    @Autowired
    EmailStorageService emailStorageService;

    @Autowired
    EmailStorageRepository emailStorageRepository;

    /*@PostMapping("/post-friend")
    EmailStorage create(@RequestBody EmailStorage emailStorage){
        EmailStorage emailStorage1=emailStorageRepository.findByEmailID(emailStorage1.getEmailID());
        return emailStorage;
    }*/

    @RequestMapping(value = "/emailcheck", method = RequestMethod.POST)
    public HttpStatus insertPersone(@RequestBody EmailStorage emailStorage) {
        return emailStorageService.addPerson(emailStorage) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
    }
}
