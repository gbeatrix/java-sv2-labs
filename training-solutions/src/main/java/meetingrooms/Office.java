package meetingrooms;

import java.util.ArrayList;
import java.util.List;

public class Office {
    private List<MeetingRoom> meetingRooms = new ArrayList<>();

    public void addMeetingRoom(MeetingRoom meetingRoom){
        meetingRooms.add(meetingRoom);
    }

    public void printNames(){
        for(MeetingRoom room : meetingRooms){
            System.out.println(room.getName());
        }
    }

    public void printNamesReverse(){
        for(int i=meetingRooms.size()-1; i>=0; i--){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printEvenNames(){
        for(int i=1; i<meetingRooms.size(); i+=2){
            System.out.println(meetingRooms.get(i).getName());
        }
    }

    public void printAreas(){
        System.out.printf("%-30s | %-10s | %-10s | %-10s%n", "név", "szélesség", "hosszúság", "terület");
        for(MeetingRoom room : meetingRooms){
            System.out.printf("%30s | %10d | %10d | %10d%n", room.getName(), room.getWidth(), room.getLength(), room.getArea());
        }
    }

    public void printMeetingRoomsWithName(String name){
        System.out.printf("%-10s | %-10s | %-10s%n", "szélesség", "hosszúság", "terület");
        for(MeetingRoom room : meetingRooms){
            if(room.getName().equals(name)){
                System.out.printf("%10d | %10d | %10d%n", room.getWidth(), room.getLength(), room.getArea());
            }
        }
    }

    public void printMeetingRoomsContains(String part){
        System.out.printf("%-10s | %-10s | %-10s%n", "szélesség", "hosszúság", "terület");
        for(MeetingRoom room : meetingRooms){
            if(room.getName().toLowerCase().contains(part.toLowerCase())){
                System.out.printf("%10d | %10d | %10d%n", room.getWidth(), room.getLength(), room.getArea());
            }
        }
    }

    public void printAreasLargerThan(int area){
        System.out.printf("%-30s | %-10s | %-10s | %-10s%n", "név", "szélesség", "hosszúság", "terület");
        for(MeetingRoom room : meetingRooms){
            if(room.getArea()>area){
                System.out.printf("%30s | %10d | %10d | %10d%n", room.getName(), room.getWidth(), room.getLength(), room.getArea());
            }
        }
    }
}
