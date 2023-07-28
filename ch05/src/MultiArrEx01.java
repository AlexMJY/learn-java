// 좌표에 x표하기 : 입력한 2차원 좌표의 위치에 x 표시

package ch05;

import java.util.Scanner;

public class MultiArrEx01 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                //  1  2  3  4  5  6  7  8  9
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 1
                { 1, 1, 1, 1, 0, 0, 1, 0, 0 }, // 2
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 3
                { 0, 0, 0, 0, 0, 0, 1, 0, 0 }, // 4
                { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, // 5
                { 1, 1, 0, 1, 0, 0, 0, 0, 0 }, // 6
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 7
                { 0, 0, 0, 1, 0, 0, 0, 0, 0 }, // 8
                { 0, 0, 0, 0, 0, 1, 1, 1, 0 }, // 9
        };

        // 1행에 행번호를, 1열에 열번호를 저장
        for (int i=1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char) (i + '0');
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("좌표를 입력하세요 (종료는 00) > ");
            String input = scanner.nextLine();

            if (input.length() == 2) {
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';
                if (x == 0 && y == 0) {
                    break;
                }
            }
            if (input.length() != 2 || x <= 0 || x >= SIZE || y <= 0 || y >= SIZE) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                continue;
            }

            // shipBoard[x-1][y-1]의 값이 1이면 '0'을 board[x][y]에 저장
            board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

            // 배열 board의 내용을 화면에 출력
            for (int i=0; i < SIZE; i++) {
                System.out.println(board[i]);;
            }
            System.out.println();
        }
    }
}

// 2차원 char 배열 board는 입력한 좌표를 표시하기 위한 것이고, 2차원 byte 배열 shipBoard는 상대방의 배의 위치를 저장한다.
// board는 행번호와 열번호가 필요하다. 그래서 shipBoard보다 행과 열의 길이가 1씩 더 크다.
// board는 char배열이므로, 숫자를 문자로 변환해야 한다. 숫자에 문자 '0'를 더해면 타입만 바뀌고 값의 변화는 없다.