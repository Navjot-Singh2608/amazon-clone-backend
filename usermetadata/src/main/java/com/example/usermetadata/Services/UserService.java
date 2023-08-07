package com.example.usermetadata.Services;

import com.example.usermetadata.Entity.UserMetaData;
import com.example.usermetadata.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepo userRepo;

    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
        return userRepo.save(metaData);
        //return new UserMetaData();
    }

    public UserMetaData getsUserDetailsFromDB(String userId) {
        return userRepo.findAllByuniqueId(userId);
        //return new UserMetaData();
    }






}
