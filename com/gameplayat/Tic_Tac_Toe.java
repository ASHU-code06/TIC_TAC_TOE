package com.gameplayat;

import java.util.Scanner;
import  java.util.Random;

public class Tic_Tac_Toe {
    /*Create a board of char[] of size 10
    and assign empty space to each
    element*/
    public static void main(String[] args) {
        System.out.println("Hello Welcome to tic tac toe!");
        char[][] gameboard = {{' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '},
                {'_', '+', '_', '+', '_'},
                {' ', '|', ' ', '|', ' '}};
        printgameboard(gameboard);
        char playerchoice = selectletter();
        char computerchoice = ' ';
        if(playerchoice == 'X'){
            computerchoice = 'O';
        }else if ( playerchoice == 'O'){
            computerchoice = 'X';
        }

        while (true){
            playermove(gameboard,playerchoice);
            computermove(gameboard,computerchoice);
        }
    }
    public static void playermove(char[][] gameboard, char playerchoice) {
        System.out.println("player1 chance");
        System.out.println("Enter your selected position from 1 to 9 for gameboard ");
        Scanner select = new Scanner(System.in);
        int playerpos = select.nextInt();
        boolean result = isvalidmove(gameboard, playerpos);
        while (!result) {
            System.out.println("Sorry invalid move try again");
            playerpos = select.nextInt();
            result = isvalidmove(gameboard, playerpos);
        }
        placepiece(gameboard, playerpos, "player",playerchoice);

    }

    public static void computermove(char[][] gameboard, char computerchoice) {
        Random run = new Random();
        int computerpos = run.nextInt(9)+1;
        boolean r = isvalidmove(gameboard, computerpos);
        while (!r) {
            System.out.println("computer made an invalid move so try again");
            computerpos = run.nextInt(9)+1;
            r = isvalidmove(gameboard,computerpos);
        }
        placepiece(gameboard, computerpos, "computer",computerchoice);
    }
    public static boolean isvalidmove(char[][] gameboard, int move) {
        switch (move) {
            case 1:
                if (gameboard[0][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 2:
                if (gameboard[0][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 3:
                if (gameboard[0][4] == ' ') {
                    return true;
                } else {
                    return false;
                }

            case 4:
                if (gameboard[2][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 5:
                if (gameboard[2][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 6:
                if (gameboard[2][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 7:
                if (gameboard[4][0] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 8:
                if (gameboard[4][2] == ' ') {
                    return true;
                } else {
                    return false;
                }
            case 9:
                if (gameboard[4][4] == ' ') {
                    return true;
                } else {
                    return false;
                }
            default:
                return false;
        }
    }

    public static void placepiece(char[][] gameboard, int pos, String user, char symbol) {
        System.out.println(user+" made a move at "+pos);
        switch( pos ) {
            case 1:
                gameboard[0][0] = symbol;
                break;
            case 2:
                gameboard[0][2] =symbol;
                break;
            case 3:
                gameboard[0][4] = symbol;
                break;
            case 4:
                gameboard[2][0] = symbol;
                break;
            case 5:
                gameboard[2][2] = symbol;
                break;
            case 6:
                gameboard[2][4] = symbol;
                break;
            case 7:
                gameboard[4][0] = symbol;
                break;
            case 8:
                gameboard[4][2] = symbol;
                break;
            case 9:
                gameboard[4][4] = symbol;
                break;
            default:
                break;
        }
        printgameboard(gameboard);
    }


    public static void printgameboard(char[][] gameboard) {

        for (char[] row : gameboard) {
            for (char c : row){
                System.out.print("  " + c);
            }
            System.out.println("  ");
        }
    }
    public static char selectletter(){
        Scanner input = new Scanner(System.in);
        System.out.println("Select any letter of your choice either X or O : ");
        String myletter = input.nextLine();
        System.out.println("selected letter is :  "+myletter);
        if(myletter.equals("X")){
            System.out.println("and Computer will choose O");
        } else if (myletter.equals("O")) {
            System.out.println("and Computer will choose X");
        }
        char symbol = myletter.charAt(0);
        return symbol;
    }

}
