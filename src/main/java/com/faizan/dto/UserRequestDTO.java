package com.faizan.dto;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserRequestDTO {
    @NotNull(message = "name cant be null")
    private String name;

    private String password;

    private String contactNumber;

    private String email;

    private String state;

    private String city;

    @Override
    public String toString() {
        return "UserRequestDTO [name=" + name + ", password=" + password + ", contactNumber=" + contactNumber + ", email=" + email + ", state=" + state + ", city=" + city + "]";
    }

}
