package com.emailvalidationapi.service;

import com.emailvalidationapi.model.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


public interface FriendsService extends CrudRepository<Friend, Integer>{
}
