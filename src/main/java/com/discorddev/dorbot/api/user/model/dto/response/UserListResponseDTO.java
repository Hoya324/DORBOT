package com.discorddev.dorbot.api.user.model.dto.response;

import java.sql.Timestamp;

import com.discorddev.dorbot.global.common.user.UserVO;

import lombok.Builder;
import lombok.Data;

@Data
public class UserListResponseDTO {
	private Long index;
	private String id;
	private Timestamp joinDate;
	private String name;
	private String email;

	@Builder
	private UserListResponseDTO(final Long index, final String id, final Timestamp joinDate, final String name,
		final String email) {
		this.index = index;
		this.id = id;
		this.joinDate = joinDate;
		this.name = name;
		this.email = email;
	}

	public static UserListResponseDTO of(UserVO userVO) {
		return UserListResponseDTO.builder()
			.index(userVO.getIndex())
			.id(userVO.getId())
			.joinDate(userVO.getJoinDate())
			.name(userVO.getName())
			.email(userVO.getEmail())
			.build();
	}
}
