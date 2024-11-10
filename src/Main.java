
public class Main{
    public static void main(String[] args){
        Main main = new Main();
        System.out.println(main.factorial(6));

        System.out.print("Combination of 6,3 is "+main.combination(0,3) + ".");
    }

    public int factorial(int x){
        assert x >=0: "factorail() is not defined for negative values.";
        int value = 1;
        while (x>0){
            value *= x;
            x--;
        }
        return value;
    }
    
    public int combination(int n, int r){
        assert n >=0 && r>=0: "n and r must be greater than 0";
        return factorial(n)/(factorial(r)*factorial(n-r));}

    //  // ! (a+b+c...+z)^n
    // public int binom(int... numbers, int exponential){
    //     int value = 0;
    //     for numb


    //     return 0;
    // }
}