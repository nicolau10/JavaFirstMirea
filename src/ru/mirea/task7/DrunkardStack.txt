package ru.mirea.task7;

import java.util.Stack;

public class DrunkardStack {
    Stack<Integer> player1, player2;

    public DrunkardStack(String p1, String p2) {
        this.player1 = new Stack<>();
        this.player2 = new Stack<>();

        for(int i = 4; i >= 0; i --){
            this.player1.push(Integer.parseInt(p1.substring(i, i+1)));
            this.player2.push(Integer.parseInt(p2.substring(i, i+1)));
        }
    }
    private void pushBack(Stack<Integer> stack, Integer item){
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty())
            newStack.push(stack.pop());
        stack.push(item);
        while (!newStack.isEmpty())
            stack.push(newStack.pop());
    }

    public String play(){
        int count = 0;
        while(!player1.isEmpty() && !player2.isEmpty() && count <= 106){
            if(player1.peek() > player2.peek() && player2.peek() != 0 ){
                pushBack(player1, player1.pop());
                pushBack(player1, player2.pop());
            }
            else if (player1.peek() == 0){
                pushBack(player1, player1.pop());
                pushBack(player1, player2.pop());
            }
            else{
                pushBack(player2, player1.pop());
                pushBack(player2, player2.pop());
            }
            count++;
        }
        String res = "";
        if(player1.isEmpty()) res += "second ";
        else if (player2.isEmpty()) res += "first ";
        res += count;
        if(count >= 106) res += " botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new DrunkardStack("02519", "13092").play());
    }
}
