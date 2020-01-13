package com.github.curriculeon;

public class AliceBobEvaluator {

    String input;

    AliceBobEvaluator(String input) {
        this.input = input;
    }

    public boolean isAlice() {
        if(input.toLowerCase().equals(AliceBobEnum.ALICE.name().toLowerCase())){
            return true;
        }
        return false;
    }

    public boolean isBob() {
        if(input.toLowerCase().equals(AliceBobEnum.BOB.name().toLowerCase())){
            return true;
        }
        return false;
    }
}
