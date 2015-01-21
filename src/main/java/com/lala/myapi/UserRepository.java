package com.lala.myapi;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository
 * @author ly
 * Create Time: 2014-12-28
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer> 
{

}
