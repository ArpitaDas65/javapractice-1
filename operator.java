public class operator {
    public static void main(String[] args) {
        //declare variables
        int x=5;
        int y=3;
        //arithmetic operator
        int sum=x+y;
        //comparison operator
        boolean isEqual=(x==y);
        //logical operator
        boolean logicalresult=(x>0 && y<10);
        //increment operator 
        x++;
        //decrement operator
        y--;
        //display results
        System.out.println("sum:"+sum);
        System.out.println("are x and y are equal?:"+isEqual);
        System.out.println("logical result:"+logicalresult);
        System.out.println("value of x after increment:"+x);
        System.out.println("value of x after decrement:"+y);
    }
}
