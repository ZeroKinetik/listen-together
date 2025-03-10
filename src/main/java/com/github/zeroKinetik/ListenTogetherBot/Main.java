package com.github.zeroKinetik.ListenTogetherBot;

import net.dv8tion.jda.api.JDABuilder;
import io.github.cdimascio.dotenv.Dotenv;

import javax.security.auth.login.LoginException;

public class Main {
    public static void main(String[] args) throws LoginException {
        Dotenv dotenv = Dotenv.load();
        final String BOT_TOKEN = dotenv.get("DISCORD_TOKEN");
        JDABuilder jdaBuilder = JDABuilder.createDefault(BOT_TOKEN);
        jdaBuilder.build();
    }
}