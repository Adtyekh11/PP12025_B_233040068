package P2.LATIHAN;

public class Node {
    private int nilai;
    private Node next;
    
    public Node(int nilai){
        this.nilai = nilai;
    }
    
    
//    Setter dan getter
    public void SetNilai(int nilai){
        this.nilai = nilai;
    }

    public int GetNIlai(){
        return nilai;
    }
    
    public void SetNext(Node next){
        this.next = next;
    }
    
    public Node GetNext(){
        return next;
    }
}