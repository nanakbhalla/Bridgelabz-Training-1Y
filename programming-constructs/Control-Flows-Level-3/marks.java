import java.util.Scanner;
class marks{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Physics marks");
int a=sc.nextInt();
System.out.println("Enter Chemistry marks");
int b=sc.nextInt();
System.out.println("Enter Maths marks");
int c=sc.nextInt();
double avg=(a+b+c)/3;
if(avg>=80){System.out.println("Average marks="+avg);
System.out.println("Grade=A above agency-normalised standard");
}
else if(avg>=70 && avg<=79){System.out.println("Average marks="+avg);
System.out.println("Grade=B at agency-normalised standard");
}
else if(avg>=60 && avg<=69){System.out.println("Average marks="+avg);
System.out.println("Grade=C below but approaching agency-normalised standard");
}
else if(avg>=50 && avg<=59){System.out.println("Average marks="+avg);
System.out.println("Grade=D  well below agency-normalised standard");
}
else if(avg>=40 && avg<=49){System.out.println("Average marks="+avg);
System.out.println("Grade=E  too below agency-normalised standard");
}
else{System.out.println("Average marks="+avg);
System.out.println("Grade=R  Remedial standard");

}




}}