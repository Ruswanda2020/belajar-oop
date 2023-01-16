package progremmer.pelajar.latihanoop.testservice;

import progremmer.pelajar.latihanoop.entity.TodoList;
import progremmer.pelajar.latihanoop.repository.TodoListRepository;
import progremmer.pelajar.latihanoop.repository.TodoListRepositoryImpl;
import progremmer.pelajar.latihanoop.service.TodoListService;
import progremmer.pelajar.latihanoop.service.TodoListServiceImpl;

public class TodoListServiceTest {
    public static void main(String[] args) {
        tesRemoveTodoList();
    }
    public static void tesShowTodoList(){

        TodoListRepositoryImpl todoLiatRepository=new TodoListRepositoryImpl();
        todoLiatRepository.data[0]=new TodoList("belajar java oop");
        todoLiatRepository.data[1]=new TodoList("belajar java besic");
        todoLiatRepository.data[2]=new TodoList("belajar java standar celasses");
        TodoListService todoListService=new TodoListServiceImpl(todoLiatRepository);

        todoListService.showTodoList();
    }

    public static void tesAddTodoList(){
        TodoListRepository  todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("belajar java dasar");
        todoListService.addTodoList("belajar java oop");
        todoListService.addTodoList("belajar java standar celasses");

        todoListService.showTodoList();
    }

    public static void tesRemoveTodoList(){
        TodoListRepository  todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("belajar java dasar");
        todoListService.addTodoList("belajar java oop");
        todoListService.addTodoList("belajar java standar celasses");
        todoListService.showTodoList();

        todoListService.removeTodoList(4);
        todoListService.removeTodoList(2);
        todoListService.removeTodoList(1);
        todoListService.removeTodoList(1);
        todoListService.showTodoList();
    }
}
