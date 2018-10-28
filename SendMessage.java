// Install the Java helper library from twilio.com/docs/libraries/java
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "AC80b8767bd05f274e15f4574af68ee603";
    public static final String AUTH_TOKEN =
            "2d1240b7fc0bbc441a6e9595937587b9";

    public static void main(String[] args) {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

        Message message = Message
                .creator(new PhoneNumber("+919827056056"), // to
                        new PhoneNumber("+16477243907"), // from
                        "Where's Wallace?")
                .create();

        System.out.println(message.getSid());
    }
}
