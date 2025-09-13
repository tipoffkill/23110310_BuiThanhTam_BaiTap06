package vn.iostaranime.service;

import vn.iostaranime.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User save(User entity);
    void deleteById(int id);
    List<User> search(String keyword);
    User findById(int id);
    Optional<User> login(String username, String password);
}
