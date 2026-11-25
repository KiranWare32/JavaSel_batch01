public class Ladderif {
    public static void main(String[] args){
        //if the marks are greater than 90 give grade A, marks are less than 75 give grade as B, marks are less than 60 give grade C, other marks Fail

        int marks = 8;

        if(marks >=90)
        {
            System.out.println("Grade A");
        } else if (marks >=75)
        {
            System.out.println("Grade B");
        }else if (marks >=60)
        {
            System.out.println("Grade c");
        }else {
            System.out.println("Fail");
        }


    }
}
