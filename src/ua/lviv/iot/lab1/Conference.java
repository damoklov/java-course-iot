package ua.lviv.iot.lab1;

public class Conference {
    private static final String DEFAULT_NAME= "N/A";
    private static final String DEFAULT_CITY = "N/A";
    private static final String DEFAULT_TOPIC = "N/A";
    private static final String DEFAULT_ORGANIZER = "N/A";
    private static final String DEFAULT_KEYNOTE = "N/A";
    private static final int DEFAULT_ATTENDEES = 0;
    private static final double DEFAULT_PRICE = 0.0;
    private static final boolean DEFAULT_WORKSHOPS = false;

    public static int conferenceNumber;
    public String conferenceName;
    public String conferenceCity;
    public int numberOfAttendees;
    public double ticketPrice;
    private String conferenceTopic;
    private String conferenceOrganizer;
    protected boolean workshopsAvailable;
    protected String conferenceKeynote;

    Conference(){
        this(DEFAULT_NAME, DEFAULT_CITY, DEFAULT_ATTENDEES, DEFAULT_PRICE, DEFAULT_TOPIC, DEFAULT_ORGANIZER, DEFAULT_WORKSHOPS, DEFAULT_KEYNOTE);
    }
    Conference(String name, String city, int attendees, double price){
        this(name, city, attendees, price, DEFAULT_TOPIC, DEFAULT_ORGANIZER, DEFAULT_WORKSHOPS, DEFAULT_KEYNOTE);
    }
    Conference(String name, String city, int attendees, double price, String topic, String organizer, boolean workshops, String keynote){
        this.conferenceName = name;
        this.conferenceCity = city;
        this.numberOfAttendees = attendees;
        this.ticketPrice = price;
        this.conferenceTopic = topic;
        this.conferenceOrganizer = organizer;
        this.workshopsAvailable = workshops;
        this.conferenceKeynote = keynote;
        Conference.conferenceNumber++;
    }
    @Override
    public String toString() {
        return Conference.class + "{" +
                "name: " + this.conferenceName + ", " +
                "city: " + this.conferenceCity + ", " +
                "attendees: " + this.numberOfAttendees + ", " +
                "price: " + this.ticketPrice + ", " +
                "topic: " + this.conferenceTopic + ", " +
                "organizer: " + this.conferenceOrganizer + ", " +
                "workshops: " + this.workshopsAvailable + ", " +
                "keynote: " + this.conferenceKeynote + '}';
    }
    public static void printStaticConferenceNumber(){
        System.out.println(Conference.conferenceNumber);
    }
    public void printConferenceNumber(){
        System.out.println(Conference.conferenceNumber);
    }
    public void resetValues(String name, String city, int attendees, double price, String topic, String organizer, boolean workshops, String keynote){
        this.conferenceName = name;
        this.conferenceCity = city;
        this.numberOfAttendees = attendees;
        this.ticketPrice = price;
        this.conferenceTopic = topic;
        this.conferenceOrganizer = organizer;
        this.workshopsAvailable = workshops;
        this.conferenceKeynote = keynote;
    }
    public void setConferenceName(String name){
        this.conferenceName = name;
    }
    public String getConferenceName(){
        return this.conferenceName;
    }
    public void setConferenceCity(String name){
        this.conferenceCity = name;
    }
    public String getConferenceCity(){
        return this.conferenceCity;
    }
    public void setNumberOfAttendees(int number){
        this.numberOfAttendees = number;
    }
    public int getNumberOfAttendees(){
        return this.numberOfAttendees;
    }
    public void setTicketPrice(double price){
        this.ticketPrice = price;
    }
    public double getTicketPrice(){
        return this.ticketPrice;
    }
    public void setConferenceTopic(String topic){
        this.conferenceTopic = topic;
    }
    public String getConferenceTopic(){
        return this.conferenceTopic;
    }
    public void setConferenceOrganizer(String organizer){
        this.conferenceOrganizer = organizer;
    }
    public String getConferenceOrganizer(){
        return this.conferenceOrganizer;
    }
}
