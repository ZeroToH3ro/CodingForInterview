package Progress.ProgramsMustToKnow;

public class Program4 {
    public static void main(String[] args) {
        //count variables to store the count of vowels and consonant 
        int vCount = 0, cCount=0;
        //a given string
        String str = "This is really simple program"; 
        //converting entire string to lower case to reduce the vowel  comparisions
        str = str.toLowerCase();

        for(int i=0; i<str.length(); i++){
            //checks whether a character is a vowel
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'u'
            || str.charAt(i) == 'o' || str.charAt(i) == 'i'){
                //increment the vowel count
                vCount++;
            }
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                //increment the consonant count
                cCount++;
            }
        }
        System.out.println("Number of vowel:" + vCount);
        System.out.println("Number of consonant:" + cCount);


    }
}
