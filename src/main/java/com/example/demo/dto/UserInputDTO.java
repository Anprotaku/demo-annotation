package com.example.demo.dto;


import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserInputDTO {

    // TRY here to see if properties are recognized.
    @Size(min = 4, max = 8, message = "{incorrectsize}")
    private String username;

}