import java.util.Scanner;
class UnitConvertor{
public static double convertKmToMiles(double km){
double km2miles=0.621371;
return km*km2miles;
}

public static double convertMilesToKm(double miles){
double miles2km=1.60934;
return miles*miles2km;
}

public static double convertMetersToFeet(double meters){
double meters2feet=3.28084;
return meters*meters2feet;
}

public static double convertFeetToMeters(double feet){
double feet2meters=0.3048;
return feet*feet2meters;
}

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("1-KM>MI 2-MI>KM 3-M>FT 4-FT>M");
int choice=sc.nextInt();
if(choice==1){
System.out.println("ENTER KM-");
System.out.println("MILES-"+convertKmToMiles(sc.nextDouble()));
}
else if(choice==2){
System.out.println("ENTER MILES-");
System.out.println("KM-"+convertMilesToKm(sc.nextDouble()));
}
else if(choice==3){
System.out.println("ENTER METERS-");
System.out.println("FEET-"+convertMetersToFeet(sc.nextDouble()));
}
else if(choice==4){
System.out.println("ENTER FEET-");
System.out.println("METERS-"+convertFeetToMeters(sc.nextDouble()));
}
sc.close();
}
}
