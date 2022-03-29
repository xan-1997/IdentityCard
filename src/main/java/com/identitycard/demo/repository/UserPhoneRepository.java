package com.identitycard.demo.repository;

import com.identitycard.demo.entity.UserPhone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserPhoneRepository extends JpaRepository<UserPhone, Long> {
//        @Query(nativeQuery = true, name = "select u.id, p.phone_number\n" +
//                "from user u\n" +
//                "left join user_phone p\n" +
//                "on u.id = p.user_id where u.id = ?1")
        List<UserPhone> getUserPhonesByUserId(Long id);

}
