package fast.campus.fcss01.controller;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/v1/hello")
    public String hello() {
        UserDetails user = User.withUsername("danny.kim")
                .password("12345")
                .authorities("READ")
                .build();
        return "Hello, Spring Security";
    }
}
