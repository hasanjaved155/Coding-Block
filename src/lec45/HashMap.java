package lec45;

public class HashMap {
    public class Node{
        String key;
        Integer val;
        Node next;
        public Node(String key, Integer val){
            this.key = key;
            this.val = val;
        }
    }
    Node[] arr;
    int size = 0;
    public HashMap(){
        arr = new Node[4];
    }
    public HashMap(int n){
        arr = new Node[n];
    }
    public void put(String key,Integer val){
        int index = Hashfun(key);
        Node temp = arr[index];
        while (temp != null){
            if (temp.key.equals(key)){
                temp.val = val;
                return;
            }
            temp = temp.next;
        }
        Node node = new Node(key,val);
        size++;
        node.next = arr[index];
        arr[index] = node;
        double lf = (1.0 * size) / arr.length;
        double thf = 2.0;
        if (lf > thf){
            rehashing();
        }
    }

    public boolean containsKey(String key){
        int index = Hashfun(key);
        Node temp = arr[index];
        while (temp != null){
            if (temp.key.equals(key)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public Integer get(String key){
        int index = Hashfun(key);
        Node temp = arr[index];
        while (temp != null){
            if (temp.key.equals(key)){
                return temp.val;
            }
            temp = temp.next;
        }
        return null;
    }
    public Integer remove(String key){
        int index = Hashfun(key);
        Node temp = arr[index];
        Node prev = null;
        while (temp != null){
            if (temp.key.equals(key)){
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        if (temp == null){
            return null;
        }
        if (prev == null){
            arr[index] = temp.next;
            temp.next = null;
        }else{
            prev.next = temp.next;
            temp.next = null;
        }
        size--;
        return temp.val;
    }
    public int Hashfun(String key){
        int bn = key.hashCode() % arr.length;// bn is remender
        if (bn < 0){
            bn += arr.length;
        }
        return bn;
    }
    @Override
    public String toString(){
        String s = "{";

        for(Node nn : arr){
            while (nn != null){
                s = s + nn.key + "=" + nn.val + ",";
                nn = nn.next;
            }
        }
        return s + "}";
    }
    private void rehashing() {
        Node[] newarr = new Node[arr.length * 2];
        Node[] oba = arr;
        arr = newarr;
        size = 0;
        for(Node nn : oba){
            while (nn != null){
                put(nn.key,nn.val);
                nn = nn.next;
            }
        }
    }
}
