package lec54_Trie_DataStructures;

import java.util.HashMap;
import java.util.Scanner;

public class Trie_Contact {
    public class Node{
        char ch;
        HashMap<Character,Node>child = new HashMap<>();
        boolean isTerminal = false;
    }
    private Node root;
    public Trie_Contact(){
        Node nn = new Node();
        nn.ch = '*';
        this.root = nn;
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else {
                Node nn = new Node();
                nn.ch = ch;
                curr.child.put(ch,nn);
                curr = nn;
            }
        }
        curr.isTerminal = true;
    }
    public boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else {
                return false;
            }
        }
        return curr.isTerminal;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Trie_Contact t = new Trie_Contact();
        t.insert("mango");
        t.insert("ram");
        t.insert("romeo");
        t.insert("apple");
        //t.insert("app");

        System.out.println(t.search("app"));
        System.out.println(t.startsWith("app"));
    }
}
