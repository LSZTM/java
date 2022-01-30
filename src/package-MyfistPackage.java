
class Access_Modifiers{
    //types of access modifiers :- deafult,private,public,protected
    //default - available to contents across a package
    //private - accesible by only the contents of the same class
    //public - available across all packages
    //protected - by its classes and inheriting subclasses


    public static void main(String[]args){
        yes2 d = new yes2();
        d.yes2();
        yes e = new yes();
        e.yes();
        yes3 f = new yes3();
        f.yes3();
        yes4 g = new yes4();
        //g.yes4();//private access



    }
}

class yes{
    protected void yes(){
        System.out.println("yes");

    }
}
class yes2 {
    public void yes2(){
        System.out.println("yes2");

    }
}
class yes3{
    void yes3(){
        System.out.println("yes3");


    }
}
class yes4{
     private void yes4(){
        System.out.println("yes4");


    }
}
final class final_class{
    final int a = 8;
    final void final_method(){
        System.out.println("final :)");
    }
}