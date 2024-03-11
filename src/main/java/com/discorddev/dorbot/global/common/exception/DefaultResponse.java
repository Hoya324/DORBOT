package com.discorddev.dorbot.global.common.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultResponse<T> {

	private Integer statusCode;
	private String message;
	private T data;

	public static <T> DefaultResponse<T> response(final Integer statusCode, final String message) {
		return (DefaultResponse<T>)DefaultResponse.builder()
			.statusCode(statusCode)
			.message(message)
			.build();
	}

	public static <T> DefaultResponse<T> response(final Integer statusCode,final String message, final T data) {
		return (DefaultResponse<T>)DefaultResponse.builder()
			.statusCode(statusCode)
			.message(message)
			.data(data)
			.build();
	}
}
