package com.poly;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {
	@Query(value = " select * from usersss where usersss.email like ?1 ", nativeQuery = true)
	public User findByEmail(String email);
	
}
