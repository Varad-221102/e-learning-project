package com.elearning.platform.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "quizzes")
public class Quiz {
    @Id
    private String id;
    private String courseId;
    private String title;
    private List<Question> questions;

    // ✅ Getter for courseId
    public String getCourseId() {
        return courseId;
    }

    //Setters and other getters
    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    //Inner class for question
    public static class Question {
        private String questionText;
        private List<String> options;
        private int correctOptionIndex;

        public String getQuestionText() {
            return questionText;
        }

        public void setQuestionText(String questionText) {
            this.questionText = questionText;
        }

        public List<String> getOptions() {
            return options;
        }

        public void setOptions(List<String> options) {
            this.options = options;
        }

        public int getCorrectOptionIndex() {
            return correctOptionIndex;
        }

        public void setCorrectOptionIndex(int correctOptionIndex) {
            this.correctOptionIndex = correctOptionIndex;
        }
    }
}
