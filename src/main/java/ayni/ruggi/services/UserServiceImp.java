package ayni.ruggi.services;

import ayni.ruggi.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by ruggi on 8/5/17.
 */
@Service
public class UserServiceImp implements UserService{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void saveOrUpdate(User user) {

    }

    @Override
    public void delete(int userId) {
      String sql = "DELETE FROM userayni WHERE contact_id=?";
      jdbcTemplate.update(sql, userId);
    }

    @Override
    public User get(int userId) {
      String sql = "SELECT * FROM contact WHERE contact_id=" + userId;
      return jdbcTemplate.query(sql, new ResultSetExtractor<User>() {

        @Override
        public User extractData(ResultSet rs) throws SQLException,
                DataAccessException {
          if (rs.next()) {
            User contact = new User();
            // completar con más cosas
            contact.setPassword(rs.getString("password"));
            contact.setEmail(rs.getString("email"));
            return contact;
          }

          return null;
        }

      });
    }

    @Override
    public List<User> list() {
        return null;
    }
}
