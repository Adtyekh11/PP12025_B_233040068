package P3.LATIHAN;

public class ListMain {
    public static void main(String[] args) {
        strukturlist List = new strukturlist();
        List.addTail(1);
        List.addTail(9);
        List.addTail(5);
        List.addTail(7);

        System.out.println();
        List.displayElement();



        //Test1 A
        strukturlist List1 = new strukturlist();
        List1.addTail(3);
        List1.addTail(2);
        List1.addTail(1);


        System.out.println();
        List1.displayElement();

        //Test1 B
        strukturlist List2 = new strukturlist();
        List2.addTail(1);
        List2.addTail(4);
        List2.addTail(5);
        List2.addTail(7);

        System.out.println();
        List2.displayElement();

        //Test2
        strukturlist List3 = new strukturlist();
        List3.addHead(5);
        List3.addHead(4);
        List3.addHead(3);

        System.out.println();
        List3.displayElement();

        //Test3 A
        strukturlist List4 = new strukturlist();
        List4.addHead(1);
        List4.addHead(2);
        List4.addHead(3);
        

        System.out.println();
        List4.displayElement();

        //Test3 B
        strukturlist List5 = new strukturlist();
        List5.addHead(7);
        List5.addHead(5);
        List5.addHead(4);
        List5.addHead(1);        

        System.out.println();
        List5.displayElement();
        
    }

}
