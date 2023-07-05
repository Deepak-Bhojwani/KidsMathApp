package com.codewithvoid.kidsmathapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionsBank {
    private static List<QuestionsList> additionQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("8 + 4 = ?", "12", "6", "8", "9", "12", "");
        final QuestionsList question2 = new QuestionsList("4 + 6 = ?", "16", "12", "3", "10", "10", "");
        final QuestionsList question3 = new QuestionsList("2 + 5 = ?", "5", "7", "9", "4", "7", "");
        final QuestionsList question4 = new QuestionsList("8 + 8 = ?", "17", "19", "14", "16", "16", "");
        final QuestionsList question5 = new QuestionsList("7 + 5 = ?", "13", "19", "12", "10", "12", "");
        final QuestionsList question6 = new QuestionsList("1 + 6 = ?", "7", "9", "5", "2", "7", "");
        final QuestionsList question7 = new QuestionsList("4 + 2 = ?", "7", "6", "10", "4", "6", "");
        final QuestionsList question8 = new QuestionsList("4 + 5 = ?", "16", "7", "9", "14", "9", "");
        final QuestionsList question9 = new QuestionsList("3 + 4 = ?", "2", "0", "1", "7", "7", "");
        final QuestionsList question10 = new QuestionsList("6 + 2 = ?", "1", "8", "13", "0", "8", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        Collections.shuffle(questionsLists);

        return questionsLists;
    }

    private static List<QuestionsList> subtractionQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("9 - 2 = ?", "9", "3", "18", "7", "7", "");
        final QuestionsList question2 = new QuestionsList("3 - 1 = ?", "2", "4", "1", "5", "2", "");
        final QuestionsList question3 = new QuestionsList("6 - 3 = ?", "4", "9", "3", "2", "3", "");
        final QuestionsList question4 = new QuestionsList("8 - 3 = ?", "5", "6", "7", "3", "5", "");
        final QuestionsList question5 = new QuestionsList("4 - 2 = ?", "6", "2", "3", "7", "2", "");
        final QuestionsList question6 = new QuestionsList("5 - 3 = ?", "1", "3", "0", "2", "2", "");
        final QuestionsList question7 = new QuestionsList("8 - 4 = ?", "4", "8", "3", "5", "4", "");
        final QuestionsList question8 = new QuestionsList("7 - 3 = ?", "2", "3", "4", "5", "4", "");
        final QuestionsList question9 = new QuestionsList("5 - 5 = ?", "4", "3", "0", "9", "0", "");
        final QuestionsList question10 = new QuestionsList("2 - 1 = ?", "2", "1", "5", "4", "1", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        Collections.shuffle(questionsLists);

        return questionsLists;
    }

    private static List<QuestionsList> multiplicationQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("7 x 4 = ?", "44", "32", "28", "12", "28", "");
        final QuestionsList question2 = new QuestionsList("2 x 6 = ?", "14", "12", "16", "6", "12", "");
        final QuestionsList question3 = new QuestionsList("5 x 9 = ?", "84", "41", "37", "45", "45", "");
        final QuestionsList question4 = new QuestionsList("8 x 4 = ?", "32", "44", "36", "4", "32", "");
        final QuestionsList question5 = new QuestionsList("9 x 1 = ?", "1", "9", "6", "0", "9", "");
        final QuestionsList question6 = new QuestionsList("8 x 5 = ?", "35", "45", "20", "40", "40", "");
        final QuestionsList question7 = new QuestionsList("7 x 9 = ?", "15", "47", "63", "18", "63", "");
        final QuestionsList question8 = new QuestionsList("2 x 7 = ?", "14", "23", "15", "17", "14", "");
        final QuestionsList question9 = new QuestionsList("6 x 0 = ?", "0", "6", "12", "32", "0", "");
        final QuestionsList question10 = new QuestionsList("5 x 4 = ?", "25", "20", "30", "40", "20", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        Collections.shuffle(questionsLists);

        return questionsLists;
    }

    private static List<QuestionsList> divisionQuestions(){
        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("9 / 3 = ?", "3", "6", "9", "12", "3", "");
        final QuestionsList question2 = new QuestionsList("8 / 4 = ?", "1", "2", "4", "6", "2", "");
        final QuestionsList question3 = new QuestionsList("6 / 3 = ?", "4", "3", "2", "1", "2", "");
        final QuestionsList question4 = new QuestionsList("8 / 2 = ?", "4", "2", "6", "8", "4", "");
        final QuestionsList question5 = new QuestionsList("8 / 1 = ?", "2", "4", "6", "8", "8", "");
        final QuestionsList question6 = new QuestionsList("6 / 2 = ?", "4", "3", "2", "1", "3", "");
        final QuestionsList question7 = new QuestionsList("7 / 1 = ?", "4", "5", "6", "7", "7", "");
        final QuestionsList question8 = new QuestionsList("5 / 5 = ?", "5", "3", "1", "0", "1", "");
        final QuestionsList question9 = new QuestionsList("4 / 2 = ?", "1", "2", "3", "4", "2", "");
        final QuestionsList question10 = new QuestionsList("3 / 1 = ?", "1", "5", "7", "3", "3", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        Collections.shuffle(questionsLists);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "addition":
                return additionQuestions();
            case "subtraction":
                return subtractionQuestions();
            case "multiplication":
                return multiplicationQuestions();
            default:
                return divisionQuestions();
        }
    }
}
