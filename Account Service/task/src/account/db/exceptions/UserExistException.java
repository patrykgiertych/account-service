package account.db.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Some error meassage")
public class UserExistException extends UsernameNotFoundException {

    public UserExistException() {
        super("User not found");
    }
}
