package com.identitycard.demo.repository;

import com.identitycard.demo.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {

}
