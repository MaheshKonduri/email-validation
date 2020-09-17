package com.emailvalidationapi.service;

import com.emailvalidationapi.dto.EmailStorage;
import com.emailvalidationapi.repository.EmailStorageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmailStorageService {

    @Autowired
    EmailStorageRepository<EmailStorage> emailStorageRepository;

    @Transactional
    public boolean addPerson(EmailStorage emailStorage) {
        return emailStorageRepository.save(emailStorage) != null;
    }

    @Transactional
    public List<EmailStorage> getAllPersons() {
        return (List<EmailStorage>) emailStorageRepository.findAll();
    }
}
