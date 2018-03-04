package foreach;

// Использование разновидности for-each цикла for
// для обработки двумерного массива.
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[][] = new int[3][5];

        // ввести ряд значений в массив nums
        for (int i=0;i<3;i++)
            for (int j=0;j<5;j++)
                nums[i][j]=(i+1)*(j+1);

        // использовать разновидность for-each цикла for
        // для суммирования и отображения значений
        // Обратите внимание на объявление переменной x.
        for (int x[]: nums){
            for (int y : x){
                System.out.println("Value is: "+y);
                sum+=y;
            }
        }
        System.out.println("Summation: "+sum);

    }
}
