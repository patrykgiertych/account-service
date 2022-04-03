package account.service;

import account.model.UserResponseView;
import account.model.UserView;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserResponseView createUser(UserView user) {
        return new UserResponseView(user);
    }
}
