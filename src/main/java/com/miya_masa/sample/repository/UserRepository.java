package com.miya_masa.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miya_masa.sample.domain.User;

public interface UserRepository extends JpaRepository<User, String> {

}
