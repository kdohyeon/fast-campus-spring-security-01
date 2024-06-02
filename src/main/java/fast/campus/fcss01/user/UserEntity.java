package fast.campus.fcss01.user;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class UserEntity {
    @Id
    private Long id;

    private String username;
    private String password;
    private String authority;
}
