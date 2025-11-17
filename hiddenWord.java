public class hiddenWord{

    private String word;

    public hiddenWord(String word)
    {
        this.word = word;
    }
     public String getHint(String guess)
     {
        String hint = " ";
        for(i = 0; i< guess.length(); i++){
            String correct = hiddenWord.substring(i, i+1);
            String correctish = guess.substring(i, i+1);
            if(correct.equals(correctish)){
                hint += correct;
            }
            else if(word.contains(correctish)){
                hint += "+";
            }  
                else hint += "*";
               } 
             }
     }

























}
