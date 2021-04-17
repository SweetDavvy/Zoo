public class Zoo {
    Object[] animals;

    public Zoo() {
        // В этой строке ы еще не создаем животных
        animals = new Object[3];
        //наполняем масств конкретными животными
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Reptile();
    }
    public void print(){
        //используется цикл
        //каждое животное выводится по-своему!
        for (Object a : animals){
            System.out.println(a);
        }
    }
    public void change(Object a, int i){
        if (i >= 0 && i < animals.length)
            animals[i] = a;
    }

}
