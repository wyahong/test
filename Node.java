package algorithm.linked;

//dev_20200502 add

//git test

/**
 * 单链表 
 */

//节点
public class Node {

    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    //追加节点
    public Node append(Node node){
        Node currentNode = this;
        while(true){
            Node nextNode = currentNode.next;
            if(nextNode == null){
                break;
            }
            currentNode = nextNode;
        }
        currentNode.next = node;
        return this;
    }
    //获取下一个节点
    public Node next(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }

    /**
     * 删除节点
     * A -- >  B ---> C ， 想要删除B
     * 思路：
     * 1. A取到下一个节点Ｂ，在取出下下节点Ｃ
     * 2. 把C赋给A的下一个节点，就可删除B
     */
    public void removeNext(){
        //取出下下一个节点
        Node newNext = next.next;
        //再赋给下个节点
        this.next = newNext;

    }

    /**
     * 插入节点
     * A -- >  B ---> C ， D插入B和C之间
     * 思路：
     * 1. 取出B的下一个节点C，作为下下节点Node nextNext = next;
     * 2. D赋给B的下一个节点this.next = node;
     * 3. C赋给D的下一个节点node.next = nextNext;
     */
    public void after(Node node){
        Node nextNext = next;
        this.next = node;
        node.next = nextNext;
    }

}
