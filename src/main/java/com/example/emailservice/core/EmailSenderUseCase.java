package com.example.emailservice.core;

public interface EmailSenderUseCase {
void sendEmail(String to, String subjet, String body);
}