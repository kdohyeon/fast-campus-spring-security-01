package fast.campus.fcss01.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.core.GrantedAuthority;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DannyUserTest {
    @Test
    void dannyUserTest() {
        // given & when
        DannyUser danny = new DannyUser();

        // then
        assertThat(danny.getUsername()).isEqualTo("danny.kim");
        assertThat(danny.getPassword()).isEqualTo("12345");
        assertThat(danny.getAuthorities().size()).isEqualTo(1);

        Optional<? extends GrantedAuthority> read = danny.getAuthorities()
                .stream()
                .filter(authority -> authority.getAuthority().equals("READ"))
                .findFirst();
        read.ifPresent(each -> assertThat(each.getAuthority()).isEqualTo("READ"));
    }

}