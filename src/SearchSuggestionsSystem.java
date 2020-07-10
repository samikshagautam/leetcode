import java.util.ArrayList;
import java.util.List;
import  java.util.Arrays;

public class SearchSuggestionsSystem {
        public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
            List<List<String>> results = new ArrayList<>();
            Arrays.sort(products);

            for(int i = 1; i <= searchWord.length() ; i++){
                String typed = searchWord.substring(0,i);
                List<String> result = new ArrayList<>();

                int count = 0;
                for(String pro : products){
                    if(pro.startsWith(typed)){
                        result.add(pro);
                        if(++count  == 3){
                            break;

                        }
                    }
                }

                results.add(result);
            }

            return results;

        }


    public static void main(String[] args){
            String[] products = {"mobile","mouse","moneypot","monitor","mousepad"};
            String search = "mouse";
            List<List<String>> res = suggestedProducts(products,search);
            System.out.println(res);


    }

}
