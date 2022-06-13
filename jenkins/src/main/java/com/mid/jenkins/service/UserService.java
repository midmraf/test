package com.mid.jenkins.service;

import com.mid.jenkins.entity.Users;
import com.mid.jenkins.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public Users save(Users users) {
        Users dataRes = userRepo.save(users);
        return dataRes;
    }

    public Users getById(Long id) {
        Users dataRes = userRepo.findById(id).get();
        return dataRes;
    }

}
