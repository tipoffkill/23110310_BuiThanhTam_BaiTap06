package vn.iostaranime.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.iostaranime.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    
    Optional<User> findByUsernameAndPassword(String username, String password);


    List<User> findByUsernameContaining(String keyword);

    List<User> findByFullNameContainingIgnoreCase(String keyword);
}


