package This.is.user.service.service.impl;

import This.is.user.service.entites.User;
import This.is.user.service.excepation.ResourceNotFoundException;
import This.is.user.service.repo.UserRepo;
import This.is.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo UserRepo;

    @Override
    public User savedUser(User user) {

        // generate unique id
        String randomUserId = UUID.randomUUID().toString();
        user.setUserId(randomUserId);
        return UserRepo.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return UserRepo.findAll();
    }

    @Override
    public User getUser(String userId) {
        return UserRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User with given id not found on server !! :"+userId));
    }
}
