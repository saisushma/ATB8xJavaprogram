package sept.Tasks.Sept25_30092024;

public class Task3_CountVowels {
    public static void main(String[] args) {

       // Count vowels and consonants in a String. (pramod) - v = 2 , c =. 4
        String sr = "SaiSushma";
        String sr1= sr.toUpperCase();
        int count=0;
        int cons=0;
      for(int i=0;i<sr.length();i++)
      {
          char ch = sr1.charAt(i);
          if(ch=='A'|| ch =='E'||ch =='I' || ch =='O'||ch=='U')
          {
              count++;
          }
          else{
              cons++;
          }
      }
        System.out.printf("no: of vowels in the given string are %d \n",count);
        System.out.printf("no: of consonants in the given string are %d \n",cons);
    }
}

//for(char ch : sr1.charAt())
//{
//
//        }