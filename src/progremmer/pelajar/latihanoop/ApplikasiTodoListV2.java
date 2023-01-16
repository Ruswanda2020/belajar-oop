package progremmer.pelajar.latihanoop;

import progremmer.pelajar.latihanoop.repository.TodoListRepository;
import progremmer.pelajar.latihanoop.repository.TodoListRepositoryImpl;
import progremmer.pelajar.latihanoop.service.TodoListService;
import progremmer.pelajar.latihanoop.service.TodoListServiceImpl;
import progremmer.pelajar.latihanoop.view.TodoListView;

public class ApplikasiTodoListV2 {
    public static void main(String[] args) {

        TodoListRepository todoListRepository=new TodoListRepositoryImpl();
        TodoListService todoListService=new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView =new TodoListView(todoListService);

        todoListView.showTodoList();
    }
}
