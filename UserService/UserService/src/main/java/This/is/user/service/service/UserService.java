package This.is.user.service.service;

import This.is.user.service.entites.User;

import java.util.List;

public interface UserService {

    // user operations

    //create
    User savedUser(User user);

    //getAll user
    List<User> getAllUser();

    //get single user of given userId;
    User getUser(String userId);

}
