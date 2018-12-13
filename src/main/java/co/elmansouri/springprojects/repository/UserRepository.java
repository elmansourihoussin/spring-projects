package co.elmansouri.springprojects.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.elmansouri.springprojects.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
