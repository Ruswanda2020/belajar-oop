package progremmer.pelajar.latihanoop.repository;

import progremmer.pelajar.latihanoop.entity.TodoList;

public class TodoListRepositoryImpl implements TodoListRepository {

    public TodoList[] data=new TodoList[3];
    @Override
    public TodoList[] getAll() {
        return data;
    }
    public boolean isFull(){
        //cek apakah data penuh?
//        var isfull=true;
//        for (var i=0;i< data.length;i++){
//            if (data[i]==null){
//                //data masih ada yang kosong
//                isfull=false;
//            }
//        }
//        return isfull;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void resizeIfFull(){
        //jika array sudah penuh maka resize ukuranyah 2*lipat
        if (isFull()){
            var temp=data;
            temp=new TodoList[data.length*2];

            for (var i=0;i < temp.length; i++){
                data[i] = temp[i];
            }
        }
    }
    @Override
    public void add(TodoList todoList) {
        resizeIfFull();
        //tambahkan ke posisi yang data arraynyah null
        for (var i=0;i< data.length;i++){
            if (data[i]==null){
                data[i]=todoList;
                break;
            }
        }
    }

    @Override
    public Boolean remove(Integer number) {

        if ((number-1) >= data.length){
            return false;
        } else if (data[number-1]==null) {
            return false;
        }else {
            for (var i=(number-1); i < data.length;i++){
                if (i==(data.length-1)){
                    data[i]=null;
                }else {
                    data[i]=data[i+1];
                }
            }
            return true;
        }
    }
}
