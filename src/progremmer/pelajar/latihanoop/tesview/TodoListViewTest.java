package progremmer.pelajar.latihanoop.tesview;

import progremmer.pelajar.latihanoop.repository.TodoListRepository;
import progremmer.pelajar.latihanoop.repository.TodoListRepositoryImpl;
import progremmer.pelajar.latihanoop.service.TodoListService;
import progremmer.pelajar.latihanoop.service.TodoListServiceImpl;
import progremmer.pelajar.latihanoop.view.TodoListView;

public class TodoListViewTest {
    public static void main(String[] args) {
       tesViewAddTodoList();
    }

    public static void tesViewShowTodoList(){

        TodoListRepository todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("belajar java dasar");
        todoListService.addTodoList("belajar java standar celasses");
        todoListService.addTodoList("belajar java oop");

        TodoListView todoListView=new TodoListView(todoListService);
        todoListView.showTodoList();
    }
    public static void tesViewAddTodoList(){

        TodoListRepository todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView=new TodoListView(todoListService);

        todoListView.addTodoList();
        todoListService.showTodoList();
        todoListView.addTodoList();
        todoListService.showTodoList();



    }
    public static void tesViewRemoveTodoList(){

        TodoListRepository todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);

        todoListService.addTodoList("belajar java dasar");
        todoListService.addTodoList("belajar java standar celasses");
        todoListService.addTodoList("belajar java oop");

        TodoListView todoListView=new TodoListView(todoListService);


        todoListService.showTodoList();
        todoListView.removeTodoList();
        todoListService.showTodoList();
    }
}
