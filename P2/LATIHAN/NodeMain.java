package P2.LATIHAN;

public class NodeMain {
    public static void main(String[] args) {
        
        //membuat 2 buat node n1 dan n2
        Node n1 = new Node(5);
        Node n2 = new Node(7);

        //membuat relasi Node n1 dan n2
        n1.SetNext(n2);


        //menampilkan node n1 dan n2 dengan pointer p
        Node p = n1;
        while (p !=null) {
            System.out.printf("%d",p.GetNIlai());
            p = p.GetNext();
        }
   }
}
