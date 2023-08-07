package com.example.usermetadata.Repository;

import com.example.usermetadata.Entity.UserMetaData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<UserMetaData, Long> {

    UserMetaData save(UserMetaData userdata);
    UserMetaData findAllByuniqueId(String uniqueId);

}