import java.util.Arrays;
import java.util.Scanner;

class Person{
    String person_name;
}

class Patient extends Person{
    String patient_ID;
}

public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Scanner line = new Scanner(System.in);
        int numberOfPatients;
        int i=0;
        String name = "";
        String ID = "";


        System.out.print("Enter the number of patients: ");
        numberOfPatients = input.nextInt();

        Patient[] patients = new Patient[numberOfPatients];

        for(int k=0; k<numberOfPatients; k++){
            System.out.println("Enter the details of patient " + (k+1));
            System.out.print("Name: ");
            name = line.nextLine();

            System.out.print("Patient ID: ");
            ID = line.nextLine();
            patients[i] = new Patient();
            patients[i].person_name = name;
            patients[i].patient_ID = ID;
            i++;
        }

        int[] ages = new int[numberOfPatients];

        for(int k=0; k<numberOfPatients; k++){
            String[] details = patients[k].patient_ID.split("-",-2);
            ages[k] = Integer.parseInt(details[1]);
        }

        Arrays.sort(ages);
        int count = ages.length - 1;

        System.out.println("List of Patients to be tested are: ");
        int k = 0;

        while(count > -1){
            String[] details = patients[k].patient_ID.split("-",-2);
            if(ages[count] == Integer.parseInt(details[1])){
                System.out.println(patients[k].patient_ID + " " + patients[k].person_name);
                count--;
                k=0;
            }
            else
                k++;
        }

    }
}
