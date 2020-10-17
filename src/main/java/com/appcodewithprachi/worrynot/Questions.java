package com.appcodewithprachi.worrynot;

public class Questions {

    public String mQuestions[] = new String[]{
            "How are you feeling right now ?",
            "How often do you feel helplessness ?",
            "Do you often feel suicidal ?",
            "Do you have people in your life who understands you or talk to you about your feelings ?",
            "How often you do physical workout ?",
            "How much do you eat in a day according to your requirements ?",
            "How many hours do you sleep ?",
            "How would you rate your temper ?",
            "How often do you have mood swings ?"
    };
    private String mChoices [][] = {
            {"Good", "Bad", "Okay", "Great"},
            {"Always", "Sometimes", "Often", "Not much"},
            {"Yes", "No","Don't want to answer","Confused-yes/no"},
            {"Yes", "No","Don't want to answer","Confused-yes/no"},
            {"Everyday", "Once in a week", "Not a single day", "In alternate days"},
            {"0%-25%", "25%-50%", "50%-75%", "75%-100%"},
            {"2-4 hours", "5-9 hours ", "9-13 hours", "More than 13 hours "},
            {"0%-20%", "20%-40%", "40%-70%","70%-100%"},
            {"0%-21%", "21%-41%", "41%-71%","71%-100%"}

    };
    private String mCorrectAnswers[] = {"Bad","Always","Yes", "No", "Not a single day", "0%-25%","2-4 hours", "0%-20%","71%-100%"};

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;

    }
    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;

    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;

    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }


}
