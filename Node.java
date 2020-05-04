package algorithm.linked;

/**
 * 单链表 
 */

//节点
public class Node {

    int data;
    Node next;

	//构造方法
    public Node(int data){
        this.data = data;
    }

    //追加节点
    public Node append(Node node){
		//当前节点
        Node currentNode = this;
        while(true){
			//下一个节点
            Node nextNode = currentNode.next;
            if(nextNode == null){
                break;
            }
			//下个节点赋给当前节点
            currentNode = nextNode;
        }
		//追加的节点赋给当前节点的下一个
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
		//取出B的下一个节点C
        Node nextNext = next;
		//D赋给B的下一个节点
        this.next = node;
		//C赋给D的下一个节点
        node.next = nextNext;
    }

}
