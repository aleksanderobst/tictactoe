package com.company;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int counterx = 0;
        int countero = 0;
        int co1 = 0;
        int co2 = 0;

        String tic = "_________";
        char[] chArray = new char[tic.length()];
        for (int i = 0; i < tic.length() ; i++) {
            chArray[i] = tic.charAt(i);
        }

        char[][] a = {
                {tic.charAt(0), tic.charAt(1), tic.charAt(2)},
                {tic.charAt(3), tic.charAt(4), tic.charAt(5)},
                {tic.charAt(6), tic.charAt(7), tic.charAt(8)},
        };


        draw(chArray);


while (true) {
    enter(co1, co2, tic, a, chArray);

    entero(co1, co2, tic, a, chArray);

}

    }

    public static void enter (int co1, int co2, String tic,char[][] a, char[] chArray){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coordinates: ");
        try {
            co1 = s.nextInt();
            co2 = s.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter numbers!");
enter(co1, co2, tic, a, chArray);


        }
        co1--;
        co2--;
        try {
            if (a[co1][co2] != 'X' && a[co1][co2] != 'O' ){
                a[co1][co2] = 'X';
                chArray[0] = a[0][0];
                chArray[1] = a[0][1];
                chArray[2] = a[0][2];
                chArray[3] = a[1][0];
                chArray[4] = a[1][1];
                chArray[5] = a[1][2];
                chArray[6] = a[2][0];
                chArray[7] = a[2][1];
                chArray[8] = a[2][2];
                draw(chArray);
            }
            else{
                System.out.println("This cell is occupied! Choose another one!");
                enter(co1, co2, tic, a, chArray);
            }


        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Coordinates should be from 1 to 3!");
                enter(co1, co2, tic, a,chArray);

        }

        catch (Exception ex) {
            System.out.println("inny");
        }
        int counterx = 0;
        int countero = 0;

        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == 'X'){
                counterx++;

            }
            if (chArray[i] == 'O'){
                countero++;

            }

        }

        a[0][0] = chArray[0];
        a[0][1] = chArray[1];
        a[0][2] = chArray[2];
        a[1][0] = chArray[3];
        a[1][1] = chArray[4];
        a[1][2] = chArray[5];
        a[2][0] = chArray[6];
        a[2][1] = chArray[7];
        a[2][2] = chArray[8];

        if (chArray[0] == 'X' && chArray[1] == 'O' && chArray[3] == 'X' && chArray[4] == 'O' && chArray[6] == 'X' && chArray[7] == 'O')
        {
            System.out.println("Impossible"); System.exit(0);
        }
        if (chArray[0] == chArray[1] && chArray[1] == chArray[2] && chArray[0] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[3] == chArray[4] && chArray[4] == chArray[5] && chArray[4] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[6] == chArray[7] && chArray[7] == chArray[8] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[5] && chArray[5] == chArray[8] && chArray[8] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[4] && chArray[4] == chArray[8] && chArray[8] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[4] && chArray[4] == chArray[6] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }

        if (chArray[0] == chArray[1] && chArray[1] == chArray[2] && chArray[0] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[3] == chArray[4] && chArray[4] == chArray[5] && chArray[4] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[6] == chArray[7] && chArray[7] == chArray[8] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[5] && chArray[5] == chArray[8] && chArray[8] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[4] && chArray[4] == chArray[8] && chArray[8] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[4] && chArray[4] == chArray[6] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        for (int i = 0; i < chArray.length; i++) {



            if (countero + counterx == 9){
                System.out.println("Draw");
                System.exit(0);
                break;
            }

        }
        // impossible
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'X' && chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'O'){
            System.out.println("Impossible");
            System.exit(0);
        }
        for (int i = 0; i < chArray.length; i++) {

            if (countero - counterx >= 2 || counterx - countero >= 2){
                System.out.println("Impossible");
                break;

            }
        }
    }




    public static void entero (int co1, int co2, String tic,char[][] a, char[] chArray){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coordinates: ");
        try {
            co1 = s.nextInt();
            co2 = s.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("You should enter numbers!");
            entero(co1, co2, tic, a,chArray);


        }
        co1--;
        co2--;
        try {
            if (a[co1][co2] != 'X' && a[co1][co2] != 'O' ){
                a[co1][co2] = 'O';
                chArray[0] = a[0][0];
                chArray[1] = a[0][1];
                chArray[2] = a[0][2];
                chArray[3] = a[1][0];
                chArray[4] = a[1][1];
                chArray[5] = a[1][2];
                chArray[6] = a[2][0];
                chArray[7] = a[2][1];
                chArray[8] = a[2][2];
                draw(chArray);
            }
            else{
                System.out.println("This cell is occupied! Choose another one!");
                entero(co1, co2, tic, a,chArray);
            }


        }
        catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Coordinates should be from 1 to 3!");
            entero(co1, co2, tic, a,chArray);





        }

        catch (Exception ex) {
            System.out.println("inny");
            entero(co1, co2, tic, a,chArray);
        }
        int counterx = 0;
        int countero = 0;

        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == 'X'){
                counterx++;

            }
            if (chArray[i] == 'O'){
                countero++;

            }

        }

        a[0][0] = chArray[0];
        a[0][1] = chArray[1];
        a[0][2] = chArray[2];
        a[1][0] = chArray[3];
        a[1][1] = chArray[4];
        a[1][2] = chArray[5];
        a[2][0] = chArray[6];
        a[2][1] = chArray[7];
        a[2][2] = chArray[8];

        if (chArray[0] == 'X' && chArray[1] == 'O' && chArray[3] == 'X' && chArray[4] == 'O' && chArray[6] == 'X' && chArray[7] == 'O')
        {
            System.out.println("Impossible"); System.exit(0);
        }
        if (chArray[0] == chArray[1] && chArray[1] == chArray[2] && chArray[0] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[3] == chArray[4] && chArray[4] == chArray[5] && chArray[4] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[6] == chArray[7] && chArray[7] == chArray[8] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[5] && chArray[5] == chArray[8] && chArray[8] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[4] && chArray[4] == chArray[8] && chArray[8] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[4] && chArray[4] == chArray[6] && chArray[6] == 'X'){
            System.out.println("X wins");
            System.exit(0);
        }

        if (chArray[0] == chArray[1] && chArray[1] == chArray[2] && chArray[0] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[3] == chArray[4] && chArray[4] == chArray[5] && chArray[4] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[6] == chArray[7] && chArray[7] == chArray[8] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[5] && chArray[5] == chArray[8] && chArray[8] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[0] == chArray[4] && chArray[4] == chArray[8] && chArray[8] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        if (chArray[2] == chArray[4] && chArray[4] == chArray[6] && chArray[6] == 'O'){
            System.out.println("O wins");
            System.exit(0);
        }
        for (int i = 0; i < chArray.length; i++) {



            if (countero + counterx == 9){
                System.out.println("Draw");
                break;
            }

        }
        // impossible
        if (chArray[0] == chArray[3] && chArray[3] == chArray[6] && chArray[6] == 'X' && chArray[1] == chArray[4] && chArray[4] == chArray[7] && chArray[7] == 'O'){
            System.out.println("Impossible");
            System.exit(0);
        }
        for (int i = 0; i < chArray.length; i++) {

            if (countero - counterx >= 2 || counterx - countero >= 2){
                System.out.println("Impossible");
                break;

            }
        }
    }





    public static void draw (char[] chArray) {
        System.out.println("---------");
        for (int i = 0; i < chArray.length  ; i++) {
            if (i == 0) {
                System.out.print("| ");
            }
            if (i == 3) {
                System.out.print("| ");
            }
            if (i == 6) {
                System.out.print("| ");
            }

            String formattedString = Arrays.toString(new char[]{chArray[i]})
                    .replace("[", "")  //remove the right bracket
                    .replace("]", " ");

            System.out.print(formattedString);

            if (i == 2) {
                System.out.print("|");
            }
            if (i == 5) {
                System.out.print("|");
            }
            if (i == 8) {
                System.out.print("|");
            }
            if (i == 2){
                System.out.println(" ");
            }
            if (i == 5){
                System.out.println(" ");
            }


        }
        System.out.println(" ");
        System.out.println("---------");

    }



}
