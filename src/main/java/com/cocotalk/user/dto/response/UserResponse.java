package com.cocotalk.user.dto.response;

import com.cocotalk.user.domain.entity.Provider;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Builder
public class UserResponse {
    private Long id;
    private String cid;
    private String name;
    private String nickname;
    private Date birth;
    private String phone;
    private String email;
    private Provider provider;
    private String providerId;
    private Short status;
    private LocalDateTime loggedinAt;
    private String profile;
}