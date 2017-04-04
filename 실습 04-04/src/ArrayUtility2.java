/**
 * @date : 2017. 4. 4.
 */
/**
 * <pre>
 *  
 *    |_ ArrayUtility2.java
 * </pre>
 * 
 * @date : 2017. 4. 4. ¿ÀÀü 12:57:06
 * @version :
 * @author : Jho
 */

import java.util.Scanner;

public class ArrayUtility2
{
    static int[] concat(int[] s1, int[] s2)
    {
        int[] iTempAry1 = new int[s1.length + s2.length];

        for (int i = 0; i < s1.length; i++)
        {
            iTempAry1[i] = s1[i];
        }

        for (int i = 0; i < s2.length; i++)
        {
            iTempAry1[i + s1.length] = s2[i];
        }

        return iTempAry1;

    }

    static int[] remove(int[] s1, int[] s2)
    {
        int[] iTempAry2 = new int[s1.length + s2.length];
        int num = 0;
        for (int i = 0; i < s1.length; i++)
        {
            int count = 0;
            for (int j = 0; j < s2.length; j++)
            {
                if (s1[i] == s2[j]) count += 1;
            }
            if (count == 0) iTempAry2[num++] = s1[i];

        }

        return iTempAry2;
    }

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        int[] iAry1 = new int[2];
        System.out.print("Enter two numbers >> ");
        for (int i = 0; i < 2; i++)
            iAry1[i] = input.nextInt();

        int[] iAry2 = new int[3];
        System.out.print("Enter three numbers >> ");
        for (int i = 0; i < 3; i++)
            iAry2[i] = input.nextInt();

        int length = iAry1.length + iAry2.length;
        int[] tempAry = concat(iAry1, iAry2);

        for (int num : tempAry)
            System.out.println(num);

    }
}
