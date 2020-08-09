package day20_WhileLoops;

public class BranchingStatements {
    public static void main(String[] args) {
        char ch ='A';
        while(ch<='E'){
            if(ch=='C') { //dont print C
                ch++; //if we dont use this iterator here ,when if is true all loop will be stopped
                continue; // skips everything even the iterator, so put the ch++ above, but it only executed if is true
            }
            System.out.println(ch);

            ch++;
        }




    }
}
