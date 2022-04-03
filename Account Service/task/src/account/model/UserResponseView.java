package account.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserResponseView {

    private String name;
    private String lastname;
    private String email;

    public UserResponseView(UserView user) {
        this.name = user.getName();
        this.lastname = user.getLastname();
        this.email = user.getEmail();
    }
}
