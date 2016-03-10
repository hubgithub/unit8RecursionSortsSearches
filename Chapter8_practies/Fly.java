
public class Fly
{

    public int fly(int x)
    {
        // put your code here
        return x + fly(x + 9) + fly(x-3);
    }
    
    public void test()
    {
        System.out.println(fly(98));
    }

}
