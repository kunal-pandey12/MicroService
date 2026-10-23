package This.is.user.service.controller;

import This.is.user.service.entites.User;
import This.is.user.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService UserService;

    // create
    @PostMapping
    public ResponseEntity<User> create(@RequestBody User user){
        User user1 = UserService.savedUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    // single user get
    @GetMapping("/userId")
    public ResponseEntity<User> getSingleUser(String userId){
       User user = UserService.getUser(userId);
        return ResponseEntity.ok(user);
    }

    // getAll user
    @GetMapping
    public ResponseEntity<List<User>>getAll(){
        List<User> allUser=UserService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

}
