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

    public static Predicate<Mail> filterBySubjectOrContent(String keyword) {
            Predicate<Mail> subjectPredicate = filterBySubject(keyword);
            Predicate<Mail> contentPredicate = filterByContent(keyword);

            return subjectPredicate.or(contentPredicate);
    }

    public static Predicate<Mail> filterBySubjectAndRemitent(String subjectKeyword, String remitentEmail) {
        Predicate<Mail> subjectPredicate = filterBySubject(subjectKeyword);
        Predicate<Mail> remitentPredicate = filterByRemitentEmail(remitentEmail);

        return subjectPredicate.and(remitentPredicate);
    }

    public static Predicate<Mail> filterByContentAndRemitent(String contentKeyword, String remitentEmail) {
        Predicate<Mail> contentPredicate = filterByContent(contentKeyword);
        Predicate<Mail> remitentPredicate = filterByRemitentEmail(remitentEmail);

        return contentPredicate.and(remitentPredicate);
    }

    public static List<Mail> applyFilter(List<Mail> mails, Predicate<Mail> filterPredicate) {
        return mails.stream().filter(filterPredicate).collect(Collectors.toList());
    }
}
