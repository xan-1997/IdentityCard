package com.identitycard.demo.repository;

import com.identitycard.demo.entity.UserPhone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPhoneRepository extends JpaRepository<UserPhone, Long> {
}
