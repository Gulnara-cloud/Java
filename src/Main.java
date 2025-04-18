public class Main {
    public static void main(String[] args) {
      // .substring() = A method used to extract a portion of a string
      //               .substring(start, end)

      String email = "Nara123@gmail.com";
      String username = email.substring(0, 6);

      System.out.println(username);
    }
}

