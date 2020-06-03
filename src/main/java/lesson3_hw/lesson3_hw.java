package lesson3_hw;

import java.util.Random;
import java.util.Scanner;

public class lesson3_hw {

    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = ' ';

    private static int fieldSizeX;
    private static int fieldSizeY;

    private static char[][] field;

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int fieldSize = 3;
        while (true) {
            init(fieldSize);
            printField();
            playOnce(fieldSize);
            System.out.println("Играть сначала?");
            if (SCANNER.next().equals("no")) {
                break;
            }
        }
    }

    private static void playOnce(int fieldSize) {
        while (true) {
            humanTurn();
            printField();
            if (isWinnerExists(DOT_HUMAN)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
            aiTurn();
            printField();
            if (isWinnerExists(DOT_AI)) {
                System.out.println("Победил компьютер!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }
        }
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (isNotEmptyField(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isWinnerExists(char symb) {
        for (int i = 0; i < fieldSizeY; i++) {
            if ((field[i][0] == symb && field[i][1] == symb && field[i][2] == symb) ||
                (field[0][i] == symb && field[1][i] == symb && field[2][i] == symb))
                return true;
            if ((field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) ||
                    (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb))
                return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты ходу X и Y (от 1 до " + fieldSizeY + ") через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidField(x, y) || isNotEmptyField(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static boolean isNotEmptyField(int x, int y) {
        return field[y][x] != DOT_EMPTY;
    }

    private static boolean isValidField(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static void printField() {
        System.out.println("=============");
        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("| ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " | ");
            }
            System.out.println();
        }
    }

    private static void init(int fieldSize) {
        fieldSizeX = fieldSize;
        fieldSizeY = fieldSize;
        field = new char[fieldSizeY][fieldSizeX];
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++){
                field[y][x] = DOT_EMPTY;
            }
        }
    }
}
