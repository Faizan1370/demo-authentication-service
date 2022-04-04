package com.faizan.helper;

import java.io.File;
import java.util.Properties;
import java.util.Random;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.stereotype.Service;

@Service
public class EmailService {

    public static boolean sendEmail() {
        boolean flag = false;
        final Random random = new Random();

        final int otp = random.nextInt(1000000);
        System.out.println("Otp ****************** :" + otp);
        // final String message = "Hello , this is test email";
        // final String message = "<h1> OTP =" + otp + "</h1>";
        final String message = "" + "<div style='border:1px solid #e2e2e2; padding:20px'" + "<p>" + "OTP is" + "</p>" + "<h1>" + "<b>" + otp + "</n>" + "</h1>" + "</div>";
        final String subject = "Code Area :Confirmation";
        // variable for email
        final String host = "smtp.gmail.com";
        // get the system properties
        final Properties prop = System.getProperties();
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.auth", "true");

        // step 1 : get the session object
        final Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("faizanmd143@gmail.com", "786@farhan");
            }
        });
        session.setDebug(true);

        // step 2: compose the message[text,multi media]
        final MimeMessage m = new MimeMessage(session);
        try {
            m.setFrom(new InternetAddress("faizanmd143@gmail.com"));
            m.addRecipient(Message.RecipientType.TO, new InternetAddress("faizan786@mailinator.com"));

            m.setSubject(subject);
            // m.setText(message);
            m.setContent(message, "text/html");

            Transport.send(m);
            flag = true;
        } catch (final MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return flag;

    }

    public static boolean sendAttach() {
        boolean flag = false;
        final String message = "Hello , this is test email";
        final String subject = "Code Area :Confirmation";
        // variable for email
        final String host = "smtp.gmail.com";
        // get the system properties
        final Properties prop = System.getProperties();
        prop.put("mail.smtp.host", host);
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.ssl.enable", "true");
        prop.put("mail.smtp.auth", "true");

        // step 1 : get the session object
        final Session session = Session.getInstance(prop, new Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("faizanmd143@gmail.com", "**********");
            }
        });
        session.setDebug(true);

        try {
            final MimeMessage m = new MimeMessage(session);
            m.setFrom(new InternetAddress("faizanmd143@gmail.com"));
            m.addRecipient(Message.RecipientType.TO, new InternetAddress("ahmadfarhan03690@gmail.com"));

            m.setSubject(subject);
            final String path = "C:\\Users\\faizan\\Downloads\\nature-3082832__480.jpg";

            final MimeMultipart mimeMultpart = new MimeMultipart();

            final MimeBodyPart textMime = new MimeBodyPart();
            final MimeBodyPart fileMime = new MimeBodyPart();
            textMime.setText(message);
            final File file = new File(path);
            fileMime.attachFile(file);

            mimeMultpart.addBodyPart(textMime);
            mimeMultpart.addBodyPart(fileMime);

            m.setContent(mimeMultpart);
            Transport.send(m);

            flag = true;

        } catch (final Exception e) {
            // TODO: handle exception
        }
        return flag;

    }

}
