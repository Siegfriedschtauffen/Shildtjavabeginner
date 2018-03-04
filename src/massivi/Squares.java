package massivi;

// Инициализация двумерного массива.
public class Squares {
    public static void main(String[] args) {
        // Обратите внимание на то, что у каждой строки свой ряд инициализаторов.
        int sqrs[][]={
                { 1, 1 },
                { 2, 4 },
                { 3, 9 , 5, 6, 9},
                { 4, 16 },
                { 5, 25, 4, 6 },
                { 6, 36, 3 },
                { 7, 49 },
                { 8, 64 },
                { 9, 81 },
                { 10, 100 },
        };

        System.out.println(sqrs[2].length);

        int i, j;
        for (i=0; i<sqrs.length; i++){
            for (j=0; j<sqrs[i].length; j++){

                System.out.print(sqrs[i][j]+" ");
            }
            System.out.println();
        }
    }
}               // SUKA YA KRASAVCHIK!!!
