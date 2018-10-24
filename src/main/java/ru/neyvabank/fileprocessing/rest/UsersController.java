package ru.neyvabank.fileprocessing.rest;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

    @GetMapping("/users")
    public List<UserDto> allUsers() {
        return Collections.singletonList(new UserDto() {{
            setId("1");
            setName("Serge");
        }});
    }
}