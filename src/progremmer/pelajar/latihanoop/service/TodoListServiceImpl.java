package progremmer.pelajar.latihanoop.service;

import progremmer.pelajar.latihanoop.entity.TodoList;
import progremmer.pelajar.latihanoop.repository.TodoListRepository;

public class TodoListServiceImpl implements TodoListService{

    private TodoListRepository todoLiatRepository;

    public TodoListServiceImpl(TodoListRepository todoLiatRepository) {
        this.todoLiatRepository = todoLiatRepository;
    }

    @Override
    public void showTodoList() {

        TodoList[] data=todoLiatRepository.getAll();

        System.out.println("TODOLIST");
        for(var i=0;i<data.length;i++){
            var todolist=data[i];
            int no=i+1;
            if (todolist!=null){
                System.out.println(no+". "+todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodoList(String todo) {

        TodoList todoList=new TodoList(todo);
        todoLiatRepository.add(todoList);
        System.out.println("SUKSES MENAMBAHKAN TODO : " + todo);


    }

    @Override
    public void removeTodoList(Integer number) {
        boolean sucses=todoLiatRepository.remove(number);
        if (sucses){
            System.out.println("SUKSES MENGHAPUS TODO KE : "+number);
        }else {
            System.out.println("GAGAL MENGHAPUS TODO KE :  "+number);
        }

    }
}
