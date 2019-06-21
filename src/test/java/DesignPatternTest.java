import com.clz.design.pattern.establishPattern.factory.SendFactory;
import com.clz.design.pattern.establishPattern.factory.Sender;
import org.junit.Test;

public class DesignPatternTest {

    @Test
    public void testSendFactory(){
        SendFactory sendFactory=new SendFactory();
        Sender sender=sendFactory.prducee("mail");
        sender.Send();
        sender=sendFactory.prducee("sms");
        sender.Send();
        /*sender=sendFactory.prducee("121");
        sender.Send();*/
        sender=sendFactory.produceMail();
        sender.Send();
        sender=sendFactory.produceSms();
        sender.Send();
        SendFactory.produceStaticMail().Send();
        SendFactory.produceStaticSms().Send();
    }

}
