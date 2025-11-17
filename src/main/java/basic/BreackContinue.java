package basic;

public class BreackContinue {
    public static void main(String[] args) {
        /*
        The break, as the translation suggests, breaks the structure. If you include a break anywhere in the structure,
        it terminates at that moment and does not execute what is below it, regardless of the stopping condition.
        For example:
         */
        for(int i = 0; i < 10; i++) {

            System.out.println(i);

            if (i == 5) { //se o i chegar em 5, ele entra no if
                break; //quebra e sai da estrutura de repetição continuando o código.
            }
        }
        // The Continue command is used only in repetition loops. When it is executed, the loop advances one step and
        // immediately returns to the loop's condition test. For example:
        for(int i = 0; i < 10; i ++) {

            if(i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}
