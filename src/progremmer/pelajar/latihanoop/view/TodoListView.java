package progremmer.pelajar.latihanoop.view;

import progremmer.pelajar.latihanoop.service.TodoListService;
import progremmer.pelajar.latihanoop.service.TodoListServiceImpl;
import progremmer.pelajar.latihanoop.util.InputUtil;

public class TodoListView {

    private TodoListService todoListService;

    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList(){

        while (true){

            todoListService.showTodoList();

            System.out.println("menu");
            System.out.println("1.tambah ");
            System.out.println("2.hapus");
            System.out.println("x.kelur");
            var input= InputUtil.input("pilih");

            if (input.equals("1")){
               addTodoList();
            }else if(input.equals("2")){
                removeTodoList();
            } else if (input.equals("x")) {
                break;
            }else {
                System.out.println("pilihan tidak di mengerti");
            }
        }
    }
    public void addTodoList(){

        System.out.println("MENAMBAH TODOLIST");
        var todo=InputUtil.input("todo(x jika batal)");

        if (todo.equals("x")){
            System.out.println("gagal menambahkan todolist");
        }else {
            todoListService.addTodoList(todo);
        }
    }
    public void removeTodoList(){

        System.out.println("MENGHAPUS TODOLIST");
        var number=InputUtil.input("nomor yang di hapus(x jika gagal");

        if (number.equals("x")){
            //batal
        }else {
            todoListService.removeTodoList(Integer.valueOf(number));
            }
        }

    }


