import java.util.Scanner;

public class EmailValidator_3 {
    static private String email;

    public static void isAtAndDotPresent() throws Exception {
        if (!(email.contains("@") && email.contains("."))) {
            throw new Exception(" The entered email doesn't have @ and . symbol");
        }
    }

    public static void dotNotPresentNextToAt() throws Exception {
        if (!(email.charAt(email.indexOf("@") - 1) != '.' && email.charAt(email.indexOf("@") + 1) != '.')) {
            throw new Exception(" The entered email has @. together");
        }
    }

    public static void userNameContainsAtLeastOneAlphabet() throws Exception {
        if (!(email.split("@")[0].matches((".*[a-zA-Z]+.*")))) {
            throw new Exception(" The username doesn't have at least one character");
        }
    }

    public static void validUserNameCheck() throws Exception {
        if (!(email.split("@")[0].matches(("[a-zA-Z0-9+_.-]*")))) {
            throw new Exception(" The username entered contains character other than alphanumerics" +
                    "_,., and -");
        }
    }

    public static void dotNotPresentAtStartAndEndOfEmail() throws Exception {
        if (!(email.charAt(email.length() - 1) != '.' && email.charAt(0) != '.')) {
            throw new Exception("dot is not allowed at start and ending of the mail id");
        }
    }

    public static void consecutiveDotsNotAllowed() throws Exception {
        for (int i = 0; i < email.length() - 1; ++i) {
            if (email.charAt(i) == email.charAt(i + 1)) {
                throw new Exception("Consecutive dots are not allowed in both the username and domain part");
            }
        }
    }

    public static void domainNameAfterDotHasOnlyLetters() throws Exception {
        String domainName=email.split("@")[1];
        if(!(domainName.split("\\.")[1].matches(("[a-zA-Z]*")))){
            throw new Exception("Entered domain name after dot is not letters");
        }
    }

    public static void domainContainsAtLeastOneDot() throws Exception {
        int flag=0;
        String domain=email.split("@")[1];
        for(int i=0;i<domain.length();++i){
            if (domain.charAt(i) == '.') {
                flag = 1;
                break;
            }
        }
        if(flag==0)
            throw new Exception(" The username doesn't have at least one dot");
    }
    public static void domainMaxLength() throws Exception {
        if (!((email.split("@")[1].length())<=255)) {
            throw new Exception(" domain name can't exceed length 255");
        }
    }
    public static void usernameMaxLength() throws Exception {
        if (!((email.split("@")[0].length())<=64)) {
            throw new Exception(" user name can't exceed length 64");
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the email");
        email = sc.nextLine();
        isAtAndDotPresent();
        dotNotPresentNextToAt();
        userNameContainsAtLeastOneAlphabet();
        dotNotPresentAtStartAndEndOfEmail();
        consecutiveDotsNotAllowed();
        validUserNameCheck();
        domainNameAfterDotHasOnlyLetters();
        domainContainsAtLeastOneDot();
        usernameMaxLength();
        domainMaxLength();
        System.out.println("Email validated successfully");

    }
}