public class P1472_BrowserHistory {

    public static void main(String[] args) {
        P1472_BrowserHistory.BrowserHistory obj = new P1472_BrowserHistory.BrowserHistory("homepage");
         obj.visit("url");
         String param_2 = obj.back(1);
         String param_3 = obj.forward(1);
        System.out.println(param_2);
        System.out.println(param_3);
    }


    static class BrowserHistory {
        Node current;
        public BrowserHistory(String homepage) {
            current = new Node(homepage);
        }

        public void visit(String url) {
            current.next = new Node(url);
            current.next.prev = current;
            current = current.next;
        }

        public String back(int steps) {
            while(current.prev != null && steps-- > 0) {
                    current = current.prev;
            }
            return current.url;
        }

        public String forward(int steps) {
            while(current.next != null && steps-- > 0) {
                current = current.next;
            }
            return current.url;
        }

        class Node {
            public Node prev;
            public Node next;
            public final String url;

            public Node(String url) {
                this.url = url;
            }
        }
    }
}
