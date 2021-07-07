package Test;

//class ListNode{
//    int val;
//    ListNode next;
//    ListNode(int val){
//        this.val=val;
//    }
//}
////创建练习
//public class ListNodeTest {
//    public static void main(String[] args) {
//        ListNode nodeSta=new ListNode(0);
//        ListNode nextNode;
//        nextNode=nodeSta;
//        for (int i=1;i<10;i++){
//            ListNode node=new ListNode(i);
//            nextNode.next=node;
//            nextNode=nextNode.next;
//        }
//        nextNode=nodeSta;
//        print(nextNode);
//    }
//    static void print(ListNode listNode){
//        while(listNode!=null){
//            System.out.println("节点："+listNode.val);
//            listNode=listNode.next;
//        }
//    }
//}

class ListNode{
    String val;
    ListNode next;
    ListNode(String val){
        this.val=val;
    }
}
public class ListNodeTest{
    public static void main(String[] args) {
    ListNode nodeSta=new ListNode("第一个");
    ListNode nextNode;
    nextNode=nodeSta;
    ListNode node1=new ListNode("第二个");
    nextNode.next=node1;
        System.out.println(nextNode.val);
    nextNode=nextNode.next;
        System.out.println(nextNode.val);
    ListNode node2=new ListNode("第三个");
    nextNode.next=node2;
    nextNode=nextNode.next;
    nextNode=nodeSta;
    print(nextNode);

    }
    static void print(ListNode listNode){
        while(listNode!=null){
            System.out.println("节点："+listNode.val);
            listNode=listNode.next;
        }
    }
}