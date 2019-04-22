package dao.usr.user;

import entity.usr.user.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DbUtils;
import utils.StringUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private QueryRunner queryRunner = new QueryRunner(DbUtils.getDataSource());

    /**
     * 登录
     * @param user
     * @return
     * @throws SQLException
     */
    public User find(User user) throws SQLException {
        String sql = "select * from usr_user where username=? and password=?";
        Object[] params = {user.getUsername(), user.getPassword()};
        return queryRunner.query(sql, new BeanHandler<User>(User.class), params);
    }

    public List<User> findAll() throws SQLException {
        String sql = "select * from usr_user";
        return queryRunner.query(sql, new BeanListHandler<User>(User.class));
    }

    public int save(User user) throws SQLException {
        String sql = "insert into usr_user values(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Object[] params = {user.getUsername(), user.getNickname(), user.getPassword(), user.getGender(), user.getBirthday(), user.getTelephone(), user.getEducation(), user.getHobby(), user.getPath(), user.getFilename(), user.getRemark()};
        return queryRunner.update(sql, params);
    }

    public List<User> findByCond(User user) throws SQLException {
        String sql = "select * from usr_user where 1=1 ";
        List<Object> params = new ArrayList<Object>();
        String username = user.getUsername();
        if (!StringUtils.isBlank(username)) {
            sql += " and username like ?";
            params.add("%" + username + "%");
        }
        String gender = user.getGender();
        if (!StringUtils.isBlank(gender)) {
            sql += " and gender = ?";
            params.add(gender);
        }
        String education = user.getEducation();
        if (!StringUtils.isBlank(education)) {
            sql += " and education = ?";
            params.add(education);
        }
        String isUpload = user.getIsUpload();
        if ("0".equals(isUpload)) {
            sql += " and filename is null";
        } else if ("1".equals(isUpload)) {
            sql += " and filename is not null";
        }
        System.out.println("findByCond sql: " + sql);
        return queryRunner.query(sql, new BeanListHandler<User>(User.class), params.toArray());
    }

    public int deleteById(Integer id) throws SQLException {
        String sql = "delete from usr_user where id = ?";
        return queryRunner.update(sql, id);
    }

    public User findById(Integer id) throws SQLException {
        String sql = "select * from usr_user where id = ?";
        return queryRunner.query(sql, new BeanHandler<User>(User.class), id);
    }
}
