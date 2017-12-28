package com.zipcode.transcurrency.Transcurrency.repositories;

import com.zipcode.transcurrency.Transcurrency.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Long> {
}
