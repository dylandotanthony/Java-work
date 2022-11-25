import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guest = String.format("Hello, %s. Lovely to see you.", name);
        return guest;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }

    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        if(conversation.indexOf("Alexis") > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation.indexOf("Alfred") > -1){
            return "At your service. As you wish, naturally.";
        }
        
        return "Right. And with that I shall retire.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s - %s. It is lovely to see you.", dayPeriod, name);
    }
}