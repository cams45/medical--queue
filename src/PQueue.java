import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class PQueue {

    private String major = "";
    private String minor = "";
    private String name = "";
    private String injury = "";
    private String Severity = "";
    private int count;
    private PriorityQueue pq = new PriorityQueue();
    private ArrayList minorList = new ArrayList();
    private ArrayList majorList = new ArrayList();



    public PQueue(){
        this.name = name;
        this.major = major;
        this.minor = minor;
        this.Severity = Severity;
        this.injury = injury;
        this.count = count;
    }

    public String PatiantQue(){
        for(int i = 0; i < 1; i++){
            pq.add("john smith");
            pq.add("cameron mclemore");
            pq.add("jessie jackson");
            pq.add("sara miller");
            pq.add("jacob jennings");
            pq.add("jimmy norton");
            pq.add("zack levinson");
        }
        System.out.println("this is the patient waiting List\n"+pq);
        return String.valueOf(pq);
    }





    public int getSize(){
        for(int i = 0; i < pq.size();i++){
            count = i +1;
        }
        if(count > 0){
            System.out.println("this is how many people are infront of you: "+count);
        }
        return count ;
    }



    public void getName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter your name");
        name = scan.nextLine();
    }










    public void injury(){
        majorList.add("broken bone");
        majorList.add("open wound");
        majorList.add("burns");
        majorList.add("organ failure");
        majorList.add("internal bleeding");
        majorList.add("missing appendage");


        minorList.add("cold");
        minorList.add("flu");
        minorList.add("stomach pain");
        minorList.add("sprains");
        minorList.add("muscle tare");
        minorList.add("concussion");

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter if your injury is major or minor");
        Severity = scan.nextLine();


        int day = 5;
        String invalid;

        // switch statement with int data type
        switch (Severity) {
            case "major":
                System.out.print("what major injury is it\n ");
                System.out.println(majorList);
                injury = scan.nextLine();
                System.out.println("-------------------------------------------------");
                pq.add(name);

                break;
            case "minor":
                System.out.print("what minor injury is it\n ");
                System.out.println(minorList);
                injury = scan.nextLine();
                pq.add(name);
                System.out.println("-------------------------------------------------");

                break;
            default:
                invalid = "Invalid choice";
                break;
        }
    }





    public String addToBack(){
        if(Severity.equals("minor")){
            pq.add(name);
        }
            System.out.println(pq);
                return String.valueOf(minorList);
    }







    public String addToFront(){
        if(Severity.equals("major")){
            pq.add(name);
        }
        System.out.println(pq);

        return String.valueOf(majorList);
    }








    public void remove(){
        pq.remove(name + 1);
        System.out.println("this is the new queue\n"+pq);
    }




    public String toString() {
                return "hello";
    }



}