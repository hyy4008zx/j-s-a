package datastructure;

/**
 * @Author: huyanyang
 * @Date: 2022/02/11/14:27
 * @Description:
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        HeroNode heroNode1 = new HeroNode(1,"a","aa");
        HeroNode heroNode2 = new HeroNode(2,"b","bb");
        HeroNode heroNode3 = new HeroNode(3,"c","cc");
        HeroNode heroNode4 = new HeroNode(3,"c","dd");


        SingleLinkedList s = new SingleLinkedList();
//        s.addList(heroNode1);
//        s.addList(heroNode2);
//        s.addList(heroNode3);
          s.addByOrder(heroNode3);
          s.addByOrder(heroNode1);
          s.addByOrder(heroNode2);
        s.listData();
//        s.changeNode(heroNode4);
//        s.listData();
//        s.deleteNode(heroNode3);
//        s.listData();
        System.out.println(s.getReverseNode(2));

    }
}

class SingleLinkedList{
    private HeroNode head =new HeroNode(0,"","");
    //添加
    public void addList(HeroNode heroNode){
        //头结点不能动 复制一份
        HeroNode tmp=head;
        while(true){
            if(tmp.next==null)
                break;
            tmp=tmp.next;
        }
        tmp.next=heroNode;
    }

    //显示
    public void listData(){
        if(head.next==null){
            System.out.println("linkedList is empty");
            return;
        }
        HeroNode tmp =head.next;
        while (true) {
            if(tmp==null){
                break;
            }
            System.out.println(tmp);
            tmp=tmp.next;
        }
    }

    //按顺序添加
    public void addByOrder(HeroNode hero){
        if(head.next==null){
            head.next=hero;
            return;
        }
        HeroNode tmp=head;
        while(tmp.next!=null && tmp.next.no<hero.no){
            tmp=tmp.next;
        }
        if(tmp.next!=null){
            hero.next=tmp.next;
        }
        tmp.next=hero;
    }
    //修改节点信息
    public void changeNode(HeroNode hero){
        if(head==null){
            System.out.println("链表为空");
        }
        HeroNode tmp =head;
    while(tmp.next!=null && tmp.next.no!=hero.no){
            tmp=tmp.next;
        }
    if(tmp.next==null){
        System.out.println("无此节点");
    }
        tmp.next.nickName=hero.nickName;
    }

    //删除节点
    public void deleteNode(HeroNode hero){
        if(head==null){
            System.out.println("链表为空，请插入数据");
            return;
        }
        HeroNode tmp = head;
        while(tmp.next!=null & tmp.next.no!=hero.no){
         tmp=tmp.next;
        }
        if(tmp.next.no!=hero.no){
            System.out.println("链表中无此数据");
            return;
        }
        tmp.next=hero.next;
    }

    //获取倒数的节点
    public HeroNode getReverseNode(int index){
        if(head.next==null){
            System.out.println("链表空");
            return null;
        }
        HeroNode tmp =head;
        int length=1;
        while(tmp.next!=null){
            tmp=tmp.next;
            length++;
        }
        System.out.println(length);
        if(length<index){
            System.out.println("链表越界");
            return null;
        }
        tmp=head;
        for (int i = 0; i <=length-index; i++) {
            tmp=tmp.next;
        }
        return tmp;
    }

    //链表反转
    public void reverseList(){
        if(head.next==null){
            System.out.println("链表为空");
            return ;
        }
        HeroNode tmp =head;
        while(tmp.next!=null){
            tmp=tmp.next;
        }

    }
}
class HeroNode{
    public int no;
    public String name;
    public String nickName;
    public HeroNode next;

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
