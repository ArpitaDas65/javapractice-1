public class datatype {
    public static void main(String[] args) {
        //integer data type
        int age =25;
        //double data type
        double price=19.99;
        //character data type
        char grade ='A';
        //boolean data types
        boolean isStudent =true;
        //string data type
        String name ="jhon smith";
        //array data type
        int[]scores={85,90,87};

        //display the values
      System.out.println("name:"+name);
      System.out.println("Age:"+age);
      System.out.println("price:"+price);
      System.out.println("grade:"+grade);
      System.out.println("Is Student:"+isStudent);
      System.out.println("scores:");
for(int score:scores){
    System.out.println(score);
}

    }
}
