package com.userprofile.user_profile_demo.repositories;

import com.userprofile.user_profile_demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
