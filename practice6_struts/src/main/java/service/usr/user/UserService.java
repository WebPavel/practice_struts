package service.usr.user;

import dao.usr.user.UserDao;
import entity.usr.user.User;
import exception.usr.user.LoginException;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();
    public User login(User user) throws LoginException {
        try {
            return userDao.find(user);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new LoginException("用户名或密码错误");
        }
    }

    public void save(User user) throws SQLException {
        userDao.save(user);
    }

    public List<User> findAll() throws SQLException {
        return userDao.findAll();
    }

    public List<User> findByCond(User user) throws SQLException {
        return userDao.findByCond(user);
    }

    public void delete(Integer id) throws SQLException {
        userDao.deleteById(id);
    }

    public User findById(Integer id) throws SQLException {
        return userDao.findById(id);
    }

    public void update(User user) throws SQLException {
        userDao.update(user);
    }
}
