package com.ead.course.dtos;

import com.ead.course.enums.UserStatus;
import lombok.Data;

@Data
public class UserDto {
    private UUID userId;
    private String username;
    private String email;
    private String fullName;
    private UserStatus userStatus;
    private String phoneNumber;
    private String cpf;
    private String imageUrl;

}
