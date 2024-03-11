package com.discorddev.dorbot.api.user.service;

import java.util.List;

import com.discorddev.dorbot.api.user.model.dto.request.UserSearchDTO;
import com.discorddev.dorbot.api.user.model.dto.response.UserListResponseDTO;
import com.discorddev.dorbot.global.common.exception.DefaultResponse;

public interface UserService {
	DefaultResponse<List<UserListResponseDTO>> usersSearch(UserSearchDTO userSearchDTO);
}
