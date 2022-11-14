public class Main {
    public static void main(String[] args) {
        division obj = new division();
        pattern ob = new pattern();
        compare mura = new compare();
        comparison mur = new comparison();
        class1  era = new class1();
        System.out.println("Hello world!");
        obj.division();
        ob.pattern(6);
        mura.compare();
        mur.comparison();
        era.munya();
    }
}
 class division{
    public void division(){
        int x;
        int sum = 0;
        for(x=1;x<=10;x++){
           sum = sum + x;
        }
        System.out.println(sum);
    }
}
class pattern{
    public void pattern(int i){
        int x,y;
        for(x=0;x<i;x++){
            for(y=0;y<i;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
class  compare{
    public void  compare(){
        int x = 70;
        int y = 50;
        if(x>y){
            System.out.println("x is greater");
        }
        else{
            System.out.println("y is greater");
        }
    }
}
class comparison{
    public void comparison(){
        int x = 60;
        int y=58;
        int z = 480;
        if(x>y && x>z){
            System.out.println("X is greater");
        }
        else if(y>x && y>z){
            System.out.println("y is greater");
        }
        else {
            System.out.println("z is greater");
        }
    }
}