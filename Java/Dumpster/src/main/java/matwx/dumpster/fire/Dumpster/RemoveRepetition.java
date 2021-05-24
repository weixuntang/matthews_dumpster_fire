public class RemoveRepetition {

    public static String transform(String input) {

        char [] stringArrayOfInput = input.toCharArray();

        String appendString = "";

        for(char character : stringArrayOfInput){

            if(!appendString.contains(Character.toString(character))){
                appendString+= character;
            }

        }

        return appendString;
    }



    public static void main (String [] args){
        System.out.println(transform("abbcbbb"));

    }

}