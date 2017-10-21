package com.longen.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.longen.boot.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByName(String userName);

	User findById(long id);

	Long deleteById(Long id);

}
