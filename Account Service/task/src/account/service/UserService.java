package account.service;

import account.db.entity.User;
import account.db.exceptions.UserExistException;
import account.db.repository.UserRepository;
import account.model.UserResponseView;
import account.model.UserView;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;

    public UserResponseView createUser(UserView user) {
        return new UserResponseView(user);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username.toLowerCase())
                .orElseThrow(UserExistException::new);
    }
}
