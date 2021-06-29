package com.example.demo.registration;

import lombok.*;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest { // this format decide the JSON format given by server
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
}
