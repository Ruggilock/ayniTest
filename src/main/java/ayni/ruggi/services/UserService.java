package ayni.ruggi.services;

import ayni.ruggi.entities.User;

import java.util.List;

/**
 * Created by ruggi on 8/5/17.
 */
public interface UserService {

    void saveOrUpdate(User user);

    void delete(int userId);

    User get(int userId);

    List<User> list();
}
