package com.discorddev.dorbot.global.common.user;

import java.sql.Timestamp;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserVO {

	private Long index;
	private String id;
	private Timestamp joinDate;
	private String name;
	private String email;
}
