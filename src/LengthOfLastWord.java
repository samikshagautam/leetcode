public class LengthOfLastWord {

        public int lengthOfLastWord(String s) {

            if(s.length() == 0)
                return 0;

            int count = 0;
            for(int i = s.length()-1 ; i>=0; i--){

                if(s.charAt(i)  == ' '){
                    if(count != 0)
                        return count;

                }else{
                    count++;

                }
            }

            return count;

        }


    public static void main(String[] args){
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String string = "Hello World";
        int result = lengthOfLastWord.lengthOfLastWord(string);
        System.out.println(result);
    }
}
