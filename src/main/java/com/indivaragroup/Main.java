package com.indivaragroup;

import com.indivaragroup.calculation.registration.identity.CalculationRegistrationIdentity;
import com.indivaragroup.characters.examples.CharacterExamples;
import com.indivaragroup.house.floor.logic.CeramicCheck;
import com.indivaragroup.jav.logic.JavLogic;
import com.indivaragroup.number.conversion.ConvertDataType;
import com.indivaragroup.student.scoring.StudentScoring;
import com.indivaragroup.type.data.primitive.TypeDataNonPrimitive;
import com.indivaragroup.type.data.array.ArrayExample;
import com.indivaragroup.activity.logic.TaskLogic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        String helloworld = "Hello JDT 17";
        System.out.println("Ini string untuk hello world: " + helloworld);

        int helloInteger = 25;
        System.out.println("Ini int untuk hello world: " + helloInteger);

        double helloDouble = 3.14;
        System.out.println("Ini double untuk hello world: " + helloDouble);

        boolean helloBoolean = true;
        System.out.println("Ini boolean untuk hello world: " + helloBoolean);

        char helloCharacter = 'A';
        System.out.println("Ini char untuk hello world: " + helloCharacter);

        //Ceramic
        CeramicCheck.checkCeramic();

        //Check Identity
        CalculationRegistrationIdentity.calculateRegisterIdentity();

        //Scoring
        StudentScoring.printGrade();

        //Convert datatype
        ConvertDataType.numberConvert();

        //Character
        CharacterExamples.characterExamples();

        //Array
        ArrayExample.arrayExample();

        //Primitive and non Primitive
        TypeDataNonPrimitive typeDataNonPrimitive = new TypeDataNonPrimitive();
        typeDataNonPrimitive.getTypeDataNonPrimitive();

        //Jav code
        JavLogic.javLogic();

        //To do list
        TaskLogic taskLogicApp = new TaskLogic();
        taskLogicApp.runApplication();




    }


}
