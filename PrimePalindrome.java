import java.util.Scanner;

class PrimePalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, i, count = 0, rev = 0, temp, rem;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                count++;
            }
        }

        temp = n;

        while (temp != 0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if (count == 2 && n == rev)
        {
            System.out.println(n + " is a Prime Palindrome number");
        }
        else
        {
            System.out.println(n + " is not a Prime Palindrome number");
        }
    }
}