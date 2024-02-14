import java.util.*;

class Conversion{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){
                double cel=0,fah=0,kev=0,temp;
                int opt;
                System.out.println("Unit Of Measurement :- ");
                System.out.println("\t 1-Celcius\n \t 2-Fahrenhite \n \t 3-Kelvin \n \t 4-exit");
                System.out.println("Please Select Unit Of Measurement");
                 opt = sc.nextInt();
                 if(opt == 4){
                    break;
                }
                else{
                        System.out.println("Enter Temperature Value ");
                        temp = sc.nextFloat();
                        if(opt==1){
                                fah=(temp*1.8)+32;
                                kev= temp + 273.15;

                                System.out.println(temp+" Degree Celsius Equals to "+fah+" Fahrenheit And "+kev+" Kelvin");
                        }
                       else if(opt==2){
                            cel=(temp-32)/1.8;
                            kev= ((temp-32)/1.8)+ 273.15;

                            System.out.println(temp+" Fahrenheit Equals to "+cel+" Degree Celsius And "+kev+" Kelvin");
                        }
                       else if(opt==3){
                            cel=temp - 273.15;
                            fah= ((temp - 273.15)*1.8)+32;

                            System.out.println(temp+" Kelvin  Equals to "+cel+" Degree Celsius And "+fah+" Fahrenheit");
                        } 
                        else{
                            System.out.println("Please Enter Valid Option");
                        }

                        System.out.println("----------------------------------------------------------------------------");
                        System.out.println("----------------------------------------------------------------------------");
            }
        }

    }
}