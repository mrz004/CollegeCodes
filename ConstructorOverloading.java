class ConstructorOverloading{

    ConstructorOverloading(){
        System.out.println("This is  default constructor...");
    }

    ConstructorOverloading(String greet){
        System.out.println("The argument to the constructor is " + greet);
    }

    public static void main(String[] args) {
        ConstructorOverloading a = new ConstructorOverloading();
        ConstructorOverloading b = new ConstructorOverloading("Hello java");
    }
}