package com.zipcodewilmington.scientificcalculator;

public class BasicFunctionsExponent {

   // double value = 0;
    double answer;
    public BasicFunctionsExponent(double answer) {
        this.answer = answer;
    }
    public double square (){
        answer = answer * answer;
        return answer;
    }
    public double squareRoot(){
        answer = Math.sqrt(answer);
        return answer;
    }

    public double exponentiation(double input){
        answer = Math.pow(answer, input);
        return answer;
    }

    public double inverse(){
        answer= 1/answer;
        return answer;
    }

    public double invert(){
        answer = (answer * -1);
        return answer;
    }

    public double getAnswer() {
        return answer;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }
}
