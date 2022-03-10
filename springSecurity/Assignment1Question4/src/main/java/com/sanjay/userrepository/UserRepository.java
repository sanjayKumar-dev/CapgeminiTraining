package com.sanjay.userrepository;

import org.springframework.data.jpa.repository.*;

import com.sanjay.user.User;
 
public interface UserRepository extends JpaRepository<User, Integer> {
         
    @Query("UPDATE User u SET u.failedAttempt = ?1 WHERE u.email = ?2")
    @Modifying
    public void updateFailedAttempts(int failAttempts, String email);
     
}