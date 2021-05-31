package com.example.reportbot.controller;

import com.example.reportbot.ReportTelegramBot;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.telegram.telegrambots.meta.api.methods.BotApiMethod;
import org.telegram.telegrambots.meta.api.objects.Update;

@RestController
public class WebHookController {
    private final ReportTelegramBot reportTelegramBot;

    public WebHookController(ReportTelegramBot reportTelegramBot) {
        this.reportTelegramBot = reportTelegramBot;
    }

    @PostMapping
    public BotApiMethod<?> onUpdateReceived(@RequestBody Update update) {
        return reportTelegramBot.onWebhookUpdateReceived(update);
    }
}
