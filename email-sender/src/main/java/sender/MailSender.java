package sender;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Properties;

//2023 - it doesn't work - gmail close access from application for this manner
//Exception in thread "main" javax.mail.AuthenticationFailedException: 535-5.7.8 Username and Password not accepted.
class MailSender {
    public static void main(String[] args) throws IOException, MessagingException {

        Properties prop = new Properties();
        prop.load(MailSender.class.getClassLoader().getResourceAsStream("mail.properties"));

        Session mailSession = Session.getDefaultInstance(prop);
        MimeMessage message = new MimeMessage(mailSession);

        message.setFrom(new InternetAddress("****"));
        message.addRecipient(Message.RecipientType.TO, new InternetAddress("****"));
        message.setSubject("Test email from java program");
        message.setText("Арендуешь smtp сервер на тестовый период + создаешь на нем 50 ящиков + тебе понадобится Advance Mail Sender pro и ты гуру спама )) Пишется небольшой скрипт прямо в программе для того чтобы каждое письмо было уникальным.Письма 100% попадают во входящие и юзеры думают что ты писал именно ему письмо а не кому-то спам отправлял");

        Transport transport = mailSession.getTransport();
        transport.connect("****", "****");//set user and password
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }
}
