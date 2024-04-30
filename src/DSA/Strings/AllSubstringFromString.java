package DSA.Strings;

public class AllSubstringFromString {
    public static void main(String[] args) {
        System.out.println("All Possible SubString From Given String");
        printAllSubString("kanishka");
    }
    public static void printAllSubString(String str){
        for(int i=0;i<str.length();i++)
        {
            String subString="";
            for (int j=i;j<str.length();j++)
            {
                subString+=str.charAt(j);
                System.out.print(subString + "\n");
            }
        }
    }
}
