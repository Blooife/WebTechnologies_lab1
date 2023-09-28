package task12;

import java.util.Comparator;

public class BookByAuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int authorComp = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorComp != 0) {
            return authorComp;
        } else {
            int titleComparison = o1.getTitle().compareTo(o2.getTitle());
            if (titleComparison != 0) {
                return titleComparison;
            } else {
                return o1.getPrice() - o2.getPrice();
            }
        }
    }
}
