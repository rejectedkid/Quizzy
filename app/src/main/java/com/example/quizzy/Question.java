package com.example.quizzy;

public class Question {
    public String questions[] = {
            "When was Android 1.0 released?",
            "How to kill an activity in Android?",
            "What is the JSON exception in Android?",
            "What company purchased Android?",
            "Who created Android?"
    };

    public String choices[][] = {
            {"2005", "2006", "2007", "2008"},
            {"finish()", "finishActivity(int requestCode)", "kill()", "A & B"},
            {"JSon Exception", "Json Not found exception", "Input not found exception", "None of the above"},
            {"Amazon", "Google", "JcPenny", "None of the Above"},
            {"Richard Stallman", "Grace Hopper", "Andy Rubin", "Bill Gates"}
    };

    public String correctAnswer[] = {
            "2008",
            "A & B",
            "JSon Exception",
            "Google",
            "Andy Rubin"
    };

    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }

    public String getchoice1(int a){
        String choice = choices[a][0];
        return choice;
    }

    public String getchoice2(int a){
        String choice = choices[a][1];
        return choice;
    }

    public String getchoice3(int a){
        String choice = choices[a][2];
        return choice;
    }

    public String getchoice4(int a){
        String choice = choices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = correctAnswer[a];
        return answer;
    }
}
