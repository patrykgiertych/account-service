package account.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserView {

    @NotEmpty
    private String name;
    @NotEmpty
    private String lastname;
    @Pattern(regexp = ".+@acme.com")
    private String email;
    @NotEmpty
    private String password;

}
