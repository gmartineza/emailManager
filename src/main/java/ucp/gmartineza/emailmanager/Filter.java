package ucp.gmartineza.emailmanager;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Filter {
    public static Predicate<Mail> filterBySubject(String subject) {
        return mail -> mail.getSubject().contains(subject);
    }

    public static Predicate<Mail> filterByContent(String content) {
        return mail -> mail.getContent().contains(content);
    }

    public static Predicate<Mail> filterByRemitentEmail(String emailAddress) {
        return mail -> mail.getRemitent().getEmailAddress().equals(emailAddress);
    }

    public static Predicate<Mail> filterByDestinataryEmail(String emailAddress) {
        return mail -> mail.getDestinatary().stream().anyMatch(contact -> contact.getEmailAddress().equals(emailAddress));
    }

    public static Predicate<Mail> filterBySubjectAndContent(String subject, String content) {
        Predicate<Mail> subjectPredicate = filterBySubject(subject);
        Predicate<Mail> contentPredicate = filterByContent(content);
        return subjectPredicate.and(contentPredicate);
    }

    public static List<Mail> applyFilter(List<Mail> mails, Predicate<Mail> filterPredicate) {
        return mails.stream().filter(filterPredicate).collect(Collectors.toList());
    }
}
