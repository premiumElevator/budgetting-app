public class UserProfile
{
   private String userName;
   private String password;
   private int pin;

   public UserProfile(String userName, String password, int pin)
   {
      this.userName = userName;
      this.password = password;
      this.pin = pin;
   }

   public UserProfile(String userName, String password)
   {
      this.userName = userName;
      this.password = password;
   }

   public String getUserName()
   {
      return userName;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }

   
}
