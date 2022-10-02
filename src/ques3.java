import java.util.ArrayList;
public class ques3 {
    ArrayList<Integer> list = new ArrayList<>();
    int index = 0;
    int size = 0;
    void push(int element) {
        list.add(element);
        index++;
        size++;
    }

    public Boolean pop() {
        if (list.isEmpty()) {
            return false;
        }
        list.remove(list.size() - 1);
        index--;
        return true;

    }
    void printStack() {
        for (int i = index - 1; i >= 0; --i)
            System.out.print(list.get(i) + " ");
    }
    void getMin() {

        if(list.isEmpty()) {
            System.out.println("Stack is Empty");
        }
        else {
            int min = list.get(0);
            for (int i = 1; i < list.size(); i++) {
                if (min > list.get(i))
                    min = list.get(i);
            }
            System.out.println(min);
        }
    }
    Boolean isFull() {
        if (size == list.size())
            return true;
        else
            return false;
    }
    Boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        ques3 specialStack = new ques3();
        specialStack.push(35);
        specialStack.push(48);
        specialStack.push(57);
        specialStack.push(98);
        specialStack.push(32);
        specialStack.push(44);
        specialStack.push(92);
        specialStack.push(8);
        specialStack.push(117);
        specialStack.push(109);

        specialStack.printStack();
        System.out.println("\nIs Stack full? : " + specialStack.isFull());
        System.out.println("Is Stack empty? : " + specialStack.isEmpty());
        System.out.print("Minimum element is :");
        specialStack.getMin();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.pop();
        specialStack.printStack();
        System.out.println("Is Stack full? : " + specialStack.isFull());
        System.out.println("Is Stack Empty? : " + specialStack.isEmpty());
    }
}