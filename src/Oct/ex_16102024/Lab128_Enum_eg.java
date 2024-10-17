package Oct.ex_16102024;

public class Lab128_Enum_eg {
    public static void main(String[] args) {
        System.out.println(APIConstantsEndPoints.BASE_URL.getValue());
    }

}

//stores the API constants - END points

enum APIConstantsEndPoints{
    BASE_URL("htpps://xxx/login"),
    DASHBOARD("htpps://xxx/dashboaord");


  private String name;
  APIConstantsEndPoints(String name){
      this.name = name;
  }
  String getName(){
      return name;
  }
  String getValue(){
    return  this.name ;
  }
}