/*
Programmed by ALT 0173
Members: Vega, Brocoy & Aco
Made with <3
*/
package physics_formula_solver;
import java.util.Scanner;

public class Physics_Formula_Solver {
    
 public static void main(String[] args) {
  menu();
  }
 public static void menu() {
  int  x=1, y=0;
  String topic;
  Scanner console = new Scanner(System.in);
  while(x > y) {
    System.out.println("\n\tPhysics Topic");
    System.out.println("\t[1]Force and Motion");
    System.out.println("\t[2]Work and Power");
    System.out.println("\t[3]Weight and Mass");
    System.out.println("\t[4]Density");
    System.out.println("\t[5]Physic's Law");
    System.out.println("\t[0]Exit\n");
    System.out.println("Enter the coresponding number to choose a process to be execute");
    System.out.printf(">> ");
  topic = console.next();
  switch (topic) {
    case "1": topic1(); break;
    case "2": topic2();break;
    case "3": topic3(); break;
    case "4": topic4(); break;
    case "5": topic5(); break;
    case "0": System.exit(0); break;
    default: System.out.println("Invalid Input\n");
        }  
    }
}
 
 public static void topic1() {
Scanner console = new Scanner(System.in);
  int  x = 1, y = 0;
  String topic;
  while (x > y) {
    System.out.println("\n\t[1]Getting the total Speed: ");
    System.out.println("\t[2]Getting the total Time: ");
    System.out.println("\t[3]Getting the total Distance ");
    System.out.println("\t[4]Getting the total Acceleration: ");
    System.out.println("\t[6]Go Back to Main Menu: ");
    System.out.println("\t[0]Exit\n ");
    System.out.println("Enter the coresponding number to choose a process to be execute");
    System.out.printf(">> ");
  topic = console.next();
  switch (topic) {
    case "1":  
        Sub1Topic1(); break;
    case "2":
        Sub2Topic1(); break;
    case "3": 
        Sub3Topic1(); break;
    case "4": 
        Sub4Topic1(); break;
    case "6": menu(); y=1; break;
    case "0": System.exit(0); break;
    default:
        System.out.println("Invalid Input");
    }
  }
}
    public static void Sub1Topic1(){
        Scanner console = new Scanner(System.in);
    String distance_value, distance_unit, time_value, time_unit;
    int x=1, y=0;
    double distance, time, speed;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Enter Distance and Unit: ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(space)UNIT \n"
                + "\tExample for entering Distance and Unit:  100 km"
                + "\n"
                + "\tUnits for Distance\n"
                + "\t\tm = meter/s\n"
                + "\t\tkm = kilometer/s\n"
                + "\t\tmi = mile/s\n"
                + "\t\tft = foot/feet\n"
                + "\n"
                + "\tExample for entering Time and Unit: 1 hr\n"
                + "\tUnits for Time\n"
                + "\t\tsec = second\n"
                + "\t\tsecs = seconds\n"
                + "\t\thr = hour\n"
                + "\t\thrs = hours\n"); 
                Sub1Topic1();
    }else if(console.hasNext("5")) {
            topic1(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    distance =  Double.parseDouble(console.next());
    distance_unit = console.next();
    System.out.printf("Enter Time and Unit: ");
    time =  Double.parseDouble(console.next());
    time_unit = console.next();
    speed = distance / time;
    speed = Math.round(speed * 100)/100.0;
    if ("m".equals(distance_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
        System.out.println("\n\tspeed = distance / time");
        System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Speed is: " + speed + " m/sec" );
    }else if("m".equals(distance_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
        System.out.println("\n\tspeed = distance / time");
        System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Speed is: " + speed + " m/hr" );
        }else if("km".equals(distance_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
            System.out.println("\n\tspeed = distance / time");
            System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
            System.out.println("The Total Speed is: " + speed + " km/sec" );
            }else if("km".equals(distance_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                System.out.println("\n\tspeed = distance / time");
                System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
                System.out.println("The Total Speed is: " + speed + " km/hr" );
                }else if("mi".equals(distance_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                    System.out.println("\n\tspeed = distance / time");
                    System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
                    System.out.println("The Total Speed is: " + speed + " mi/sec" );
                    }else if("mi".equals(distance_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                        System.out.println("\n\tspeed = distance / time");
                        System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
                        System.out.println("The Total Speed is: " + speed + " mi/hr" );
                        }else if("ft".equals(distance_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                            System.out.println("\n\tspeed = distance / time");
                            System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
                            System.out.println("The Total Speed is: " + speed + " ft/sec" );
                            }else if("ft".equals(distance_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                                System.out.println("\n\tspeed = distance / time");
                                System.out.println("\t      = " + distance + distance_unit + " / " + time + time_unit + "\n");
                                System.out.println("The Total Speed is: " + speed + " ft/hr" );
                                }else{
                                    System.out.println("\tInvalid Input\n");
                    }
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
            }
        }while (x > y );
    }
    public static void Sub2Topic1(){
        Scanner console = new Scanner(System.in);
    String distance_value, distance_unit, speed_value, speed_unit;
    int x=1, y=0;
    double distance, time, speed;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Enter Distance and Unit: ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(space)UNIT \n"
                + "\tExample for entering Distance and Unit:  100 km"
                + "\n"
                + "\tUnits for Distance\n"
                + "\t\tm = meter/s\n"
                + "\t\tkm = kilometer/s\n"
                + "\t\tmi = mile/s\n"
                + "\t\tft = foot/feet\n"
                + "\n"
                + "\tExample for entering Speed and Unit: 1 hr\n"
                + "\tUnits for Speed\n"
                + "\t\tsec = second\n"
                + "\t\tsecs = seconds\n"
                + "\t\thr = hour\n"
                + "\t\thrs = hours\n"); 
                Sub2Topic1();
    }else if(console.hasNext("5")) {
            topic1(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    distance =  Double.parseDouble(console.next());
    distance_unit = console.next();
    System.out.printf("Enter Time and Unit(per sec/hr): ");
    speed =  Double.parseDouble(console.next());
    speed_unit = console.next();
    time = distance / speed;
    time = Math.round(time * 100)/100.0;
    if ("m".equals(distance_unit) && "sec".equals(speed_unit) || "secs".equals(speed_unit)){
        System.out.println("\n\ttime = distance / speed");
        System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
        System.out.println("The Total Time is: " + time + " m/sec" );
    }else if("m".equals(distance_unit) && "hr".equals(speed_unit) || "hrs".equals(speed_unit)){
        System.out.println("\n\ttime = distance / speed");
        System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
        System.out.println("The Total Time is: " + time + " m/hr" );
        }else if("km".equals(distance_unit) && "sec".equals(speed_unit) || "secs".equals(speed_unit)){
            System.out.println("\n\ttime = distance / speed");
            System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
            System.out.println("The Total Time is: " + time + " km/sec" );
            }else if("km".equals(distance_unit) && "hr".equals(speed_unit) || "hrs".equals(speed_unit)){
                System.out.println("\n\ttime = distance / speed");
                System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
                System.out.println("The Total Time is: " + time + " km/hr" );
                }else if("mi".equals(distance_unit) && "sec".equals(speed_unit) || "secs".equals(speed_unit)){
                    System.out.println("\n\ttime = distance / speed");
                    System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
                    System.out.println("The Total Time is: " + time + " mi/sec" );
                    }else if("mi".equals(distance_unit) && "hr".equals(speed_unit) || "hrs".equals(speed_unit)){
                        System.out.println("\n\ttime = distance / speed");
                        System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
                        System.out.println("The Total Time is: " + time + " mi/hr" );
                        }else if("ft".equals(distance_unit) && "sec".equals(speed_unit) || "secs".equals(speed_unit)){
                            System.out.println("\n\ttime = distance / speed");
                            System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
                            System.out.println("The Total Time is: " + time + " ft/sec" );
                            }else if("ft".equals(distance_unit) && "hr".equals(speed_unit) || "hrs".equals(speed_unit)){
                                System.out.println("\n\ttime = distance / speed");
                                System.out.println("\t      = " + distance + distance_unit + " / " + speed + speed_unit + "\n");
                                System.out.println("The Total Time is: " + time + " ft/hr" );
                                }else{
                                    System.out.println("\tInvalid Input\n");
                    }
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
            }
        }while (x > y );
    }
    public static void Sub3Topic1(){
        Scanner console = new Scanner(System.in);
    String speed_value, time_unit, time_value, speed_unit;
    int x=1, y=0;
    double distance, time, speed, m , km , mi , ft;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Enter Speed and Unit(per sec/hr): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(space)UNIT \n"
                + "\tExample for entering Speed and Unit:  100 hr"
                + "\n"
                + "\tUnits for Speed\n"
                + "\t\tsec= second\n"
                + "\t\tsecs = second/s\n"
                + "\t\thr = hrour\n"
                + "\t\thrs = hour/s\n"
                + "\n"
                + "\tExample for entering Speed and Unit: 1 hr\n"
                + "\tUnits for Time\n"
                + "\t\tsec = second\n"
                + "\t\tsecs = seconds\n"
                + "\t\thr = hour\n"
                + "\t\thrs = hours\n"); 
                Sub3Topic1();
    }else if(console.hasNext("5")) {
            topic1(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    speed =  Double.parseDouble(console.next());
    speed_unit = console.next();
    System.out.printf("Enter Time and Unit(per sec/hr): ");
    time =  Double.parseDouble(console.next());
    time_unit = console.next();
    distance = speed * time;
    m = distance;
    km = m / 1000;
    mi = km * 0.6213712;
    ft = mi * 5280.0;
    if ("sec".equals(speed_unit) || "secs".equals(speed_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
        System.out.println("\n\tdistance = time * speed");
        System.out.println("\t      = " + speed + speed_unit + " * " + time + time_unit + "\n");
        System.out.printf("The Total Distance is:  %.2f m/sec\n", m);
        System.out.printf( "\t\t\t%.2f km/sec\n",km);
        System.out.printf( "\t\t\t%.2f mi/sec\n",mi);
        System.out.printf( "\t\t\t%.2f ft/sec\n",ft);
    }else if("hr".equals(speed_unit) || "hrs".equals(speed_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
        System.out.println("\n\ttime = speed * time");
        System.out.println("\t      = " + speed + speed_unit + " * " + time + time_unit + "\n");
        System.out.printf("The Total Distance is:  %.2f m/hr\n", m);
        System.out.printf( "\t\t\t%.2f km/hr\n",km);
        System.out.printf( "\t\t\t%.2f mi/hr\n",mi);
        System.out.printf( "\t\t\t%.2f ft/hr\n",ft);
        }else if("sec".equals(speed_unit) || "secs".equals(speed_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
            System.out.println("\n\ttime = speed * time");
            System.out.println("\t      = " + speed + speed_unit + " * " + time + time_unit + "\n");
            System.out.printf("The Total Distance is:  %.2f m/hr\n", m);
        System.out.printf( "\t\t\t%.2f km/hr\n",km);
        System.out.printf( "\t\t\t%.2f mi/hr\n",mi);
        System.out.printf( "\t\t\t%.2f ft/hr\n",ft);
            }else if("hr".equals(speed_unit) || "hrs".equals(speed_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                System.out.println("\n\ttime = speed * time");
                System.out.println("\t      = " + speed + speed_unit + " / " + time + time_unit + "\n");
                System.out.printf("The Total Distance is:  %.2f m/hr\n", m);
        System.out.printf( "\t\t\t%.2f km/hr\n",km);
        System.out.printf( "\t\t\t%.2f mi/hr\n",mi);
        System.out.printf( "\t\t\t%.2f ft/hr\n",ft);
                }else{
                                    System.out.println("\tInvalid Input\n");
                    }
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
            }
        }while (x > y );
    }
    public static void Sub4Topic1(){
        Scanner console = new Scanner(System.in);
    String velocity_value, velocity_unit, time_value, time_unit;
    int x=1, y=0;
    double acc, time, velocity;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Enter Changes in Velocity and Unit: ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(space)UNIT \n"
                + "\tExample for entering Changes and Velocity and Unit:  100 km"
                + "\n"
                + "\tUnits for Distance\n"
                + "\t\tm = meter/s\n"
                + "\t\tkm = kilometer/s\n"
                + "\t\tmi = mile/s\n"
                + "\t\tft = foot/feet\n"
                + "\n"
                + "\tExample for entering Time and Unit: 1 hr\n"
                + "\tUnits for Time\n"
                + "\t\tsec = second\n"
                + "\t\tsecs = seconds\n"
                + "\t\thr = hour\n"
                + "\t\thrs = hours\n"); 
                Sub4Topic1();
    }else if(console.hasNext("5")) {
            topic1(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    velocity =  Double.parseDouble(console.next());
    velocity_unit = console.next();
    System.out.printf("Enter Time and Unit: ");
    time =  Double.parseDouble(console.next());
    time_unit = console.next();
    acc = velocity / time;
    acc = Math.round(acc * 100)/100.0;
    if ("m".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
        System.out.println("\n\tacceleration = velocity / time");
        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Acceleration is: " + acc + " m/s" );
    }else if("m".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
        System.out.println("\n\tacceleration = velocity / time");
        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Acceleration is: " + acc + " m/" );
        }else if("km".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
            System.out.println("\n\tacceleration = velocity / time");
            System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
            System.out.println("The Total Acceleration is: " + acc + " km/s" );
            }else if("km".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                System.out.println("\n\tacceleration = velocity / time");
                System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                System.out.println("The Total Acceleration is: " + acc + " km/h" );
                }else if("mi".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                    System.out.println("\n\tacceleration = velocity / time");
                    System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                    System.out.println("The Total Acceleration is: " + acc + " mi/s" );
                    }else if("mi".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                        System.out.println("\n\tacceleration = velocity / time");
                        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                        System.out.println("The Total Acceleration is: " + acc + " mi/h" );
                        }else if("ft".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                            System.out.println("\n\tacceleration = velocity / time");
                            System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                            System.out.println("The Total Acceleration is: " + acc + " ft/s" );
                            }else if("ft".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                                System.out.println("\n\tacceleration = velocity / time");
                                System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                                System.out.println("The Total Acceleration is: " + acc + " ft/h" );
                                }else{
                                    System.out.println("\tInvalid Input\n");
                    }
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
            }
        }while (x > y );
    }
    
public static void topic2() {
Scanner console = new Scanner(System.in);
  int  x = 1, y = 0;
  String topic;
  while (x > y) {
    System.out.println("\n\t[1]Getting the total Work: ");
    System.out.println("\t[2]Getting the total Power: ");
    System.out.println("\t[6]Go Back to Main Menu: ");
    System.out.println("\t[0]Exit\n ");
    System.out.println("Enter the coresponding number to choose a process to be execute");
    System.out.printf(">> ");
  topic = console.next();
  switch (topic) {
    case "1":  
        Sub1Topic2(); break;
    case "2":
        Sub2Topic1(); break;
    case "6": menu(); y=1; break;
    case "0": System.exit(0); break;
    default:
        System.out.println("Invalid Input");
        }
    }
  }
    public static void Sub1Topic2(){
        Scanner console = new Scanner(System.in);
    int x=1, y=0;
    double displacement, work, force;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input Force(in Newton): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(hit enter) \n"
                + "\tInput Force (in Newton): Enter the value, no available unit/s"
                + "\n"
                + "\tInput Displacement (in meters) : Enter the value, no available unit/s");
                Sub1Topic2();
    }else if(console.hasNext("5")) {
            topic2(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    force = console.nextDouble();
    System.out.printf("Input Displacement(in meters): ");
    displacement =  console.nextDouble();
    work = force * displacement;
    work = Math.round(work * 100)/100.0;
        System.out.println("\n\twork = force * displacement\n"
                + "             = " + force +" * "+ displacement);
        System.out.printf("\nThe total work is: %.2f joules\n", work);
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
                Sub1Topic2();
            }
        }while (x > y );
    }
    public static void Sub2Topic2(){
        Scanner console = new Scanner(System.in);
    int x=1, y=0;
    double power, work, time;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input Work(in Joules): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(hit enter) \n"
                + "\tInput Work(in Joules): Enter the value, no available unit/s"
                + "\n"
                + "\tInput Time (in seconds) : Enter the value, no available unit/s");
                Sub1Topic2();
    }else if(console.hasNext("5")) {
            topic2(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    work = console.nextDouble();
    System.out.printf("Input Time(in seconds): ");
    time =  console.nextDouble();
    power = work / time;
    power = Math.round(power * 100)/100.0;
        System.out.println("\n\tpower = work * time\n"
                + "             = " + work +" * "+ time);
        System.out.printf("\nThe total Power is: %.2f watts\n", power);
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
                Sub1Topic2();
            }
        }while (x > y );
    }
    
public static void topic3() {
Scanner console = new Scanner(System.in);
  int  x = 1, y = 0;
  String topic;
  while (x > y) {
    System.out.println("\n\t[1]Getting the total Weight: ");
    System.out.println("\t[2]Getting the total Mass: ");
    System.out.println("\t[6]Go Back to Main Menu: ");
    System.out.println("\t[0]Exit\n ");
    System.out.println("Enter the coresponding number to choose a process to be execute");
    System.out.printf(">> ");
  topic = console.next();
  switch (topic) {
    case "1":  
        Sub1Topic3(); break;
    case "2":
        Sub2Topic3(); break;
    case "6": menu(); y=1; break;
    case "0": System.exit(0); break;
    default:
        System.out.println("Invalid Input");
        }
    }
  }
    public static void Sub1Topic3(){
        Scanner console = new Scanner(System.in);
    int x=1, y=0;
    double w, m, a;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input Mass(in kg.): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(hit enter) \n"
                + "\tInput Mass(in kg.): Enter the value, no available unit/s"
                + "\n"
                + "\tInput Acceleration (m/s) : Enter the value, no available unit/s");
                Sub1Topic3();
    }else if(console.hasNext("5")) {
            topic3(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    m = console.nextDouble();
    System.out.printf("Input Time(in seconds): ");
    a =  console.nextDouble();
    w = m * a;
    w = Math.round(w * 100)/100.0;
        System.out.println("\n\tweight = mass * acceleration\n"
                + "             = " + m +" * "+ a);
        System.out.printf("\nThe total Power is: %.2f \n", w);
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
                Sub1Topic3();
            }
        }while (x > y );
    }
    public static void Sub2Topic3(){
        Scanner console = new Scanner(System.in);
    int x=1, y=0;
    double w, m, a;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input Weight(in Newton): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(hit enter) \n"
                + "\tInput Weight(in Newton): Enter the value, no available unit/s"
                + "\n"
                + "\tInput Acceleration (in seconds) : Enter the value, no available unit/s");
                Sub1Topic3();
    }else if(console.hasNext("5")) {
            topic3(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    w = console.nextDouble();
    System.out.printf("Input Acceleration(m/s): ");
    a =  console.nextDouble();
    m = w / a;
    m = Math.round(m * 100)/100.0;
        System.out.println("\n\tweight = mass / acceleration\n"
                + "             = " + w +" / "+ a);
        System.out.printf("\nThe total Power is: %.2f kg\n", m);
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
                Sub2Topic3();
            }
        }while (x > y );
    }
    
public static void topic4(){
        Scanner console = new Scanner(System.in);
    int x=1, y=0;
    double d, m, v;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input Mass(in gram/s): ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(hit enter) \n"
                + "\tInput Mass(in gram/s): Enter the value, no available unit/s"
                + "\n"
                + "\tInput Volume (cm) : Enter the value, no available unit/s");
                Sub1Topic3();
    }else if(console.hasNext("5")) {
            topic4(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    m = console.nextDouble();
    System.out.printf("Input Acceleration(m/s): ");
    v =  console.nextDouble();
    d = m / v;
    d = Math.round(d * 100)/100.0;
        System.out.println("\n\tdensity = masss / volume\n"
                + "             = " + m +" / "+ v);
        System.out.printf("\nThe total Power is: %.2f kg\n", d);
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
                topic4();
            }
        }while (x > y );
    }

 public static void topic5() {
Scanner console = new Scanner(System.in);
  int  x = 1, y = 0;
  String topic;
  while (x > y) {
    System.out.println("\n\t[1]Newton's 2nd Law(Acceleration): ");
    System.out.println("\t[2]Boye's Law: ");
    System.out.println("\t[3]Avogrado's Law ");
    System.out.println("\t[6]Go Back to Main Menu: ");
    System.out.println("\t[0]Exit\n ");
    System.out.println("Enter the coresponding number to choose a process to be execute");
    System.out.printf(">> ");
  topic = console.next();
  switch (topic) {
    case "1":  
        Sub1Topic5(); break;
    case "2":
        Sub2Topic5(); break;
    case "3": 
         break;
    case "6": menu(); y=1; break;
    case "0": System.exit(0); break;
    default:
        System.out.println("Invalid Input");
        }
    }
  }
 public static void Sub1Topic5(){
        Scanner console = new Scanner(System.in);
    String velocity_value, velocity_unit, time_value, time_unit;
    int x=1, y=0;
    double velocity, time, acc;
    
    do {
        try {
    System.out.println("\n[1]Help [5]Back [6]Main Menu [0]Exit");
    System.out.printf("Input changes in velocity and Unit: ");
    if (console.hasNext("1")) {
        System.out.println("\n\tVALUE(space)UNIT \n"
                + "\tInput changes in velocity and Unit:  100 km"
                + "\n"
                + "\tUnits for Velocity\n"
                + "\t\tm = meter/s\n"
                + "\t\tkm = kilometer/s\n"
                + "\t\tmi = mile/s\n"
                + "\t\tft = foot/feet\n"
                + "\n"
                + "\tExample for entering Time and Unit: 1 hr\n"
                + "\tUnits for Time\n"
                + "\t\tsec = second\n"
                + "\t\tsecs = seconds\n"
                + "\t\thr = hour\n"
                + "\t\thrs = hours\n"); 
                Sub1Topic5();
    }else if(console.hasNext("5")) {
            topic5(); 
        }else if (console.hasNext("6")){
            menu();
            }else if (console.hasNext("0")){
                System.exit(0);
                }else {
    velocity =  Double.parseDouble(console.next());
    velocity_unit = console.next();
    System.out.printf("Enter Time and Unit: ");
    time =  Double.parseDouble(console.next());
    time_unit = console.next();
    acc = velocity / time;
    acc = Math.round(acc * 100)/100.0;
    if ("m".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
        System.out.println("\n\tacceleration = velocity / time");
        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Speed is: " + acc + " m/sec" );
    }else if("m".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
        System.out.println("\n\tacceleration = velocity / time");
        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
        System.out.println("The Total Speed is: " + acc + " m/hr" );
        }else if("km".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
            System.out.println("\n\tacceleration = velocity / time");
            System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
            System.out.println("The Total Speed is: " + acc + " km/sec" );
            }else if("km".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                System.out.println("\n\tacceleration = velocity / time");
                System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                System.out.println("The Total Speed is: " + acc + " km/hr" );
                }else if("mi".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                    System.out.println("\n\tacceleration = velocity / time");
                    System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                    System.out.println("The Total Speed is: " + acc + " mi/sec" );
                    }else if("mi".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                        System.out.println("\n\tacceleration = velocity / time");
                        System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                        System.out.println("The Total Speed is: " + acc + " mi/hr" );
                        }else if("ft".equals(velocity_unit) && "sec".equals(time_unit) || "secs".equals(time_unit)){
                            System.out.println("\n\tacceleration = velocity / time");
                            System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                            System.out.println("The Total Speed is: " + acc + " ft/sec" );
                            }else if("ft".equals(velocity_unit) && "hr".equals(time_unit) || "hrs".equals(time_unit)){
                                System.out.println("\n\tacceleration = velocity / time");
                                System.out.println("\t      = " + velocity + velocity_unit + " / " + time + time_unit + "\n");
                                System.out.println("The Total Speed is: " + acc + " ft/hr" );
                                }else{
                                    System.out.println("\tInvalid Input\n");
                    }
                }
            }catch (Exception e){
                System.out.println("\tInvalid Input\n");
            }
        }while (x > y );
    }
 public static void Sub2Topic5(){
     Scanner console = new Scanner(System.in);
     float p1, p2 , v1, v2;
     String val;
     System.out.println("\nBoyle's Law\n");
     System.out.println("Value you're looking for:");
     System.out.println("[1]P1 Initial Pressure [2]P2 Initial Pressure [3]V1 Initial Volume [4]V2 Initial Volume");
     System.out.println("[5]Back [6]Main Menu [7]Help [0]Exit\n");
     System.out.printf(">> ");
      val = console.next();
      switch(val) {
          case "1": 
              System.out.printf("Input P2 value: ");
                      p2 = console.nextFloat();
                        System.out.printf("Input V1 value: ");
                           v1 = console.nextFloat();
                                System.out.printf("Input V2 value: ");
                                    v2 = console.nextFloat();
                                    p1 = ( p2 * v2 )/ v1;
                                        System.out.printf("\n\tp1 = (p2 * v2) / v1\n"
                                                + "           = " + "(" + p2+ " * " +v2+ ")" + "/" + v1);
                                                System.out.printf("\n        P1 = %.2f\n", p1);
              Sub2Topic5();break;
          case "2": 
          System.out.printf("Input P1 value: ");
                      p1 = console.nextFloat();
                        System.out.printf("Input V1 value: ");
                           v1 = console.nextFloat();
                                System.out.printf("Input V2 value: ");
                                    v2 = console.nextFloat();
                                    p2 = ( p1 * v2 )/ v1;
                                        System.out.printf("\n\tp1 = (p1 * v2) / v1\n"
                                                + "           = " + "(" + p1 + " * " + v2+ ")" + "/" + v1);
                                                System.out.printf("\n        P2 = %.2f\n", p2);
              Sub2Topic5();break;
          case "3": 
              System.out.printf("Input P1 value: ");
                      p1 = console.nextFloat();
                        System.out.printf("Input P2 value: ");
                           p2 = console.nextFloat();
                                System.out.printf("Input V2 value: ");
                                    v2 = console.nextFloat();
                                    v1 = ( p1 * p2 )/ v2;
                                        System.out.printf("\n\tv1 = (p1 * p2) / v2\n"
                                                + "           = " + "(" + p1 + " * " + p2+ ")" + "/" + v2);
                                                System.out.printf("\n        V1 = %.2f\n", v1);
              Sub2Topic5();;break;
          case "4": 
              System.out.println("Input P1 value: ");
                      p1 = console.nextFloat();
                        System.out.println("Input P2 value: ");
                           p2 = console.nextFloat();
                                System.out.println("Input V1 value: ");
                                    v1 = console.nextFloat();
                                    v2 = ( p1 * p2 )/ v1;
                                        System.out.printf("\n\tv2 = (p1 * p2) / v1\n"
                                                + "           = " + "(" + p1 + " * " + p2+ ")" + "/" + v1);
                                                System.out.printf("\n        V2 = %.2f\n", v2);
              Sub2Topic5();;break;
          default : 
              System.out.println("Invalid Input"); Sub2Topic5(); break;
              
      }
 }
 public static void Sub3Topic5(){
     Scanner console = new Scanner(System.in);
     float n1, n2 , v1, v2;
     String val;
     System.out.println("\nAvogrado's Law\n");
     System.out.println("Value you're looking for:");
     System.out.println("[1]P1 Initial Pressure [2]P2 Initial Pressure [3]V1 Initial Volume [4]V2 Initial Volume");
     System.out.println("[5]Back [6]Main Menu [7]Help [0]Exit\n");
     System.out.printf(">> ");
      val = console.next();
      switch(val) {
          case "1": 
              System.out.printf("Input V2 value: ");
                      v2 = console.nextFloat();
                        System.out.printf("Input N1 value: ");
                           n1 = console.nextFloat();
                                System.out.printf("Input N2 value: ");
                                    n2 = console.nextFloat();
                                    v1 = ( n1 * v2 )/ n2;
                                        System.out.printf("\n\tv1 = (n1 * v2) / n2\n"
                                                + "           = " + "(" + n1+ " * " +v2+ ")" + "/" + n2);
                                                System.out.printf("\n        P1 = %.2f\n", v1);
              Sub2Topic5();break;
          case "2": 
          System.out.printf("Input V1 value: ");
                      v1 = console.nextFloat();
                        System.out.printf("Input N1 value: ");
                           n1 = console.nextFloat();
                                System.out.printf("Input N2 value: ");
                                    n2 = console.nextFloat();
                                    v2 = ( v1 * n2 )/ n1;
                                        System.out.printf("\n\tv2 = (v1 * n2 ) / n1\n"
                                                + "           = " + "(" + v1 + " * " + n2+ ")" + "/" + n1);
                                                System.out.printf("\n        P2 = %.2f\n", v2);
              Sub2Topic5();break;
          case "3": 
              System.out.printf("Input V1 value: ");
                      v1 = console.nextFloat();
                        System.out.printf("Input V2 value: ");
                           v2 = console.nextFloat();
                                System.out.printf("Input N2 value: ");
                                    n2 = console.nextFloat();
                                    n1 = ( v1 * n2 )/ v2;
                                        System.out.printf("\n\tn1 = (v1 * n2) / v2\n"
                                                + "           = " + "(" + v1 + " * " + n2+ ")" + "/" + v2);
                                                System.out.printf("\n        V1 = %.2f moles\n", n1);
              Sub2Topic5();;break;
          case "4": 
              System.out.println("Input V1 value: ");
                      v1 = console.nextFloat();
                        System.out.println("Input V2 value: ");
                           v2 = console.nextFloat();
                                System.out.println("Input N1 value: ");
                                    n1 = console.nextFloat();
                                    n2 = ( n1 * v2 )/ v1;
                                        System.out.printf("\n\tn2 = (n1 * v2) / v1\n"
                                                + "           = " + "(" + n1 + " * " + v2+ ")" + "/" + v1);
                                                System.out.printf("\n        V2 = %.2f moles\n", n2);
              Sub2Topic5();;break;
          default : 
              System.out.println("Invalid Input"); Sub2Topic5(); break;
              
      }
 }
 
}


