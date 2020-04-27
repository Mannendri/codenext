package com.example.femaleleadershipappv2;

public class Question {
    String question;
    String[] possibleAnswers;
    String answer;

    public Question(String question, String[] possibleAnswers, String answer) {
        this.question = question;
        this.possibleAnswers = possibleAnswers;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
