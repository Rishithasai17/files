import java.util.*;
public class Score {
public static void main(String[] args) {
    String grade =null;
    System.out.println("enter");
    Scanner sc=new Scanner(System.in);
    int score=sc.nextInt();
    switch(score/10)
    {
case 10:
case 9:
grade="a";
break;
case 8:
grade="b";
break;
case 7:
grade="c";
break;
case 6:
grade="d";
break;
default:
grade="e";
break;
    }
    System.out.println(grade);
}

}
