package ru.skillsad.sad.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.skillsad.sad.domain.user.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByName(String s);
}
