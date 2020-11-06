public class Main {
    public static void main(String[] args){
        BoundedWaitList<String> que=new BoundedWaitList<>(3);
        que.add("Саша");
        que.add("Мага");
        que.add("Серж");
        que.add("Кеша");
        System.out.println(que);
        UnfairWaitList<String> unfque=new UnfairWaitList<>();
        unfque.content=que.content;
        System.out.println(unfque.content.peek()+" отошел, теперь он последний");
        unfque.moveToBack(unfque.content.poll());
        System.out.println(unfque);
    }
}
