package com.emailvalidationapi.repository;

import com.emailvalidationapi.dto.EmailStorage;
import com.emailvalidationapi.model.Friend;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmailStorageRepository<p> extends CrudRepository<EmailStorage, String> {
    List<EmailStorage> findByEmailID(String emailID);
}
