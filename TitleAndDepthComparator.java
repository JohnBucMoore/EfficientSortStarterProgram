import java.util.Comparator;

public class TitleAndDepthComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        int title = q1.getInfo().compareTo(q2.getInfo());
        if (title == 0) {
            return Double.compare(q1.getDepth(), q2.getDepth());
        }
        return title;
    }
}
