public class HiddenWord{

    private String word;

    public HiddenWord(String word)
    {
        this.word = word;
    }


     public String getHint(String guess)
     { 
        String hint = " ";
        for(int i = 0; i< guess.length(); i++)
        {
            String correct = word.substring(i, i+1);
            String correctish = guess.substring(i, i+1);
            if(correct.equals(correctish)){
                hint += correct;
            }
            else if(word.contains(correctish)){
                hint += "+";
            }  
            else hint += "*";
        } 
        return hint;
    }



     

     public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        System.out.println(puzzle.getHint("AAAAA")); //should display +A+++
        System.out.println(puzzle.getHint("HELLO")); //should display H****
        System.out.println(puzzle.getHint("HEART")); //should display H*++*
        System.out.println(puzzle.getHint("HARMS")); //should display HAR*S
        System.out.println(puzzle.getHint("HARPS")); //should display HARPS

        HiddenWord puzzle2 = new HiddenWord("JACKS");
        System.out.println(puzzle2.getHint("FARSE")); //should display *A*+*
        System.out.println(puzzle2.getHint("SACKS")); //should display +ACKS
    }

























}
