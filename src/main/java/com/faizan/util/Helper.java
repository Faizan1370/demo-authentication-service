package com.faizan.util;

import java.util.Objects;

import com.faizan.dto.UserRequestDTO;
import com.faizan.exception.BadRequestException;

public class Helper {

    public static void isValidRequest(UserRequestDTO dto) {
        if (isEmptyOrNull(dto.getName())) {
            throw new BadRequestException("Name can't be empty or null");
        } else if (isEmptyOrNull(dto.getPassword())) {
            throw new BadRequestException("password can't be null or empty");
        }

    }

    public static boolean isEmptyOrNull(String str) {
        return (Objects.isNull(str)) ? true : str.isEmpty() ? true : str.trim().isEmpty() ? true : false;
    }

    public static void isNameAndPasswordNullOrEmapty(String name, String password) {

        if (name.equals("null") || Objects.isNull(name) || name.isEmpty() || password.equals("null") || Objects.isNull(password) || password.isEmpty()) {
            throw new BadRequestException("name or password cant be null or empty");
        }

        /*
         * if (Objects.isNull(name) || name.isEmpty() || name.trim().isEmpty() || Objects.isNull(password) || password.isEmpty() || password.trim().isEmpty()) { throw new BadRequestException("name or password cant be null or empty"); }
         */

    }

}
