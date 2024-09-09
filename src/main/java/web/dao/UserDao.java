package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(Long id, User user);
    void delete(Long id);
}
