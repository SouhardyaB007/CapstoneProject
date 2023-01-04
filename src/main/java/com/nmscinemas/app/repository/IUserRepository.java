package com.nmscinemas.app.repository;

import com.nmscinemas.app.beans.User;
import org.apache.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {
	
	User findByUsername(String username);
	
	@Query(nativeQuery = true , value = "select * from user_table8 where USERNAME= :username AND PASSWORD= :password")
	public User checkUserCredential(@Param("username") String username,@Param("password") String password);

}
