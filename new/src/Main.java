import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] mas = new int[9];
        mas[0] = 1;
        mas[1] = 2;
        mas[2] = 3;
        mas[3] = 4;
        mas[4]= 5;
        mas[5] = 6;
        mas[6] = 7;
        mas[7] = 8;
        mas[8] = 9;
        for (int i = 0; i < mas.length; i+=3) {
//            if (i != 0){

                System.out.println(mas[i]);
//            }
        }
            }



    private static int[] build_array()
    {
        return build_array(10);
    }

    private static int[] build_array(String string)
    {
        return build_array(Integer.parseInt(string));
    }

    private static int[] build_array(int length)
    {
        int[] result = new int[length];
        for (int i = 0; i < length; i++)
        {
            result[i] = (int) Math.round((Math.random() * 10));
        }
        return result;

    }
}
