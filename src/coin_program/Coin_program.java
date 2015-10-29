/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coin_program;

/**
 *
 * @author Austin
 */
public class Coin_program {

    private int [] coins = { 1, 11, 15};
    public int d;
    private int[]table;
    public static void main(String[] args)
    {
        new Coin_program();
    }
    public Coin_program()
    {
        table = new int[1];
        System.out.println(kS(0)+ " coins to make " + (d));
        //print(table);
        table = new int[2];
        System.out.println(kS(1)+ " coins to make " + (d));
        //print(table);
        table = new int[3];
        System.out.println(kS(2)+ " coins to make " + (d));
        //print(table);
        table = new int[4];
        System.out.println(kS(3)+ " coins to make " + (d));
        //print(table);
        table = new int[5];
        System.out.println(kS(4)+ " coins to make " + (d));
        //print(table);
        table = new int[6];
        System.out.println(kS(5)+ " coins to make " + (d));
        //print(table);
        table = new int[7];
        System.out.println(kS(6)+ " coins to make " + (d));
        //print(table);
        table = new int[8];
        System.out.println(kS(7)+ " coins to make " + (d));
        //print(table);
        table = new int[9];
        System.out.println(kS(8)+ " coins to make " + (d));
        //print(table);
        table = new int[10];
        System.out.println(kS(9)+ " coins to make " + (d));
        //print(table);
        table = new int[11];
        System.out.println(kS(10)+ " coins to make " + (d));
        //print(table);
        table = new int[21];
        System.out.println(kS(20)+ " coins to make " + (d));
        //print(table);
        table = new int[31];
        System.out.println(kS(30)+ " coins to make " + (d));
        //print(table);
        table = new int[32];
        System.out.println(kS(31)+ " coins to make " + (d));
        //print(table);
        table = new int[33];
        System.out.println(kS(32)+ " coins to make " + (d));
        //print(table);
        table = new int[34];
        System.out.println(kS(33)+ " coins to make " + (d));
        //print(table);
        table = new int[51];
        System.out.println(kS(50) + " coins to make " + (d));
        //print(table);
    }
    
    public int kS(int a)
    { 
        if(a < 0)//assures you're not looking for a negitive value
        {
            return Integer.MAX_VALUE - 1;
        }
        else if(a == 0)//if you're looking at index 0 in the array, returns 0
        {
            return 0;
        }
        else if(table[a] > 0) //if the table isn't null
        {
            return table[a];//returns table at index a
        }
        else 
        {
            table[a] = 1 + kS(a - coins[0]);
            for(int i = 0; i < coins.length; i++)
            {
                d = a;
                if(table[a] < 1 + kS(a - coins[i]))
                {
                return table[a];//assures that you're getting the smaller table
                }
                else if(table[a] > 1 + kS(a - coins[i]))
                {
                table[a] = 1 + kS(a - coins[i]);//assures that you're getting the smallest table
                return table[a];
                }
            }
            return table[a];
        }
    }
    public void print(int[] c)//prints out the array if ever needed
    {
        
            for(int i = 0; i < c.length; i++)
        {
                System.out.print(c[i] + " ");
        }
            System.out.println();
    }
}
