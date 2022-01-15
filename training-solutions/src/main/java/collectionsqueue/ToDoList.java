package collectionsqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new LinkedList<>();

    public void addToDo(ToDo todo) {
        todos.add(todo);
    }

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> result = new ArrayDeque<>();
        for (ToDo todo : todos) {
            if (todo.isUrgent()) {
                result.addFirst(todo);
            } else {
                result.addLast(todo);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ToDoList todos = new ToDoList();
        todos.addToDo(new ToDo("bevásárlás", false));
        todos.addToDo(new ToDo("nyaralást lefoglalni", false));
        todos.addToDo(new ToDo("COVID oltás", true));
        todos.addToDo(new ToDo("szülinapost köszönteni", true));
        todos.addToDo(new ToDo("bérletet venni", true));
        todos.addToDo(new ToDo("időpontot kérni", false));
        Deque todosInUrgencyOrder = todos.getTodosInUrgencyOrder();
        while (!todosInUrgencyOrder.isEmpty()) {
            System.out.println(todosInUrgencyOrder.pop());
        }
    }
}
