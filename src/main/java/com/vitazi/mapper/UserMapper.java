package com.vitazi.mapper;

import com.vitazi.dto.request.UserCreateRequest;
import com.vitazi.dto.response.UserResponse;
import com.vitazi.entities.UserEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserEntity toUserEntity(UserCreateRequest userCreateRequest);
}
