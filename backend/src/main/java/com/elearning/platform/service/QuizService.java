package com.elearning.platform.service;

import com.elearning.platform.entity.Quiz;
import com.elearning.platform.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuizService {
    @Autowired
    private QuizRepository quizRepository;

    public Quiz createQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllByCourseId(String courseId) {
        return quizRepository.findAll().stream()
                .filter(q -> q.getCourseId().equals(courseId)).toList();
    }
}
