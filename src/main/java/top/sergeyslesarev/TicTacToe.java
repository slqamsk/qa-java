package top.sergeyslesarev;
import java.util.Scanner;
public class TicTacToe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] base = {{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        char[][] field = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
        boolean turn = true; // Если true - ходят крестики
        int n;
        char current;
        System.out.println("Игра \"Крестики-нолики\"");
        do {
            System.out.println("Номера ячеек:");
            draw_field(base);
            System.out.println("Текущая позиция:");
            draw_field(field);
            if (turn) {
                System.out.print("Ходят крестики, укажите номер ячейки: ");
                current = 'X';
            } else {
                System.out.print("Ходят нолики, укажите номер ячейки: ");
                current = 'O';
            }
            n = s.nextInt();
            if (n < 1) {
                break;
            } else if (n > 9) {
                System.out.println("Укажите номер ячейки от 1 до 9. Для выхода укажите 0.");
                continue;
            }
            field[row(n)][col(n)] = current;
            turn = !turn;

            System.out.println("Ваш ход: " + n);
        } while (true);
        s.close();
    }
    static void draw_field(char[][] array){
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {
                System.out.print(" | " + array[i][j]);
            }
            System.out.println(" | ");
        }
    }
    static int row (int n) {
        return (n-1)/3;
    }

    static int col (int n) {
        return (n-1)%3;
    }
}
