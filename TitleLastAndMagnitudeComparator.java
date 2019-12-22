import java.util.Comparator;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {
    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1String = q1.toString();
        String q1Suffix = q1String.substring(q1String.lastIndexOf(' ')+1);
        String q2String = q2.toString();
        String q2Suffix = q2String.substring(q2String.lastIndexOf(' ')+1);
        int titleSuffix = q1Suffix.compareTo(q2Suffix);
        if (titleSuffix == 0) {
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        return titleSuffix;
    }
}
