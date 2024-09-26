package ru.oleynik.otus.notification.service

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NotificationServiceApp

fun main(args: Array<String>) {
    runApplication<NotificationServiceApp>(*args)
}
