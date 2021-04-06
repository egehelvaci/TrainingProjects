package project4;


public class NodeS {

    public int num;
    public NodeS next;

    public NodeS(int n){
        this.num = n;
    }
    public void setNum(Integer num){
		this.num = num;
	}
    public Integer getNum(){
		return num;
	}
    public void getNext(NodeS ne){
        this.next = ne;
    }
   

    
}