package account.api;

import account.model.UserResponseView;
import account.model.UserView;
import account.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/api/auth")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping("/signup/")
    public ResponseEntity<UserResponseView> createUser(@Valid @RequestBody UserView user) {
        return ResponseEntity.ok(this.service.createUser(user));
    }

}
