package com.example.forumAlura.services

import com.example.forumAlura.models.Course
import com.example.forumAlura.models.Topic
import com.example.forumAlura.models.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicService {
    fun getAll(): List<Topic> {
        val topic = Topic(
            id = 1,
            title = "Dúvida Kotlin",
            message = "Variável no kotlin",
            course = Course(
                id = 1,
                name = "Kotlin",
                category = "Programação",
            ),
            author = User(
                id = 1,
                name = "Pedro",
                email = "pedro@email.com"
            )
        )

        return Arrays.asList(topic)
    }
}