package org.example.rpg;

public class RgpMain {
    public static void main(String[] args) {
        Monster shrek = new Troll("shrek",1000,40);

        printAttackResult(shrek);


    }
    private static void printAttackResult(Monster monster){
        System.out.println("attack result of: " + monster.getName() + monster.attack());
    }
}