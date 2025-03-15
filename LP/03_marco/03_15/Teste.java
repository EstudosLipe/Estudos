public class Teste{    
    public static void main(String args[]){

        int i=0;

        

        String grito = "";
        for(i=0;i<650000; i++){
            grito += 'a';
        }
        System.out.print(grito);
    }
}