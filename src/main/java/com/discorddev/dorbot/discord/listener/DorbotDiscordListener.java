package com.discorddev.dorbot.discord.listener;

import java.util.List;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DorbotDiscordListener extends ListenerAdapter {

	@Override
	public void onMessageReceived(MessageReceivedEvent event) {

		User user = event.getAuthor();
		TextChannel textChannel = event.getChannel().asTextChannel();
		Message message = event.getMessage();

		log.info("get message : " + message.getContentDisplay());

		if (user.isBot()) {
			return;
		} else if (message.getContentDisplay().equals("")) {
			log.info("디스코드 Message 문자열 값 공백");
		}

		List<String> resultList = CheckDiscordCommand.checkCommand(event, message.getContentDisplay().split(" "));

		if (resultList.isEmpty()) {
			log.info("처리 결과 값 공백");
		}

		createSendMessage(event, resultList.get(0), Objects.requireNonNull(resultList.get(1)));
	}

}
