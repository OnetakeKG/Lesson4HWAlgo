import java.util.LinkedList;

public class Impl {

    public static void main(String args[]) {
        LinkedList<Character> pl = new LinkedList<Character>();
        pl.add('j');
        pl.add('a');
        pl.add('v');
        pl.add('a');
        for (char s : pl)
            System.out.print(s+"->");
    }}
