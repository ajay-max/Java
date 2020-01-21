using System;

namespace Coins
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Enter Rs 10 coins");
            int val1 = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Rs 5 coins");
            int val2 = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Rs 2 coins");
            int val3 = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter Rs 1 coins");
            int val4 = int.Parse(Console.ReadLine());

            int result = (val1 * 10) + (val2 * 5) + (val3 * 2) + (val4 * 1);

            Console.WriteLine("Total amount are " +result);
        }
    }
}
