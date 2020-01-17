package ua.lviv.iot.lab1;

public class ConferenceGenerator {
    private final static int numberOfConferences = 4;
    public static void main(String[] args){
        Conference defaultConference = new Conference();
        Conference conferenceWithBasicInfo = new Conference("NoNameCon", "Kyiv", 400, 120.0);
        Conference conferenceWithExtendedInfo = new Conference("OWASP", "Lviv", 200, 0.0, "Information Security", "OWASP Lviv Chapter", true, "DDOS attacks mitigation");

        System.out.println(defaultConference);
        System.out.println(conferenceWithBasicInfo);
        System.out.println(conferenceWithExtendedInfo);

        Conference.printStaticConferenceNumber();
        defaultConference.printConferenceNumber();

        Conference[] arrayOfConferences = new Conference[numberOfConferences];
        int currentConferenceNumber = 0;
        while (currentConferenceNumber < numberOfConferences) {
            arrayOfConferences[currentConferenceNumber] = new Conference();
            currentConferenceNumber++;
        }

        for (Conference currentConference: arrayOfConferences){
            System.out.println(currentConference);
        }
    }
}
