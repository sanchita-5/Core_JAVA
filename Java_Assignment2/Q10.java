class DomainExtractor {
    public String extractDomain(String url) {
        url = url.replaceFirst("https?://(www\\.)?", "");
        return url.split("/")[0];
    }
}

public class Q10 {
    public static void main(String[] args) {
        DomainExtractor de = new DomainExtractor();
        System.out.println("Domain: " + de.extractDomain("https://www.google.com/search?q=java"));
    }
}
