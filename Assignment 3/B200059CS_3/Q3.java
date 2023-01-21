import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


class DepartmentMeetingScheduler{
    String meetingTitle;
    String meetingDate;
    String meetingStartTime;
    String meetingEndTime;
    String meetingDescription;

    public void displayMeetings(ArrayList<DepartmentMeetingScheduler> meetings, Date d){

        for(int i=0; i<meetings.size(); i++){
            String[] dates = meetings.get(i).meetingDate.split("/",-2);
            Date temp = new Date(Integer.parseInt(dates[2]) - 1990,Integer.parseInt(dates[1]) - 1,Integer.parseInt(dates[0]));
            if(d.compareTo(temp) == 0){
                System.out.println("On " + meetings.get(i).meetingDate + ", from " + meetings.get(i).meetingStartTime + " to " + meetings.get(i).meetingEndTime + " : " + meetings.get(i).meetingTitle + " : " + meetings.get(i).meetingDescription);
            };

        }
    }

    public DepartmentMeetingScheduler scheduleMeeting(ArrayList<DepartmentMeetingScheduler> meetings, String title, String date, String timeOfStart, String timeOfEnd, String description){



            String[] startTime = timeOfStart.split(":",-2);
            LocalTime timeStart = LocalTime.of(Integer.parseInt(startTime[0]),Integer.parseInt(startTime[1])); //works
            String[] dates = date.split("/",-2);
            Date temp = new Date(Integer.parseInt(dates[2]) - 1990,Integer.parseInt(dates[1]) - 1,Integer.parseInt(dates[0]));

            if(meetings.size() == 0){
                this.meetingTitle = title;
                this.meetingDate = date;
                this.meetingStartTime = timeOfStart;
                this.meetingEndTime = timeOfEnd;
                this.meetingDescription = description;
                System.out.println("Scheduled successfully");
                return this;
            }

            for(int j=0; j<meetings.size(); j++){
                String[] eachDetailStartTime = meetings.get(j).meetingStartTime.split(":",-2);
                String[] eachDetailEndTime = meetings.get(j).meetingEndTime.split(":",-2);
                String[] eachDate = meetings.get(j).meetingDate.split("/",-2);
                Date newTemp = new Date(Integer.parseInt(eachDate[2])-1990,Integer.parseInt(eachDate[1]) - 1, Integer.parseInt(eachDate[0]));
                LocalTime eachStartTime = LocalTime.of(Integer.parseInt(eachDetailStartTime[0]),Integer.parseInt(eachDetailStartTime[1]));
                LocalTime eachEndTime = LocalTime.of((Integer.parseInt(eachDetailEndTime[0])),Integer.parseInt(eachDetailEndTime[1]));
                if(timeStart.compareTo(eachStartTime) > 0 && timeStart.compareTo(eachEndTime) < 0 && (temp.compareTo(newTemp) == 0)){
                    System.out.println("Collision! Already another meeting is scheduled");
                    return null;
                }
                else{
                    this.meetingTitle = title;
                    this.meetingDate = date;
                    this.meetingStartTime = timeOfStart;
                    this.meetingEndTime = timeOfEnd;
                    this.meetingDescription = description;
                    System.out.println("Scheduled successfully");
                    return this;
                }
            }
        return null;
    }


}

public class Q3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String inputline = "";
        String title = "";
        String date = "";
        String startTime = "";
        String endTime = "";
        String description = "";
        ArrayList<DepartmentMeetingScheduler> allMeetings= new ArrayList<>();
        String fullDetails = "";
        int result;

        System.out.println("1. Schedule Meeting");
        System.out.println("2. List Meetings");
        while(true){
            System.out.print("Enter your choice: ");
            inputline = input.nextLine();
            if(inputline.equals("1")){
                System.out.print("Title - ");
                title = input.nextLine();
                System.out.print("Date - ");
                date = input.nextLine();
                System.out.print("Start time - ");
                startTime = input.nextLine();
                System.out.print("End time - ");
                endTime = input.nextLine();
                System.out.print("Description - ");
                description = input.nextLine();
                DepartmentMeetingScheduler meetingTemp = new DepartmentMeetingScheduler();
                //result = meetingTemp.scheduleMeeting(allMeetings,title,date,startTime,endTime,description);
                meetingTemp = meetingTemp.scheduleMeeting(allMeetings,title,date,startTime,endTime,description);
                if(meetingTemp != null){
                    allMeetings.add(meetingTemp);
                }
            }
            else if(inputline.equals("2")){
                System.out.print("Enter the date you wish to check: ");
                inputline = input.nextLine();
                String[] actualDate = inputline.split("/",-2);
                Date currentDate = new Date(Integer.parseInt(actualDate[2]) - 1990,Integer.parseInt(actualDate[1]) - 1,Integer.parseInt(actualDate[0]));
                DepartmentMeetingScheduler tempMeet = new DepartmentMeetingScheduler();
                tempMeet.displayMeetings(allMeetings,currentDate);
            }
            else {
                break;
            }
        }
    }
}
