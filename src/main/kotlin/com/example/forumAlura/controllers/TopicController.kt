package com.example.forumAlura.controllers

import com.example.forumAlura.models.Course
import com.example.forumAlura.models.Topic
import com.example.forumAlura.models.User
import com.example.forumAlura.services.TopicService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/topics")
class TopicController(
    private val topicService: TopicService,
) {
    @GetMapping
    fun getAll(): List<Topic> {
        return topicService.getAll()
    }
}