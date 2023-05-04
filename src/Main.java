public class Main
{
    public static void main(String[] args)
    {

        forloop();
    }

    public static void forloop()
    {
        int [][] ragged;
        ragged = new int [][]
                {
                        {21, 63, 50, 78, 16} , //row 0, ragged[0].length gives 5
                        {99, 72, 85} , //row 1, ragged[1].length gives 3
                        {36, 12, 47, 49, 28, 54}, //row 2, ragged[2].length gives 6
                        {34, 51, 17}
                };
        System.out.println(ragged[1][2]);
    }
}