package exercise.lab_06;

public class Lab04 {
    public static void main(String[] args) {
        String googleUrl = "https://google.com";
        String[] splitGoogleUrl = googleUrl.split(":");

        //Split scheme and domain
        String scheme = splitGoogleUrl[0];
        String domain = googleUrl.substring(14);

        //Check verification
        if (scheme.equals("https")){
            System.out.println("Scheme of google Url is: " + scheme);
        }else if (scheme.equals("http")){
            System.out.println("http");
        }else {
            System.out.println("Scheme is not http or .https");
        }

        if (domain.equals(".com")){
            System.out.println("Domain of google Url is: " + domain);
        }else if (domain.equals(".net")){
            System.out.println(".net");
        }else {
            System.out.println("Domain is not .net or .com");
        }
    }
}
