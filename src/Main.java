import progremmer.pelajar.latihanoop.entity.TodoList;
import progremmer.pelajar.latihanoop.repository.TodoListRepository;
import progremmer.pelajar.latihanoop.repository.TodoListRepositoryImpl;

public class Main {
    public static void main(String[] args) {

        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.add(new TodoList());
        todoListRepository.add(new TodoList());
        todoListRepository.add(new TodoList());


    }
}