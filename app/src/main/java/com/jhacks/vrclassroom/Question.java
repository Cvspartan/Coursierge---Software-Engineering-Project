package com.jhacks.vrclassroom;
// Base code provided by  https://www.youtube.com/watch?v=rRpl7CexurE



public class Question {
    private String questionText;
    private String choiceA;
    private String choiceB;
    private String choiceC;
    private String choiceD;
    private String correctAnswer;
    public Question()
    {
        // Empty constructor requirement by Firebase deserializer
    }

    public Question(String questionText, String choiceA, String choiceB, String choiceC, String choiceD, String correctAnswer)
    {
        this.questionText = questionText;
        this.choiceA = choiceA;
        this.choiceB = choiceB;
        this.choiceC = choiceC;
        this.choiceD = choiceD;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestionText() { return questionText; }

    public String getChoiceA() { return choiceA; }
    public String getChoiceB() { return choiceB; }
    public String getChoiceC() { return choiceC; }
    public String getChoiceD() { return choiceD; }
    public String getCorrectAnswer() { return correctAnswer; }

    public boolean isCorrectAnswer(String selectedAnswer)
    {
        return (selectedAnswer.equals(correctAnswer));
    }

    @Override
    public String toString(){
        return questionText;
    }
}