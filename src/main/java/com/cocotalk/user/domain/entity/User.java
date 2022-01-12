package com.cocotalk.user.domain.entity;

import com.cocotalk.user.dto.request.UserModifyRequest;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class User extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NotNull
    @Column(length = 20)
    private String cid; // 코코톡 아이디

    @NotNull
    @Column(length = 64)
    private String password;

    @Column(length = 125, unique = true)
    private String email;

    @NotNull
    @Column(length = 20)
    private String name;

    @NotNull
    @Column(length = 20)
    private String nickname;

    @NotNull
    @Column(length = 20, unique = true)
    private String phone;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Provider provider;

    @NotNull
    private String providerId;

    private String profile; // JSON 형태로 저장

    @NotNull
    private Short status; // 유저 상태
    
    private LocalDateTime loggedinAt; // 최종 접속 기록

    private Date birth;

    public void modify(UserModifyRequest request) {
        this.name = request.getName();
        this.nickname = request.getNickname();
        this.birth = request.getBirth();
        this.phone = request.getPhone();
        this.email = request.getEmail();
        this.status = request.getStatus();
        this.profile = request.getProfile();
    }
}