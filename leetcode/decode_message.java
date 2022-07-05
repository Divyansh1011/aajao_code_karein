import java.util.HashMap;


/*
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:

Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
Align the substitution table with the regular English alphabet.
Each letter in message is then substituted using the table.
Spaces ' ' are transformed to themselves.
For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
Return the decoded message.
 */

 //Tags: HashMap, Strings, Replace elements with the mapping of the key original alphabets order 

 /**
  * decode_message
  */
 public class decode_message {
    public String decode(String key,String message)
    {
        HashMap<Character,Character> mp = new HashMap<>();//mapping the keys of the hashmap 

        StringBuilder str = new StringBuilder();// for the final ans creating a screen
        key = key.replaceAll(" ", "");
        //Replaceing all the white spaces in the key string 

        char original = 'a';//for making an orignal alphabet 26 values in the hashmap corresponding to the key 

        for(int i = 0;i<key.length();i++)
        {
            if(!mp.containsKey(key.charAt(i)));//checking if the key already has the mapped alphabets
            {
                mp.put(key.charAt(i), original++);//if no putting the corresponding original alphabet with the key as the characters of the key 

            }
        }

        for(int i = 0;i<message.length();i++)
        {
            if(mp.containsKey(message.charAt(i)))
            {
                str.append(mp.get(message.charAt(i)));// //Now replacing the letters of the message with appropriate letter according to the key
            }
            else
            {
                str.append(message.charAt(i));  
                  //This is for characters other than the letters in the key example a space " "
                //They will not be replaced by any letters hence original letter is appended into the StringBuilder
            }
        }

        return str.toString();


        

    }
 
    public static void main(String[] args) {
        
    }
 }