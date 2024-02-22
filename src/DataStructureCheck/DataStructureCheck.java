package DataStructureCheck;
public class DataStructureCheck {
    
    // Function to concatenate strings in the array
    public static String concatenateStrings(String[] titles) {
        StringBuilder concatenated = new StringBuilder();
        
        for (String title : titles) {
            concatenated.append(title);
        }
        return concatenated.toString();
    }
    
    // Function to remove numeric symbols from a string
    public static String removeNumericSymbols(String str) {
        return str.replaceAll("[0-9]", "");
    }
    
    // Function to capitalize first character of each word in a string
    public static String capitalizeFirstCharacter(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
            }
        }
        return result.toString().trim();
    }
    
    // Main function to process titles
    public static String processTitles(String[] titles) {
        String concatenated = concatenateStrings(titles);
        String withoutNumeric = removeNumericSymbols(concatenated);
        return capitalizeFirstCharacter(withoutNumeric);
    }
    
    // Main method to test the code
    public static void main(String[] args) {
        String[] input1 = {"breaking news5:", "1A Icircle is round!"};
        System.out.println(processTitles(input1)); 

        String[] input2 = {"", "Fresh fried fish - fish fresh fried"};
        System.out.println(processTitles(input2)); 

        String[] input3 = {"2Here2 ", "is", " our STRING"};
        System.out.println(processTitles(input3)); 

        String[] input4 = {"123", "eat;sleep;repeat", "321"};
        System.out.println(processTitles(input4)); 
    }
}
