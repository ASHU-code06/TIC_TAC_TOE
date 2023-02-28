package com.gameplayat;

import java.util.Scanner;

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
        char userchoice = selectletter();
        System.out.println("Enter your selected position from 1 to 9 for gameboard ");
        Scanner select = new Scanner(System.in);
        int pos = select.nextInt();

        placepiece( gameboard, pos, "player",userchoice );

    }

    public static void placepiece(char[][] gameboard, int pos, String user, char symbol) {

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
        if(myletter.toLowerCase().equals("x")){
            System.out.println("and Computer will choose O");
        } else if (myletter.toLowerCase().equals("o")) {
            System.out.println("and Computer will choose X");
        }
        char symbol = myletter.charAt(0);
        return symbol;
    }

}
