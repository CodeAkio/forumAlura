package com.example.forumAlura.services

import com.example.forumAlura.models.Course
import com.example.forumAlura.models.Topic
import com.example.forumAlura.models.User
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicService(private var topics: List<Topic>) {
    init {
        val topic1 = Topic(
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

        val topic2 = Topic(
            id = 2,
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

        topics = Arrays.asList(topic1, topic2)
    }

    fun getAll(): List<Topic> {
        return topics
    }

    fun getById(id: Long): Topic {
        return topics.stream()
            .filter { t -> t.id == id }
            .findFirst()
            .get()
    }
}