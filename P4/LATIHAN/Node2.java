package P4.LATIHAN;

public class Node2 {
        private double data;
        private Node2 next;
    
        public Node2(double data) {
            this.data = data;
            this.next = null;
        }
    
        public Node2 GetNext() {
            return this.next;
        }
    
        public void SetNext(Node2 next) {
            this.next = next;
        }
    
        public double GetData() {
            return this.data;
        }
    }
    
